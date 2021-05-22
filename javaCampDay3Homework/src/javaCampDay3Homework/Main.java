package javaCampDay3Homework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("0555", "21");
		student1.setName("ogrenci1");
		student1.setSurname("ogrenciSoyadı1");
		student1.setEmail("canmeyra1@gmail.com");
		student1.setPassword("1234");
		
		/*
		 * Student student2 = new Student("ogrenci2", "ogrenciSoyadı2", "abc@gmail.com","0000");
		 * student2 = new Student("0553", "22");
		 * System.out.println(student2.getPassword()); 
		 * System.out.println("********");
		 */
		
		Instructor instructor1 = new Instructor("Course1", 4500, "01");
		instructor1.setName("Engin");
		instructor1.setSurname("Demiroğ");
		instructor1.setEmail("engindemirog@gmail.com");
		instructor1.setPassword("5678");
		
		StudentManager studentManager = new StudentManager();
		studentManager.enterence(student1);
		studentManager.listLessons();
		studentManager.seeCourseName(instructor1.getCourseName());
		studentManager.exiting(student1);
		
		System.out.println("-----------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.enterence(instructor1);
		instructorManager.listStudents();
		instructorManager.listGrades();
		instructorManager.addCourse("Java Kursu");
		instructorManager.seeMySalary(instructor1);
		instructorManager.exiting(instructor1);
	}

}
