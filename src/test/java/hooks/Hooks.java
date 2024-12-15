package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import webDriverManager.DriverFactory;
import utilities.LoggerLoad;
import utilities.ConfigReader;

public class Hooks {
	public static WebDriver driver;
	public static DriverFactory driverfactory;
	static Scenario scenario;

	@BeforeAll
	public static void before() throws Throwable {
		//Get browser Type from config file
		LoggerLoad.info("Loading Config file");
		//ConfigReader.loadConfig();
		String browser = ConfigReader.getBrowserType();
		
		//Initialize driver from driver factory
		driverfactory = new DriverFactory();
		driver = driverfactory.webdriverinitialize(browser);
		LoggerLoad.info("Initializing driver for : "+browser);
	
	}
	
	@AfterAll
	public static void after() {
		DriverFactory.getDriver().close();
	}
	
}
