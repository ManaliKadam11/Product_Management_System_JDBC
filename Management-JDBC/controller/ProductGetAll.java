package com.company.controller;

import com.company.service.ProductService;

public class ProductGetAll {
 public static void main(String []args) {
	 ProductService productService = new ProductService();
	 
	 productService.getAllProduct();
 }
}
