package demoPackage;
import java.io.IOException;

public class consoleClear {

    public static void clear() {

        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
            System.err.println("Hata oluştu: " + ex.getMessage());
            ex.printStackTrace(); // Hatanın tam izlemini görmek için
        }
    }
}
