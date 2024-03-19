package stc;

public class Main {

	public static void main(String[] args) {
		
		Employee e1=new Employee("e1");
		System.out.println(e1.getName());

		Employee.totalEmployeeWrite();

		Employee e2=new Employee("e2");
		System.out.println(e2.getName());
		
		Employee.totalEmployeeWrite();
	
	}

}
