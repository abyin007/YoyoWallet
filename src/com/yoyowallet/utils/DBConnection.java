package com.yoyowallet.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 * This class is used for getting the mysql dbconnection needed for the database
 * access.
 * 
 * @author Aby
 * 
 */
public class DBConnection {

	public Connection getMySQLDataSource() {
		Properties props = new Properties();
		MysqlDataSource mysqlDS = null;
		Connection con = null;
		String propFile = "dbconnection.properties";
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFile);
			props.load(inputStream);
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
			mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
			mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
			con = mysqlDS.getConnection();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
