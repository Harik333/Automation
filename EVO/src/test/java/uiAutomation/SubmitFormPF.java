package uiAutomation;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import objectFactoryRepo.SubmitFormPageFactory;

public class SubmitFormPF {
	
	@Test
	public void SubmitFormTC() throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Temp\\Drivers\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		
		SubmitFormPageFactory fs = new SubmitFormPageFactory(driver);
		driver.switchTo().frame("iframeResult");
		
		fs.FirstName().sendKeys("Harish");
		fs.LastName().sendKeys("Krishnadas");
		fs.SubmitButton().click();
		Thread.sleep(3000);
		assertEquals(fs.DataSubmitted().getText(), "Submitted Form Data");
			
		
	}

}
