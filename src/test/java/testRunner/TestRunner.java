package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/dsalgoBDD.html"}, //reporting purpose
		
		monochrome=false,  //console output color
		tags = "",//tags from feature file
		features = {".///Features/"}, //location of feature files
		glue= "stepDefinitions") //location of step definition files
public class TestRunner {
	

}
