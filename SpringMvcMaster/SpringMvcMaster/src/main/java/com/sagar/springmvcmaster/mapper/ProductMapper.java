package com.sagar.springmvcmaster.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sagar.springmvcmaster.model.Product;

public class ProductMapper   implements RowMapper<Product> {



	   @Override
	    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Product p1 = new Product();
	        p1.setProductId(rs.getString("product_id"));
	        p1.setName(rs.getString("name"));
	        p1.setCategory(rs.getString("category"));
	        p1.setDescription(rs.getString("description"));
	        p1.setManufacturer(rs.getString("manufacturer"));
	        p1.setUnitprice(rs.getInt("unitprice"));
	        return p1;
	    }



	}