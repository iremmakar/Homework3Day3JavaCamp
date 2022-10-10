package day3Homework3.business;

import java.util.List;

import day3Homework3.core.logging.Logger;
import day3Homework3.dataAccess.CategoryDao;
import day3Homework3.entities.Category;
import day3Homework3.entities.Course;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category,List<Category> categories) throws Exception {
		
		for(Category c:categories) {
			if(c.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Bu kategori daha önce eklendi");
			}
		}
		
		
		
		categories.add(category);
		categoryDao.add(category);
		
		for(Logger logger:loggers) {
			logger.log(category.getCategoryName());
		}
	}
	
	
}
