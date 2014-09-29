package com.yoyowallet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.yoyowallet.dto.common.UserDetails;
import com.yoyowallet.utils.DBConnection;

public class RegisterDAO {

	DBConnection dBConnection = new DBConnection();
	Connection connection = null;

	public RegisterDAO() {
		try {
			connection = dBConnection.getMySQLDataSource().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Add the userdetails into the db using jdbc.
	 * 
	 * @param userDetails
	 */
	public boolean registerUser(UserDetails userDetails) {

		int noOfRecords = 0;
		String message = null;
		boolean registerStatus = false;
		String registerQuery = "INSERT INTO userdetails VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		if (connection != null) {
			try {
				PreparedStatement statement = connection
						.prepareStatement(registerQuery);
				statement.setString(1, userDetails.getUsername());
				statement.setString(2, userDetails.getFname());
				statement.setString(3, userDetails.getLname());
				statement.setString(4, userDetails.getEmail());
				statement.setString(5, userDetails.getPassword());
				statement.setLong(6, userDetails.getMobileNo());
				statement.setString(7, userDetails.getCity());
				statement.setString(8, userDetails.getCountry());
				statement.setInt(9, userDetails.getPinCode());
				statement.setString(10, userDetails.getCurrency());
				statement.setString(11, userDetails.getMartialStatus());
				statement.setString(12, userDetails.getAddress());
				statement.setString(13, userDetails.getStayingWith());

				noOfRecords = statement.executeUpdate();
				statement.close();
				connection.close();
				if(noOfRecords>0){
					registerStatus = true;
				}
				message = noOfRecords + " inserted successfully";
				System.out.println(message);
			} catch (SQLException exception) {
				exception.printStackTrace();
				return false;
			}
		}
		return registerStatus;
	}

	/**
	 * Adding the user using hibernate.
	 * 
	 * @param userDetails
	 */
	public void registerUserUsingHibernate(UserDetails userDetails) {
		// TODO not working
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(userDetails);
		transaction.commit();

	}
}
