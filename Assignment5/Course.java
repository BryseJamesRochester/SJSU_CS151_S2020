
public class Course {
	private String courseName;
	private String courseDescription;
	private String department;
	private String time;
	private String day;
	
	
	public Course(String courseName, String courseDescription, String department, String time, String day) {
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.department = department;
		this.time = time;
		this.day = day;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseDescription=" + courseDescription + ", department="
				+ department + ", time=" + time + ", day=" + day + "]";
	}
	
	
	
}
