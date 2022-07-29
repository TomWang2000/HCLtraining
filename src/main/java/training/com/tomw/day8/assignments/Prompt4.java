package training.com.tomw.day8.assignments;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Prompt4 {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");

			Statement stat = conn.createStatement();

			ResultSet rs = stat.executeQuery("select * from student");
			ResultSetMetaData rsData = rs.getMetaData();
			System.out.println(rsData.getColumnName(1));
			System.out.println(rsData.getColumnName(2));
			System.out.println(rsData.getColumnType(1));
			System.out.println(rsData.getColumnType(2));

			DatabaseMetaData dbData = conn.getMetaData();
			System.out.println(dbData.getDriverMajorVersion());
			System.out.println(dbData.getMaxColumnsInIndex());
			System.out.println(dbData.getMaxUserNameLength());

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
