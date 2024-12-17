package stepDefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.QueuePOF;
import utilities.LoggerLoad;

public class QueueSteps {
	
	public QueuePOF QPOF = new QueuePOF();


@Given("The user is on the Home page")
public void the_user_is_on_the_home_page() { 
	//String Title = QPOF.getPageTitle();
	LoggerLoad.info("User is on the Homepage");
	//assertEquals(Title,"NumpyNinja");
}

@When("User clicks the Get Started button in Queue")
public void user_clicks_the_get_started_button_in_queue() {
	 LoggerLoad.info("-----Click on get Started button----");
    QPOF.getStarted_Q();
}

@Then("User should be redirected to the Queue page clicking on Get Started")
public void user_should_be_redirected_to_the_queue_page_clicking_on_get_started() {
	 LoggerLoad.info("-----User is redirected to the Queue page----");
}

@Given("User is on the Queue Page")
public void user_is_on_the_queue_page() {
	 LoggerLoad.info("-----User is on the Queue Page----");
	QPOF.getStarted_Q();  
}

@When("user clicks Implementation of Queue in python link")
public void user_clicks_implementation_of_queue_in_python_link() {
	 LoggerLoad.info("-----User is clicking on Implementation of Queue ----");
 QPOF.ImplementationofQueueinPythonLink();
}

@Then("User should be redirected to the Implementation of queue in Python Page")
public void user_should_be_redirected_to_the_implementation_of_queue_in_python_page() {
	 LoggerLoad.info("-----User is redirected to Implementation of queue----");
	
}

@Given("User is on the Implementation of Queue in python link")
public void user_is_on_the_implementation_of_queue_in_python_link() {
	LoggerLoad.info("-----User is on the Implementation of Queue----");
	QPOF.getStarted_Q();
	QPOF.ImplementationofQueueinPythonLink();
	
    }

@When("user clicks try here button")
public void user_clicks_try_here_button() {
	LoggerLoad.info("-----User is clicking on try here button----");
	QPOF.clickTry();
}


@Then("user should be redirected to a page having an tryEditor with a Run button to test")
public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	//String Title = QPOF.getPageTitle();
	LoggerLoad.info("-----User is redirected to the page having tryEditor----");
	

}

@Given("user is on Try Editor page")
public void user_is_on_try_editor_page() {
	LoggerLoad.info("-----User on Try Editor----");
	QPOF.getStarted_Q();
	QPOF.ImplementationofQueueinPythonLink();
	QPOF.clickTry();

}

@When("user enter valid pythonCode in tryEditor as print {string}")
public void user_enter_valid_python_code_in_try_editor_as_print_hello_numpy_ninjas(String Input) {
	LoggerLoad.info("-----User enters valid pythoncode----");
    QPOF.Input.sendKeys(Input);
    QPOF. RunImplementationOfQueue();
}

@Then("user should be presented with Run result")
public void user_should_be_presented_with_run_result() {
//	String Title = QPOF.getPageTitle();
//	System.out.println("Presented with a Run Result"+ Title);
	LoggerLoad.info("-----User is viewing the Result----");
    }

@When("user enter Invalid pythonCode in tryEditor {string}")
public void user_enter_invalid_python_code_in_try_editor(String Input) {
	LoggerLoad.info("-----User enters Invalid pythoncode----");
	QPOF.Input.sendKeys(Input);
    QPOF. RunImplementationOfQueue();
    
}
@Then("The user should get an alert message")
public void the_user_should_get_an_alert_message() {
	LoggerLoad.info("-----User gets an alert message----");
	String actualErrorMsg = QPOF.getErrorOnTryEditor("SyntaxError: bad input on line 1");
	assertEquals(actualErrorMsg, "SyntaxError: bad input on line 1");
    }

@When("User clicks  Implementation using Collection.deque link")
public void user_clicks_implementation_using_collection_deque_link() {
	LoggerLoad.info("-----User is clicking on Implementation using Collections.deque----");
	QPOF.ImplementationUsingCollectiondeQueueLink();
}

@Then("User should be redirected to the Implementation using Collection.deque Page")
public void user_should_be_redirected_to_the_implementation_using_collection_deque_page() {
	LoggerLoad.info("-----User is redirected to the Implementation using Collection.deque Page ----");	
//	String Title = QPOF.getPageTitle();
//	System.out.println("Implementation Of queue in Python"+ Title);
}

@Given("User is on the Implementation using Collection.deque link")
public void user_is_on_the_implementation_using_collection_deque_link() {
	LoggerLoad.info("-----User is on Implementation using collection.deque----");
	QPOF.getStarted_Q();
	QPOF.ImplementationUsingCollectiondeQueueLink(); 
}

@When("user clicks  Implementation using array page  link")
public void user_clicks_implementation_using_array_page_link() {
	LoggerLoad.info("-----User clicking on Implementation using array page----");
	QPOF.ImplementationUsingArray();	
}

@Then("User should be redirected to the Implementation using array page")
public void user_should_be_redirected_to_the_implementation_using_array_page() {
	LoggerLoad.info("-----User is redirected to the Implementation using array page----");
//	String Title = QPOF.getPageTitle();
//	System.out.println("Try Editor with Run button"+ Title);
    }  

@When("user clicks  Queue Operations page link")
public void user_clicks_queue_operations_page_link() {
	LoggerLoad.info("-----User is clicking on Queue Operation page----");
	QPOF.QueueOperations();
}

@Then("User should be directed to the Queue Operations page")
public void user_should_be_directed_to_the_queue_operations_page() {
	LoggerLoad.info("-----User is redirected to the Queue Operations----");
//	String Title = QPOF.getPageTitle();
//	System.out.println("Try Editor with Run button"+ Title);
    } 

 @Given("User is on the Queue Operation page")
 public void user_is_on_the_queue_operation_page() {
	 LoggerLoad.info("-----User is on the Queue Operation Page----");
	    QPOF.getStarted_Q();
	    QPOF.QueueOperations();

 }

@When("user clicks Practice Questions link")
public void user_clicks_practice_questions_link() {
	LoggerLoad.info("-----User clicks on Practice Questions----");
    QPOF.clickPracticeQuestions();
}

@Then("User should be directed to the Practice Question Page with list of Questions Page")
public void user_should_be_directed_to_the_practice_question_page_with_list_of_questions_page() {
	LoggerLoad.info("-----User is redirected to the Practice Question page----");
//	String Title = QPOF.getPageTitle();
//	System.out.println("Practice Question Page with list of Questions"+ Title);
    } 

}



