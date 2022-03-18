package apiAutomation;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

public class RequestAsFile {
	
	@Test
	public void ReqAsFile() {
		File JSONRequest = new File("C:\\Temp\\AddPlace.txt");
		
		
		given()
		      .log().all()
		      .baseUri("https://rahulshettyacademy.com/maps/api/place/add/json")
		      .queryParam("key", "qaclick123")
		      .contentType("application/json")
		      .body(JSONRequest).
	    when()
	        .post().
	    then()
	        .log().all()
	        .assertThat().statusCode(200);
	        
		          	
	}

}
