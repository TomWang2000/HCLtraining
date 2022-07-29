package training.com.tomw.day8.assignments;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Prompt5 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");

			Statement stat = conn.createStatement();
			stat.executeUpdate("insert into employee values (5,'emp5')");
			System.out.println("Inserted Employee values successfully");
			stat.executeUpdate("insert into student values (6,'Dan')");
			System.out.println("Inserted Student values successfully");
			conn.setAutoCommit(false);
			conn.commit();
			
		} catch (SQLException e) {
			try {
				conn.setAutoCommit(false);
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
