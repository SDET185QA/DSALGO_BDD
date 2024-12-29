package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegisterPOF;
import utilities.ConfigReader;
import utilities.ExcelReader;
import webDriverManager.DriverFactory;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationSteps {
	
	WebDriver driver = DriverFactory.getDriver();
	RegisterPOF pageObject = new RegisterPOF();

	ExcelReader excelReader = new ExcelReader();

//	//Scenario1: Verify the user is able to launch the web page
//	@Given("The user is on the home page")
//	public void the_user_is_on_the_home_page() {
//		driver.get(RegisterPOF.homePageUrl);
//	
//	}
//	
//	@When ("The user clicks Get Started button on the home page")
//	public void the_user_clicks_get_started_button_on_the_home_page() {
//		pageObject.clickOnGetStarted();
//	}
//
//	@Then ("The user should be redirected to the secondary home page")
//	public void the_user_should_be_redirected_to_the_secondary_home_page() {
//		String actualUrl = driver.getCurrentUrl();
//		String expectedUrl = "https://dsportalapp.herokuapp.com/home";
//		assertEquals(actualUrl, expectedUrl);
//	}
//
//	//Scenario2: Verify the user is able to land on Registration
//	@Given("The user is on the secondary home page")
//	public void the_user_is_on_the_secondary_home_page() {
//		driver.get(RegisterPOF.secondHomePageUrl);
//	}
//
//	@When("The user clicks Register link on the Home page")
//	public void the_user_clicks_register_link_on_the_home_page() {
//		pageObject.clickOnRegister();
//	}
//
//	@Then("The user should be redirected to Register form")
//	public void the_user_should_be_redirected_to_register_form() {
//		String actualRes = driver.getCurrentUrl();
//		String expectedRes = "https://dsportalapp.herokuapp.com/register";
//		assertEquals(actualRes,expectedRes);
//	}

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
	
	@When ("The user clicks Register button after entering password and passwordConfirmation and leaves username field empty with inputs from {string} and {int}")
	public void the_user_clicks_register_button_after_entering_password_and_password_confirmation_and_leaves_username_field_empty(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
	//	ExcelReader excelReader = new ExcelReader();
		List<Map<String, String>> data = excelReader.getData(ConfigReader.getexcelfilepath(), sheetName);
		String password = data.get(rowNumber - 2).get("password");
		String passwordConfirmation = data.get(rowNumber - 2).get("passwordConfirmation");
		System.out.println("password = " + password);
		System.out.println("password Confirmation = " + passwordConfirmation);

		pageObject.enterPassword(password);
		pageObject.enterPasswordConf(passwordConfirmation);
		pageObject.enterUserName("");
		pageObject.clickOnRegisterBtn();
	}
	
	
	//Scenario5: Verify that user receives error message for empty Password field during registration
	@When ("The user clicks Register button after entering username with other fields empty with inputs from {string} and {int}")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
		
		List<Map<String, String>> data = excelReader.getData(ConfigReader.getexcelfilepath(), sheetName);
		String username = data.get(rowNumber - 2).get("username");
	
		pageObject.enterUserName(username);
		pageObject.enterPassword("");
		pageObject.enterPasswordConf("");
		pageObject.clickOnRegisterBtn();
	}
	
	@Then("The error message Please fill out this field appears below Password textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_password_textbox() {
		String actualErrorMsg = pageObject.getErrorOnRegister("Please fill out this field");
		assertEquals(actualErrorMsg, "Please fill out this field");	}

	//Scenario6: Verify that user receives error message for empty Password Confirmation field during registration
	
	@When ("The user clicks Register button after entering username and Password with passwordConfirmation field empty with inputs from {string} and {int}")
	public void the_user_clicks_register_button_after_entering_username_and_password_with_password_cofirmation_field_empty(String sheetName, int rowNumber) throws InvalidFormatException, IOException{
		
		List<Map<String, String>> data = excelReader.getData(ConfigReader.getexcelfilepath(), sheetName);
		String username = data.get(rowNumber - 2).get("username");
		String password = data.get(rowNumber - 2).get("password");
		pageObject.enterUserName(username);
		pageObject.enterPassword(password);
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
	
	@When("The user clicks Register button after entering a username with special characters other than digits with inputs from {string} and {int}")
	public void the_user_clicks_register_button_after_entering_a_username_with_special_characters_other_than_digits(String sheetName, int rowNumber ) throws InvalidFormatException, IOException {
		List<Map<String, String>> data = excelReader.getData(ConfigReader.getexcelfilepath(), sheetName);
		String username = data.get(rowNumber - 2).get("username");
		String password = data.get(rowNumber - 2).get("password");
		String passwordConfirmation = data.get(rowNumber -2).get("passwordConfirmation");
		pageObject.enterUserName(username);
		pageObject.enterPassword(password);
		pageObject.enterPasswordConf(passwordConfirmation);
		pageObject.clickOnRegisterBtn();
	}
	
	@Then("The user is able to see error msg after entering invalid data Password mismatch The two password fields did not match")
	public void the_user_is_able_to_see_error_msg_after_entering_invalid_data_password_mistmatch_the_two_password_fields_did_not_match() {
		String actualMsg = pageObject.getErrorOnPasswordMsg();
		assertEquals(actualMsg, "password_mismatch:The two password fields didn’t match.");
		
	}
	
	//Scenario8: Verify that user receives error message for invalid password field during registration
	
	@When("The user clicks Register button after entering a password with numeric data and valid username with inputs from {string} and {int}")
	public void the_user_clicks_register_button_after_entering_a_password_with_numeric_data_and_valid_username(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> data = excelReader.getData(ConfigReader.getexcelfilepath(), sheetName);
		String username = data.get(rowNumber - 2).get("username");
		String password = data.get(rowNumber - 2).get("password");
		String passwordConfirmation = data.get(rowNumber -2).get("passwordConfirmation");

	   
	   pageObject.enterUserName(username);
	   pageObject.enterPassword(password);
	   pageObject.enterPasswordConf(passwordConfirmation);
	   pageObject.clickOnRegisterBtn();
	}

	//Scenario9: Verify that user receives error message for mismatched Password and Password Confirmation field during registration
	
	@When("The user clicks Register button after entering different passwords in password and passwordConfirmation fields with inputs from {string} and {int}")
	public void the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields(String sheetName, int rowNumber ) throws InvalidFormatException, IOException {
		List<Map<String, String>> data = excelReader.getData(ConfigReader.getexcelfilepath(), sheetName);
		String username = data.get(rowNumber - 2).get("username");
		String password = data.get(rowNumber - 2).get("password");
		String passwordConfirmation = data.get(rowNumber -2).get("passwordConfirmation");

		
		pageObject.enterUserName(username);
		pageObject.enterPassword(password);
		pageObject.enterPasswordConf(passwordConfirmation);
		pageObject.clickOnRegisterBtn();
	}

	

	//Scenario10: Verify that user is able to land on Home page after registration with valid fields
//	@When("The user clicks Register button after entering  with valid {string}, {string} and {string} in related textboxes")
//	public void the_user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes(String username, String password, String passwordConfirmation ) {
////	pageObject.enterUserName(username); commented since this is a valid scenario
//		pageObject.enterPassword(password);
//		pageObject.enterPasswordConf(passwordConfirmation);
//		pageObject.clickOnRegisterBtn();
//	}

//	@Then("The user should be redirected to Home Page of DS Algo with message New Account Created. You are logged in as <ID>")
//	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_message_new_account_created_you_are_logged_in_as_id() {
//		String actualUrl = pageObject.getCurrentUrl();
//		assertEquals(actualUrl, "https://dsportalapp.herokuapp.com/home");		
//	}

	//Scenario11: Verify that the user receives the error message for entering user name less than eight characters
	@When("The user clicks Register button after entering username with less than eight characters with valid password and passwordConfirmation in related textboxes with inputs from {string} and {int}")
	public void the_user_clicks_register_button_after_entering_with_username_with_less_than_eight_characters_with_valid_password_and_password_confirmation_in_related_textboxes(String sheetName,int rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> data = excelReader.getData(ConfigReader.getexcelfilepath(), sheetName);
		String username = data.get(rowNumber - 2).get("username");
		String password = data.get(rowNumber - 2).get("password");
		String passwordConfirmation = data.get(rowNumber -2).get("passwordConfirmation");

		
		pageObject.enterUserName(username);
		pageObject.enterPassword(password);
		pageObject.enterPasswordConf(passwordConfirmation);
		pageObject.clickOnRegisterBtn();
	   	}

	@Then("The user should get an error saying password should contain atleast eight characters")
	public void the_user_should_get_an_error_saying_password_should_contain_atleast_eight_characters() {
		String actualMsg = pageObject.getErrorOnPasswordMsg();
		assertEquals(actualMsg, "Password should contain atleast eight characters");
	}

	//Scenario12: Verify that the user receives the error message for entering password less than 8 characters
	@When("The user clicks on Register button after entering valid username, password and passwordConfirmation with less than eight characters with inputs from {string} and {int}")
	public void the_user_clicks_on_register_button_after_entering_valid_username_and_password_with_less_than_eight_characters(String sheetName,int rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> data = excelReader.getData(ConfigReader.getexcelfilepath(), sheetName);
		String username = data.get(rowNumber - 2).get("username");
		String password = data.get(rowNumber - 2).get("password");
		String passwordConfirmation = data.get(rowNumber -2).get("passwordConfirmation");

		
		
		pageObject.enterUserName(username);
		pageObject.enterPassword(password);
		pageObject.enterPasswordConf(passwordConfirmation);
		pageObject.clickOnRegisterBtn();
	}


}

