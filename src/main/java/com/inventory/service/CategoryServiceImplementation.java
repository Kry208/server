package com.inventory.service;

import com.inventory.exception.ResourceNotFoundException;
import com.inventory.model.Category;
import com.inventory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImplementation implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public String saveCategory(Category category) {
		categoryRepository.save(category);
		return "new category added";
	}


	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(Integer id) throws ResourceNotFoundException {
		return categoryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category with id " + id  + " not found!!"));
	}

	@Override
	public String deleteById(Category category) {
		return categoryRepository.deleteById();
	}
}
