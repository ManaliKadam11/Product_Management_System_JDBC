package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.configuration.HelperClass;
import com.company.dto.Product;

public class ProductDao {
	HelperClass helperClass = new HelperClass();

	Connection connection = null;

	// to save products
	public Product saveProduct(Product product) {
		connection = helperClass.gectConnection();
		String sql = "INSERT INTO customer VALUES(?,?,?)";

		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setInt(3, product.getPrice());
			preparedStatement.setString(4, product.getBrand());

			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return product;
	}

	// to delete products
	public boolean deleteProduct(int id) {
		connection = helperClass.gectConnection();

		String sql = "DELETE FROM product WHERE id =?";

		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);

			// values passing
			preparedStatement.setInt(1, id);

			// execution
			int i = preparedStatement.executeUpdate();

			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

//to update products

	public boolean updateProduct(int id) {

		connection = helperClass.gectConnection();

		String sql = "UPDATE product SET name ='manali' WHERE ID = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			int i = preparedStatement.executeUpdate();

			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	//to get product by id 
	public int getProductById(int id) {
		// TODO Auto-generated method stub
		connection = helperClass.gectConnection();
		String sql = "SELECT * FROM product WHERE ID=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getInt(3));
				System.out.println(resultSet.getString(4));
				System.out.println("=======================================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return id;
	}

	//to get all products
	public void GetAllProduct() {
		// TODO Auto-generated method stub
		connection = helperClass.gectConnection();

		String sql = "SELECT * FROM product";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getInt(3));
				System.out.println(resultSet.getString(4));
				System.out.println("===============================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
