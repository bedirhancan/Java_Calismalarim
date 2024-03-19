package poly;

public class Main {
	
	public static void talkAnimal(Animal animal) {
		animal.makeVoice();
	}

	public static void main(String[] args) {
		
		//Animal animal=new Animal("Hayvan");
		Cat cat=new Cat("Felix");
		Bird bird=new Bird("Bıcır");
		Dog dog=new Dog("Bolt");
	
		talkAnimal(bird);
		//talkAnimal(animal);
		talkAnimal(dog);
		talkAnimal(cat);
		
	}

}
