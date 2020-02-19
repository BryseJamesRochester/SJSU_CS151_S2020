
public class StudentTest {

	public static void main(String[] args) {
			Student student = new Student("John","Smith",20,(float) 3.6,"Computer Science", "School of Computer Science");
			Student.Course course = student.new Course();
			course.printSchedule();
	}

}
