package com.inventory.service;

import com.inventory.model.Product;

import java.util.List;

public interface ProductService {
	public Product saveProduct(Product product);
	public List<Product> getAllProducts();
}
