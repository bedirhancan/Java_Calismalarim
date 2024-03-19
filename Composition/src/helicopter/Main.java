package helicopter;

public class Main {

	public static void main(String[] args) {

		Engine myEngine=new Engine(800,2200);
		Propeller myPropeller=new Propeller(10,2000);
		Storage myStorage=new Storage(250);
		
		Helicopter Sikorsky=new Helicopter(2731, myEngine, myPropeller, myStorage);
		
		Sikorsky.getEngine().startEngine();
		Sikorsky.getEngine().stopEngine();
		
		Engine gokbeyEngine=new Engine(900,2800);
		Propeller gokbeyPropeller=new Propeller(13,2200);
		Storage gokbeyStorage=new Storage(1020);
		
		Helicopter Gokbey=new Helicopter(625, gokbeyEngine, gokbeyPropeller, gokbeyStorage);
		
		Gokbey.getEngine().startEngine();
		Gokbey.getEngine().stopEngine();
	}

}
