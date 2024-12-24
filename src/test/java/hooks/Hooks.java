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
			LoggerLoad.info("Testing on chrome");
			System.out.println(" about to open browser" + "chrome");
			driverfactory = new DriverFactory();
			driver = driverfactory.webdriverinitialize("chrome");
			driver.get(ConfigReader.getApplicationUrl("applicationurl"));
			LoggerLoad.info("Initializing driver for : "+ "chrome");
		}
		else {
			driverfactory = new DriverFactory();
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