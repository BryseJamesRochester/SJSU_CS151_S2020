
public class Employee {
	private String firstName;
	private String lastName;
	private int employeeID;
	private int hourlyPay;
	
	public Employee(String firstName, String lastName, int employeeID, int hourlyPay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.hourlyPay = hourlyPay;
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

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	public double computePay(int hours) {
		try {
			if (hours<1)
				throw new NumberFormatException();
			if (hours>40)
				throw new TooManyHoursWorkedException("Hours worked cannot exceed 40."); 
			return (double)hours*hourlyPay;
		} catch (NumberFormatException nfe) {
			System.out.println("Improper format of hours worked with " + hours + " hours.");
			return 0;
		} catch (TooManyHoursWorkedException tmhwe) {
			System.out.println(tmhwe.getMessage());
			return 0;
		}
		
	}

}
