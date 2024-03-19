import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int toplam=0;
		
		for(int i=0;i<4;i++) {
			System.out.println(i+". öğrencinin notunu giriniz:");
			 int not=scanner.nextInt();
			 toplam=toplam+not;
		}
		
		double ortalama=toplam/4;
		System.out.println("Ortalama: "+ortalama);
	
	
	
	}

}
