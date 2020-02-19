
public class Student {
	
	String firstName;
	String lastName;
	int age;
	float gpa;
	String major;
	String department;
	
	public Student(String firstName, String lastName, int age, float gpa, String major, String department ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department=department;
		
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	class Course{
		public void printSchedule() {
			System.out.println(firstName + " " + lastName + " is taking CS151 on Tuesday and Thursday from 6-715pm" );
		}
	}


}
