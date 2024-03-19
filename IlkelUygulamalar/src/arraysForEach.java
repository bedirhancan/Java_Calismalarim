
public class arraysForEach {

	public static void main(String[] args) {
		
		String[] cars= {"Tesla","Ford","Honda","Koenigsegg"};
		
		for(int i=0;i<cars.length;i++){System.out.print(cars[i]+" ");}
		
		//for(String marka:cars){System.out.println(marka.toUpperCase());}
		
		String[] cars2=new String[cars.length-1];
		
		int i=0;
		for(String marka: cars) {
			if(!marka.equals("Tesla")) {
				cars2[i]=marka;
				i++;
			}
		}
		cars=cars2;
		
		System.out.println("Silme işlemi sonrası:");
		for(String marka:cars){System.out.println(marka.toUpperCase());}

	}

}
