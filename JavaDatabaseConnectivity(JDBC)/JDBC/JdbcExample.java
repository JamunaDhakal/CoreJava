package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {
	
	public static void main(String[] args) {
		
		String url  = "jdbc:mysql://localhost:3306/mydatabase"; 
		String username = "root";
		String password =  "password";
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
			
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				System.out.print("ID :"+ id + "Name: "+name);
			}
			resultSet.close();
			statement.close();
			connection.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

}
