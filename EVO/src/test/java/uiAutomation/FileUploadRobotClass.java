package uiAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadRobotClass {
    WebDriver driver;
    
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.edge.driver", "C:\\Temp\\Drivers\\msedgedriver.exe");
	driver = new EdgeDriver();	
	driver.manage().window().maximize();

	}	
   @Test
   public void fileupROBOT() throws Exception {
	   driver.get("https://demo.guru99.com/test/upload/");
	   //driver.switchTo().frame("uploadframe");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//input[@class='upload_txt']")).sendKeys("C:\\Program Files (x86)\\Pers Files\\Latest\\Selenium\\Cover.txt");	   
		 //Note: There is NO need to simulate clicking on Browse button and then enter the path. Just sendskeys the path, Webdriver will upload in the background
	   
   }

}
