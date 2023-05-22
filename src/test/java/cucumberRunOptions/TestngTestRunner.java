package cucumberRunOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features= "C:\\Users\\rohit.kumar2\\Downloads\\TestAppiumProject01\\src\\test\\java\\features\\appLogin.feature",
		glue = "testApp",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestngTestRunner extends AbstractTestNGCucumberTests {

}	
