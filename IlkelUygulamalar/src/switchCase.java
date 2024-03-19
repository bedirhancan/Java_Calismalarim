import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
		//kullanıcı 1-7 arası günü konsoldan sayı olarak girsin
		// program bunu güne çevirsin
		//1= pazartesi ...
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-7 arası gün numarasını giriniz: ");
		int gunNo= scanner.nextInt();
		switch(gunNo)
		{
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Yanlış bir değer girdiniz!");
		}
	}

}
