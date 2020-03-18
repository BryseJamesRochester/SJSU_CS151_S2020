
public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science");
		try {
			Student s2 = (Student) s1.clone();
			s1.printInfo();
			s2.printInfo();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
