package com.sagar.springmvcmaster.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.sagar.springmvcmaster.exception.ProductNotFoundException;
import com.sagar.springmvcmaster.mapper.ProductMapper;
import com.sagar.springmvcmaster.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> getAllProducts() {
		String sql = "select * from product";
		return jdbcTemplate.query(sql, new ProductMapper());
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		String sql = "select * from product where category=?";
		return jdbcTemplate.query(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, category);
			}

		}, new ProductMapper());
	}

	@SuppressWarnings("deprecation")
	@Override
	public Product getProductById(String productId) throws ProductNotFoundException{
		String sql = "select * from product where product_id=?";
		try {
		return jdbcTemplate.queryForObject(sql, new Object[] { productId }, new ProductMapper());
		}
		catch(DataAccessException ex) {
			throw new ProductNotFoundException(productId,"Product does not Exists with id");
		}
	}

	@Override
	public int addProduct(Product product) {
		String sql = "insert into product(product_id,name,category,manufacturer,description,unitprice)values(?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, product.getProductId());
				ps.setString(2, product.getName());
				ps.setString(3, product.getCategory());
				ps.setString(4, product.getManufacturer());
				ps.setString(5, product.getDescription());
				ps.setInt(6, product.getUnitprice());

			}

		});

	}

	@SuppressWarnings("deprecation")
	@Override
	public Product getProductById1(String productId) {
		String sql = "select * from product where product_id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { productId }, new ProductMapper());
	}

	@Override
	public void DeleteProductById(String productId) {
		String sql = "delete from product where product_id=?";
		jdbcTemplate.update(sql, productId);

	}

	public List<Product> listAllProducts() {
		String sql = "select * from product";
		return jdbcTemplate.query(sql, new ProductMapper());
		
	}
	
	
		

}
