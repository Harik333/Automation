package uiAutomation;

import java.time.Duration;
import java.util.ArrayList;

import javax.swing.text.TabableView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Set110 {
	GetURLEdgeBrowser getURL = new GetURLEdgeBrowser();
	EdgeDriver driver = null; //new EdgeDriver();
	
	//How to perform back,forward and refresh action in selenium
	@Test
	public void SetOne() {	
		
		getURL.GetURL("https://demo.guru99.com/test/newtours/register.php");
		driver = this.getURL.driver;
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();			
	}
	
	//How to select value from a DropDwon in selenium
	@Test
	public void DropDown() {
		getURL.GetURL("https://demo.guru99.com/test/newtours/register.php");
		driver = this.getURL.driver;
		
		Select CountryDropDown = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		CountryDropDown.selectByValue("YEMEN");
	}
	
	//How to fetch text from UI in selenium?
	@Test
	public void BufferText() {
		getURL.GetURL("https://demo.guru99.com/test/newtours/register.php");
		driver = this.getURL.driver;
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Harish Krishnadas");
		String Fname = driver.findElement(By.cssSelector("input[name='firstName']")).getText();
		String Fname2 = driver.findElement(By.cssSelector("input[name='firstName']")).getAttribute("value");
		System.out.println("Name is :"+ Fname + " 2 " + Fname2 );
				
	}
	
	//How to open a new tab and GetURL
	@Test
	public void NewTabGETURL() {
		getURL.GetURL("https://demo.guru99.com/test/newtours/register.php");
		driver = this.getURL.driver;
		String FTitle = driver.getTitle();
        driver.switchTo().newWindow(WindowType.TAB);
        
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.news.google.com/");
		driver.close();

	}
	
	//Perform mouse actions & send keys
	@Test
	public void MouseActionKeys() throws InterruptedException {
		getURL.GetURL("https://the-internet.herokuapp.com/drag_and_drop");
		driver = this.getURL.driver;	
		Actions a = new Actions(driver);
		//a.contextClick(driver.findElement(By.linkText("SIGN-ON"))).build().perform();  //ContextClick mean RightClick
		a.dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-b"))).perform();		
		
	}
	
	
	@Test
	public void ExplicitWait() {
		getURL.GetURL("https://demo.guru99.com/test/newtours/register.php");
		driver = this.getURL.driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='Mercury Tours']")))); 
		driver.findElement(By.linkText("Home")).click();
			
		
	}
	

}
