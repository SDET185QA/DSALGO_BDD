package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPOF;
import utilities.LoggerLoad;

public class ArraySteps {
	public ArrayPOF arraypagefactory = new ArrayPOF();
	
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
		 arraypagefactory.getpageTitle(expectedArrayPageTitle);
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
		arraypagefactory.getpageTitle(expectedArrayPageTitle);
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
		arraypagefactory.getpageTitle(expectedAssesmentPageTitle);
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
		arraypagefactory.getpageTitle(expectedAssesmentPageTitle);
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





}
