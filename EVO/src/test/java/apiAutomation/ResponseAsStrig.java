package apiAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class ResponseAsStrig {
	
	  @Test
	  public void GetCityWeather() {
		  
		  //RestAssured.baseURI="https://demoqa.com/utilities/weather/city/Pune";
		  String city = "Coimbatore";
		  
		 String Response =  given()
		        .log().all()
		  .when()
		        .get("https://demoqa.com/utilities/weather/city/" + city)
		  .then()
		        .extract().asPrettyString();
		 System.out.println(Response);
		  
	  }
	  
        

}
