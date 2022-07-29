package training.com.tomw.day8.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prompt1 {

	public static void main(String[] args) {
		Connection conn = null;
		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");

			Statement stat = conn.createStatement();
			// int ins2 = stat.executeUpdate("insert into student values (" + 2 + ", '" +
			// "Ash" + "')");
			// int update = stat.executeUpdate("update student set name = 'Tom' where id =
			// 1");
			ResultSet res = stat.executeQuery("select * from student");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {

				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
				Statement stat = conn.createStatement();
				int delete = stat.executeUpdate("delete from student where id = 2");
				ResultSet res = stat.executeQuery("select * from student");
				while (res.next()) {
					System.out.println(res.getInt(1) + " " + res.getString(2));
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
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
}
