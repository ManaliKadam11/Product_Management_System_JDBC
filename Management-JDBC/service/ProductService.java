package com.company.service;

import com.company.dao.ProductDao;
import com.company.dto.Product;

public class ProductService {
	ProductDao productDao = new ProductDao();

	public Product saveProduct(Product product) {
		return productDao.saveProduct(product);
	}

	public boolean deleteProduct(int id) {
		return productDao.deleteProduct(id);
	}

	public boolean updateProduct(int id) {
		return productDao.updateProduct(id);
	}

	public int getProductById(int id) {
		// TODO Auto-generated method stub
		int p = productDao.getProductById(id);
		return p;
	}

	public void getAllProduct() {
		// TODO Auto-generated method stub
		productDao.GetAllProduct();
	}
}
