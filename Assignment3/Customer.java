
public class Customer extends Person{
	private String paymentMethodPreference;
	private boolean specialAccommodations;
	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public Customer(String firstName, String lastName, int streetNum, String streetName, String city, int zip,
			String state) {
		super(firstName, lastName, streetNum, streetName, city, zip, state);
	}

	public Customer(String firstName, String lastName, int age, int ssn, int id, int streetNum, String streetName,
			String city, int zip, String state, String paymentMethodPreference, boolean specialAccommodations) {
		super(firstName, lastName, age, ssn, id, streetNum, streetName, city, zip, state);
		this.paymentMethodPreference = paymentMethodPreference;
		this.specialAccommodations = specialAccommodations;
	}

	public String getPaymentMethodPreference() {
		return paymentMethodPreference;
	}

	public void setPaymentMethodPreference(String paymentMethodPreference) {
		this.paymentMethodPreference = paymentMethodPreference;
	}

	public boolean isSpecialAccommodations() {
		return specialAccommodations;
	}

	public void setSpecialAccommodations(boolean specialAccommodations) {
		this.specialAccommodations = specialAccommodations;
	}

	
	public void makePayment() {
		System.out.println(firstName + " " + lastName + " pays using " + paymentMethodPreference + ".\n");
	}

	@Override
	public String toString() {
		return "Customer [paymentMethodPreference=" + paymentMethodPreference + ", specialAccommodations="
				+ specialAccommodations + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", ssn=" + ssn + ", " + address.toString() + ", id=" + id + "]\n";
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

	
	
	
	


}
