package javaCampDay2Homework;

public class CourseManager {
	
	public void startLesson(Courses course) {
		System.out.println( course.getCourseName() + ": Derse ba�land�.");
	}
	
	public void seeTheInstructor(Courses course) {
		System.out.println("E�itmen: " + course.getInstructor());
	}
	
	public void endThisLesson(Courses course) {
		System.out.println(course.getCourseName() + ": Ders bitirildi.");
	}

}
