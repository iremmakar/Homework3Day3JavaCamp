package day3Homework3.business;

import day3Homework3.core.logging.Logger;
import day3Homework3.dataAccess.InstructorDao;
import day3Homework3.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for(Logger logger:loggers) {
			logger.log(instructor.getInstructorName());
		}
		
	}

	
	
	
	

}
