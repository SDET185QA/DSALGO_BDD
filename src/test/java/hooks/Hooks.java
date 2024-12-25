package hooks;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import webDriverManager.DriverFactory;
import utilities.LoggerLoad;
import utilities.ConfigReader;

public class Hooks {
	private static WebDriver driver;
	private static DriverFactory driverfactory;
	ConfigReader configFileReader = new ConfigReader();
	
	@Before
	public void before() throws Throwable {
		
		String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");	
		if (browser==null) {
			
			driverfactory = new DriverFactory();
			browser =ConfigReader.getBrowserType();
			LoggerLoad.info("Testing on browser declared in the config file which is "+browser);
			driver = driverfactory.webdriverinitialize(browser);
			driver.get(ConfigReader.getApplicationUrl("applicationurl"));
			LoggerLoad.info("Initializing driver for : "+ browser);
		}
		else {
			driverfactory = new DriverFactory();
			LoggerLoad.info("Testing on browser declared in the testng XML file which is "+browser);
			driver = driverfactory.webdriverinitialize(browser);
			driver.get(ConfigReader.getApplicationUrl("applicationurl"));
			LoggerLoad.info("Initializing driver for : "+ browser);
		}
	
	}

	@After
	public static void after() throws Throwable {
		LoggerLoad.info("Closing Driver");
		driverfactory.quitDriver();
	}
}