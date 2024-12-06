package webDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	//public static WebDriver driver;
	public static WebDriver webdriverinitialize() {
		//WebDriverManager is a utility class that manages the WebDriver binaries
		//Use WebDriverManager to configure the ChromeDriver
        // This will automatically download and configure the ChromeDriver binary
		WebDriverManager.chromedriver().setup();
		 // Create a new instance of ChromeOptions
        // This allows us to configure the Chrome browser
		ChromeOptions options = new ChromeOptions();
		 // Add some options to the Chrome browser like maximize 
		options.addArguments("--start-maximized");
	
		// Create a new instance of the ChromeDriver
        // We pass in the ChromeOptions instance to configure the browser
		driver.set(new ChromeDriver(options));
		
	
		
		
	
		
		return driver.get();
		
	}
	public static WebDriver getDriver() {
		
		return driver.get();
		
	}

}
