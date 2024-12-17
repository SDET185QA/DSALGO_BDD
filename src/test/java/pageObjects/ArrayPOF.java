package pageObjects;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverManager.DriverFactory;
import org.testng.Assert;

import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;


public class ArrayPOF {
	
	public static WebDriver driver = DriverFactory.getDriver();
	Utility_Methods util=new Utility_Methods();
	String treeUrl = ConfigReader.getloginUrl("TryEditorPageUrl");
	
	@FindBy(xpath = "//div[@id='navbarCollapse']//a[contains(text(), 'Data Structures')]")
    private WebElement dropdownoption;
	@FindBy(xpath = "//a[@class='dropdown-item'][@href='/array']")
    private WebElement arraydropdown;
	
	
	@FindBy(xpath = "//a[@href='array']")
    private WebElement arrayGetStarted;
	@FindBy(xpath="//a[@href='arrays-in-python']")
    private WebElement arraysInPython;
	
	
	@FindBy(xpath="//a[@href='/tryEditor']")
    private WebElement tryHereLink;

	
	
	@FindBy(xpath="//a[@href='/array/practice']")
    private WebElement PraciceQuestionsButton;
	
	
	
	@FindBy(xpath="//a[@href='/question/1']")
    private WebElement searchTheArrayButton;
	
	@FindBy(xpath="//a[@href='/question/2']")
    private WebElement maxConsecutiveOnesButton;
	
	@FindBy(xpath="//a[@href='/question/3']")
    private WebElement findNumbersWithEvenDigit;
	
	@FindBy(xpath="//a[@href='/question/4']")
    private WebElement sqauresOfSortedArray;
	
	@FindBy(xpath="//a[@href='arrays-using-list']")
    private WebElement arraysUsingList;
	
	@FindBy(xpath="//a[@href='basic-operations-in-lists']")
    private WebElement basicOperationList;
	
	@FindBy (xpath="//form/div/div/div/textarea")
	private WebElement editorInput;
	
	@FindBy (id="answer_form")
	private WebElement answerform;
	
	@FindBy (xpath="//button[text()='Run']") 
	private WebElement runButton;
	
	@FindBy (xpath="//pre[@id='output']") 
	private WebElement output;
	
	public ArrayPOF() {
		
		// Use the PageFactory.initElements method to initialize the elements on the array page
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(null, this);
	}
	public void dropDownClick() {
		
		dropdownoption.click();
		
	}
	
	public void arrayDropClick() {
		
		arraydropdown.click();
	}
	public void getpageTitle(String expectedPageTitle) {
		String actualPageTitle = driver.getTitle();
		LoggerLoad.info("The tile of array page is "+ actualPageTitle);
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		}
	public void clickOnarraysInPython() {
		LoggerLoad.info("click " + arraysInPython.getText() + " On array page");
		arraysInPython.click();
		}
	
	public void clickOnarrayGetStarted() {
		LoggerLoad.info("click " + arrayGetStarted.getText() + " On array page");
		
		arrayGetStarted.click();
		}
	
	public void clickOnTryHere() {
		LoggerLoad.info("click on Try here On array in python  page");
		
		tryHereLink.click();
		}
	

	
	public void clickOnPraciceQuestions() {
		LoggerLoad.info("click on Practice Questions On array in python  page");
		
		PraciceQuestionsButton.click();
		}
	
	public void clickOnsearchTheArrays() {
		LoggerLoad.info("click on Search the Array On array in python practice  page");
		
		searchTheArrayButton.click();
		}
	
	public void clickOnmaxConsecutiveOnesButtons() {
		LoggerLoad.info("click on Maximum Consecutive ones  On array in python practice  page");
		
		maxConsecutiveOnesButton.click();
		}
	
	public void clickOnfindNumbersWithEvenDigitsButtons() {
		LoggerLoad.info("click onFind Numbers with Even Number digits On array in python practice  page");
		
		findNumbersWithEvenDigit.click();
		}
	
	public void clickOnSquaresOfSortedArrayButtons() {
		LoggerLoad.info("click on Squares of a sorted array On array in python practice  page");
		
		sqauresOfSortedArray.click();
		}
	
	
	public void clickOnarraysUsingList() {
		LoggerLoad.info("click " + arraysUsingList.getText() + " On array page");
		arraysUsingList.click();
		}
	public void basicOperationList() {
		LoggerLoad.info("click " + basicOperationList.getText() + " On array page");
		basicOperationList.click();
		}
	
	public void  navigateTo(String pagename)
    {
        
        util.driver.get(treeUrl);
    }
	
	public void fetchPythonCode(String PythonCode) {
        System.out.println("Editor Input: "+editorInput);
        util.waitForElement(answerform);
        answerform.click();
        editorInput.sendKeys(PythonCode);
    }
	public void clickRunButton() {
		LoggerLoad.info("Click on the run button");
		runButton.click();
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
        String errorMessage=util.driver.switchTo().alert().getText();
        LoggerLoad.info("Click on the OK button for the error pop up ");
        util.driver.switchTo().alert().accept();
        return errorMessage;
    }
	
	public void enterPracticeQuestions(String sheetname, int rownumber) throws InvalidFormatException, IOException
    {
        util.waitForElement(answerform);
        answerform.click();
        String code=util.getCodefromExcel(sheetname, rownumber);
        util.enterPythonCodeForPractice(code, editorInput);

    }
	
	public String getExpectedResult(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException
    {
        String expectedResult=util.getResultfromExcel(sheetName, rowNumber);
        return expectedResult;
    }
	
	public String getActualResult()
    {
        return output.getText();
    }
	
	
	
}
