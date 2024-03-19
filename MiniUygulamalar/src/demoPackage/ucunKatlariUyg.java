package demoPackage;
import java.util.Scanner;

public class ucunKatlariUyg {

	public static void ucunKatlari() {
	
		//for(int i=0;i<=100;i+=3){System.out.print(i+", ");}
		
		for(int i=0;i<=100;i++) {
			if(i%3==0)
			System.out.print(i+", ");
		}
	}
	public static void girilenSayininKatlari(int sayiKat,int limit) {
		for(int i=0;i<=limit;i++) {
			if(i%sayiKat==0)
			System.out.print(i+", ");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaça kadar olan katları bulalım? ");
		int limit=scanner.nextInt();
		System.out.println("Neyin katlarını bulalım? ");
		int kat=scanner.nextInt();
		girilenSayininKatlari(kat, limit);
		System.out.println("");
		ucunKatlari();
		
	}

}
