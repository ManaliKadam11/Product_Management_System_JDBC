package com.company.controller;

import java.util.Scanner;

import com.company.service.CustomerService;
public class GetCustomerById {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id: ");
		
	int id = sc.nextInt();
	
	CustomerService customerService = new CustomerService();
	customerService.getCustomerById(id);
	}
}
