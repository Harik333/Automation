package objectFactoryRepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SubmitFormPage {

	WebDriver driver; 
	public SubmitFormPage (WebDriver driver) {
		this.driver = driver;
		
	}
	
	//By FirstName = By.name("fname");
	By LastName = By.name("lname");
	By SubmitButton = By.xpath("//input[@value='Submit']");
	By DataSubmitted = By.xpath("//body[@class='w3-container']/h1");
	
	public WebElement FirstName() {
		 return driver.findElement(By.name("fname"));		
	}
	public WebElement LastName() {
		return driver.findElement(LastName);		
	}
	public WebElement SubmitButton() {
		return driver.findElement(SubmitButton);		
	}	
	public WebElement DataSubmitted() {
		return driver.findElement(DataSubmitted);		
	}	
	
	
	
}
