package in.pwsills.main;

import java.sql.*;

import in.pwskills.utility.jddbcUtil;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null; 
		
		 try {
			connection = jddbcUtil.getDBConnection();

			if(connection!=null)
				statement = connection.createStatement();
			
			if(statement!=null )
			    resultSet = statement.executeQuery("select name from student where age=22");
			
	        if(resultSet!=null) {
	         while(resultSet.next()) {
	        	 System.out.println(resultSet.getString(1));
	         }
	        }	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				jddbcUtil.closeResources(resultSet,statement,connection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}   
	}
}
