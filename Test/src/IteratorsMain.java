import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorsMain {

	public static void main(String[] args) {
		
		List<String> listPersonel=new ArrayList<String>();
		
		listPersonel.add("Zeynep");
		listPersonel.add("Dilara");
		listPersonel.add("Kurnaz");
		
		Iterator<String> iterator= listPersonel.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
			
	}

}
