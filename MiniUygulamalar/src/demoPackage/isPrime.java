package demoPackage;

public class isPrime {

	public static boolean numPrime(int num) {
		if(num<=1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int n=0;
		int total=0;
		for(int i=1;i<100;i++) {
			if(numPrime(i)) {
			total+=i;
			n++;
			System.out.print(i+", ");
			
			}
		}
		System.out.println("");
		System.out.println("100'e kadar olan asal sayıların toplamı: "+total);
		System.out.println("100'den küçük asal sayıların sayısı: "+n);

	}

}
