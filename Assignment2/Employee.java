
public class Employee extends Person {
	int id;
	String status;
	String startDate;
	int pay;
	public Employee(String firstName, String lastName, int age, long socialSecurityNumber, String address,
			String gender, float weight, int id, String status, String startDate, int pay) {
		super(firstName, lastName, age, socialSecurityNumber, address, gender, weight);
		this.id = id;
		this.status = status;
		this.startDate = startDate;
		this.pay = pay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", status=" + status + ", startDate=" + startDate + ", pay=" + pay
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", socialSecurityNumber="
				+ socialSecurityNumber + ", address=" + address + ", gender=" + gender + ", weight=" + weight + "]";
	}
	
	public int calculatePay(int time) {
		if (status.equalsIgnoreCase("full time"))
			return ((pay/52)*time);
		else
			return pay*time;
	}

	
	}


