package demoPackage;
import java.util.Scanner;

public class menuWithLoop {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		do{
			System.out.println("Menü");
			System.out.println("*-*-*-*-*-*-");
			System.out.println("1. Karışık Pizza");
			System.out.println("2. Sebzeli Pizza");
			System.out.println("3. Mantarlı Pizza");
			System.out.println("4. Çıkış");
			
			int secim=scanner.nextInt();
			if(secim==1)
				System.out.println("Karışık pizza seçtiniz...");
			else if(secim==2)
				System.out.println("Sebzeli pizza seçtiniz...");
			else if(secim==3)
				System.out.println("Mantarlı pizza seçtiniz...");
			else if(secim==4){
				System.out.println("Çıkış yapılıyor...");
				break;
			}
		}while(true);
	}

}
