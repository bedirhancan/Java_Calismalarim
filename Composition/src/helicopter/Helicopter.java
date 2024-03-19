package helicopter;

public class Helicopter {

	private int tailNumber;
	private Engine engine;
	private Propeller propeller;
	private Storage storage;
	
	
	
	public Helicopter(int tailNumber, Engine engine, Propeller propeller, Storage storage) {
		this.tailNumber = tailNumber;
		this.engine = engine;
		this.propeller = propeller;
		this.storage = storage;
	}
	public int getTailNumber() {
		return tailNumber;
	}
	public void setTailNumber(int tailNumber) {
		this.tailNumber = tailNumber;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Propeller getPropeller() {
		return propeller;
	}
	public void setPropeller(Propeller propeller) {
		this.propeller = propeller;
	}
	public Storage getStorage() {
		return storage;
	}
	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	
	
}
