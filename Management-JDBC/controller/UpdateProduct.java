package com.company.controller;

import com.company.service.ProductService;

public class UpdateProduct {
	public static void main(String []args) {
		ProductService productService=new ProductService();
		
		boolean p = productService.updateProduct(3);
		System.out.println(p);
	}
}
