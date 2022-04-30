package uiAutomation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToastItem {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.edge.driver", "C:\\Temp\\Drivers\\msedgedriver.exe");
	driver = new EdgeDriver();	
	driver.manage().window().maximize();

	}
    
	@Test
	public void toastControl() {
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_snackbar");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		driver.findElement(By.xpath("//button[text()='Show Snackbar']")).click();
		String toastMessgae = driver.findElement(By.id("snackbar")).getText();
		System.out.println(toastMessgae);
		assertEquals(toastMessgae, "Some text some message..");
	}
		
		//right click and select "Refresh" from context menu
		@Test
		public void contextMenuclick() throws Exception {	
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_snackbar");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		WebElement button = driver.findElement(By.xpath("//button[text()='Show Snackbar']"));
		Actions action = new Actions(driver);
		action.contextClick(button).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.RETURN).build().perform();
		}
	

       @Test
       public void menuOptions() {
    	   driver.get("https://jqueryui.com/menu/");
    	   driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
    	   WebElement menuOptionMUSIC = driver.findElement(By.xpath("//li[@class='ui-menu-item']/div[text()='Music']"));
    	   
    	   Actions action = new Actions(driver);
    	   action.moveToElement(menuOptionMUSIC).perform();
    	   action.moveToElement(driver.findElement(By.xpath("//div[@id='ui-id-10']"))).perform();
    	   
    	   
    	   
       }

}
