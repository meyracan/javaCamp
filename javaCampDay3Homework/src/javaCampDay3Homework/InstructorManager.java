package javaCampDay3Homework;

public class InstructorManager extends UserManager {
	
	public void addCourse(String course ) {
		System.out.println("Kurs eklendi: " + course);
	}
	
	public void listStudents() {
		System.out.println("��renciler listelendi.");
	}
	
	public void listGrades() {
		System.out.println("��rencilerin notlar� listelendi.");
	}
	
	public void seeMySalary(Instructor instructor) {
		System.out.println("G�ncel maa��m: " + instructor.getSalary());
		
	}
	
}
