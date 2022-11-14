package com.sagar.springmvcmaster.service;

import java.util.List;

import com.sagar.springmvcmaster.exception.ProductNotFoundException;
import com.sagar.springmvcmaster.model.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	public List<Product> getProductsByCategory(String category);
	public Product getProductById(String productId) throws ProductNotFoundException;
	public int addProduct(Product product);
	public void DeleteProductById(String productId);
	//public String getUsernameAndPassword(String username, String password);
	 
	
}
