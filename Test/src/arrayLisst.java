import java.util.ArrayList;

public class arrayLisst {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList= new ArrayList<String>();
		
		arrayList.add("Ali");
		arrayList.add("Veli");
		arrayList.add("49 50");
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		//arrayList.remove("Ali");
		System.err.println("---");
		arrayList.remove(1);

		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}

}
