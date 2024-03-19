
public class charString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char mykey=3; //char değişkenine int atanırsa ASCII karşılığını çıktı verir.
		char beta='\u00DF';
		System.out.println(beta);
		
		String metin= "merhaba Java !";
		metin = metin.toUpperCase();
		String altmetin = metin.substring(8,12);
		System.out.println(altmetin+" "+metin);
		
	}

}
