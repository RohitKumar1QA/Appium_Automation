package cucumberRunOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features= "C:\\Users\\avinash.yadav\\eclipse-workspace\\TestAppiumProject01\\src\\test\\java\\features",
		glue = "testApp",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestngTestRunner extends AbstractTestNGCucumberTests {

}	
