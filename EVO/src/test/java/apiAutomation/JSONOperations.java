package apiAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;


public class JSONOperations {	
	
	@Test
	public void JSONOps() {
	
	JSONData JD = new JSONData();	
	//Print No of courses returned by API
	JsonPath JP = new JsonPath(JD.JSONResource);
    int NoOfCourses = JP.getInt("courses.size()");
    System.out.println("No Of Courses " + NoOfCourses);
        
    //Print Purchase amount
    int PurchaseAmount = JP.getInt("dashboard.purchaseAmount");
    System.out.println("Total purchase amount is " + PurchaseAmount);
    
    //Print Title of the first course
    int a = 1;
    String Title = JP.getString("courses["+a+"].title");
    System.out.println("Title of first course is " + Title);
    
    //Print All course titles and their respective Prices
    for(int i=0; i<NoOfCourses; i++) {
    System.out.println("Name of the Course is " + JP.getString("courses["+i+"].title") + ", and its Price is: " + JP.getInt("courses["+i+"].price"));
    if(JP.getString("courses["+i+"].title").equalsIgnoreCase("RPA")) {
    	System.out.println("Price of RPA Course is " + JP.getInt("courses["+i+"].price"));
    }
    }   
    //Verify if Sum of all Course prices matches with Purchase Amount
    int TotalSum = 0;
     for(int i=0; i<NoOfCourses; i++) {
    	
    	int Price =  JP.getInt("courses["+i+"].price");
        int Copies = JP.getInt("courses["+i+"].copies");
        int TotalPrice = Price * Copies;
        TotalSum = TotalSum + TotalPrice;
        
	}	
     System.out.println(TotalSum);
     
     Assert.assertEquals(PurchaseAmount, TotalSum);
 }
}


