package javaCampDay2Homework;

public class CourseManager {
	
	public void startLesson(Courses course) {
		System.out.println( course.getCourseName() + ": Derse baþlandý.");
	}
	
	public void seeTheInstructor(Courses course) {
		System.out.println("Eðitmen: " + course.getInstructor());
	}
	
	public void endThisLesson(Courses course) {
		System.out.println(course.getCourseName() + ": Ders bitirildi.");
	}

}
