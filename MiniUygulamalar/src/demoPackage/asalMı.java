package demoPackage;
import java.util.Scanner;

public class asalMı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        scanner.close();
        
        if (asalMi(sayi)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } 
        else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }
    
    public static boolean asalMi(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}

