package javaCampDay3Homework;

public class Instructor extends User {
	private String courseName;
	private double salary;
	private String instructorNumber;
	
	public Instructor(String courseName, double salary, String instructorNumber) {
		super();
		this.courseName = courseName;
		this.salary = salary;
		this.instructorNumber = instructorNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

}