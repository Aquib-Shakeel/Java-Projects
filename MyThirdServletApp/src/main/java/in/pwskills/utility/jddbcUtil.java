package in.pwskills.utility;
import java.sql.*;
public class jddbcUtil {
 static {
	//Load and Registers JDBC
     try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
 }
     public static Connection getDBConnection() throws SQLException{
    	//Establish the connection
         String url="jdbc:mysql://localhost:3306/pwskills";
         String user="root";
         String password="Friends@2";
        return DriverManager.getConnection(url,user,password);
         
     }
     
     public static void closeResources(ResultSet resultSet,Statement statement,Connection connection)throws SQLException {
    	 if(resultSet!=null) {
    		 resultSet.close();
    	 }
    	 if(statement!=null) {
    		 statement.close();
    	 }
    	 if(connection!=null) {
    		 connection.close();
    	 }
     }
 }
	

