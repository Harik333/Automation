package objectFactoryRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmitFormPageFactory {
	
	WebDriver driver;
	public SubmitFormPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="fname") 	WebElement FirstName;
	@FindBy(name="lname")   WebElement LastName;
    @FindBy(xpath="//input[@value='Submit']") WebElement SubmitButton;
    @FindBy(xpath="//body[@class='w3-container']/h1") WebElement DataSubmitted;

	public WebElement FirstName() {
		 return FirstName;		
	}
	public WebElement LastName() {
		return LastName;		
	}
	public WebElement SubmitButton() {
		return SubmitButton;		
	}	
	public WebElement DataSubmitted() {
		return DataSubmitted;		
	}		

}
