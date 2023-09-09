package com.company.controller;

import com.company.dto.Product;
import com.company.service.ProductService;

public class ProductSave {
	public static void main(String[] args) {
		Product product = new Product();
		product.setId(3);
		product.setName("laptop");
		product.setPrice(50000);
		product.setBrand("HP");
		
		ProductService productService = new ProductService();
		Product p = productService.saveProduct(product);
		
		if(p!=null) {
			System.out.println("Product Saved Sucessfully!! "); 
		}
	}
	
}
