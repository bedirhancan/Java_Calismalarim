package ndpProje;

public class Manager extends Personnel {
	
	public Manager(int id, String name, String surname, int salary,int degree) {
		super(id, name, surname, salary);
		this.degree=degree;
	}

	private int degree;

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}
	
	
}
