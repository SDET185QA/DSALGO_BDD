package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import utilities.ConfigReader;
import webDriverManager.DriverFactory;

public class QueuePOF {
	
	 
	public static WebDriver driver = DriverFactory.getDriver();
	
	
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
		
		@FindBy(xpath="//textarea[@tabindex='0']")
		public WebElement Input;
		
		@FindBy(xpath="//button[text()='Run']")
	    private WebElement  RunImplementationOfQueue;
		
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

		public void ImplementationofQueueinPythonLink() {
			Implementation_of_queue.click();
	}
		public void clickTry() {
			Try.click();
		}
		public void Input(String pythonCode) {
			Input.sendKeys(pythonCode);
		}
		public void RunImplementationOfQueue() {
			RunImplementationOfQueue.click();
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
		
//		public String getPageTitle() {
//			String title = driver.getTitle();
//			return title;
//		}

		public String getErrorOnTryEditor(String message) {
			return message;
		}}
