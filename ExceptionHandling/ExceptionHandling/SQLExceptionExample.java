package ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionExample {
	
	static final String jdbc_driver = "com.mysql.jdbc_driver";
	static final String dburl = "jdbc:mysql://locashost/STOREDB";
	static final String dbuser = "root";
	static final String dbpass = "root";
	
	public static void main(String[] args) throws SQLException {
	
		Connection con = null;
		Statement stmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/123");
			stmt = con.createStatement();
			String Query = "SELECT * FROM item";
			
			ResultSet rset = stmt.executeQuery(Query);
			while(rset.next()) {
				System.out.print("ID :" +rset.getInt(1));
				System.out.print("Product :" +rset.getString(2));
				System.out.print("Price :" +rset.getInt(3));
				
			}
		}
		
		catch(SQLException sql) {
			System.err.print("Cannot connect! "); 
			sql.printStackTrace();
		}
		
		finally {
			System.out.print("Closing the connection.");
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException ignore){
					
				}
			}
			
		}
		
		
		
		
	}

}
