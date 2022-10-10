package day3Homework3.business;

import java.util.ArrayList;
import java.util.List;

import day3Homework3.core.logging.Logger;
import day3Homework3.dataAccess.CourseDao;
import day3Homework3.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course,List<Course> myCourses) throws Exception {
		
		if(course.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");

		}
		
		for(Course courses:myCourses) {
			if(courses.getCourseName() == course.getCourseName()) {
				throw new Exception("Bu kurs daha önce eklendi veya kurs fiyatı 0'dan küçük olamaz.");
			}
		}
		
		
		
		myCourses.add(course);
		courseDao.add(course);
		
		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}
		
	}
	

}
