package inter;

public class Car implements IHgs {

    String plate;
    int balance;
    
    public Car(String plate, int balance) {
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
    
    public void openSunroof() {
        System.out.println("Sunroof opened.");
    }
}
