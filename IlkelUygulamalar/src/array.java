public class array {

    public static void dizininOrtalamasiniYazdir(int[] arr) {
        double toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam = toplam + arr[i];
        }
        System.out.println(toplam / arr.length);
    }

    public static void dizininOrtalamasiniYazdir(double[] arr) {
        double toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam = toplam + arr[i];
        }
        System.out.println(toplam / arr.length);
    }
    public static void dizininOrtalamasiniYazdir(float[] arr) {
        double toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam = toplam + arr[i];
        }
        System.out.println(toplam / arr.length);
    }

    public static void main(String[] args) {

        int[] array = { 8, 31, 69, 42, 27 };
        double[] arrayD = { 8.8, 31.31, 69.69, 42.42, 27.27 };
        float[] arrayF = { 8.8f, 31.31f, 69.69f, 42.42f ,27.27f };
        char[] arrayC = { 'C', 'H', 'A', 'R' };
        String[] arrayS = { "STRING", "ARRAY" };

        dizininOrtalamasiniYazdir(array);
        dizininOrtalamasiniYazdir(arrayD);
        dizininOrtalamasiniYazdir(arrayF);
        System.out.println(arrayC);

        // String[] türündeki dizileri tek tek yazdırmak gerekiyor
        for (String str : arrayS) {
            System.out.print(str+" ");
        }
    }
}
