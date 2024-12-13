package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegisterPOF;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationSteps {
	
	ChromeDriver driver;
	RegisterPOF pageObject = new RegisterPOF();

	@Before
	public void initialize() {
		driver = new ChromeDriver();
	}
	
	@After
	public void cleanup() {
		driver.close();
	}
	
	//Scenario1: Verify the user is able to launch the web page
	@Given("The user is on the home page")
	public void the_user_is_on_the_home_page() {
		driver.get(RegisterPOF.homePageUrl);
	
	}
	
	@When ("The user clicks Get Started button on the home page")
	public void the_user_clicks_get_started_button_on_the_home_page() {
		pageObject.clickOnGetStarted();
	}

	@Then ("The user should be redirected to the secondary home page")
	public void the_user_should_be_redirected_to_the_secondary_home_page() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://dsportalapp.herokuapp.com/home";
		assertEquals(actualUrl, expectedUrl);
	}

	//Scenario2: Verify the user is able to land on Registration
	@Given("The user is on the secondary home page")
	public void the_user_is_on_the_secondary_home_page() {
		driver.get(RegisterPOF.secondHomePageUrl);
	}

	@When("The user clicks Register link on the Home page")
	public void the_user_clicks_register_link_on_the_home_page() {
		pageObject.clickOnRegister();
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		String actualRes = driver.getCurrentUrl();
		String expectedRes = "https://dsportalapp.herokuapp.com/register";
		assertEquals(actualRes,expectedRes);
	}

	//Scenario3: Verify the user receives error message for all empty fields during registration
	@Given("The user is on the registration page")
	public void the_user_is_on_the_registration_page() {
		pageObject.navigateToRegistrationPage(driver);
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() {
		pageObject.enterUserName("");
		pageObject.enterPassword("");
		pageObject.enterPasswordConf("");
		pageObject.clickOnRegisterBtn();
	}

	@Then("The error Please fill out this field appears below Username textbox")
	public void the_error_please_fill_out_this_field_appears_below_username_textbox() {
		String actualErrorMsg = pageObject.getErrorOnRegister("Please fill out this field");
		assertEquals(actualErrorMsg, "Please fill out this field");
	}


	//Scenario4: Verify that user received error message for empty user name field
	
	@When ("The user clicks Register button after entering password and password confirmation and leaves username field empty")
	public void the_user_clicks_register_button_after_entering_password_and_password_confirmation_and_leaves_username_field_empty() {
		pageObject.enterPassword("Jack");
		pageObject.enterPasswordConf("Jack");
		pageObject.enterUserName("");
		pageObject.clickOnRegisterBtn();
	}
	
	

	//Scenario5: Verify that user receives error message for empty Password field during registration
	@When ("The user clicks Register button after entering Username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty() {
		pageObject.enterUserName("SDET");
		pageObject.enterPassword("");
		pageObject.enterPasswordConf("");
		pageObject.clickOnRegisterBtn();
	}
	
	@Then("The error message Please fill out this field appears below Password textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_password_textbox() {
		String actualErrorMsg = pageObject.getErrorOnRegister("Please fill out this field");
		assertEquals(actualErrorMsg, "Please fill out this field");	}

	//Scenario6: Scenario: Verify that user receives error message for empty Password Confirmation field during registration
	
	@When ("The user clicks Register button after entering Username and Password with password confirmation field empty")
	public void the_user_clicks_register_button_after_entering_username_and_password_with_password_cofirmation_field_empty(){
		pageObject.enterUserName("Jack");
		pageObject.enterPassword("1234");
		pageObject.enterPasswordConf("");
		pageObject.clickOnRegisterBtn();
	}	
		
	
	@Then ("The error message Please fill out this field appears below Password Confirmation textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_password_confirmation_textbox() {
			String actualErrorMsg = pageObject.getErrorOnRegister("Please fill out this field");
			String expectedErrorMsg = "Please fill out this field";
			assertEquals(actualErrorMsg, expectedErrorMsg);
		}
	

	
	//Scenario7: Verify that user receives error message for invalid user name field during registration
	
	@When("The user clicks Register button after entering a username with special characters other than digits")
	public void the_user_clicks_register_button_after_entering_a_username_with_special_characters_other_than_digits() {
		pageObject.enterUserName("@#%^&");
		pageObject.enterPassword("Leon");
		pageObject.enterPasswordConf("Leon");
		pageObject.clickOnRegisterBtn();
	}
	
	@Then("The user is able to see error msg after entering invalid data Password mismatch The two password fields did not match")
	public void the_user_is_able_to_see_error_msg_after_entering_invalid_data_password_mistmatch_the_two_password_fields_did_not_match() {
		String actualMsg = pageObject.getErrorOnPasswordMsg();
		assertEquals(actualMsg, "password_mismatch:The two password fields didn’t match.");
		
	}
	
	//Scenario8: Verify that user receives error message for invalid password field during registration
	
	@When("The user clicks Register button after entering a password with numeric data and valid username")
	public void the_user_clicks_register_button_after_entering_a_password_with_numeric_data_and_valid_username() {
	   pageObject.enterUserName("John");
	   pageObject.enterPassword("1234");
	   pageObject.enterPasswordConf("1234");
	   pageObject.clickOnRegisterBtn();
	}

	//Scenario9: Verify that user receives error message for mismatched Password and Password Confirmation field during registration
	
	@When("The user clicks Register button after entering different passwords in Password and Password Confirmation fields")
	public void the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields() {

		pageObject.enterUserName("Rose");
		pageObject.enterPassword("boss123");
		pageObject.enterPasswordConf("123boss");
		pageObject.clickOnRegisterBtn();
	}

	

	//Scenario10: Verify that user is able to land on Home page after registration with valid fields
//	@When("The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes")
//	public void the_user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes() {
////		pageObject.enterUserName("DSAlgo"); commented since this is a valid scenario
//		pageObject.enterPassword("Batch66");
//		pageObject.enterPasswordConf("Batch66");
//		pageObject.clickOnRegisterBtn();
//	}

//	@Then("The user should be redirected to Home Page of DS Algo with message New Account Created. You are logged in as <ID>")
//	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_message_new_account_created_you_are_logged_in_as_id() {
//		String actualUrl = pageObject.getCurrentUrl();
//		assertEquals(actualUrl, "https://dsportalapp.herokuapp.com/home");		
//	}

	//Scenario11: Verify that the user receives the error message for entering user name less than eight characters
	@When("The user clicks Register button after entering  with  username with less than eight characters with valid password and password confirmation in related textboxes")
	public void the_user_clicks_register_button_after_entering_with_username_with_less_than_eight_characters_with_valid_password_and_password_confirmation_in_related_textboxes() {
		pageObject.enterUserName("11");
		pageObject.enterPassword("@SDET!*%");
		pageObject.enterPasswordConf("@SDET!*%");
		pageObject.clickOnRegisterBtn();
	   	}

	@Then("The user should get an error saying password should contain atleast eight characters")
	public void the_user_should_get_an_error_saying_password_should_contain_atleast_eight_characters() {
		String actualMsg = pageObject.getErrorOnPasswordMsg();
		assertEquals(actualMsg, "Password should contain atleast eight characters");
	}

	//Scenario12: Verify that the user receives the error message for entering password less than 8 characters
	@When("The user clicks on Register button after entering valid username and password with less than eight characters")
	public void the_user_clicks_on_register_button_after_entering_valid_username_and_password_with_less_than_eight_characters() {
		pageObject.enterUserName("SDET185");
		pageObject.enterPassword("11");
		pageObject.enterPasswordConf("11");
		pageObject.clickOnRegisterBtn();
	}


}

