package test;

public class Car {
	
	private String color;
	private String rim; 
	private String model;
	
	//Constructor with parameters
	public Car(String clr,String Rim,String mdl) {
		this.color=clr;
		this.rim=Rim;
		this.model=mdl;
	}
	//Constructor not parameters
	public Car() {
		this("White","Plastic","Volkswagen");
	}
	
	public String getModel(){
		return this.model;
	}
	public void setModel(String mdl) {
		this.model=mdl;
	}
	
	public void setColor(String clr) {
		this.color=clr;
	}
	public String getColor() {
		return this.color;
	}
	
	public void setRim(String Rim) {
		this.rim=Rim;
	}
	public String getRim() {
		return this.rim;
	}
}
