package com.ssi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entities.Product;
import com.ssi.services.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("productentry")
	public String showProductEntryForm() {
		return "productentry.jsp";
	}
	
	@RequestMapping("saveproduct")
	public ModelAndView saveProduct(@ModelAttribute("product") Product product) {
		System.out.println(product);
		productService.createProduct(product);
		ModelAndView mv=new ModelAndView("success.jsp");
		return mv;
	}
}
