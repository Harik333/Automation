package uiAutomation;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FacebookLaunchTest {
	
	@Test
	public void FBLaunchTest() {
		
		System.setProperty("webdriver.edge.driver", "C:\\Temp\\Drivers\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		assertEquals("Facebook – log in or sign up", driver.getTitle());
		
				
	}

}
