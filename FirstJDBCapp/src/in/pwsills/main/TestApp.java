package in.pwsills.main;

import java.sql.*;

public class TestApp {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		//Load and Registers JDBC
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         //Establish the connection
         String url="jdbc:mysql://localhost:3306/pwskills";
         String user="root";
         String password="Friends@2";
         Connection connection=DriverManager.getConnection(url,user,password);
         
         //Create a statement object
         Statement statement = connection.createStatement();
         
         //Execute query
         String sqlNonSelectQuery="update student set name='Shashwat' where name='vivek'";
         int rowsAffected=statement.executeUpdate(sqlNonSelectQuery);
         
         //Process the result
        if(rowsAffected>=1) {
        	System.out.println("No of rows affected :- "+rowsAffected);
        }else {
        	System.out.println("rowws not affected");
        }
         
         //Close the resources
         
         statement.close();
         connection.close();
	}

}
