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




}
