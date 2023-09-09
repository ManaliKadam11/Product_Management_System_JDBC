package com.company.controller;

import com.company.dto.Product;
import com.company.service.ProductService;
public class DeleteProduct {
	public static void main(String[]args) {
		ProductService productService = new ProductService();
		boolean res = productService.deleteProduct(3);
		System.out.println(res);
	}
}
