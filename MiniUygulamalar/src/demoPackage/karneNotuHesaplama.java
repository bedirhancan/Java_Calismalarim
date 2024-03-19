package demoPackage;
import java.util.Scanner;

public class karneNotuHesaplama {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Not giriniz: ");
		int not = scanner.nextInt();
		if((not>=0) && (not<=44))
		{
			System.out.println("Zayıf");
		}
		else if ((not>44) && (not<=54))
		{
			System.out.println("Geçer");
		}
		else if ((not>54) && (not<=64))
		{
			System.out.println("Orta");
		}
		else if ((not>64) && (not<=74))
		{
			System.out.println("İyi");
		}
		else if ((not>74) && (not<=84))
		{
			System.out.println("Çok iyi");
		}
		else if ((not>84) && (not<=100))
		{
			System.out.println("Nirvana");
		}
		else 
			System.out.println("Girdiğiniz not geçerli değil!");
			
	}
}
