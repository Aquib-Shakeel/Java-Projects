package in.pwsills.main;
import java.util.Date;
import java.sql.*;


import in.pwskills.utility.jddbcUtil;
import java.util.*;
import java.text.*;
public class TestApp {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		Scanner sc=null;
		
		 try {
			connection = jddbcUtil.getDBConnection();
            String sqlInsertQuery="insert into person(name,dob) values(?,?)";
			
            if(connection!=null)
            statement=connection.prepareStatement(sqlInsertQuery);
	       
			if(statement!=null) {
				 sc= new Scanner(System.in);
				System.out.print("Enter a name");
				String name = sc.next();
				System.out.print("Enter date ");
				String dob = sc.next();
				
				SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
				Date utilDate=sdf.parse(dob);
				
				java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
				
				
				statement.setString(1, name);
				statement.setDate(2, sqlDate);
				
				
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
