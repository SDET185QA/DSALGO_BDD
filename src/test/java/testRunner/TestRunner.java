package testRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
@CucumberOptions(
	plugin = {"pretty", "html:target/dsalgoBDD.html","json:target/cucumber-reports/Cucumber.json",
			"html:target/cucumber-reports/dsalgo.html",
			"com.aventstack.chaintest.plugins.ChainTestCucumberListener:" }, //reporting purpose
			publish = true,	
			monochrome=false,  //console output color
			tags = "",//tags from feature file
			features = {"src/test/resources/features/LoginTest.java"}, //location of feature files
			glue= {"stepDefinitions","hooks"}) //location of step definition files
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
