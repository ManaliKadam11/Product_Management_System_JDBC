package com.company.controller;

import com.company.service.CustomerService;

public class UpdateCustomer {
	public static void main(String []args) {
		CustomerService customerService = new CustomerService();
		
		boolean c = customerService.updateCustomer(2);
		System.out.println(c);
	}
}
