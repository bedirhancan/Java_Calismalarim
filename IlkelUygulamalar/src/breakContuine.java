import java.util.Scanner;

public class breakContuine {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		for(int i =0;i<10;i++) {
			if(i==3) {
				System.out.println("Döngüden çıkılıyor...\n");
				break;
			}
			System.out.println(i);
		}
		for(int j =0;j<10;j++) {
			if(j==3) {
				System.out.println("Continue geldi 3'ü atladı...");
				continue;
			}
			System.out.println(j);
		}
	}

}
