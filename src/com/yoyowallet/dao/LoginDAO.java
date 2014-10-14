package com.yoyowallet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yoyowallet.dto.common.Login;
import com.yoyowallet.utils.DBConnection;

/**
 * This class performs the DB access for login operations.
 * 
 * @author Aby
 * 
 */
public class LoginDAO {

	DBConnection dBConnection = new DBConnection();
	Connection connection = null;

	public LoginDAO() {
		try {
			connection = dBConnection.getMySQLDataSource().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String loginUser(Login login) {
		ResultSet resultSet = null;
		String loginQuery = null;
		String username = null;
		if (login.getUserID().contains("@")) {
			loginQuery = "SELECT username FROM userdetails WHERE email=? AND password=?";
		} else {
			loginQuery = "SELECT username FROM userdetails WHERE username=? AND password=?";
		}

		if (connection != null) {
			try {
				PreparedStatement statement = connection
						.prepareStatement(loginQuery);
				statement.setString(1, login.getUserID());
				statement.setString(2, login.getPassword());
				resultSet = statement.executeQuery();
				if (resultSet.next()) {
					username = resultSet.getString(1);
					System.out.println("Login Success.");
				} else {
					System.out.println("Login Failed.");
				}
				statement.close();
				connection.close();
			} catch (SQLException exception) {
				exception.printStackTrace();
				return null;
			}
		}
		return username;
	}
}