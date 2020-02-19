
public class AnimalTest {

	public static void main(String[] args) {
		Dog vandi = new Dog("dog", "Vandi", 12, "female", "home", 2);
		Cat chester = new Cat("cat", "Chester", 50, "female", "home", 15);
		Racoon garbo = new Racoon("racoon", "Garbo", 5, "male", "forest", 20);
		Whale dory = new Whale("whale", "Dory", 27, "female", "ocean", 1);
		
		vandi.bark();
		vandi.eat();
		vandi.move();
		vandi.sleep();
		vandi.greetHuman();
		vandi.sound();
		vandi.walk();
		vandi.swim();
		chester.eat();
		chester.move();
		chester.sleep();
		chester.greetHuman();
		chester.sound();
		chester.walk();
		chester.scratch();
		garbo.eat();
		garbo.move();
		garbo.sleep();
		garbo.sound();
		garbo.scratch();
		dory.eat();
		dory.move();
		dory.sleep();
		dory.sound();
		dory.swim();
		
	}

}
