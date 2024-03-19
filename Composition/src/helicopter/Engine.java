package helicopter;

public class Engine {
	
	private int torque;
	private int horsePower;
	
	public Engine(int torque, int horsePower) {
		super();
		this.torque = torque;
		this.horsePower = horsePower;
	}

	public int getTorque() {
		return torque;
	}
	public void setTorque(int torque) {
		this.torque = torque;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public void startEngine() {
		System.out.println("The engine started to work.");
	}
	public void stopEngine() {
		System.out.println("The engine has stopped working.");
	}
}
