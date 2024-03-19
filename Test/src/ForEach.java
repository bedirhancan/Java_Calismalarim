import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Mercedes-Benz");
		list.add("Bentley");
		list.add("Rolls-Royce");
		
		for(String str:list) {
			System.out.println(str);
		}
	}

}
