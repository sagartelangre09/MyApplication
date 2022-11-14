package com.sagar.springmvcmaster.exception;

public class ProductNotFoundException extends Exception
{
	private String message;
	private String productId;
	
	public ProductNotFoundException() {
		super();
	}

	public ProductNotFoundException(String message, String productId) {
		super();
		this.message = message;
		this.productId = productId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	

}
