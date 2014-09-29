package com.yoyowallet.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 * This class is used for getting the mysql dbconnection needed for the database
 * access.
 * 
 * @author Aby
 * 
 */
public class DBConnection {

	public DataSource getMySQLDataSource() {
		Properties props = new Properties();
		MysqlDataSource mysqlDS = null;
		String propFile = "dbconnection.properties";
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFile);
			props.load(inputStream);
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
			mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
			mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mysqlDS;
	}

}
