package demoPackage;
import java.util.Scanner;

public class rectangleArea {

	public static void main(String[] args) {
		// dikdörtgenin kenarları a ve b olsun
		
		double uzunKenar , kısaKenar ,alan;
		System.out.print("Lütfen dikdörtgenin uzun kenarını giriniz: ");
		Scanner scanner = new Scanner(System.in);
		uzunKenar= scanner.nextDouble();
		
		System.out.print("Lütfen dikdörtgenin kısa kenarını giriniz: ");
		kısaKenar= scanner.nextDouble();
		
		alan= uzunKenar*kısaKenar;
		System.out.println("Alan: "+ alan);
	}

}
