
public class Salary extends Employee {
	protected int yearlyPay;

	public Salary() {
		super();
	}

	public Salary(String firstName, String lastName, int streetNum, String streetName, String city, int zip,
			String state) {
		super(firstName, lastName, streetNum, streetName, city, zip, state);
	}

	public Salary(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Salary(String firstName, String lastName, int age, int ssn, int id, int streetNum, String streetName,
			String city, int zip, String state, String educationLevel, boolean directDeposit, int yearlyPay) {
		super(firstName, lastName, age, ssn, id, streetNum, streetName, city, zip, state, educationLevel,
				directDeposit);
		this.yearlyPay = yearlyPay;
	}

	public int getYearlyPay() {
		return yearlyPay;
	}

	public void setYearlyPay(int yearlyPay) {
		this.yearlyPay = yearlyPay;
	}

	@Override
	public String toString() {
		return "Salary [yearlyPay=" + yearlyPay + ", directDeposit=" + directDeposit + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn + ", address=" + address + ", id=" + id
				+ "]";
	}
	
	



	
	
	


}
