package javaCampDay2Homework;

public class Courses {
	
	private String courseName;
	private int CourseId;
	private String instructor;
	private String courseTime;
	
	public Courses() {
		
	}
	
	public Courses(String courseName, int courseId, String instructor, String courseTime) {
		this();
		this.courseName = courseName;
		this.CourseId = courseId;
		this.instructor = instructor;
		this.courseTime = courseTime;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getCourseId() {
		return CourseId;
	}


	public void setCourseId(int courseId) {
		CourseId = courseId;
	}


	public String getInstructor() {
		return instructor;
	}


	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}


	public String getCourseTime() {
		return courseTime;
	}


	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

}
