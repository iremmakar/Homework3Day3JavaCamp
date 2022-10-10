package day3Homework3.dataAccess;

import day3Homework3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori jdbc ile eklendi."+category.getCategoryName());
		
	}

}
