
public class Person {
	protected String firstName;
	protected String lastName;
	protected int age;
	protected int ssn;
	protected Address address;
	protected int id;
	
	
	public Person() {
	}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Person(String firstName, String lastName,  int streetNum, String streetName, String city, int zip, String state) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address(streetNum,streetName,city,zip,state);
	}
	
	public Person(String firstName, String lastName, int age, int ssn, int id, int streetNum, 
					String streetName, String city, int zip, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.address = new Address(streetNum,streetName,city,zip,state);
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn
				+ ", " + address.toString() + ", id=" + id + "]";
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
	public long getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}







	protected class Address {
		int streetNum;
		String streetName;
		String city;
		int zip;
		String state;
		
		private Address(int streetNum, String streetName, String city, int zip, String state) {
			this.streetNum = streetNum;
			this.streetName = streetName;
			this.city = city;
			this.zip = zip;
			this.state = state;
		}

		@Override
		public String toString() {
			return "Address [streetNum=" + streetNum + ", streetName=" + streetName + ", city=" + city + ", zip=" + zip
					+ ", state=" + state + "]";
		}
		
		
		
	}
}
