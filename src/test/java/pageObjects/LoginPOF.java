package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPOF {
	// Define the WebDriver instance
		//private WebDriver driver;
		
		
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
		
		// Constructor to initialize the page object with the WebDriver instance
		public LoginPOF(WebDriver driver) {
			
			// Use the PageFactory.initElements method to initialize the elements on the login page
			PageFactory.initElements(driver, this);
		}
		 // Method to login
		public void login(String username, String password ) {
			getStarted.click();
			signIn.click();
			usernameField.sendKeys(username);
			passwordField.sendKeys(password);
			
			
		}
		//Method to click on login
		public void clickonLogin() {
			loginButton.click();
			
		}



}
