package day3Homework3.dataAccess;

import day3Homework3.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("kurs jdbc ile eklendi."+course.getCourseName());
		
	}

}
