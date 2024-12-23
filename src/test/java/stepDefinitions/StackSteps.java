package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StackPOF;
import pageObjects.TryEditorPOF;
import webDriverManager.DriverFactory;

public class StackSteps {
	WebDriver driver = DriverFactory.getDriver();
	StackPOF stackPOF= new StackPOF();
	TryEditorPOF tryEditorPOF = new TryEditorPOF();
	

//Scenario 1
//	@When("The user clicks on Get Started under the Stack")
//	public void the_user_clicks_on_get_started_under_the_stack() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be able to land on the Stack page")
//	public void the_user_should_be_able_to_land_on_the_stack_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user selects Stack from the menu bar")
//	public void the_user_selects_stack_from_the_menu_bar() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should land on Stack page")
//	public void the_user_should_land_on_stack_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//Scenario  Verify the user is able to view the Operations in Stack
	@Given("The user is on Stack page")
	public void the_user_is_on_stack_page() {
	  stackPOF.navigateToStackPage(driver);
	}

	@When("The user clicks on Operations in Stack link")
	public void the_user_clicks_on_operations_in_stack_link() {
		stackPOF.clickOnOperationsInStack();
	}

	@Then("The user should be able to view the details pertaining to the Operation in Stack")
	public void the_user_should_be_able_to_view_the_details_pertaining_to_the_operation_in_stack() {
		String actualUrl = stackPOF.getCurrentUrl();
		assertEquals(actualUrl, "https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
	}

//
	
//Scenario Verify the user is able to view  Implementation page
	@When("The user clicks on Implementation link")
	public void the_user_clicks_on_implementation_link() {
		stackPOF.clickOnImplementation();
	}

	@Then("The user should be able to view the details pertaining to the Implementation page")
	public void the_user_should_be_able_to_view_the_details_pertaining_to_the_implementation_page() {
		String actualUrl = stackPOF.getCurrentUrl();
		assertEquals(actualUrl, "https://dsportalapp.herokuapp.com/stack/implementation/");
	}

//Scenario: Verify the user is able to view Appllications page
	@When("The user clicks on Applications link")
	public void the_user_clicks_on_applications_link() {
		stackPOF.ClickOnApplications();
	}

	@Then("The user should be able to view the details pertaining to the Applications page")
	public void the_user_should_be_able_to_view_the_details_pertaining_to_the_applications_page() {
		String actualUrl = stackPOF.getCurrentUrl();
		assertEquals(actualUrl, "https://dsportalapp.herokuapp.com/stack/stack-applications/");
	}
//Scenario : Verify the user is able to navigate to practice questions page from every subpages on stack
	@When("The user clicks on {string}")
	public void the_user_is_on_the_sub_page(String subPage) {
		stackPOF.openSubPage(subPage);
	}

	@And("The user clicks on Practice Questions link")
	public void the_user_clicks_on_practice_questions_link() {
		stackPOF.ClickOnPracticeQns();
		}

	@Then("The user should be able to view the details pertaining to the Practice questions page")
	public void the_user_should_be_able_to_view_the_details_pertaining_to_the_practice_questions_page() {
		String actualContent = stackPOF.getPracticeQnsContent();
		assertNotEquals(actualContent, "");
	}
//Scenario : Verify the user is able to navigate to try editor page from every subpages on stack
	@When("The user click on {string}")
	public void the_user_click_on_subPage(String subPage) {
		stackPOF.openSubPage(subPage);
		}
	@And ("The user clicks on try here link on the subpage")
	public void the_user_clicks_on_try_here_link_on_the_subpage() {
		stackPOF.clickOnTryHereOnSubPage();
	}
	@Then("The user should navigate to try editor page")
	public void the_user_should_navigate_to_try_editor_page() {
		String actualUrl = stackPOF.getCurrentUrl();
		assertEquals(actualUrl, "https://dsportalapp.herokuapp.com/tryEditor");
	}
//Scenario: Verify the user is able to view the error message without entering code and click on Run button on Try Editor Page
	@Given("The user is on Try Editor Page")
	public void the_user_is_on_try_editor_page() {
		tryEditorPOF.navigateToTryEditorPage(driver);
	}

	@When ("The user click on Run button without entering code")
	public void the_user_click_on_run_button_without_entering_code() {
		tryEditorPOF.clickOnRunBtn();
	}
	@Then ("The error message should be displayed on screen")
	public void the_error_message_should_be_displayed_on_screen() {
		String actualMsg = tryEditorPOF.getErrorMsg();
		assertEquals(actualMsg, "Please enter the code");
		}

}
