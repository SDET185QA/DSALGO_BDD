package stepDefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPOF;

import utilities.LoggerLoad;


public class LoginSteps {
	
	
	public LoginPOF loginpagefactory = new LoginPOF();
	
	

	@Given("The user is on the DS Algo Login Page")
	public void the_user_is_on_the_ds_algo_login_page() {
		LoggerLoad.info("Opening the Login Page");
		loginpagefactory.loginpage();
		
		
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
	
	@Given("The user is in home page")
	public void the_user_is_in_home_page() {
		loginpagefactory.clickonLogout();
		LoggerLoad.info("The user succesfully clicked on logout button");
	}

	@When("The user clicks on signout button")
	public void the_user_clicks_on_signout_button() {
		loginpagefactory.clickOnSignin();
		LoggerLoad.info("The user succesfully clicked on signout button");
	}

	@Then("The user should be redirected to the DS Algo home page to enter email as {string} and password as {string}")
	public void the_user_should_be_redirected_to_the_ds_algo_home_page_to_enter_email_as_and_password_as(String username, String password) {
		loginpagefactory.clickOnSignin();
		LoggerLoad.info("The user succesfully clicked on signin button");
		loginpagefactory.enter_login_credentails(username,password);
		LoggerLoad.info("The user succesfully entered  the username and password");
		loginpagefactory.clickonLogin();
		LoggerLoad.info("The user succesfully clicked on signin button");
	    loginpagefactory.clickonLogout();
	    LoggerLoad.info("The user succesfully clicked on logout button");
	}



}
