package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverManager.DriverFactory;

public class GraphPOF {
	public static WebDriver driver =  DriverFactory.getDriver();

	
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
	
	@FindBy(xpath="//textarea[@tabindex='0']")
	public WebElement Input;
	
	@FindBy(xpath="//button[text()='Run']")
    private WebElement  Run_btn;
	
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
  		public void Input(String pythonCode) {
  			Input.sendKeys(pythonCode);
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

		

}
