
public class FullTimeHourlyEmployee extends Hourly{
	protected int overtimePay;

	public FullTimeHourlyEmployee() {
		super();
	}

	public FullTimeHourlyEmployee(String firstName, String lastName, int streetNum, String streetName, String city,
			int zip, String state) {
		super(firstName, lastName, streetNum, streetName, city, zip, state);
	}

	public FullTimeHourlyEmployee(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public FullTimeHourlyEmployee(String firstName, String lastName, int age, int ssn, int id, int streetNum,
			String streetName, String city, int zip, String state, String educationLevel, boolean directDeposit,
			int hourlyPay, int overtimePay, int hours) {
		super(firstName, lastName, age, ssn, id, streetNum, streetName, city, zip, state, educationLevel, directDeposit,
				hourlyPay, hours);
		this.overtimePay = overtimePay;
	}

	public int getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(int overtimePay) {
		this.overtimePay = overtimePay;
	}
	
	public float computePay(int hours) {
		return hourlyPay*hours + overtimePay;
	}

	@Override
	public String toString() {
		return "FullTimeHourlyEmployee [overtimePay=" + overtimePay + ", hourlyPay=" + hourlyPay + ", directDeposit="
				+ directDeposit + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", ssn="
				+ ssn + ", address=" + address + ", id=" + id + ", pay=" + computePay(hours) + "]\n";
	}
	public void introduce() {
		System.out.println(toString());
	}
	public void introduce(int noSSN) {
		String s = toString();
		int ind = s.indexOf("ssn");
		s = s.substring(0, ind-3) + s.substring(ind+4+Integer.toString(ssn).length());
		System.out.println(s);
	}
	public void introduce(int noSSN,int noPay) {
		String s = toString();
		int ind = s.indexOf("ssn");
		s = s.substring(0, ind-2) + s.substring(ind+4+Integer.toString(ssn).length());
		ind = s.indexOf("pay");
		s = s.substring(0, ind-2) + s.substring(ind+4+Integer.toString((int) computePay(hours)).length());
		System.out.println(s);
	}



	
	
	
	
	


	
	
}
