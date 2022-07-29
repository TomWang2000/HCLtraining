package training.com.tomw.day8.assignments;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prompt3 {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");

			CallableStatement call = conn.prepareCall("{call empprocedure(3, 'Emp3')}");
			call.execute();
			ResultSet res = call.executeQuery("select * from employee");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2));
			}
		} catch (SQLException e) {
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
