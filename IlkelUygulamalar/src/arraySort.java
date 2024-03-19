import java.lang.reflect.Array;
import java.util.Arrays;

public class arraySort {

	public static void main(String[] args) {

		int[] array= {141,5123,1,523,6346,41};
		int[] array3= {141,5123,1,523,6346,41};
		int[] array2= array;
		
		//Arrays.sort(array); küçükten büyüğe sıralar diziyi
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		if(array==array2)
			System.out.println("eşit");
			
		if(Arrays.equals(array, array3))
			System.out.println("eşsit");
		else 
			System.out.println("eşsit değil");
		
		boolean esitMi=true;
		
		for(int i=0;i<5;i++) {
			if(array[i]!=array3[i])
			{
				esitMi=false;
				break;
			}
		}
		if(esitMi)
			System.out.println("eşiit");
		else 
			System.out.println("eşiit değil");
	}
	

}
