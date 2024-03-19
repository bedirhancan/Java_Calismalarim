package inter;

public class Main {

    public static void printHgsInfo(IHgs vehicle) {
        System.out.println(vehicle.queryHgsBalance() + " " + vehicle.showHgsPlate());
        
        if (vehicle instanceof Car) {
        	Car car = (Car) vehicle;
            car.openSunroof();
        }
    }
    
    public static void main(String[] args) {
        
    	Car myCar = new Car("01SV055", 100);
        Truck myTruck = new Truck("27SV31", 200);
        printHgsInfo(myTruck);
        printHgsInfo(myCar);
    }

}
