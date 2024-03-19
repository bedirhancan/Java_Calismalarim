package pdp;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GitHub reposu URL'sini girin:");
        String repoUrl = scanner.nextLine();
        scanner.close();

        File repoDir = cloneRepository(repoUrl);
        if (repoDir != null) {
            analyzeJavaFiles(repoDir);
        } else {
            System.out.println("Git reposu klonlanırken bir hata oluştu.");
        }
    }

    public static File cloneRepository(String repoUrl) {
        File repoDir = null;
        try {
            String tempDirPath = System.getProperty("java.io.tmpdir") + File.separator + "tempRepo";
            deleteDirectory(Paths.get(tempDirPath));
            Files.createDirectories(Paths.get(tempDirPath));

            ProcessBuilder processBuilder = new ProcessBuilder("git", "clone", repoUrl, tempDirPath);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                repoDir = new File(tempDirPath);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return repoDir;
    }

    public static void analyzeJavaFiles(File directory) {
        if (!directory.isDirectory()) {
            System.out.println("Belirtilen dizin geçerli bir dizin değil.");
            return;
        }

        findAndAnalyzeJavaFiles(directory);
    }

    public static void findAndAnalyzeJavaFiles(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    findAndAnalyzeJavaFiles(file);
                } else if (file.getName().endsWith(".java")) {
                    analyzeJavaFile(file);
                }
            }
        }
    }

    public static void analyzeJavaFile(File file) {
        try {
            List<String> lines = Files.readAllLines(file.toPath());
            int javadocLines = countJavadocLines(lines);
            int otherCommentsLines = countOtherCommentsLines(lines);
            int codeLines = countCodeLines(lines);
            int LOC = lines.size();
            int functionCount = countFunctionCount(lines);

            double YG = ((javadocLines + otherCommentsLines) * 0.8) / functionCount;
            double YH = (codeLines / (double) functionCount) * 0.3;
            double commentDeviationPercentage = ((100 * YG) / YH) - 100;

            System.out.println("Sınıf: " + file.getName());
            System.out.println("Javadoc Satır Sayısı: " + javadocLines);
            System.out.println("Diğer Yorumlar Satır Sayısı: " + otherCommentsLines);
            System.out.println("Kod Satır Sayısı: " + codeLines);
            System.out.println("LOC: " + LOC);
            System.out.println("Fonksiyon Sayısı: " + functionCount);
            System.out.println("Yorum Sapma Yüzdesi: " + commentDeviationPercentage);
            System.out.println("-----------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countJavadocLines(List<String> lines) {
        int count = 0;
        boolean inJavadoc = false;
        for (String line : lines) {
            line = line.trim();
            if (line.startsWith("/**")) {
                inJavadoc = true;
                count++;
            } else if (line.startsWith("/*") && !line.startsWith("/**")) {
                inJavadoc = true;
            } else if (line.startsWith("*") && inJavadoc) {
                count++;
            } else if (line.endsWith("*/") && inJavadoc) {
                count++;
                inJavadoc = false;
            }
        }
        return count;
    }

    public static int countOtherCommentsLines(List<String> lines) {
        int count = 0;
        for (String line : lines) {
            line = line.trim();
            if (line.startsWith("//") || line.startsWith("/*")) {
                count++;
            }
        }
        return count;
    }

    public static int countCodeLines(List<String> lines) {
        int count = 0;
        for (String line : lines) {
            line = line.trim();
            if (!line.isEmpty() && !line.startsWith("//") && !line.startsWith("/*")) {
                count++;
            }
        }
        return count;
    }

    public static int countFunctionCount(List<String> lines) {
        int count = 0;
        for (String line : lines) {
            line = line.trim();
            if (line.startsWith("public") || line.startsWith("private") || line.startsWith("protected")) {
                count++;
            }
        }
        return count;
    }

    private static void deleteDirectory(Path directory) {
        if (!Files.exists(directory)) {
            return;
        }
        try {
            Files.walk(directory)
                    .map(Path::toFile)
                    .sorted((o1, o2) -> -o1.compareTo(o2))
                    .forEach(File::delete);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
