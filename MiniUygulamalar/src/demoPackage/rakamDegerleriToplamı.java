package demoPackage;
import java.util.Scanner;

public class rakamDegerleriToplamı {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz:");
		int sayi=scanner.nextInt();
		int toplam=0;
		do {
			toplam=toplam+(sayi%10);
			sayi=sayi/10;
		}while(sayi>0);
		System.out.println("Rakamlar toplamı: "+toplam);

	}

}
