package com.company.controller;

import com.company.dto.Customer;
import com.company.service.CustomerService;

public class CustomerSave {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(2);
		customer.setName("kadam");
		customer.setEmail("kadam@gmail.com");

		CustomerService customerService = new CustomerService();
		Customer c = customerService.customerSave(customer);

		if (c != null) {
			System.out.println("Customer Saved Successfully.....! ");
		}
	}
}
