package ndpProje;

public class Branch {
	
	Personnel personnelArray[];
	
	public Branch(Personnel[] personnelArray) {
		super();
		this.personnelArray=personnelArray;
	}
	
	public void addPersonnel(Personnel personnel) {
		Personnel[] personnelTemp=new Personnel[personnelArray.length+1];
		for(int i=0;i<personnelArray.length;i++) {
			personnelTemp[i]=personnelArray[i];
		}
		personnelTemp[personnelArray.length]=personnel;
		personnelArray=personnelTemp;		
	}
	
	public void listPersonnel() {
		for(int i=0;i<personnelArray.length;i++) {
			System.out.println(personnelArray[i]);
		}
	}
	
	public void searchPersonnel(int id) {
		for(Personnel p:personnelArray) {
			if(p.getId()==id) {
				System.out.println("Personnel: "+p);
				return;
			}
		}
		System.err.println(id+ " Personnel ID number could not be found");
	}
	
	
}
