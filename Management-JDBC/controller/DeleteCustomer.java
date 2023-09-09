package com.company.controller;

import com.company.service.CustomerService;

public class DeleteCustomer {
	public static void main(String []args) {
		CustomerService customerService = new CustomerService();
		boolean res = customerService.deleteCustomer(4);
		System.out.println(res);
	}
}
