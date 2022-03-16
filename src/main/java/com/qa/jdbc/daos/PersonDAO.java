package com.qa.jdbc.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.jdbc.domain.Person;

public class PersonDAO {
	
	public static final Logger LOGGER = LogManager.getLogger();


	private String connectionURL = "jdbc:mysql://localhost:3306/persondb";
	private String username = "root";		
	private String password = "72ZF%KhePZ";
	
	// CREATE
	public void create(Person person) {
		

		try(Connection conn = DriverManager.getConnection(connectionURL, username, password);
				PreparedStatement statement = conn.prepareStatement("INSERT INTO peopleOne(firstName, lastName, age) VALUES(?, ?, ?)")) {
			statement.setString(1, person.getFirstName());
			statement.setString(2, person.getLastName());
			statement.setInt(3, person.getAge());
			statement.executeUpdate();
//			Statement statement = conn.createStatement()) {
//			statement.executeUpdate("INSERT INTO peopleOne(firstName, lastName, age) VALUES ('" + person.getFirstName() + "', '" + person.getLastName() + "', " + person.getAge() + ")");
			System.out.println("Person Created");
		} catch(SQLException e) {
			LOGGER.error(e);
		}
	}
		
	
	// READ ALL
	public void readAll() {}
	
	// READ BY ID (PRIMARY KEY)
	public void readByID() {}
	
	// UPDATE
	public void update() {}
	
	// DELETE
	public void delete() {}
}
