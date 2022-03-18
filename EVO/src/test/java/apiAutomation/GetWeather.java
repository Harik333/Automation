package apiAutomation;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GetWeather {


  @Test
  public void GetCityWeather() {
	  
	  //RestAssured.baseURI="https://demoqa.com/utilities/weather/city/Pune";
	  String city = "Delhi";
	  
	  given()
	        .log().all()
	  .when()
	        .get("https://demoqa.com/utilities/weather/city/" + city)
	  .then()
	        .log().all().statusCode(200);
	  
	
	  
  }


}
