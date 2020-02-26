
public class PartTimeHourlyEmployee extends Hourly{

	public PartTimeHourlyEmployee() {
		super();
	}

	public PartTimeHourlyEmployee(String firstName, String lastName, int streetNum, String streetName, String city,
			int zip, String state) {
		super(firstName, lastName, streetNum, streetName, city, zip, state);
	}

	public PartTimeHourlyEmployee(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public PartTimeHourlyEmployee(String firstName, String lastName, int age, int ssn, int id, int streetNum,
			String streetName, String city, int zip, String state, String educationLevel, boolean directDeposit,
			int hourlyPay,int hours) {
		super(firstName, lastName, age, ssn, id, streetNum, streetName, city, zip, state, educationLevel, directDeposit,
				hourlyPay, hours);
	}
public float computePay(int hours) {
		if (hours>40)
			return -1;
		else
			return hourlyPay*hours;
	}

@Override
public String toString() {
	return "PartTimeHourlyEmployee [hourlyPay=" + hourlyPay + ", directDeposit=" + directDeposit + ", firstName="
			+ firstName + ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn + ", address=" + address + ", id="
			+ id + ", pay=" + computePay(hours) + "]\n";
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
