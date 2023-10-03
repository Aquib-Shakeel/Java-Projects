package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {
public static Connection connection=null;
public static Connection getConnection() {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localHost:3306/FileHider?useSSL=false","root","Friends@2");
		
	} catch (ClassNotFoundException | SQLException  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	System.out.println("connection succesfull");
	return connection;
}
public static void closeConnection() {
	if(connection!=null) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}
