package demoPackage;

public class clearMethod {

    public static void main(String[] args) throws InterruptedException {
        int maxIteration = 100; // Döngüyü sonlandırmak için maksimum iterasyon sayısı
        for (int i = 1; i <= maxIteration; i++) {
            System.out.printf("Tur: %d%n", i);
            Thread.sleep(30);
            consoleClear.clear();
        }
    }
}
