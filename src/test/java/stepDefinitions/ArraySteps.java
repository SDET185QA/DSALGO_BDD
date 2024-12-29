package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPOF;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class ArraySteps {
	public ArrayPOF arraypagefactory = new ArrayPOF();
	String PythonCode;
    String Output;
    String ExpectedResult,ExpectedError,ExpectedMsg;
	String Excelpath=ConfigReader.getexcelfilepath();
	
	@Given("The user is on the home page of DS-ALGO application")
	public void the_user_is_on_the_home_page_of_ds_algo_application() {
		LoggerLoad.info("The user is on user ds-algo page and click on the drop down menu");
		arraypagefactory.dropDownClick();
	}

	@When("The user select the drop down option and select the array option")
	public void the_user_select_the_drop_down_option_and_select_the_array_option() {
	   
		arraypagefactory.arrayDropClick();
		LoggerLoad.info("The user succesfully clicked on the dropdown for data structures");
	}

	@Then("The user lands in the arrays Datastructure page with title {string}")
	public void the_user_lands_in_the_arrays_datastructure_page_with_title(String expectedArrayPageTitle) {
		LoggerLoad.info("The user succesfully clicked on the Array option for data structures dropdown");
		
        String actualTitle =arraypagefactory.getpageTitle();
        LoggerLoad.info("Page Title is " +actualTitle);
        
        assertEquals(actualTitle,expectedArrayPageTitle,"User is redirected to another page");
		LoggerLoad.info("The user succesfully clicked on the Array option for data structures dropdown");
	}
	
	
	@Given("The user is in the {string} page after Sign in")
	public void the_user_is_in_the_page_after_sign_in(String string) {
		arraypagefactory.clickOnarrayGetStarted();
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		arraypagefactory.clickOnarraysInPython();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String expectedArrayPageTitle) {
		String actualTitle =arraypagefactory.getpageTitle();
        LoggerLoad.info("Page Title is " +actualTitle);
        assertEquals(actualTitle,expectedArrayPageTitle,"User is redirected to another page");
	}
	

	
	@Given("The user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
		arraypagefactory.clickOnarrayGetStarted();
		arraypagefactory.clickOnarraysInPython();
	}

	@When("The user clicks {string} button in Arrays in Python page")
	public void the_user_clicks_button_in_arrays_in_python_page(String string) {
		arraypagefactory.clickOnTryHere();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test and page title {string}")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_and_page_title(String expectedAssesmentPageTitle) {
		String actualTitle =arraypagefactory.getpageTitle();
        LoggerLoad.info("Page Title is " +actualTitle);
        
        assertEquals(actualTitle,expectedAssesmentPageTitle,"User is redirected to another page");
	}
	

	
	@When("The user clicks Practice Questions button")
	public void the_user_clicks_practice_questions_button() {
		arraypagefactory.clickOnPraciceQuestions();
	}

	@When("The user clicks the {string} link")
	public void the_user_clicks_the_link(String string) {
		arraypagefactory.clickOnPraciceQuestions();
		arraypagefactory.clickOnsearchTheArrays();
	}

	@Then("The user should be redirected to {string} page contains a question,and try Editor with Run and Submit buttons and page title {string}")
	public void the_user_should_be_redirected_to_page_contains_a_question_and_try_editor_with_run_and_submit_buttons_and_page_title(String string, String expectedAssesmentPageTitle) {
		String actualTitle =arraypagefactory.getpageTitle();
        LoggerLoad.info("Page Title is " +actualTitle);
        
        assertEquals(actualTitle,expectedAssesmentPageTitle,"User is redirected to another page");
	}
	
	

	
	@When("The user clicks the Maximum Consecutive ones link")
	public void the_user_clicks_the_maximum_consecutive_ones_link() {
		arraypagefactory.clickOnPraciceQuestions();
		arraypagefactory.clickOnmaxConsecutiveOnesButtons();
	}
	
	

	
	
	@When("The user clicks the Find Numbers with Even Number digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_digits_link() {
		arraypagefactory.clickOnPraciceQuestions();
		arraypagefactory.clickOnfindNumbersWithEvenDigitsButtons();
	}

	


	@When("The user clicks the Squares of a Sorted array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
		arraypagefactory.clickOnPraciceQuestions();
		arraypagefactory.clickOnSquaresOfSortedArrayButtons();
	}
	

	@When("The user clicks Arrays Using List button")
	public void the_user_clicks_arrays_using_list_button() {
		arraypagefactory.clickOnarraysUsingList();
	}


	
	@When("The user clicks {string} button in Arrays Using List page")
	public void the_user_clicks_button_in_arrays_using_list_page(String string) {
		arraypagefactory.clickOnTryHere();
	}
	
	
	
	@When("The user clicks Basic Operations in Lists button")
	public void the_user_clicks_basic_operations_in_lists_button() {
		arraypagefactory.basicOperationList();
	}
	
	

	@Given("The user is on the Basic Operations in Lists page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
		arraypagefactory.clickOnarrayGetStarted();
		arraypagefactory.basicOperationList();
	}
	
	
	@Given("User is on {string} after logged in")
	public void user_is_on_after_logged_in(String pagename) {
		arraypagefactory.clickOnarrayGetStarted();
		arraypagefactory.clickOnarraysInPython();
		arraypagefactory.clickOnTryHere();
        LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("User enters valid Python code from sheet {string} and {int}")
	public void user_enters_valid_python_code_from_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		LoggerLoad.info("User is on Try Editor page");
        ExcelReader reader = new ExcelReader();

        List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
        LoggerLoad.info(SheetName);
        PythonCode = testdata.get(RowNumber).get("PythonCode");
        ExpectedResult=testdata.get(RowNumber).get("Output");
        LoggerLoad.info("Expected Result is "+ExpectedResult);
        LoggerLoad.info("User enters PythonCode as \" " + PythonCode);
        
        if ( PythonCode!= null )
        	arraypagefactory.fetchPythonCode(PythonCode);
	}

	@When("User clicks on Run button")
	public void user_clicks_on_run_button() {
		LoggerLoad.info("User clicks on Run Button");
		arraypagefactory.clickRunButton();
	}

	@Then("User should be able to see the output")
	public void user_should_be_able_to_see_the_output() {
		LoggerLoad.info("User gets the Result of entered Python Code");
        String fetchOutput = arraypagefactory.fetchOutput();
        
        LoggerLoad.info("Displayed Result is "+fetchOutput);
        assertEquals(fetchOutput,ExpectedResult,"Expected and actual result  matches");
	}
	

	
	@When("User enters invalid Python code from sheet {string} and {int}")
    public void user_enters_invalid_python_code_from_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {

        LoggerLoad.info("User is on Try Editor page");
        ExcelReader reader = new ExcelReader();

        List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
        PythonCode = testdata.get(RowNumber).get("PythonCode");
        ExpectedResult=testdata.get(RowNumber).get("Output");
        LoggerLoad.info("Expected Result is "+ExpectedResult);

        LoggerLoad.info("User enters PythonCode as \" " + PythonCode);
        if ( PythonCode!= null )
        	arraypagefactory.fetchPythonCode(PythonCode);

    }

	
	@Then("User should be able to see error message")
    public void user_should_be_able_to_see_error_message() {

        LoggerLoad.info("User gets the error message in an Alert");
        String actualError = arraypagefactory.fetchErrorMessage();
        String ExpectedError="NameError: name 'hello' is not defined on line 1";
        LoggerLoad.info("Displayed Error Message  is "+actualError);
        assertEquals(actualError,ExpectedError,"Invalid Syntax error message");
        

    }
	
	@Given("User is on {string} page of {string} after logged in")
    public void user_is_on_page_of_after_logged_in(String pageName1, String pageName2)
    {
        LoggerLoad.info("User is  on " +pageName1 + "  page of "+pageName2 + "after logged in ");
        arraypagefactory.clickOnarrayGetStarted();
		arraypagefactory.clickOnarraysInPython();
		arraypagefactory.clickOnPraciceQuestions();
		arraypagefactory.clickOnsearchTheArrays();

    }
	

	
	@When("User enters valid Python code from sheet {string} and {int} for the PracticeQuestions")
    public void user_enters_valid_python_code_from_sheet_and_for_the_practice_questions(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException
    {
        LoggerLoad.info("User enters valid Python Code from Sheet Name  "+sheetName);
        LoggerLoad.info("User enters valid Python Code from Row Number "+rowNumber);
        arraypagefactory.enterPracticeQuestions(sheetName,rowNumber);
        ExpectedMsg=arraypagefactory.getExpectedResult(sheetName, rowNumber);
    }

	
	
	@Then("User should be able to see the Result")
    public void user_should_be_able_to_see_the_result() {

        LoggerLoad.info("User gets the Result of entered Python Code");
        String actualResult = arraypagefactory.getActualResult();
        LoggerLoad.info("Displayed Result is "+actualResult);
        assertEquals(actualResult,ExpectedMsg,"Output is displayed");
    }

	@When("User clicks on Submit button")
    public void user_clicks_on_submit_button()
    {
        LoggerLoad.info("User clicks on Submit button");
        arraypagefactory.clickSubmitButton();
    }
	
	@Then("User should get success submission message  from sheet {string} and {int}")
	public void user_should_get_success_submission_message_from_sheet_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException
    {
        LoggerLoad.info("User gets Success submission message");
        String actualMessage=arraypagefactory.getActualResult();
        System.out.println("the actual message is ");
        System.out.println(actualMessage);
        ExpectedMsg=arraypagefactory.getExpectedResult(sheetName, rowNumber);
        assertEquals(actualMessage,ExpectedMsg,"User gets submission message");
    }
	
	@When("User clicks on Find Numbers with Even Number of Digits link")
    public void user_clicks_on_find_numbers_with_even_number_of_digits_link()
    {
        LoggerLoad.info("User clicks on Find Numbers with Even Number of Digits link");
        arraypagefactory.clickFindNumbersWithEvenNumberOfDigitsLink();

    }
	
	
	
	@Then("User should be redirected to Questions page contains a tryEditor with Run and Submit buttons")
    public void user_should_be_redirected_to_questions_page_contains_a_try_editor_with_run_and_submit_buttons() {

        LoggerLoad.info("User is redirected to Questions page having a Try Editor with Run button and Submit buttons");
        String expectedTitle="Assessment";
        String actualTitle =arraypagefactory.getpageTitle();
        LoggerLoad.info("Page Title is " +actualTitle);
        
        assertEquals(actualTitle,expectedTitle,"User is redirected to another page");

    }
	

	@When("User clicks on Squares of a Sorted Array link")
    public void user_clicks_on_squares_of_a_sorted_array_link() {
        LoggerLoad.info("User clicks on Squares of a Sorted Array link");
        arraypagefactory.clickSquaresOfASortedArrayLink();

    }

	@Given("User is on {string} page of Max Consecutive Ones after logged in")
	public void user_is_on_page_of_max_consecutive_ones_after_logged_in(String string) {
		arraypagefactory.clickOnarrayGetStarted();
		arraypagefactory.clickOnarraysInPython();
		arraypagefactory.clickOnPraciceQuestions();
		arraypagefactory.clickOnmaxConsecutiveOnesButtons();
	}
	
	@Given("User is on Practice page after logged in")
	public void user_is_on_practice_page_after_logged_in() {
		arraypagefactory.clickOnarrayGetStarted();
		arraypagefactory.clickOnarraysInPython();
		arraypagefactory.clickOnPraciceQuestions();
	}
	
	
		@Given("User is on {string} page of FindNumberswithEvenNumberofDigit after logged in")
		public void user_is_on_page_of_find_numberswith_even_numberof_digit_after_logged_in(String string) {
			arraypagefactory.clickOnarrayGetStarted();
			arraypagefactory.clickOnarraysInPython();
			arraypagefactory.clickOnPraciceQuestions();
			arraypagefactory.clickFindNumbersWithEvenNumberOfDigitsLink();
		}
		
		
		@Given("User is on {string} page of Squares of a Sorted Array after logged in")
		public void user_is_on_page_of_squares_of_a_sorted_array_after_logged_in(String string) {
			arraypagefactory.clickOnarrayGetStarted();
			arraypagefactory.clickOnarraysInPython();
			arraypagefactory.clickOnPraciceQuestions();
			arraypagefactory.clickSquaresOfASortedArrayLink();
		}




}
