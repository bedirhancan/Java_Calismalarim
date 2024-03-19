package poly;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void makeVoice() {
		System.out.println(super.getName()+" miyavlıyor.");
	}
}
