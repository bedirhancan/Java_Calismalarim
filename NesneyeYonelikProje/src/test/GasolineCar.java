package test;

public class GasolineCar extends Car {
	
	private int fuel;
	
	public GasolineCar(int Fuel) {
		super("Orange","Steel","Peugeot");
		this.fuel=Fuel;
	}
	
	public GasolineCar() {
		this(99);
	}
	
	public int getFuel() {
		return this.fuel;
	}
	public void setFuel(int Fuel) {
		this.fuel=Fuel;
	}
	public void fillFuel() {
		fuel=100;
	}
}
