package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructuresPOF;
import utilities.LoggerLoad;

public class DataStructuresSteps {

	DataStructuresPOF DSPOF = new DataStructuresPOF();
	@Given("The user is logged in and on the HomePage")
	public void the_user_is_logged_in_and_on_the_home_page() {
		LoggerLoad.info("User is on the Homepage");
	}

	@When("The user clicks the Get Started button on Home Page Page")
	public void the_user_clicks_the_get_started_button_on_home_page_page() {
		DSPOF.getStarted_DS();
	}

	@Then("The user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_data_structures_introduction_page(String ExpectedPageTitle) {
		String actualPageTitle = DSPOF.getpageTitle(ExpectedPageTitle);
		LoggerLoad.info("-----User is redirected to the  Data-Structures-Introduction page----");
		Assert.assertEquals(ExpectedPageTitle, actualPageTitle);
	}


	@Given("User is on  the Data-Structures-Introduction page")
	public void user_is_on_the_data_structures_introduction_page() {
		LoggerLoad.info("User is on the Data-Structures-Introduction Page");
	}

	@When("The user clicks Time Complexity")
	public void the_user_clicks_time_complexity() {
		DSPOF.getStarted_DS();
		DSPOF.clickOnTimeComplexitylink();
	}

	@Then("user is redirected to {string} Page")
	public void user_is_redirected_to_time_complexity_page(String ExpectedpageTitle) {
		String actualPageTitle = DSPOF.getpageTitle(ExpectedpageTitle);
		LoggerLoad.info("User is redirected tn the Time Complexity Page");
		Assert.assertEquals(ExpectedpageTitle, actualPageTitle);
	}

	@Given("User is on the Time Complexity Page")
	public void user_is_on_the_time_complexity_page() {
		LoggerLoad.info("User is on the Time Complexity Page");
	}	

	@When("user clicks try here button of Time Complexity")
	public void user_clicks_try_here_button_of_time_complexity() {
		DSPOF.getStarted_DS();
		DSPOF.clickOnTimeComplexitylink();
		DSPOF.clickOnTryHere();
	}

	@Then("user should be redirected to a page having an tryEditor with a Run button")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button() {
		LoggerLoad.info("-----User is redirected to the page having tryEditor----");
	}

	@Given("user is on Try Editor page of Data Structures-Introduction")
	public void user_is_on_try_editor_page_of_data_structures_introduction() {
		LoggerLoad.info("-----User is on the tryEditor----");
	}

	@When("user enter valid pythonCode in tryEditor  {string}")
	public void user_enter_valid_python_code_in_try_editor(String Input) {
		LoggerLoad.info("-----User enters valid pythoncode----");
		DSPOF.getStarted_DS();
		DSPOF.clickOnTimeComplexitylink();
		DSPOF.clickOnTryHere();
		DSPOF.Input.sendKeys(Input);
		DSPOF.clickonRunButton();
	}

	@Then("user should be able to find valid Run result")
	public void user_should_be_able_to_find_valid_run_result() {
		LoggerLoad.info("-----User is viewing the Result----");;
	}
	@When("user enter Invalid pythonCode on tryEditor {string}")
	public void user_enter_invalid_python_code_on_try_editor(String Input) {
		LoggerLoad.info("-----User enters Invalid pythoncode----");
		DSPOF.getStarted_DS();
		DSPOF.clickOnTimeComplexitylink();
		DSPOF.clickOnTryHere();
		DSPOF.Input.sendKeys(Input);
		DSPOF.clickonRunButton();

	}
	@Then("The user should get an alert message box")
	public void the_user_should_get_an_alert_message_box() {
		LoggerLoad.info("-----User gets an alert message----");
		String actualErrorMsg = DSPOF.getErrorOnTryEditor("SyntaxError: bad input on line 1");
		assertEquals(actualErrorMsg, "SyntaxError: bad input on line 1");
	}

	@Given("User is on Time Complexity Page")
	public void user_is_on_time_complexity_page() {
		LoggerLoad.info("User is on the Time Complexity Page");
	}	

	@When("The user clicks Practice Questions link in Time Complexity page")
	public void the_user_clicks_practice_questions_link_in_time_complexity_page() {
		LoggerLoad.info("-----User clicks on Practice Questions----");
		DSPOF.getStarted_DS();
		DSPOF.clickOnTimeComplexitylink();
		DSPOF.clickOnPracticeQuestion();
	}

	@Then("The user should be redirected to the {string} page in Data Structures Introduction")
	public void the_user_should_be_redirected_to_the_practice_questions_page_in_data_structures_introduction(String ExpectedpageTitle) {
		LoggerLoad.info("-----User is redirected to the Practice Question page----");
		String actualPageTitle = DSPOF.getpageTitle(ExpectedpageTitle);
		LoggerLoad.info("User is redirected tn the Time Complexity Page");
		Assert.assertEquals(ExpectedpageTitle, actualPageTitle);
	}


}
