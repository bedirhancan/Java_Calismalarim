package inter;

public class Truck implements IHgs {

	 String plate;
	 int balance;
    
    public Truck(String plate, int balance) {
        this.plate = plate;
        this.balance = balance;
    }
    
    @Override
    public int queryHgsBalance() {
        return this.balance;
    }

    @Override
    public String showHgsPlate() {
        return this.plate;
    }

}
