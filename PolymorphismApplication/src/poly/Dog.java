package poly;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}


	@Override
	public void makeVoice() {
		System.out.println(super.getName()+" havlıyor.");
	}
	
}
