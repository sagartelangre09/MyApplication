package com.sagar.springmvcmaster.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.springmvcmaster.exception.ProductNotFoundException;
import com.sagar.springmvcmaster.model.Product;
import com.sagar.springmvcmaster.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		System.out.println("hi sagar this is service method");
		return productRepository.getAllProducts().stream().filter(p -> p.getCategory().equals(category))
				.collect(Collectors.toList());

	}

	@Override
	public Product getProductById(String productId) throws ProductNotFoundException {
		return productRepository.getProductById(productId);
	}

	@Override
	public int addProduct(Product product) {
		return productRepository.addProduct(product);
	}

	@Override
	public void DeleteProductById(String productId) {
		productRepository.DeleteProductById(productId);

	}

	
	
}
