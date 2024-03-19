
public class multiArray {

	public static void main(String[] args) {

		//int[][] multiArray=new int[2][3];
		int[][] multiArray= {{7,3,2},{2,5,4}};
		System.out.println(multiArray[1][0]);
		
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.print("| "+multiArray[i][j]+" |");
			}
			System.out.println();
		}
	}

}
