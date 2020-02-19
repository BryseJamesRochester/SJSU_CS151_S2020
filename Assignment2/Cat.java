
public class Cat extends Animal implements Domesticated, Scratcher {

	
	public Cat(String type, String name, int age, String gender, String environment, int speed) {
		super(type, name, age, gender, environment, speed);
	}

	@Override
	public void scratch() {
		System.out.println(name + " the " + type + " scratches.\n");
		
	}

	@Override
	public void walk() {
		System.out.println(name + " the " + type + " goes for a walk.\n");
		
	}

	@Override
	public void greetHuman() {
		System.out.println(name + " the " + type + " greets a human.\n");
		
	}

}
