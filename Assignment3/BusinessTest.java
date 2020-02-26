
public class BusinessTest {

	public static void main(String[] args) {
		Executive one = new Executive("John", "Doe", 35, 485937582, 1, 256, "Eagle", "Turlock", 95382, "CA", "Masters", true, 100000,
				25000);
		Executive two = new Executive("Jane", "Done", 25, 937454820, 2, 938, "Bird", "Turlock", 95382, "CA", "Masters", true, 100000,
				25000);
		FullTimeSalaryEmployee three = new FullTimeSalaryEmployee("Bryse", "Rochester", 23, 849827474, 3, 1371, "Violet", "Turlock", 95382, "CA", "Bachelors", true,
				85000, 4);
		FullTimeSalaryEmployee four = new FullTimeSalaryEmployee("Vianca", "Soria", 23, 475658585, 4, 1371, "Violet", "Turlock", 95382, "CA", "Bachelors", true,
				85000, 4);
		PartTimeHourlyEmployee five = new PartTimeHourlyEmployee("Kevin", "Green", 42, 874647484, 5, 9485, "Oak", "Turlock", 95382, "CA", "Associate", false,
				34, 20);
		PartTimeHourlyEmployee six = new PartTimeHourlyEmployee("Aaron", "Gray", 34, 974795855, 6, 2834, "Oak", "Turlock", 95382, "CA", "Associate", false,
				38, 20);
		FullTimeHourlyEmployee seven = new FullTimeHourlyEmployee("Alex", "Gorden", 36, 1807474044, 7, 23983, "Rose", "Turlock", 95382, "CA", "Associate", true,
				45, 200, 40);
		FullTimeHourlyEmployee eight = new FullTimeHourlyEmployee("Adam", "Smith", 24, 230847209, 8, 7482, "Geer", "Turlock", 95382, "CA", "Associate", true,
				40, 200, 40);
		Contractor nine = new Contractor("Jaron", "Tacoma", 24, 2093840293, 9, 13830, "Geer", "Turlock", 95382, "CA", "Bachelors", true,
				60, 500, 40);
		Contractor ten = new Contractor("Aidan", "Chandler", 24, 2083492983, 10, 3844, "Geer", "Turlock", 95382, "CA", "Bachelors", true,
				70, 1000, 50);
		Customer eleven = new Customer("Adela", "Hernandez", 32, 849495753, 11, 29384, "Hawkeye", "Turlock", 95382, "CA", "Credit", false);
		Customer twelve = new Customer("Carol", "Cline", 75, 844649297, 12, 3123, "Hawkeye", "Turlock", 95382, "CA", "Check", true);
		
		
		one.introduce();
		two.introduce(0);
		three.introduce();
		four.introduce(0, 0);
		five.introduce();
		six.introduce();
		seven.introduce();
		eight.introduce(0);
		nine.introduce(0, 0);
		ten.introduce();
		eleven.introduce();
		twelve.introduce();
		





		

	}

}
