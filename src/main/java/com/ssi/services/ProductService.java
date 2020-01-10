package com.ssi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.ProductDAO;
import com.ssi.entities.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDAO productDAO;
	
	public Product createProduct(Product product) {
		return productDAO.addProduct(product);
	}
}
