package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		/* 
		 * https://www.ibm.com/docs/en/cics-ts/5.4?topic=processing-acid-properties-transactions
		 * Transactions are used to ensure data consistency. 
		 * If any step was not performed, everything must be undone.
		 */
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false); // Ensures that changes depend on confirmation.
			st = conn.createStatement();
	
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
//			int x = 1;
//			if (x > 0) {
//				throw new SQLException("Fake error!");
//			}
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit(); // Makes all changes.
			
			System.out.println("Done! Rows affected: " + rows1);
			System.out.println("Done! Rows affected: " + rows2);
			
		} catch (SQLException e) {
			try {
				conn.rollback(); // Undoes all changes.
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}