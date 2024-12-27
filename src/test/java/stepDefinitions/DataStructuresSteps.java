package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructuresPOF;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class DataStructuresSteps {

	public DataStructuresPOF DSPOF = new DataStructuresPOF();
	String TreeHomePageTitle = "NumpyNinja";
	String Excelpath=ConfigReader.getexcelfilepath();
	String PythonCode;
    String Output;
    String ExpectedResult,ExpectedError,ExpectedMsg;
//	String PQExpectedTitle = "Practice Questions";
	
	@Given("The user is logged in and on the HomePage")
	public void the_user_is_logged_in_and_on_the_home_page() {
		LoggerLoad.info("User is on the Homepage");
		String actualPageTitle = DSPOF.getpageTitle();
		Assert.assertEquals(TreeHomePageTitle, actualPageTitle);
	}

	@When("The user clicks the Get Started button on Home Page Page")
	public void the_user_clicks_the_get_started_button_on_home_page_page() {
		DSPOF.getStarted_DS();
	}

	@Then("The user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_data_structures_introduction_page(String ExpectedPageTitle) {
		String actualPageTitle = DSPOF.getpageTitle();
		LoggerLoad.info("-----User is redirected to the  Data-Structures-Introduction page----");
		Assert.assertEquals(ExpectedPageTitle, actualPageTitle);
	}


	@Given("User is on  the Data-Structures-Introduction page")
	public void user_is_on_the_data_structures_introduction_page() {
		LoggerLoad.info("User is on the Data-Structures-Introduction Page");
		//DSPOF.getStarted_DS();
	}

	@When("The user clicks Time Complexity")
	public void the_user_clicks_time_complexity() {
	   DSPOF.getStarted_DS();
		DSPOF.clickOnTimeComplexitylink();
	}

	@Then("user is redirected to {string} Page")
	public void user_is_redirected_to_time_complexity_page(String ExpectedpageTitle) {
		String actualPageTitle = DSPOF.getpageTitle();
		LoggerLoad.info("User is redirected tn the Time Complexity Page");
		Assert.assertEquals(ExpectedpageTitle, actualPageTitle);
	}

	@Given("User is on the Time Complexity Page")
	public void user_is_on_the_time_complexity_page() {
		LoggerLoad.info("User is on the Time Complexity Page");
		DSPOF.getStarted_DS();
		DSPOF.clickOnTimeComplexitylink();
	}	

	@When("user clicks try here button of Time Complexity")
	public void user_clicks_try_here_button_of_time_complexity() {
	
		DSPOF.clickOnTryHere();
	}

	@Then("user should be redirected to a page having an tryEditor with a Run button")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button() {
		LoggerLoad.info("-----User is redirected to the page having tryEditor----");
	}

	@Given("user is on Try Editor page of Data Structures-Introduction")
	public void user_is_on_try_editor_page_of_data_structures_introduction() {
		DSPOF.getStarted_DS();
		DSPOF.clickOnTimeComplexitylink();
		DSPOF.clickOnTryHere();
		LoggerLoad.info("-----User is on the tryEditor----");
	}

	@When("user enter valid pythonCode in tryEditor  {string}")
	public void user_enter_valid_python_code_in_try_editor(String Input) {
		LoggerLoad.info("-----User enters valid pythoncode----");
		DSPOF.Input.sendKeys(Input);
		DSPOF.clickonRunButton();
	}

	@Then("user should be able to find valid Run result")
	public void user_should_be_able_to_find_valid_run_result() {
		LoggerLoad.info("-----User is viewing the Result----");;
	}
	
	@Given("user is on the Try Editor page of Data Structures-Introduction")
	public void user_is_on_the_try_editor_page_of_data_structures_introduction() {
		LoggerLoad.info("-----User is on the tryEditor----");
		DSPOF.getStarted_DS();
		DSPOF.clickOnTimeComplexitylink();
		DSPOF.clickOnTryHere();
	}
	@When("user enter Invalid pythonCode on tryEditor {string}")
	public void user_enter_invalid_python_code_on_try_editor(String Input) {
		LoggerLoad.info("-----User enters Invalid pythoncode----");
	
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
	@When("user clicks on Practice Questions link")
	public void user_clicks_on_practice_questions_link() {
		DSPOF.clickOnPracticeQuestion();
	}
	

@Then("user should be redirected to {string} page")
public void user_should_be_redirected_to_page(String PQExpectedTitle) {
	String actualPageTitle = DSPOF.getpageTitle();
	LoggerLoad.info("User is redirected tn the Time Complexity Page");
	Assert.assertEquals(PQExpectedTitle, actualPageTitle);
}

@When("User enters a valid Python code from the sheet {string} and {int}")
public void user_enters_a_valid_python_code_from_the_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
	LoggerLoad.info("User is on Try Editor page");
	ExcelReader reader = new ExcelReader();

	List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
	LoggerLoad.info(SheetName);
	PythonCode = testdata.get(RowNumber).get("PythonCode");
	ExpectedResult=testdata.get(RowNumber).get("Output");
	LoggerLoad.info("Expected Result is "+ExpectedResult);
	LoggerLoad.info("User enters PythonCode as \" " + PythonCode);

	if ( PythonCode!= null )
		DSPOF.fetchPythonCode(PythonCode);
}

@When("User clicks the Run button")
public void user_clicks_the_run_button() throws InterruptedException {
	LoggerLoad.info("User clicks on Run Button");
	DSPOF.clickonRunButton();
	}

@Then("User should be able to see valid output")
public void user_should_be_able_to_see_valid_output() {
	LoggerLoad.info("User gets the Result of entered Python Code");
	String fetchOutput = DSPOF.fetchOutput();

	LoggerLoad.info("Displayed Result is "+fetchOutput);
	assertEquals(fetchOutput,ExpectedResult,"Expected and actual result  matches");
}

@When("User enters a invalid Python code from the sheet {string} and {int}")
public void user_enters_a_invalid_python_code_from_the_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {

	LoggerLoad.info("User is on Try Editor page");
	ExcelReader reader = new ExcelReader();

	List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
	PythonCode = testdata.get(RowNumber).get("PythonCode");
	ExpectedResult=testdata.get(RowNumber).get("Output");
	LoggerLoad.info("Expected Result is "+ExpectedResult);

	LoggerLoad.info("User enters PythonCode as \" " + PythonCode);
	if ( PythonCode!= null )
		DSPOF.fetchPythonCode(PythonCode);

}


@Then("User should be able to see error message dialogue")
public void user_should_be_able_to_see_error_message_dialogue() {

	LoggerLoad.info("User gets the error message in an Alert");
	String actualError = DSPOF.fetchErrorMessage();
	String ExpectedError="NameError: name 'hello' is not defined on line 1";
	LoggerLoad.info("Displayed Error Message  is "+actualError);
	assertEquals(actualError,ExpectedError,"Invalid Syntax error message");


}



}
