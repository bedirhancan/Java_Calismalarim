package demoPackage;
import java.util.Scanner;

public class factorialWhileLoop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayı giriniz. ");
		int fact=scanner.nextInt();
		int realNum=fact;
		
		int total=1;
		while(fact>0) {
			total=total*fact;
			fact--;
		}
		System.out.println(realNum+"!: " + total);
	}

}
