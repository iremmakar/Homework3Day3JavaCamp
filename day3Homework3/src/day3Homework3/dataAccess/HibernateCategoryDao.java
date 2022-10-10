package day3Homework3.dataAccess;

import day3Homework3.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori hibernate ile eklendi."+category.getCategoryName());
		
	}

}
