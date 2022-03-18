package apiAutomation;

import java.io.File;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class FileUpload {
	
	@Test
	public void SendAttachment() {
		File attachment1 = new File("C:\\Program Files (x86)\\Pers Files\\Harish Krishnadas Profile Pic.JPG");
		
		given().log().all()
		      .baseUri("http://demo.guru99.com/test/upload/")
		      .multiPart(attachment1).
	    when()
	          .post().
	    then()
	          .statusCode(200);
		 
		
	}

}
