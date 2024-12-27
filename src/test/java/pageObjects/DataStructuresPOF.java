package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.messages.types.Duration;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;
import webDriverManager.DriverFactory;


public class DataStructuresPOF {

    WebDriver driver = DriverFactory.getDriver();
	Utility_Methods util=new Utility_Methods();

	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement getStartedDSintro_link;
	@FindBy(xpath = "//a[@href='time-complexity']")
	WebElement timecomplexity_link;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement try_Here;
	@FindBy(xpath = "//button[@type='button']")
	WebElement run_button;
	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practiceQuestins;
	@FindBy(xpath="//textarea[@tabindex='0']")
	public WebElement Input;
	@FindBy (xpath="//form/div/div/div/textarea")
	private WebElement editorInput;
	
	@FindBy (xpath="//pre[@id='output']") 
	private WebElement output;
	
	@FindBy (id="answer_form")
	private WebElement answerform;
	
	
	public DataStructuresPOF() {
		PageFactory.initElements(driver, this);
	}

	public void getStarted_DS() {
		
		getStartedDSintro_link.click();
	}

	public String getpageTitle() {
		String actualPageTitle = driver.getTitle();
		LoggerLoad.info("The tile of array page is "+ actualPageTitle);
		return actualPageTitle;
	}

	public void clickOnTimeComplexitylink() {
		System.out.println("clickOnTimeComplexitylink");
		timecomplexity_link.click();

	}
	public void clickOnTryHere() {
		try_Here.click();

	}
	public void Input(String pythonCode) {
		Input.sendKeys(pythonCode);
	}
	public void fetchPythonCode(String PythonCode) {
        System.out.println("Editor Input: "+editorInput);
        util.waitForElement(answerform);
        answerform.click();
        editorInput.sendKeys(PythonCode);
    }
	

	public void clickonRunButton() {
		LoggerLoad.info("Click on the run button");
		run_button.click();
		
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
	
	public void clickOnPracticeQuestion() {
		practiceQuestins.click();
	}
	public String getErrorOnTryEditor(String message) {
		return message;
	}

	
}
