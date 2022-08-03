package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SirClass {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Nandy*16");
			statement = connection.createStatement(); 
			ResultSet resultSet = statement.executeQuery("select * from account");
			while (resultSet.next()) {				
				System.out.println(resultSet.getInt(1) + ", " + resultSet.getString(2) + ", " + resultSet.getString(3) + ", " + resultSet.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally  {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
