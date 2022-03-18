package uiAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FileUploadAutoIT {
	
	@Test
	public void FileUpload() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new  ChromeDriver();
		
		//driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button");
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //Switch to iframe
        driver.switchTo().frame("iframeResult");  
        System.out.println("Switched to iFrame");
       		
		driver.findElement(By.cssSelector("input[name='filename']")).sendKeys("Harish");		
		
		//Runtime.getRuntime().exec("C:\\Selenium Files\\AutoITFiles\\ScriptFiles\\FileUpload.exe");
		
		
	}

}
