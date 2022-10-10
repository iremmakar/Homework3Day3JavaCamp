package day3Homework3.dataAccess;

import day3Homework3.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("kurse hibernate ile eklendi."+course.getCourseName());
		
	}

}
