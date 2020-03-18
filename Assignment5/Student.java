
public class Student implements Cloneable{
	private String firstName;
	private String lastName;
	private int age;
	private double gpa;
	private String major;
	private String department;
	private Course cs151;
	private Course cs147;
	private Course cs123;
	private Course math161;
	public Student(String firstName, String lastName, int age, double gpa, String major, String department) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.cs151 = new Course("Computer Science 151", "Object Oriented Design", "computer Science", "6:00PM", "Tuesday");
		this.cs147 = new Course("Computer Science 147", "Computer Architecture", "computer Science", "7:30PM", "Tuesday");
		this.cs123 = new Course("Computer Science 123", "Bioinformatics", "computer Science", "10:00AM", "Tuesday");
		this.math161 = new Course("Mathematics 161", "Applied Probability and Statistics", "math", "4:30PM", "Tuesday");
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
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
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
	public Course getCs151() {
		return cs151;
	}
	public void setCs151(Course cs151) {
		this.cs151 = cs151;
	}
	public Course getCs147() {
		return cs147;
	}
	public void setCs147(Course cs147) {
		this.cs147 = cs147;
	}
	public Course getCs123() {
		return cs123;
	}
	public void setCs123(Course cs123) {
		this.cs123 = cs123;
	}
	public Course getMath161() {
		return math161;
	}
	public void setMath161(Course math161) {
		this.math161 = math161;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gpa=" + gpa
				+ ", major=" + major + ", department=" + department + ", course one=" + cs151.toString() + ", course two=" + cs147.toString()
				+ ", course three=" + cs123.toString() + ", course four=" + math161.toString() + "]";
	}
	public void printInfo() {
		System.out.println(toString());
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	
}
