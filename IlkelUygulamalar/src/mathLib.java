import java.util.Scanner;
public class mathLib {

	public static void main(String[] args) {
		//math kütüphanesi kullanımı - örnek kodlama
		
		System.out.print("Karenin bir köşesini uzunluğunu giriniz (m) :");
		Scanner scanner = new Scanner(System.in);
		int kenar = scanner.nextInt();
		double alan= Math.pow(kenar,2);
		System.out.println("Karenin alanı: " + alan + " 2m2");
		System.out.println(Math.abs(-7)+":mutlak değer 7");
		System.out.println(Math.sin(Math.PI/6)+ ":sin30");
		
		
	}

}
