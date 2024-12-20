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
import webDriverManager.DriverFactory;


public class DataStructuresPOF {

	public static WebDriver driver = DriverFactory.getDriver();
	String homePageurl="https://dsportalapp.herokuapp.com/home";

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
	
	
	public DataStructuresPOF() {
		PageFactory.initElements(driver, this);
	}

	public void DShomepage() {
		driver.get(homePageurl);
	}
	public void getStarted_DS() {
		
		getStartedDSintro_link.click();
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
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
	

	public void clickonRunButton() {
		run_button.click();
		
	}
	public String getpageTitle(String expectedPageTitle) {
		String actualPageTitle = driver.getTitle();
		LoggerLoad.info("The tile of array page is "+ actualPageTitle);
		return actualPageTitle;
		
		}
	
	public void clickOnPracticeQuestion() {
		practiceQuestins.click();
	}
	public String getErrorOnTryEditor(String message) {
		return message;
	}

	
}
