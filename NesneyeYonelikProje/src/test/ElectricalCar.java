package test;

public class ElectricalCar extends Car {
	
	private int battery;
	
	public ElectricalCar(int Battery) {
		super("Blue","Normal","Tesla");
		this.battery=Battery;
	}
	public ElectricalCar() {
		this(99);
	}
	
	public int getBattery() {
		return this.battery;
	}
	public void setBattery(int Battery) {
		this.battery=Battery;
	}
	
	public void doCharge(){
		this.battery=100;
	}
}
