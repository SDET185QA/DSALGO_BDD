package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDriverManager.DriverFactory;


public class ArrayPOF {
	public static WebDriver driver = DriverFactory.getDriver();
	
	@FindBy(xpath = "//div[@id='navbarCollapse']//a[contains(text(), 'Data Structures')]")
    private WebElement dropdownoption;
	@FindBy(xpath = "//a[@class='dropdown-item'][@href='/array']")
    private WebElement arraydropdown;

	public ArrayPOF() {
		
		// Use the PageFactory.initElements method to initialize the elements on the array page
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(null, this);
	}
	public void array_dropdown() {
		//*[@id='navbarCollapse']//a[contains(text(), 'Data Structures')]
		dropdownoption.click();
		arraydropdown.click();
	}
	public void getArraypageTitle() {
		String title = driver.getTitle();
		System.out.println("The tile of array page is "+ title);
		}
}
