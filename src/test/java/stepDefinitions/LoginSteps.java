package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPOF;
import utilities.ConfigReader;


public class LoginSteps {
	
	public WebDriver driver = new ChromeDriver();
	public LoginPOF loginpagefactory = new LoginPOF(driver);
	String homepageurl = ConfigReader.getApplicationUrl("url");
	

	@Given("The user is on the DS Algo Home Page {string}")
	public void the_user_is_on_the_ds_algo_home_page(String homepageurl_) {
		System.out.println("THIS IS THE HOME PAGE");
		System.out.println(homepageurl);//have to ask mentor
		driver.get(homepageurl_);
		
		
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		loginpagefactory.login(username,password);
	    
	}

	@Then("The user should land in Data Structure Home Page with message {string}")
	public void the_user_should_land_in_data_structure_home_page_with_message(String string) {
		loginpagefactory.clickonLogin();
		
	}

}
