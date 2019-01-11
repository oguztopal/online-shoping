package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	private static  List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setCategoryId(1);
		category.setName("Televizyon");
		category.setDescription("açıklama");
		category.setImageUrl("CAT_1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setCategoryId(2);
		category.setName("Telefon");
		category.setDescription("açıklama");
		category.setImageUrl("CAT_2.png");
		
		categories.add(category);
		
		category= new Category();
		category.setCategoryId(3);
		category.setName("Laptop");
		category.setImageUrl("CAT_3.png");
		category.setDescription("açıklama");
		
		categories.add(category);
	}
	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category : categories) {
			if (category.getCategoryId() == id) {
				return category;
			}
		}
		return null;
	}

}
