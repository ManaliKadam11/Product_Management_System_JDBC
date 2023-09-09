package com.company.service;

import com.company.dao.CustomerDao;
import com.company.dto.Customer;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();

	public Customer customerSave(Customer customer) {
		return customerDao.customerSave(customer);
	}

	public boolean deleteCustomer(int id) {
		return customerDao.deleteCustomer(id);
	}

	public boolean updateCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(id);
	}

	public int getCustomerById(int id) {
		// TODO Auto-generated method stub
		int p = customerDao.getCustomerById(id);
		return p;
	}

	public void getAllCustomer() {
		// TODO Auto-generated method stub
		customerDao.GetAllCustomer();
	}

}
