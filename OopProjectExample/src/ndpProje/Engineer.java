package ndpProje;

public class Engineer extends Personnel {
	
	public Engineer(int id, String name, String surname, int salary,String expertise) {
		super(id, name, surname, salary);
		this.expertise=expertise;
	}

	private String expertise;
	
	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

}
