package testRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
		plugin = {"pretty", "html:target/dsalgoBDD.html"}, //reporting purpose
		
		monochrome=false,  //console output color
		tags = "",//tags from feature file
		features = {".///Features/"}, //location of feature files
		glue= "stepDefinitions") //location of step definition files
public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}
}
