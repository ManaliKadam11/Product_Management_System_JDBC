package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.configuration.HelperClass;
import com.company.dto.Customer;

public class CustomerDao {
	HelperClass helperClass = new HelperClass();

	Connection connection = null;

	// to save
	public Customer customerSave(Customer customer) {
		connection = helperClass.gectConnection();

		String sql = "INSERT INTO customer VALUES(?,?,?)";

		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, customer.getId());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setString(3, customer.getEmail());

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
		return customer;
	}

//to delete
	public boolean deleteCustomer(int id) {
		connection = helperClass.gectConnection();

		String sql = "DELETE FROM customer WHERE id=?";
		PreparedStatement preparedStatement;

		try {
			preparedStatement = connection.prepareStatement(sql);

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

	// to update customers
	public boolean updateCustomer(int id) {
		connection = helperClass.gectConnection();

		String sql = "UPDATE customer SET name ='Kadam' WHERE ID = ?";

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

	// to get customer by id
	public int getCustomerById(int id) {
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
				System.out.println(resultSet.getString(3));
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

	// to get all customers
	public void GetAllCustomer() {
		// TODO Auto-generated method stub
		connection = helperClass.gectConnection();

		String sql = "SELECT * FROM customer";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
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