package in.pwsills.main;

import java.sql.*;

import in.pwskills.utility.jddbcUtil;
import java.util.*;
public class UpdateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		Scanner sc=null;
		
		 try {
			connection = jddbcUtil.getDBConnection();
            String sqlUpdateQuery="update student set name=? where name=?";
			
            if(connection!=null)
            statement=connection.prepareStatement(sqlUpdateQuery);
	       
			if(statement!=null) {
				 sc= new Scanner(System.in);
				System.out.print("Enter a name");
				String name1 = sc.next();
				
				System.out.print("Enter seecond name");
				String name2=sc.next();
				
				
				
				statement.setString(1, name1);
				statement.setString(2, name2);
				
				int rowAffected=statement.executeUpdate();
				if(rowAffected==1) {
					System.out.print("row affected : "+rowAffected);
				}else {
					System.out.print("Row not affected");
				}
			}
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				jddbcUtil.closeResources(resultSet,statement,connection);
				sc.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
        
        
         
        
	}

}
