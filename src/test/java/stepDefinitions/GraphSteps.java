package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPOF;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;




public class GraphSteps {
	
	 GraphPOF GraphpageObject = new GraphPOF();
	 String PythonCode;
	    String Output;
	    String ExpectedResult,ExpectedError,ExpectedMsg;
		String Excelpath=ConfigReader.getexcelfilepath();
		
	
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
		GraphpageObject.GraphRepresentationLink();
	    
	}

	@Given("User is on the {string}.")
	public void user_is_on_the(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		GraphpageObject.navigateTo(page_name);
        LoggerLoad.info("User is on the "+pagename + " after logged in");
	}
	
	@When("User enters Valid Python code from sheet {string} and {int}")
	public void user_enters_valid_python_code_from_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		LoggerLoad.info("User is on Try Editor page");
        ExcelReader reader = new ExcelReader();

        List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
        LoggerLoad.info(SheetName);
        PythonCode = testdata.get(RowNumber).get("PythonCode");
        ExpectedResult=testdata.get(RowNumber).get("Output");
        LoggerLoad.info("Expected Result is "+ExpectedResult);
        LoggerLoad.info("User enters PythonCode as \" " + PythonCode);
        
        if ( PythonCode!= null )
        	GraphpageObject.fetchPythonCode(PythonCode);
	}
	
	@When("User clicks on Run Button")
	public void user_clicks_on_run_button() {
		LoggerLoad.info("User clicks on Run Button");
		GraphpageObject.Runbtn();
	}
	@Then("User should be able to see the  valid output")
	public void user_should_be_able_to_see_the_valid_output() {
		LoggerLoad.info("User gets the Result of entered Python Code");
        String fetchOutput = GraphpageObject.fetchOutput();
        
        LoggerLoad.info("Displayed Result is "+fetchOutput);
        assertEquals(fetchOutput,ExpectedResult,"Expected and actual result  matches");
	}
	
	@When("User enters Invalid Python code from sheet {string} and {int}")
	public void user_enters_invalid_python_code_from_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		 LoggerLoad.info("User is on Try Editor page");
	        ExcelReader reader = new ExcelReader();

	        List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
	        PythonCode = testdata.get(RowNumber).get("PythonCode");
	        ExpectedResult=testdata.get(RowNumber).get("Output");
	        LoggerLoad.info("Expected Result is "+ExpectedResult);

	        LoggerLoad.info("User enters PythonCode as \" " + PythonCode);
	        if ( PythonCode!= null )
	        	GraphpageObject.fetchPythonCode(PythonCode);

	    }
	
	@When("User clicks on  the Run button")
	public void user_clicks_on_the_run_button() {
		LoggerLoad.info("User clicks on Run Button");
		GraphpageObject.Runbtn();
	
	}
	@Then("User should be able to see  the error message")
	public void user_should_be_able_to_see_the_error_message() {
		 LoggerLoad.info("User gets the error message in an Alert");
	        String actualError = GraphpageObject.fetchErrorMessage();
	        String ExpectedError="NameError: name 'hello' is not defined on line 1";
	        LoggerLoad.info("Displayed Error Message  is "+actualError);
	        assertEquals(actualError,ExpectedError,"Invalid Syntax error message");
	        


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
	
  @Then("The User should get an alert message")
  public void the_user_should_get_an_alert_message() {
	LoggerLoad.info("-----User gets an alert message----");
	String actualErrorMsg = GraphpageObject.getErrorOnTryEditor("SyntaxError: bad input on line 1");
	assertEquals(actualErrorMsg, "SyntaxError: bad input on line 1");
    }
}


	

	
					