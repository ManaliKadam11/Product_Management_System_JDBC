package com.company.controller;

import com.company.service.CustomerService;

public class CustomerGetAll {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();

		customerService.getAllCustomer();
	}
}
