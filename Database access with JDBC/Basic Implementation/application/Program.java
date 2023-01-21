package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		// A basic implementation of how to connect to the database.
		Connection conn = DB.getConnection();
		DB.closeConnection();

	}

}
