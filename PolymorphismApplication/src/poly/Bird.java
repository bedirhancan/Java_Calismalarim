package poly;

public class Bird extends Animal {

	public Bird(String name) {
		super(name);
	}

	@Override
	public void makeVoice() {
		System.out.println(super.getName()+" cikliyor.");
	}
	
	
	
	
}
