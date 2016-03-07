package com.sapient.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;


public class SqlConnection {
public static Connection getOracleConnection(){
		
		Connection con = null;
		
		try {
			//Load the property file
			Properties props = new Properties();
			InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("DbConnection.properties");
			props.load(stream);
			
			//Establish connection
			Class.forName(props.getProperty("db.className"));
			con=DriverManager.getConnection(props.getProperty("db.url"), 
											props.getProperty("db.userName"),
											props.getProperty("db.passWord")
											);
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
