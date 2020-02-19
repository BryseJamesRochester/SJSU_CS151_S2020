
public class Person {
	String firstName;
	String lastName;
	int age;
	long socialSecurityNumber;
	String address;
	String gender;
	float weight;
	public Person(String firstName, String lastName, int age, long socialSecurityNumber, String address, String gender,
			float weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(long socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", socialSecurityNumber="
				+ socialSecurityNumber + ", address=" + address + ", gender=" + gender + ", weight=" + weight + "]";
	}
	
	public void introduce() {
		System.out.println(toString());
	}
	
	

}
