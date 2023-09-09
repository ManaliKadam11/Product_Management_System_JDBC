package com.company.controller;

import java.util.Scanner;

import com.company.service.ProductService;

public class GetProductById {
	public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the ID: ");
	int id = sc.nextInt();
	
	ProductService productService = new ProductService();
	productService.getProductById(id);
}
}