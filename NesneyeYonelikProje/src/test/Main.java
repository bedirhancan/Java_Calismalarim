package test;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Color"+" | " + "Rim"+" | "+"Model");

		Car car1=new Car("Blus","Steel","Koenigsegg");		
		System.out.println(car1.getColor()+" | " + car1.getRim()+" | "+car1.getModel());

		Car car2=new Car("Black","Carbon","Pagani");
		System.out.println(car2.getColor()+" | " + car2.getRim()+" | "+car2.getModel());
		
		Car car3=new Car();
		System.out.println(car3.getColor()+" | " + car3.getRim()+" | "+car3.getModel());		
		
		GasolineCar gasolineCar=new GasolineCar(12);
		System.out.println(gasolineCar.getColor()+" | " + gasolineCar.getRim()+" | "+gasolineCar.getModel()+" | "+gasolineCar.getFuel());		
		
		ElectricalCar Tesla=new ElectricalCar();
		Tesla.setColor("Red");
		System.out.println(Tesla.getColor()+" | " + Tesla.getRim()+" | "+Tesla.getModel()+" | "+Tesla.getBattery());		

	}

}















