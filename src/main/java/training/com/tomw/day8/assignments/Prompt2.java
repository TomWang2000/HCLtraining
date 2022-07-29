package training.com.tomw.day8.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prompt2 {

	public static void main(String[] args) {
		Connection conn = null;
		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");

			PreparedStatement PrepStat = conn.prepareStatement("insert into student values (?,?)");
			PrepStat.setInt(1, 2);
			PrepStat.setString(2, "Ash");
			int count = PrepStat.executeUpdate();
			ResultSet res = PrepStat.executeQuery("select * from student");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2));
			}
			PreparedStatement UpdatePrepStat = conn.prepareStatement("update student set name = ? where id = ?");
			UpdatePrepStat.setString(2, "Tommy");
			UpdatePrepStat.setInt(1, 1);
			int count1 = UpdatePrepStat.executeUpdate();
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2));
			}
			
			PreparedStatement DeletePrepStat = conn.prepareStatement("delete from student where id = ?");
			DeletePrepStat.setInt(1, 2);
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
