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
		LoggerLoad.info("The user is on user ds-algo page");
	}

	@When("The user select the drop down option and select the array option")
	public void the_user_select_the_drop_down_option_and_select_the_array_option() {
		arraypagefactory.array_dropdown();
		LoggerLoad.info("The user succesfully clicked on the dropdown for data structures");
	}

	@Then("The user lands in the arrays Datastructure page")
	public void the_user_lands_in_the_arrays_datastructure_page() {
		arraypagefactory.getArraypageTitle();
		LoggerLoad.info("The user succesfully clicked on the Array option for data structures dropdown");
	}
	

	
	///To implement block
	


@Given("The user is in the {string} page after Sign in")
public void the_user_is_in_the_page_after_sign_in(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("The user clicks {string} button")
public void the_user_clicks_button(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("The user should be redirected to {string} page")
public void the_user_should_be_redirected_to_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	

@Given("The user is in the tryEditor page")
public void the_user_is_in_the_try_editor_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("The user clicks the Run Button without entering the code in the Editor")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("The user should able to see an error message in alert window")
public void the_user_should_able_to_see_an_error_message_in_alert_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	

@When("The user clicks the {string} link")
public void the_user_clicks_the_link(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("The user should be redirected to {string} page contains a question,and try Editor with Run and Submit buttons")
public void the_user_should_be_redirected_to_page_contains_a_question_and_try_editor_with_run_and_submit_buttons(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

	



@Then("The user should be redirected to a page having an try Editor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


@Given("The user is on the {string} page")
public void t_the_user_is_on_the_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("The user clicks {string} button in Arrays Using List page")
public void the_user_clicks_button_in_arrays_using_list_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



@Given("The user is in the Array page after Sign in")
public void the_user_is_in_the_array_page_after_sign_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



@When("The user clicks {string} button in Arrays in Python page")
public void the_user_clicks_button_in_arrays_in_python_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



}
