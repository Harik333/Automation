package dataBaseAutomation;



import java.sql.SQLException;

import org.testng.annotations.Test;

import objectFactoryRepo.DBOperations;

public class RetrieveDBData{
	
	@Test
	public void DBDataRetrieve() throws SQLException {

        
        DBOperations dbo = new DBOperations();
        
        String connectionUrl = "jdbc:sqlserver://DESKTOP-BVG2GMI;"
                + "database=Selenium;"
                + "user=Harish;"
                + "password=hari@MSSQL28";
        
        String sqlQuery = "Select * From EmployeeInfo where Firstname ='Roger'";
        
        String ColumnName = "location";
        
        dbo.DbRetrieve(connectionUrl, sqlQuery);   
        
        //System.out.println(resultTable.getString(ColumnName));
        
        System.out.println(dbo.resultTable.getString(ColumnName)) ;        
                       

		
	}

}
