package stepDefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPOF;
import utilities.LoggerLoad;




public class GraphSteps {
	
	 GraphPOF GraphpageObject = new GraphPOF();
	
	@When("User clicks the Get Started button in Graph")
	public void user_clicks_the_get_started_button_in_graph() {
		LoggerLoad.info("-----Click on get Started button----");
		GraphpageObject.getStarted();
	}

	@Then("User should be redirected to the Graph home page clicking on Get Started")
	public void user_should_be_redirected_to_the_graph_home_page_clicking_on_get_started() {
		LoggerLoad.info("-----User is redirected to the Graph home page ----");
	}

	@Given("user is on the Graph home Page")
	public void user_is_on_the_graph_home_page() {
	    LoggerLoad.info("-----User is on the Graph home page----");
		GraphpageObject.getStarted();
		//GraphpageObject.GraphHomeLink();
		
	}

	@When("user clicks Graph")
	public void user_clicks_graph() {
		LoggerLoad.info("-----User is clicking on Graph home page ----");
		GraphpageObject.GraphHomeLink();
		
	}

	@Then("user should be redirected to Graph page from  Graph home Page")
	public void user_should_be_redirected_to_graph_page_from_graph_home_page() {
		LoggerLoad.info("-----User is redirected to the Graph page from Graph home page ----");
	}
	
	@Given("user is on the Graph Page")
	public void user_is_on_the_graph_page() {
		LoggerLoad.info("-----User is on the Graph page---");
		GraphpageObject.getStarted();
		GraphpageObject.GraphHomeLink();
	}
	
	@When("user clicks on the Graph Representation link")
	public void user_clicks_on_the_graph_representation_link() {
		LoggerLoad.info("-----User is clicking on Graph Representation ----");
		GraphpageObject.GraphRepresentationLink();
	}

	@Then("user should be redirected to the Graph Representation Page")
	public void user_should_be_redirected_to_the_graph_representation_page() {
		LoggerLoad.info("-----User is redirected to the Graph Representation Page ----");
	}

	@Given("user is on the Graph Representation Page")
	public void user_is_on_the_graph_representation_page() {
		LoggerLoad.info("-----User is on the Graph Representation page---");
		GraphpageObject.getStarted();
		//GraphpageObject.GraphHomeLink();
		GraphpageObject.GraphRepresentationLink();
	    
	}
	@Given("user is on Try Editor")
	public void user_is_on_try_editor() {
		LoggerLoad.info("-----User is clicking on try here button----");
		GraphpageObject.getStarted();
		GraphpageObject.GraphHomeLink();
		GraphpageObject.clickTry();
	}

	@When("user enter valid pythonCode in tryEditor as {string}")
	public void user_enter_valid_python_code_in_try_editor_as(String Input) {
		LoggerLoad.info("-----User enters valid pythoncode----");
		GraphpageObject.Input.sendKeys(Input);
		GraphpageObject. Runbtn();
	}

	@When("user enter Invalid pythonCode in tryEditor as {string}")
	public void user_enter_invalid_python_code_in_try_editor_as(String Input) {
		LoggerLoad.info("-----User enters Invalid pythoncode----");
	    GraphpageObject.Input.sendKeys(Input);
		GraphpageObject. Runbtn();
	}



	@Given("User is on the Graph Representations")
	public void user_is_on_the_graph_representations() {
		LoggerLoad.info("-----User is on the Graph Representation----");
		GraphpageObject.getStarted();
		GraphpageObject.GraphRepresentationLink();
	    
	}

	@When("user clicks Practice Questions  link")
	public void user_clicks_practice_questions_link() {
		LoggerLoad.info("-----User clicks on Practice Questions----");
		GraphpageObject.clickPracticeQuestions();
	}

	

	
					}