package com.inventory;

import com.inventory.model.Category;
import com.inventory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}

//	@Autowired

//	private CategoryRepository categoryRepository;

//	@Override
//	public void run(String... args) throws Exception {
//		Category category = new Category();
//		category.setCategoryName("Beverages");
//		category.setCategoryId("sku1");
//		category.setDescription("All kinds of beverages but no coffee available at the moment");
//		categoryRepository.save(category);
//
//		Category category1 = new Category();
//		category1.setCategoryName("Drinks");
//		category1.setCategoryId("sku2");
//		category1.setDescription("All kinds of drinks including liquor");
//		categoryRepository.save(category1);
//	}
}
