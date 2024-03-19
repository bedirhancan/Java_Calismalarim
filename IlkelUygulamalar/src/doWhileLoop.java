import java.util.Scanner;

public class doWhileLoop {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int sayi=scanner.nextInt();
		int real=sayi;
		int toplam=0;
		do {
			
			toplam+=sayi;
			sayi--;
		}while(sayi>0);
		System.out.println("Toplam: "+ toplam+" "+(real*(real+1)/2));
	}

}
