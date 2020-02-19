
public class EmployeeTest {

	public static void main(String[] args) {
		Employee joe = new Employee("Joe", "Smith", 30, 819384859, "123 nothing lane", "male", 120, 1, "contractor", "Jan 1, 1900", 60);
		Employee lisa = new Employee("Lisa", "Gray", 30, 819384859, "123 nothing lane", "female", 120, 1, "full time", "Jan 1, 1900", 110000);
		Employee timothy = new Employee("Timothy", "Briggs", 30, 819384859, "123 nothing lane", "male", 120, 1, "full time", "Jan 1, 1900", 80000);
		Employee george = new Employee("George", "Wallace", 30, 819384859, "123 nothing lane", "male", 120, 1, "part time", "Jan 1, 1900", 20);
		Employee amy = new Employee("Amy", "Student", 30, 819384859, "123 nothing lane", "female", 120, 1, "contractor", "Jan 1, 1900", 45);
		
		joe.introduce();
		System.out.println("Joe's pay: "+ joe.calculatePay(30) + "\n");
		lisa.introduce();
		System.out.println("Lisa's pay: "+ lisa.calculatePay(2) + "\n");
		timothy.introduce();
		System.out.println("Timothy's pay: "+ timothy.calculatePay(4) + "\n");
		george.introduce();
		System.out.println("George's pay: "+ george.calculatePay(25) + "\n");
		amy.introduce();
		System.out.println("Amy's pay: "+ amy.calculatePay(45) + "\n");
	}

}
