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
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user should click the Sign in link")
	public void the_user_should_click_the_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on the DS Algo Login Page")
	public void the_user_is_on_the_ds_algo_login_page() {
		LoggerLoad.info("Opening the Login Page");
		loginpagefactory.loginpage();
	}

	@When("User clicks on login button with all empty field")
	public void user_clicks_on_login_button_with_all_empty_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User verify the message at username as {string}")
	public void user_verify_the_message_at_username_as(String validationMessage) {
		String username ="username";
		loginpagefactory.validate_login_with_blank_credentials(validationMessage,username);
	}

	@When("User clicks on login button with username as {string}")
	public void user_clicks_on_login_button_with_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User verify the message at password as {string}")
	public void user_verify_the_message_at_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on login button with password as {string}")
	public void user_clicks_on_login_button_with_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
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

	@Given("The user is in the DataStructures page")
	public void the_user_is_in_the_data_structures_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on signout button")
	public void the_user_clicks_on_signout_button() {
		loginpagefactory.clickOnSignin();
		LoggerLoad.info("The user succesfully clicked on signout button");
	}

	@Then("Verify the logout message {string}")
	public void verify_the_logout_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in home page")
	public void the_user_is_in_home_page() {
		loginpagefactory.clickonLogout();
		LoggerLoad.info("The user succesfully clicked on logout button");
	}	
	
	
}
