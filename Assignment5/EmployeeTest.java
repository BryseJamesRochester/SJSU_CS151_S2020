
public class EmployeeTest {

	public static void main(String[] args) {
		Employee john = new Employee("John", "Smith", 101, 35);
		System.out.println("Pay for 40 hours = " + john.computePay(40));
		System.out.println();
		System.out.println("Pay for 23 hours = " + john.computePay(23));
		System.out.println();
		System.out.println("Pay for 1 hour = " + john.computePay(1));
		System.out.println();
		System.out.println("Pay for 0 hours = " + john.computePay(0));
		System.out.println();
		System.out.println("Pay for -5 hours = " + john.computePay(-5));
		System.out.println();
		System.out.println("Pay for 45 hours = " + john.computePay(45));

	}

}
