package javaCampDay2Homework;

public class Main {

	public static void main(String[] args) {
		
		Courses course1 = new Courses();
		course1.setCourseId(1);
		course1.setCourseName("First Course");
		course1.setInstructor("Engin Demiroğ");
		course1.setCourseTime("wednesday");
		
		Courses course2 = new Courses();
		course2.setCourseId(2);
		course2.setCourseName("Second Course");
		course2.setInstructor("Engin Demiroğ");
		course2.setCourseTime("saturday");
		
		Courses[] courses = {course1, course2};
		
		for (Courses course: courses) {
			System.out.println(course.getCourseName());
			System.out.println(course.getCourseId());
			System.out.println(course.getCourseTime());
			System.out.println(course.getInstructor());
			System.out.println("--------------");
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.startLesson(course1);
		courseManager.seeTheInstructor(course1);
		courseManager.endThisLesson(course1);
	
	}

}
