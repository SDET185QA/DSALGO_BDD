package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;

public class LinkedListIntroPOF {
	
	WebDriver driver;
	public static String linkedListIntroPageUrl = ConfigReader.getLinkedListIntroUrl();

	@FindBy (xpath = "//a[@href=\"/tryEditor\"]")
	WebElement tryHereClickBtn;			//Click on try here button
	
	@FindBy (xpath="//a[@href=\"/linked-list/practice\"]")
	WebElement practiceQnsLink;		//Click on practice questions link

	public void tryHere() {
		tryHereClickBtn.click();
	}
	
	public void practiceQns() {
		practiceQnsLink.click();
	}

	public void navigateToLinkedListIntroPage(WebDriver webDriver) {
		driver = webDriver;
		driver.get(linkedListIntroPageUrl);
		PageFactory.initElements(driver,this);
	}
	
	public String getPracticeQnsContent() {
		return driver.findElement(By.xpath("//div[@id='content']")).getText().trim();
	}

}
