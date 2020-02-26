
public class Employee extends Person {
	protected  String educationLevel;
	protected boolean directDeposit;
	public Employee() {
		super();
	}
	public Employee(String firstName, String lastName, int streetNum, String streetName, String city, int zip,
			String state) {
		super(firstName, lastName, streetNum, streetName, city, zip, state);
	}
	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
	}
	public Employee(String firstName, String lastName, int age, int ssn, int id, int streetNum, String streetName,
			String city, int zip, String state, String educationLevel, boolean directDeposit) {
		super(firstName, lastName, age, ssn, id, streetNum, streetName, city, zip, state);
		this.educationLevel = educationLevel;
		this.directDeposit = directDeposit;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public boolean isDirectDeposit() {
		return directDeposit;
	}
	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}
	@Override
	public String toString() {
		return "Employee [directDeposit=" + directDeposit + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", ssn=" + ssn + ", address=" + address + ", id=" + id + "]";
	}

	

	

	
	
}
