package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverManager.DriverFactory;
import org.testng.Assert;
import utilities.LoggerLoad;


public class ArrayPOF {
	
	public static WebDriver driver = DriverFactory.getDriver();
	
	@FindBy(xpath = "//div[@id='navbarCollapse']//a[contains(text(), 'Data Structures')]")
    private WebElement dropdownoption;
	@FindBy(xpath = "//a[@class='dropdown-item'][@href='/array']")
    private WebElement arraydropdown;
	
	
	@FindBy(xpath = "//a[@href='array']")
    private WebElement arrayGetStarted;
	@FindBy(xpath="//a[@href='arrays-in-python']")
    private WebElement arraysInPython;
	
	
	
	@FindBy(xpath="///*[@id='answer_form']/button")
    private WebElement runButton;
	
	
	
	
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
	
	
	
}
