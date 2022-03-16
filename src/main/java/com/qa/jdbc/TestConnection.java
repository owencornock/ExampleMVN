package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestConnection {

	public static final Logger LOGGER = LogManager.getLogger();

	private String connectionURL = "jdbc:mysql://localhost:3306/persondb";
	private String username = "root";		
	private String password = "72ZF%KhePZ";

	public void testConnection() {
		Connection conn = null;
		try {
			System.out.println("Attempting DB connection...");
			conn = DriverManager.getConnection(connectionURL, username, password);
			System.out.println("Connected Successfully!");
		} catch (SQLException se) {
			LOGGER.error(se.getMessage());
		} finally {
			try {
				if(conn != null) {
					System.out.println("Attempting to close connection...");
					conn.close();
					System.out.println("Connection closed");
				}
			} catch(SQLException e) {
				LOGGER.error(e);
			}
		}
	
	}

}
