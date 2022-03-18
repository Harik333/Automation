package objectFactoryRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DBOperations {
	
	public ResultSet resultTable = null;
	
	
	public void DbRetrieve(String connectionUrl,String sqlQuery) throws SQLException {

            //Set connection
			Connection connection = DriverManager.getConnection(connectionUrl);
            
			//To run SQL Statements
		    Statement statement = connection.createStatement();
		    

		    
		     resultTable = statement.executeQuery(sqlQuery);
		    
		    //ResultSet default index is 0, we do next to reach our Result table
		    resultTable.next();
		    
		          

		
	}

}
