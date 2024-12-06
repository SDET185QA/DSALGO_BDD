package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPOF;
import utilities.LoggerLoad;

public class CommonSteps {
	
	public LoginPOF loginpagefactory = new LoginPOF();
	
	@Given("The user is on DS-ALGO application sign in page")
	public void the_user_is_on_ds_algo_application_sign_in_page() {
		LoggerLoad.info("the user is in the home page");
		loginpagefactory.loginpage();
	}

	@When("The user enter valid credentials {string} and password as {string}")
	public void the_user_enter_valid_credentials_and_password_as(String username, String password) {
		loginpagefactory.enter_login_credentails(username,password);
	}

	@Then("The user should land in homepage")
	public void the_user_should_land_in_homepage() {
		loginpagefactory.clickonLogin();
	}


}
