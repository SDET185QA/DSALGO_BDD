package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ConfigReader;
import webDriverManager.DriverFactory;
import utilities.LoggerLoad;


public class LoginPOF {
	// Define the WebDriver instance and instantiate it
	//public static WebDriver initdriver = DriverFactory.webdriverinitialize();
	public static WebDriver driver = DriverFactory.getDriver();
	String loginpageurl = ConfigReader.getloginUrl("loginpageurl");
	String applicationurl = ConfigReader.getloginUrl("applicationurl");
	String datastructureurl = ConfigReader.getloginUrl("datastructureurl");
		
		
		 // Use the @FindBy annotation to identify the elements on the page
		@FindBy(linkText = "Get Started")
	    private WebElement getStarted;
		
		@FindBy(linkText = "Sign in")
	    private WebElement signIn;
		
		@FindBy(id = "id_username")
	    private WebElement usernameField;
		
		@FindBy(id = "id_password")
	    private WebElement passwordField;
		
		@FindBy(xpath = "//input[contains(@value,'Login')]")
	    private WebElement loginButton;
		
		@FindBy(xpath = "//a[@href='/logout']")
	    private WebElement signoutButton;
		
		@FindBy(xpath = "//div[@class='alert alert-primary']")
	    private WebElement logoutalert;
		
		// Constructor to initialize the page object with the WebDriver instance
		public LoginPOF() {
			
			// Use the PageFactory.initElements method to initialize the elements on the login page
			PageFactory.initElements(driver, this);
		}
		
public void loginpage() {
			
			LoggerLoad.info("Opening the Login page url"+loginpageurl );
	
		
			driver.get(loginpageurl);
			//getStarted.click();
			
		}
		public void clickOnSignin() {
			LoggerLoad.info("Clicking in Signin Button " );
			signIn.click();
		}
		 // Method to login
		public void enter_login_credentails(String username, String password ) {
			
			
			LoggerLoad.info("Clearing the username fields");
			usernameField.clear();
			LoggerLoad.info("Entering the  User Name  "+ username );
			usernameField.sendKeys(username);
			LoggerLoad.info("Clearing the password fields");
			passwordField.clear();
			LoggerLoad.info("Entering the  Password "+ password );
			passwordField.sendKeys(password);
			
			
		}
		//Method to click on login
		public void clickonLogin() {
			LoggerLoad.info("Clicking in Login Button " );
			loginButton.click();
			
		}
		//Method to click on login
		public void clickonLogout() {
			LoggerLoad.info("Clicking in Signout Button " );
			signoutButton.click();
			
					
				}
public String validate_login_with_blank_credentials(String validationMessage,String field) {
			
			LoggerLoad.info("Expected error message is   "+ validationMessage );
			String message1 = null;
			if (field.equalsIgnoreCase("username")) {
			@SuppressWarnings("deprecation")
			String message = usernameField.getAttribute("validationMessage");
			message1 =message;	

			} else if (field.equalsIgnoreCase("password")) {
				@SuppressWarnings("deprecation")
				String message = passwordField.getAttribute("validationMessage");
				message1 =message;		
			}
			
			return message1;
					
		}
		
	
	public void enter_user_name(String username) {
		LoggerLoad.info("Clearing the username fields");
		usernameField.clear();
		LoggerLoad.info("Entering the  User Name  "+ username );
		usernameField.sendKeys(username);	
	}
	
	public String getTitleHomePage(String expectedTitle) {
		String actualTitle = driver.getTitle();
		LoggerLoad.info(actualTitle);
		return actualTitle;
	}
	
	public String getlogoutAlert(String expectedLogoutMessage) {
		String logoutMessage = logoutalert.getText();
		LoggerLoad.info(logoutMessage);
		return logoutMessage;
	}
	public void homepage() {
		
		LoggerLoad.info("Opening the Login page url"+applicationurl );
		driver.get(applicationurl);
			
	}

	public void clickOnGetstarted() {
		
		LoggerLoad.info("Opening the Login page url"+loginpageurl );
	    getStarted.click();
		
	}
	
	public void enter_user_password(String password) {
		LoggerLoad.info("Clearing the username fields");
		passwordField.clear();
		LoggerLoad.info("Entering the  User Name  "+ password );
		passwordField.sendKeys(password);	
	}
	public void datastructurepage() {
		
		LoggerLoad.info("Opening the datastructure page url"+datastructureurl );
		driver.get(datastructureurl);	
	}
	
		
		






}
