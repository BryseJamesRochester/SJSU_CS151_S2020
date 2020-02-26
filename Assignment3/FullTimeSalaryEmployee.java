
public class FullTimeSalaryEmployee extends Salary{
	private int weeks;
	
	public FullTimeSalaryEmployee() {
		super();
	}

	public FullTimeSalaryEmployee(String firstName, String lastName, int streetNum, String streetName, String city,
			int zip, String state) {
		super(firstName, lastName, streetNum, streetName, city, zip, state);
	}

	public FullTimeSalaryEmployee(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public FullTimeSalaryEmployee(String firstName, String lastName, int age, int ssn, int id, int streetNum,
			String streetName, String city, int zip, String state, String educationLevel, boolean directDeposit,
			int yearlyPay, int weeks) {
		super(firstName, lastName, age, ssn, id, streetNum, streetName, city, zip, state, educationLevel, directDeposit,
				yearlyPay);
		this.weeks = weeks;
	}
	
	public float computePay(int weeks) {
		return (yearlyPay/52)*weeks;
	}

	@Override
	public String toString() {
		return "FullTimeSalaryEmployee [yearlyPay=" + yearlyPay + ", directDeposit=" + directDeposit
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn + ", address="
				+ address + ", id=" + id + ", pay=" + computePay(weeks) + "]\n";
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
		s = s.substring(0, ind-2) + s.substring(ind+4+Integer.toString((int) computePay(weeks)).length());
		System.out.println(s);
	}
	

}
