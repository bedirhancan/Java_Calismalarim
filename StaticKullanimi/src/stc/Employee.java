package stc;

public class Employee {

	private String name;
	private static int totalEmployee=0;

	public Employee(String name) {
		this.name = name;
		totalEmployee++;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void totalEmployeeWrite() {
		System.out.println("Total employee: "+totalEmployee);
	}
	
	
}
