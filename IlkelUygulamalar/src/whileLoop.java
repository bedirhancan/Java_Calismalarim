import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i=0;
		int j=9;
		while(i<10 && j>=0) {
			System.out.println(i+" :I");
			i++;
			System.out.println(j+" :J");
			j--;
		}

	}

}
