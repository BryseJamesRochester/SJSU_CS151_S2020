
public class Dog extends Animal implements Domesticated , Swimmer {



	public Dog(String type, String name, int age, String gender, String environment, int speed) {
	super(type, name, age, gender, environment, speed);
}

	@Override
	public void swim() {
		System.out.println(name + " the " + type + " swims.\n");
	}

	@Override
	public void walk() {
		System.out.println(name + " the " + type + " goes for a walk.\n");
		
	}

	@Override
	public void greetHuman() {
		System.out.println(name + " the " + type + " greets a human.\n");
		
	}
	
	public void bark() {
		System.out.println(name + " the " + type + " barks.\n");

	}

}
