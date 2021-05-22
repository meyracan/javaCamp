package javaCampDay3Homework;

public class Student extends User {
	private String phoneNumber;
	private String age;
	
	public Student() {
		super();
	}

	public Student(String phoneNumber, String age) {
		super();
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	public Student(String name, String surname, String email, String password) {
		super(name, surname, email, password);
		// TODO Auto-generated constructor stub
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
