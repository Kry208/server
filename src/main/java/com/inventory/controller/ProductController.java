package com.inventory.controller;

import com.inventory.model.Product;
import com.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// defines the methods on the product ['GET', 'POST', 'DELETE', 'PUT']
@RestController
@RequestMapping("/api/v1")
public class ProductController {

	@Autowired
	private ProductService productService;
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@PostMapping("/add-product")
	public String addProduct(@RequestBody Product product) {
		productService.saveProduct(product);
		return "new product added";
	}

	@DeleteMapping("/delete-product")
	public String deleteProduct() {
		return "product deleted";
	}

}
