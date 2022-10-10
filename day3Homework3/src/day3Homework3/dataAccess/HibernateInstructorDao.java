package day3Homework3.dataAccess;

import day3Homework3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor hibernate ile eklendi."+instructor.getInstructorName());
		
	}

}
