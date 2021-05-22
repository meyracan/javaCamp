package javaCampDay3Homework;

public class InstructorManager extends UserManager {
	
	public void addCourse(String course ) {
		System.out.println("Kurs eklendi: " + course);
	}
	
	public void listStudents() {
		System.out.println("Öðrenciler listelendi.");
	}
	
	public void listGrades() {
		System.out.println("Öðrencilerin notlarý listelendi.");
	}
	
	public void seeMySalary(Instructor instructor) {
		System.out.println("Güncel maaþým: " + instructor.getSalary());
		
	}
	
}
