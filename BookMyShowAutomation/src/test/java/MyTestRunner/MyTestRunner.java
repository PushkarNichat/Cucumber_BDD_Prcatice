package MyTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= "src/test/resources/Features",
		glue= {"stepdefinations"},
		plugin= {"pretty", "html:target/cucumber-reports.html"},
		monochrome=true
		
		)
public class MyTestRunner {

}
