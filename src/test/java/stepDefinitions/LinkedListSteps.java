package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePagePOF;
import pageObjects.LinkedListIntroPOF;
import pageObjects.LinkedListPOF;
import pageObjects.LoginPOF;
import pageObjects.TryEditorPOF;
import utilities.ConfigReader;
import utilities.ExcelReader;
import webDriverManager.DriverFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkedListSteps {
	
	WebDriver driver = DriverFactory.getDriver();
	LinkedListPOF pageObject = new LinkedListPOF();
	LinkedListIntroPOF linkedListIntroPOF = new LinkedListIntroPOF();
	TryEditorPOF tryEditorPOF = new TryEditorPOF();
	LoginPOF loginPOF = new LoginPOF();
	HomePagePOF homepagePOF = new HomePagePOF();
	ExcelReader excelReader = new ExcelReader();

	
	@Given ("The user logged in to dsAlgo Portal with credentials from {string} and row {int}")
	public void the_user_logged_in_to_dsalgo_portal_and_should_be_in_linkedlist_page(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> data = excelReader.getData(ConfigReader.getexcelfilepath(), sheetName);
		String username = data.get(rowNumber - 2).get("username");
		String password = data.get(rowNumber - 2).get("password");
		
		homepagePOF.getstarted_btn();
		loginPOF.clickOnSignin();
		loginPOF.enter_login_credentails(username, password);
		loginPOF.clickonLogin();
	}
	
	//Commenting these for time being
	//Scenario 1
	//@Given("The user is on the secondary home page after logged in")
	//public void the_user_is_on_the_secondary_home_page_after_logged_in() {
	//  
	//}
	//
	//@When("The user clicks on Get Started under the linked List")
	//public void the_user_clicks_on_get_started_under_the_linked_list() {
	//    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	//}
	//
	//@Then("The user should land on Linked list page")
	//public void the_user_should_land_on_linked_list_page() {
	//    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	//}
	//
	//	
	////Scenario 2 : Verify the user is able to land when Linked list option is selected
	//@Given("The user is on the secondary home page after logged in")
	//public void the_user_is_on_the_secondary_hone_page_after_logged_in(){
	//	
	//}
	//@When("The user selects Linked list from the menu bar")
	//public void the_user_selects_linked_list_from_the_menu_bar() {
	//	
	//}
	//@Then("The user should land on Linked list page")
	//public void the_user_should_land_on_linked_list_page() {
		
	//}
	
	//Scenario 3 Verify the user is able to view the Introduction page
	@Given("The user is on the Linked list page")
	public void the_user_is_on_the_linked_list_page() {
		homepagePOF.getStartedhome("Linked List");
		pageObject.navigateToLinkedListPage(driver);
	}
	
	@When("The user clicks on Introduction link")
	public void the_user_clicks_on_introduction_link() {
		pageObject.clickOnIntro();
	}
	
	@Then("The user should be able to view all details pertaining to Introduction")
	public void the_user_should_be_able_to_view_all_details_pertaining_to_introduction() {
		String actualurl = pageObject.getCurrentUrl();
		assertEquals(actualurl,"https://dsportalapp.herokuapp.com/linked-list/introduction/");
	}
	//Scenario 4 Validiation of try editor page open
//	@Given("The user is on the Introduction page")
	@And ("The user is on the Introduction page")
	public void the_user_is_on_the_introduction_page() {
		pageObject.clickOnIntro();
		linkedListIntroPOF.navigateToLinkedListIntroPage(driver);
		
	}
	
	@Then("The user should land on try editor page")
	public void the_user_should_land_on_try_editor_page() {
		String actualurl = pageObject.getCurrentUrl();
		assertEquals(actualurl, "https://dsportalapp.herokuapp.com/tryEditor");
	} 
	//Scenario 5 Verify the user is able to view the error message without entering code and click on Run button
	@And("The user navigates to Try Editor page")
	public void the_user_navigates_to_try_editor_page() {
		pageObject.clickOnIntro();
		linkedListIntroPOF.navigateToLinkedListIntroPage(driver);
		linkedListIntroPOF.tryHere();
		tryEditorPOF.navigateToTryEditorPage(driver);
	}
	
	@When("The user clicks Run button without entering code")
	public void the_user_clicks_run_button_without_entering_code() {
		tryEditorPOF.clickOnRunBtn();
	}
	
	@Then("The error message should be displayed")
	public void the_error_message_should_be_displayed() {
		String actualMsg = tryEditorPOF.getMsg();
		assertEquals(actualMsg, "Please enter the code");
		
	}
	
	// Scenario 6 Verify If User is able to execute the valid python code in Try Editor
	@When("The user enters {string} in try editor")
	public void the_user_enters_code_in_try_editor(String code) {
	     tryEditorPOF.executeCode(code);
	}
	
	@And("The user click on Run button")
	//@When("The user click on Run button")
	public void the_user_click_on_run_button() {
		tryEditorPOF.clickOnRunBtn();
		}
	
	@Then("The user should be able to view the result in console window")
	public void the_user_should_be_able_to_view_the_result_in_console_window() {
		String actualRes = tryEditorPOF.outputConsole();
		assertEquals(actualRes, "Hello");
		
	}
	//Scenario 7 Verify If User is able to execute the invalid python code in Try Editor 
	@Then("The user should get error message in a pop up window")
	public void the_user_should_get_error_message_in_a_pop_up_window() {
	   String actualMsg = tryEditorPOF.getErrorMsg();
	   assertEquals(actualMsg,"SyntaxError: bad input on line 1");
	}
	
	//Scenario 8 Verify the user is able to view the Creating Linked list page
	@When("The user clicks on Creating Linked list link")
	public void the_user_clicks_on_creating_linked_list_link() {
		pageObject.clickOnCreatingLinkedList();
	   
	}
	
	@Then("The user should be able to view all details pertaining to Creating linked list")
	public void the_user_should_be_able_to_view_all_details_pertaining_to_creating_linked_list() {
		String actualUrl = pageObject.getCurrentUrl();
		assertEquals(actualUrl, "https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/");
	}
	//Scenario 9  Verify the user is able to view the try editior page 
//	@Given("The user is on the Creating Linked List page")
//	public void the_user_is_on_the_creating_linked_list_page() {
//		pageObject.clickOnCreatingLinkedList();
//	}
	
	//Scenario 12 Verify the user is able to view the Types of Linked list page
	@When("The user clicks on Types of Linked list link")
	public void the_user_clicks_on_types_of_linked_list_link() {
		pageObject.clickOnTypesOfLinkedList();
	}
	
	@Then("The user should be able to view all details pertaining to Types of linked list")
	public void the_user_should_be_able_to_view_all_details_pertaining_to_types_of_linked_list() {
	   String actualUrl = pageObject.getCurrentUrl();
	   assertEquals(actualUrl, "https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/");
	}
	
	//Scenario 13 Verify the user is able to view the try editior page
//	
//	@Given("The user is on the Types of Linked list page")
//	public void the_user_is_on_the_types_of_linked_list_page(){
//		pageObject.navigateToLinkedListPage(driver);
//	}
	//Scenario 16
	
	@When("The user clicks on Implement Linked list in python page link")
	public void the_user_clicks_on_implement_linked_list_in_python_page_link() {
		pageObject.implementLinkedListInPython();
	}
	
	@Then("The user should be able to view all details pertaining to Implement linked list in python page")
	public void the_user_should_be_able_to_view_all_details_pertaining_to_implement_linked_list_in_python_page() {
		String actualUrl = pageObject.getCurrentUrl();
		assertEquals(actualUrl, "https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/");
	}
	//Scenario 17  Verify the user is able to view the try editior page
	@Given("The user is on the Implement Linked List in python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page() {
		
	}
	
	//Scenario 20 Verify the user is able to view the Traversal page
	@When ("The user clicks on Traversal page link")
	public void the_user_clicks_on_traversal_page_link() {
		pageObject.traversal();
	}
	
	@Then("The user should be able to view all details pertaining to Traversal page")
	public void the_user_should_be_able_to_view_all_details_pertaining_to_traversal_page() {
		String actualUrl = pageObject.getCurrentUrl();
		assertEquals(actualUrl,"https://dsportalapp.herokuapp.com/linked-list/traversal/");
	}
	
	//Scenario 21 The user is on the Traversal list page
	@Given("The user is on the Traversal list page")
	public void the_user_is_on_the_traversal_list_page() {
	  
	}
	//Scenario 24 Verify the user is able to view the Insertion page
	@When("The user clicks on Insertion page link")
	public void the_user_clicks_on_insertion_page_link() {
		pageObject.insertion();
	}
	
	@Then("The user should be able to view all details pertaining to Insertion page")
	public void the_user_should_be_able_to_view_all_details_pertaining_to_insertion_page() {
		String actualUrl = pageObject.getCurrentUrl();
		assertEquals(actualUrl,"https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/");
	}
	//Scenario 28 Verify the user is able to view the Deletion page
	@When("The user clicks on Deletion link")
	public void the_user_clicks_on_deletion_link() {
		pageObject.deletion();
	    }
	
	@Then("The user should be able to view all details pertaining to Deletion page")
	public void the_user_should_be_able_to_view_all_details_pertaining_to_deletion_page() {
		String actualUrl = pageObject.getCurrentUrl();
		assertEquals(actualUrl,"https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/");
	}
	
	//Scenario 32 Verify the user is able to view the Practice questions page
	
	@When("The user clicks on Practice Questions Link")
	public void the_user_clicks_on_practice_questions_link() {
		linkedListIntroPOF.navigateToLinkedListIntroPage(driver);
		linkedListIntroPOF.practiceQns();
	}
	
	@Then("The user should be able to view contents pertaining to Practice Questions page")
	public void the_user_should_be_able_to_view_contents_pertaining_to_practice_questions_page() {
		String actualContent = linkedListIntroPOF.getPracticeQnsContent();
		assertNotEquals(actualContent, "");
	}

	//Scenario Outline 33: Verify the user is able to navigate to try editor page from every sub pages on Linkedlist
	 
	@When("The user navigate to {string}")
	public void the_user_navigate_to_sub_page(String subPage) {
		pageObject.openSubPage(subPage);
	}
	
	@When("The user clicks on try here link")
	@And("The user clicks on try here link on the sub page")
	public void the_user_clicks_on_try_here_link() {
		pageObject.tryHereOnSubPage();
	}
}

