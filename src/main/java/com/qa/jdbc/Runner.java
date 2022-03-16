package com.qa.jdbc;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class Runner {

	public static void main(String[] args) {
		// Testing connection
//		TestConnection tc = new TestConnection();
//		tc.testConnection();

		// CRUD functionality (CREATE, READ, UPDATE, DELETE)
		// DOA - Data Access Object
		
		PersonDAO pDAO = new PersonDAO();
		Person p = new Person("John", "Smith", 30);
		
		pDAO.create(p);

//		PersonDAO createPrepared = new PersonDAO();
//		Person o = new Person();
//		
//		createPrepared.create(o);
		
	}

}
