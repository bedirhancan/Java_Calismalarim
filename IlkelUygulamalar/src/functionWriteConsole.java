import java.util.Scanner;

public class functionWriteConsole {

	public static void writeConsole(String message ,int numb) {
		System.out.println("Hello "+message+" TR "+numb);
	}
	
	public static double rectangleArea(int longEdge,int shortEdge) {
		double area=longEdge*shortEdge;
		return area;
	}
	
	public static void squareArea(int edge) {
		System.out.println(Math.pow(edge, 2));
	}
	
	public static void main(String[] args) {
		
		writeConsole("World",31);
		double alanDikdortgen=rectangleArea(69,31);
		System.out.println(alanDikdortgen);
		squareArea(8);
		
		
		
	}

}
