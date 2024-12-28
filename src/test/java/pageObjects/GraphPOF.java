package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;
import webDriverManager.DriverFactory;

public class GraphPOF {
     WebDriver driver =  DriverFactory.getDriver();
     Utility_Methods util=new Utility_Methods();

	
	//Constructor
	public GraphPOF(){
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	//Locators
	
	    @FindBy(xpath="//a[@href ='graph']")
	    public WebElement getStarted_btn;
	
        @FindBy(xpath="//a[@href='graph']")//Graph Page
        private WebElement Graph_home_link;
	
        @FindBy(xpath="//a[@href='graph']")
        private WebElement Graph_link;
    
	    @FindBy(xpath="//a[text()='Try here>>>']")
        private WebElement Try;
	
		
		@FindBy (xpath="//form/div/div/div/textarea")
		private WebElement editorInput;
		
		@FindBy (id="answer_form")
		private WebElement answerform;
		
		@FindBy(xpath="//button[text()='Run']")
	    private WebElement  Run_btn;
		
		@FindBy (xpath="//pre[@id='output']") 
		private WebElement output;
		
	
	    @FindBy(xpath="//a[text()='Graph Representations']")//Graph Representation
        private WebElement Graph_Representation_link;
	
        @FindBy(xpath="//a[text()='Practice Questions']")//Practice Questions
        private WebElement Practice_Questions;
	
    
  //Actions	
  		public void getStarted() 
  		{
  		getStarted_btn.click();
  		}

  		public void GraphHomeLink() {
  		Graph_home_link.click();
  	    }
  		public void GraphLink() {
  	  		Graph_link.click();
  	  	    }
  		public void clickTry() {
  			Try.click();
  		}
  		public void Runbtn() {
  			Run_btn.click();
  		}
  		
  		public void GraphRepresentationLink() {
  			Graph_Representation_link.click();
  		}
  		public void clickPracticeQuestions() {
			Practice_Questions.click();
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
