import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {

Connection con;
Statement s;

	public Conn(){
		//Activate JDBC Drivers
				try 
				{
				Class.forName("com.mysql.cj.jdbc.Driver");	
				}
				catch (ClassNotFoundException e) 
				{
					System.out.println("Error in loading drivers"+e);
				}
				try 
				{
			
				//Get Connection
					 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelsk?user=root&password=Sachit@2001");
				//Create Query
					s = con.createStatement();
				}
				catch (SQLException e) 
				{
					System.out.println("Error in sql statement");
				}
	}

	
	}

