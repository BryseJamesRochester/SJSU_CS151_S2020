
public class Executive extends Salary {
	private int yearlyBonus;
	


	public Executive() {
		super();
	}



	public Executive(String firstName, String lastName, int streetNum, String streetName, String city, int zip,
			String state) {
		super(firstName, lastName, streetNum, streetName, city, zip, state);
	}



	public Executive(String firstName, String lastName) {
		super(firstName, lastName);
	}
	



	public Executive(String firstName, String lastName, int age, int ssn, int id, int streetNum, String streetName,
			String city, int zip, String state, String educationLevel, boolean directDeposit, int yearlyPay,
			int yearlyBonus) {
		super(firstName, lastName, age, ssn, id, streetNum, streetName, city, zip, state, educationLevel, directDeposit,
				yearlyPay);
		this.yearlyBonus = yearlyBonus;
	}



	public int getYearlyBonus() {
		return yearlyBonus;
	}



	public void setYearlyBonus(int yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}



	public float computePay() {
		return yearlyPay+yearlyBonus;
		
	}


	@Override
	public String toString() {
		return "Executive [yearlyBonus=" + yearlyBonus + ", yearlyPay=" + yearlyPay + ", directDeposit=" + directDeposit
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn + ", address="
				+ address + ", id=" + id + ", pay=" + computePay() + "]\n";
		
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
		s = s.substring(0, ind-2) + s.substring(ind+4+Integer.toString((int) computePay()).length());
		System.out.println(s);
	}

	
	
}
