package training.com.tomw.day8.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prompt6 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");

			Statement stat = conn.createStatement();
			stat.executeUpdate("insert into employee values (123,'emp123')");
			stat.executeUpdate("update employee set id = 100 where name = 'emp1'");
			ResultSet res = stat.executeQuery("select * from employee");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2));
			}

			PreparedStatement PrepStat = conn.prepareStatement("insert into student values (?, ?)");
			PrepStat.setInt(1, 100);
			PrepStat.setString(2, "Random Person");
			PrepStat.addBatch();
			try {
				PrepStat.executeBatch();
			} catch (SQLException e) {
				e.getMessage();
			}
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
