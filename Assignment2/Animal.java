
public class Animal {
	private String type;
	private String name;
	private int age;
	private String gender;
	private String environment;
	private int speed;
	
	
	public Animal(String type, String name, int age, String gender, String environment, int speed) {
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.speed = speed;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void move() {
		System.out.println(name + " the " + type + " moves.\n");
	}
	public void eat() {
		System.out.println(name + " the " + type + " eats.\n");
	}
	public void sleep() {
		System.out.println(name + " the " + type + " sleeps.\n");
	}
	public void sound() {
		switch (type) {
		case "dog" : System.out.println(name + " the " + type + " growls.\n");break;
		case "cat" : System.out.println(name + " the " + type + " purrs.\n");break;
		case "racoon" : System.out.println(name + " the " + type + " snorts.\n");break;
		case "whale" : System.out.println(name + " the " + type + " bellows.\n");break;
		}
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", age=" + age + ", gender=" + gender + ", environment="
				+ environment + ", speed=" + speed + "]\n";
	}
	
}
