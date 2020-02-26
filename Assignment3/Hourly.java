
public class Hourly extends Employee{
	protected int hourlyPay;
	protected int hours;

	public Hourly() {
		super();
	}

	public Hourly(String firstName, String lastName, int streetNum, String streetName, String city, int zip,
			String state) {
		super(firstName, lastName, streetNum, streetName, city, zip, state);
	}

	public Hourly(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Hourly(String firstName, String lastName, int age, int ssn, int id, int streetNum, String streetName,
			String city, int zip, String state, String educationLevel, boolean directDeposit, int hourlyPay,int hours) {
		super(firstName, lastName, age, ssn, id, streetNum, streetName, city, zip, state, educationLevel,
				directDeposit);
		this.hourlyPay = hourlyPay;
		this.hours = hours;
	}

	public int getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	@Override
	public String toString() {
		return "Hourly [hourlyPay=" + hourlyPay + ", directDeposit=" + directDeposit + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn + ", address=" + address + ", id=" + id
				+ "]";
	}


	
	
	



	

}
