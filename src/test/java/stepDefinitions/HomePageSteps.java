package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePagePOF;

public class HomePageSteps {
	
	HomePagePOF homePage = new HomePagePOF();
	@Given("Launch the home page of dsalgo portal")
	public void launch_the_home_page_of_dsalgo_portal() {
	  // System.out.println("Launch the home page of dsalgo portal");
	   homePage.dsalgoportal();
	}

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String Login) {
	 //  System.out.println("User clicks on"+Login + "button");
	   homePage.getstarted_btn();
	}

	@Then("User redirected to HomePage")
	public void user_redirected_to_home_page() {
	  // System.out.println("User redirected to HomePage");
	   String title=homePage.getTitleofPage();
	   System.out.println("HomePage Title"+ title);
	}
	
	@Given("User is on HomePage")
	public void user_is_on_home_page() {
	///System.out.println("User is on HomePage\"");
	homePage.homepage();
	}

	@When("The user select any dropdown menu {string} without sigining in")
	public void the_user_select_any_dropdown_menu_without_sigining_in(String Option) {
	  // System.out.println("The user selected***" + Option + "***option from dropdown menu without sigining in");
	   homePage.dropdown(Option);
	}

	@Then("User not signed in alert message displyed")
	public void user_not_signed_in_alert_message_displyed() {
      //  System.out.println("ser not signed in alert message displyed");
        String alert =homePage.getAlert();
        System.out.println("ALERT"+alert);
	}
	@When("The user click any of the Get started link before signin {string} in home page")
	public void the_user_click_any_of_the_get_started_link_before_signin_in_home_page(String string) {
	   // System.out.println("The user click any of the Get started link before signin in home page");
		homePage.getStartedhome(string);
	}

	@Then("It should Alert the user with the message {string}")
	public void it_should_alert_the_user_with_the_message(String string) {
	  // System.out.println("It should Alert the user with the message Not Logged in");
	    String alert =homePage.getAlert();
        System.out.println("ALERT"+alert);
	}

	@When("user clicks on SignIn link")
	public void user_clicks_on_sign_in_link() {
		//System.out.println("user clicks on SignIn link");
		  homePage.signinLink();
	}

	@Then("user redirected to login page")
	public void user_redirected_to_login_page() {
	   // System.out.println("user redirected to login page");
		String Title = homePage.login_page();
        System.out.println("Title of current page is : " + Title);
	}

	@When("user clicks on Register link")
	public void user_clicks_on_register_link() {
	  // System.out.println("user clicks on Register link");
		 homePage.registerLink();
	}

	@Then("user redirected to register page")
	public void user_redirected_to_register_page() {
	   //System.out.println("user redirected to register page");
		String regPageTitle = homePage.register_page();
        System.out.println("regPageTitle  "+ regPageTitle);
	}







}
