package stepDefinitions;

import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePagePOF;
import utilities.LoggerLoad;

public class HomePageSteps {
	
	HomePagePOF homePage = new HomePagePOF();
	@Given("Launch the home page of dsalgo portal")
	public void launch_the_home_page_of_dsalgo_portal() {
	   LoggerLoad.info("-----DSAlgo Portal-----");;
	   homePage.dsalgoportal();
	}


	@When("User clicks on {string} button")
	public void user_clicks_on_button(String Login) {
	   LoggerLoad.info("-----Click on get Started button----");
	   homePage.getstarted_btn();
	}

	@Then("User redirected to HomePage")
	public void user_redirected_to_home_page() {
		String title=homePage.getTitleofPage();
        LoggerLoad.info("----User is on"+title +"Page----");
        assertEquals(title,"NumpyNinja");
	}
	
	@Given("User is on HomePage")
	public void user_is_on_home_page() {
	LoggerLoad.info("----User is on Home Page Page----");
	homePage.homepage();
	}

	@When("The user select any dropdown menu {string} without sigining in")
	public void the_user_select_any_dropdown_menu_without_sigining_in(String Option) {
	   LoggerLoad.info("-----User Clicks on Dropdown Before Sign in-----");
	   homePage.dropdown(Option);
	}

	@Then("User not signed in alert message displyed {string}")
	public void user_not_signed_in_alert_message_displyed(String string) {
		String alert =homePage.getAlert();
        LoggerLoad.info("The actual Message:" +alert);
        assertEquals(alert, string);
	}
	@When("The user click any of the Get started link before signin {string} in home page")
	public void the_user_click_any_of_the_get_started_link_before_signin_in_home_page(String string) {
	    LoggerLoad.info("User Clicks on Get Started link before Sign in");
		homePage.getStartedhome(string);
	}

	@Then("It should Alert the user with the message {string}")
	public void it_should_alert_the_user_with_the_message(String string) {
		String alert =homePage.getAlert();
        LoggerLoad.info("The actual Message:" +alert);
        assertEquals(alert, string);
	}

	@When("user clicks on SignIn link")
	public void user_clicks_on_sign_in_link() {
		LoggerLoad.info("---User Clicks on Sign In link----");
		homePage.signinLink();
	}

	@Then("user redirected to login page")
	public void user_redirected_to_login_page() {
		LoggerLoad.info("User redirected to Login page ");
        String Title = homePage.login_page();
        LoggerLoad.info("Title of current page is : " + Title);
        assertEquals(Title, "Login");
	}

	@When("user clicks on Register link")
	public void user_clicks_on_register_link() {
		 LoggerLoad.info("----User Clicks on Register link---");
		 homePage.registerLink();
	}

	@Then("user redirected to register page")
	public void user_redirected_to_register_page() {
		LoggerLoad.info("User redirected to Registraion page ");
        String Title = homePage.register_page();
        LoggerLoad.info("Title of current page is : " + Title);
        assertEquals(Title, "Registration");

	}







}
