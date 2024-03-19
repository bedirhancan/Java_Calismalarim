package ndpProje;

public class Main {
	
	//Polymorphism 
	public static void listSalary(Personnel personnel) {
		System.out.println(personnel.getSalary());
	}
	
	public static void isManager(Personnel personnel) {
		if(personnel instanceof Manager) {
			System.out.println(personnel.getName()+" is a manager.");
		}
		else {
			System.out.println(personnel.getName()+" is not a manager.");
		}
	}
	
	public static void main(String[] args) {

		Manager manager=new Manager(8, "Alaska", "Frigo", 8000, 2);
		Engineer eng1=new Engineer(9, "John", "Cena", 5000,"Machine" );
		Engineer eng2=new Engineer(10, "Dilara", "Kurnaz", 4500,"Software" );
		Secretary sec=new Secretary(11, "Justin", "Zeynep", 3240, 583210);
		Officer officer=new Officer(12, "Dwight", "Brian", 3400, "Salary");
		
		Personnel[] personell= {manager,eng1,eng2,sec,officer};
		
		Branch branch=new Branch(personell);
		
		branch.listPersonnel();
		
		Engineer eng3=new Engineer(13,"Bedirhan", "Can", 2731, "Software");
		branch.addPersonnel(eng3);
		System.out.println();
		branch.listPersonnel();
		
		System.out.println();
		branch.searchPersonnel(10);
		
		isManager(manager);
		
	}
		
}


