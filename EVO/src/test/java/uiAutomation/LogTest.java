package uiAutomation;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class LogTest {
	private static Logger log =  LogManager.getLogger(LogTest.class);
	
	@Test
	public void logTesting() {
		log.info("This is just Info");
		log.error("This is error");
		log.debug("This is debug message");
		log.fatal("this is fatal message");	
		System.out.println("Logging off/on");
	}

}
