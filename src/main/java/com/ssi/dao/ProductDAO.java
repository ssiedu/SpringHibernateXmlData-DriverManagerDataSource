package com.ssi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssi.entities.Product;

@Repository
public class ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Product addProduct(Product product) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(product);
		tr.commit();
		return product;
	}
}
