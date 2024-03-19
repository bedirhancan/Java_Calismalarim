import java.util.Scanner;

public class veriOkuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String kullaniciIsmi=scanner.nextLine();
		System.out.println("Merhaba" + kullaniciIsmi);
		
		int yas= scanner.nextInt();
		double oran=scanner.nextDouble();
		System.out.println("yas:" + yas);
		System.out.println("oran:" + oran);

		
	}

}
