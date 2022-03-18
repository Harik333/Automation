package uiAutomation;



import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Set2 {
	GetURLEdgeBrowser getURL = new GetURLEdgeBrowser();
	EdgeDriver driver = null; 
	//Create Random String/Numbers
	@Test
	public void RandomString() {
		
		String randomNumber = RandomStringUtils.randomNumeric(3);
		System.out.println(randomNumber);
		
		String randomText = RandomStringUtils.randomAlphabetic(4);
		System.out.println(randomText);
		
		String randomAlphanumeric = RandomStringUtils.randomAlphanumeric(3,5);
		System.out.println(randomAlphanumeric);	
					
	}
	
	//Date functions
	@Test
	public void DateFunctions() {
		Date CurrentDate = DateUtils.addDays(new Date(), 10);
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        System.out.println(dateFormat.format(CurrentDate));
		
	}
	//How to take Screenshots
	@Test
	public void TakeScreenshots() throws IOException {
		getURL.GetURL("https://demo.guru99.com/test/newtours/register.php");
		driver = this.getURL.driver;
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File ScreenshotFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenshotFile, new File("C:\\Temp\\FileOperations\\Screenshots\\HomePage.png"));
	}
	
	//What is softAssertion
	@Test
	public void SoftAssertion() {
		int a = 5;
		int b = 6;
		SoftAssert sa = new SoftAssert();
		//assertEquals(a, b);
		sa.assertEquals(a, b);		
		System.out.println("Print after failed assertion");
		sa.assertAll();
		
	}
	//Table steering - Constraint
	@Test
	public void tableSteering() {
		getURL.GetURL("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		driver = this.getURL.driver;
		driver.switchTo().frame("iframeResult");
		String country = driver.findElement(By.xpath("//table/tbody/tr/td[text()='Ernst Handel']/../td[3]")).getText();
		System.out.println(country);
		
	}
	
	
	
	

}
