package stepDefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPOF;

import utilities.LoggerLoad;


public class LoginSteps {
	
	
	public LoginPOF loginpagefactory = new LoginPOF();
	

	
	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {
		loginpagefactory.homepage();
		
		loginpagefactory.clickOnGetstarted();
	}

	@When("The user should click the Sign in link")
	public void the_user_should_click_the_sign_in_link() {
		loginpagefactory.clickOnSignin();
	}

	@Then("The user should be redirected to Sign in page and the title of the page should be {string}")
	public void the_user_should_be_redirected_to_sign_in_page_and_the_title_of_the_page_should_be(String expectedTitle) {
		loginpagefactory.getTitleHomePage(expectedTitle);
	}

	@Given("The user is on the DS Algo Login Page")
	public void the_user_is_on_the_ds_algo_login_page() {
		LoggerLoad.info("Opening the Login Page");
		loginpagefactory.loginpage();
	}

	@When("User clicks on login button with all empty field")
	public void user_clicks_on_login_button_with_all_empty_field() {
		loginpagefactory.clickOnSignin();

		loginpagefactory.clickonLogin();
	}

	@Then("User verify the message at username as {string}")
	public void user_verify_the_message_at_username_as(String validationMessage) {
		String username ="username";
		loginpagefactory.validate_login_with_blank_credentials(validationMessage,username);
	}

	@When("User clicks on login button with username as {string}")
	public void user_clicks_on_login_button_with_username_as(String username) {
		loginpagefactory.clickOnSignin();
		loginpagefactory.enter_user_name(username);
		loginpagefactory.clickonLogin();
	}

	@Then("User verify the message at password as {string}")
	public void user_verify_the_message_at_password_as(String validationMessage) {
		String password ="password";
		loginpagefactory.validate_login_with_blank_credentials(validationMessage,password);
	}

	@When("User clicks on login button with password as {string}")
	public void user_clicks_on_login_button_with_password_as(String password) {
		loginpagefactory.clickOnSignin();
		loginpagefactory.enter_user_password(password);
		loginpagefactory.clickonLogin();
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		loginpagefactory.clickOnSignin();
		LoggerLoad.info("The user succesfully clicked on signin button");
		loginpagefactory.enter_login_credentails(username,password);
		LoggerLoad.info("The user succesfully entered  the username and password");
	}

	@Then("The user should land in Data Structure Home Page with message {string}")
	public void the_user_should_land_in_data_structure_home_page_with_message(String string) {
		loginpagefactory.clickonLogin();
		LoggerLoad.info("The user succesfully clicked on signin button");
	}

	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click login button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in home page and enters  email as {string} and password as {string} and in {string}")
	public void the_user_is_in_home_page_and_enters_email_as_and_password_as_and_in(String username, String password, String string3) {
		loginpagefactory.loginpage();
		loginpagefactory.enter_login_credentails(username,password);
		loginpagefactory.clickonLogin();
		loginpagefactory.datastructurepage();
	}

	@When("The user clicks on signout button")
	public void the_user_clicks_on_signout_button() {
		loginpagefactory.clickonLogout();
	  
		LoggerLoad.info("The user succesfully clicked on signout button");
	}

	@Then("Verify the logout message {string}")
	public void verify_the_logout_message(String expectedLogoutMessage) {
		 loginpagefactory.getlogoutAlert(expectedLogoutMessage);
	}

	@Given("The user is in home page and enters  email as {string} and password as {string}")
	public void the_user_is_in_home_page_and_enters_email_as_and_password_as(String username, String password) {
		loginpagefactory.loginpage();
		loginpagefactory.enter_login_credentails(username,password);
		loginpagefactory.clickonLogin();
		
	    
		LoggerLoad.info("The user succesfully clicked on logout button");
	}	
	
	
}
