package day3Homework3.dataAccess;

import day3Homework3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor jdbc ile eklendi."+instructor.getInstructorName());
		
	}

}
