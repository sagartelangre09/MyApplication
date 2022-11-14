package com.sagar.springmvcmaster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sagar.springmvcmaster.exception.ProductNotFoundException;
import com.sagar.springmvcmaster.model.Product;

public interface ProductRepository 
{
	public List<Product> getAllProducts();
    public List<Product> getProductsByCategory(String category);
	public Product getProductById(String productId) throws ProductNotFoundException;
	public int addProduct(Product product);
	public Product getProductById1(String productId);
	public void DeleteProductById(String productId);
	public List<Product> listAllProducts();
	
}
