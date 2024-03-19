package pdp;

import java.util.Random;

public class RastgeleKarakter {
    private Random random;

    public RastgeleKarakter() {
        random = new Random();
    }

    // Verilen iki karakter arasında alfabetik sıraya göre rastgele bir karakter üretme
    public char rastgeleKarakter(char minChar, char maxChar) {
        int min = (int) minChar;
        int max = (int) maxChar;
        int randomNum = random.nextInt(max - min + 1) + min;
        return (char) randomNum;
    }

    // Belirtilen sayıda rastgele karakter üretme
    public String rastgeleKarakterler(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            sb.append(randomChar);
        }
        return sb.toString();
    }

    // Rastgele bir cümle üretme
    public String rastgeleCumle(int wordCount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            int wordLength = random.nextInt(10) + 1; // Max kelime uzunluğu 10 olsun
            sb.append(rastgeleKarakterler(wordLength)).append(" ");
        }
        return sb.toString().trim(); // Trim to remove extra space at the end
    }

    // Verilen iki karakter arasından belirtilen sayıda karakter üretme
    public String karakterlerArasiRastgele(char minChar, char maxChar, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(rastgeleKarakter(minChar, maxChar));
        }
        return sb.toString();
    }
}
