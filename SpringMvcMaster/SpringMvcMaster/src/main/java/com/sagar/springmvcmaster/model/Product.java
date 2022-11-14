package com.sagar.springmvcmaster.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="PRODUCT")
public class Product 
{
	@Id
	@Column(name="PRODUCT_ID")
	private String productId;
	@NonNull
	private String category;
	@NonNull
	private String description;
	
	@Size(min=5,max=40,message="{spring.form.name.size}")
	@NonNull
	private String name;
	@NonNull
	private String manufacturer;
	@NonNull
	private int unitprice;
	
	@Transient
	private MultipartFile productImage;
	
	public Product() {
		super();
	}

	public Product(String productId, String category, String description, String name, String manufacturer,
			int unitprice) {
		super();
		this.productId = productId;
		this.category = category;
		this.description = description;
		
		this.name = name;
		this.manufacturer = manufacturer;
		this.unitprice = unitprice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}
	
	
	
	

}
