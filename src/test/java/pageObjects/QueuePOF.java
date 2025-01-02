package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;
//import utilities.ConfigReader;
import webDriverManager.DriverFactory;

public class QueuePOF {
	
	 
	 WebDriver driver = DriverFactory.getDriver();
	 Utility_Methods util=new Utility_Methods();
	
	
public QueuePOF() {
	     
		// Use the PageFactory.initElements method to initialize the elements on the array page
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(null, this);
	}

		

		//Locators- @FindBy annotation to identify the elements on the page
	    @FindBy(xpath="//a[@href='queue']")
		public WebElement getStarted;
		
	    @FindBy(xpath="//a[text()='Implementation of Queue in Python']")//Implementation of Queue Page
	    private WebElement Implementation_of_queue;
		
		@FindBy(xpath="//a[text()='Try here>>>']")
	    private WebElement Try;
						
	    @FindBy (xpath="//form/div/div/div/textarea")
		private WebElement editorInput;
				
		@FindBy (id="answer_form")
		private WebElement answerform;
				
		@FindBy(xpath="//button[text()='Run']")
	    private WebElement  Run_btn_Queue;
				
		@FindBy (xpath="//pre[@id='output']") 
		private WebElement output;
		
//		@FindBy(xpath="//button[text()='Run']")
//	    private WebElement  RunImplementationOfQueue;
//		
		@FindBy(xpath="//a[text()='Implementation using collections.deque']")//Implementation Using collections dequeue
	    private WebElement Implementation_Using_Collections_deque;
				
		@FindBy(xpath="//a[text()='Implementation using array']")//Implementation Using Array
	    private WebElement Implementation_Using_Array;

		@FindBy(xpath="//a[text()='Queue Operations']")//Queue Operations
	    private WebElement Queue_Operations;
		
	    @FindBy(xpath="//a[text()='Try here>>>']")
        private WebElement Try_QueueOperations;
		
		@FindBy(xpath="//a[text()='Practice Questions']")//Practice Questions
	    private WebElement Practice_Questions;
		
		@FindBy(xpath="//a[text()='Try here>>>']")
	    private WebElement Try_PracticeQuestions;

	//Actions	
		public void getStarted_Q() 
		{
		getStarted.click();
		}
		public String getpageTitle() {
			String actualPageTitle = driver.getTitle();
			LoggerLoad.info("The tile of Queue page is "+ actualPageTitle);
			return actualPageTitle;
		}

		public void ImplementationofQueueinPythonLink() {
			Implementation_of_queue.click();
	}
		public void clickTry() {
			Try.click();
		}
//		public void Input(String pythonCode) {
//			Input.sendKeys(pythonCode);
//		}
		public void Run_btn_Queue() {
			Run_btn_Queue.click();
		}
		
		
		public void ImplementationUsingCollectiondeQueueLink() {
			Implementation_Using_Collections_deque.click();
		}
		
		public void ImplementationUsingArray() {
			Implementation_Using_Array.click();
		}
		
		public void QueueOperations() {
		Queue_Operations.click();
	    }
	    public void TryQueueOperations() {
			Try_QueueOperations.click();
	    }
		public void clickPracticeQuestions() {
			Practice_Questions.click();
		}
		public void clickTryPracticeQuestions() {
			Try_PracticeQuestions.click();
		}
		

		public String getErrorOnTryEditor(String message) {
			return message;
		}
		public void  navigateTo(String pagename)
  	    {
  	        
  			 String GraphUrlName= ConfigReader.geturl(pagename);
  		        driver.get(GraphUrlName);
  	    }
  		public void fetchPythonCode(String PythonCode) {
  	        System.out.println("Editor Input: "+editorInput);
  	        util.waitForElement(answerform);
  	        answerform.click();
  	        editorInput.sendKeys(PythonCode);
  	        
  	    }
  		public String fetchOutput()
  	    {
  	        util.waitForElement(output);
  	        LoggerLoad.info("Click on the OK button for the error pop up ");
  	        String Result = output.getText();
  	        return Result;
  	        
  	    }
  		public String fetchErrorMessage()
  	    {
  			LoggerLoad.info("Get the error message pop up for the invalid python code ");
  	        String errorMessage=driver.switchTo().alert().getText();
  	        LoggerLoad.info("Click on the OK button for the error pop up ");
  	        driver.switchTo().alert().accept();
  	        return errorMessage;
  	    }
}
