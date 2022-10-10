package day3Homework3;

import java.util.ArrayList;
import java.util.List;

import day3Homework3.business.CategoryManager;
import day3Homework3.business.CourseManager;
import day3Homework3.business.InstructorManager;
import day3Homework3.core.logging.DatabaseLogger;
import day3Homework3.core.logging.FileLogger;
import day3Homework3.core.logging.Logger;
import day3Homework3.core.logging.MailLogger;
import day3Homework3.dataAccess.HibernateCategoryDao;
import day3Homework3.dataAccess.JdbcCourseDao;
import day3Homework3.dataAccess.JdbcInstructorDao;
import day3Homework3.entities.Category;
import day3Homework3.entities.Course;
import day3Homework3.entities.Instructor;


public class Main {

	public static void main(String[] args) throws Exception {
		
		
		List<Course> myCourses = new ArrayList<Course>();
		Logger[] loggers = {new DatabaseLogger(),new MailLogger(),new FileLogger()};
		
		Course course = new Course();
		course.setCourseName("C++");
		course.setPrice(44);
		
		Course course2 = new Course();
		course2.setCourseName("Java");
		course2.setPrice(10);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
		courseManager.add(course,myCourses);
		courseManager.add(course2,myCourses);
	
		List<Category> categories = new ArrayList<Category>();
		
		Category category = new Category();
		category.setCategoryName("java");
		
		Category category2 = new Category();
		category2.setCategoryName("c");
		
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category, categories);
		categoryManager.add(category2, categories);
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
		Instructor instructor = new Instructor();
		instructor.setInstructorName("engin");
		instructorManager.add(instructor);

	}

}
