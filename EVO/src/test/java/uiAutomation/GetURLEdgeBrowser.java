package uiAutomation;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

public class GetURLEdgeBrowser {
		// TODO Auto-generated method stub
	
	    EdgeDriver driver = null;
	    
	    public GetURLEdgeBrowser() {
	    	System.setProperty("webdriver.edge.driver", "C:\\Temp\\Drivers\\msedgedriver.exe");
	    }
		 
		public void GetURL(String URL) {
			
			//System.setProperty("webdriver.edge.driver", "C:\\Temp\\Drivers\\msedgedriver.exe");
			
			driver = new EdgeDriver();	
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get(URL);
			driver.manage().window().maximize();
		
		}
	}


