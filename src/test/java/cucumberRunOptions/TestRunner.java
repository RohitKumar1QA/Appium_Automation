package cucumberRunOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\rohit.kumar2\\Downloads\\TestAppiumProject01\\src\\test\\java\\features\\appLogin.feature" , 
		glue = "testApp",
		stepNotifications = true,dryRun=false,
		
				tags="@login",
					
	plugin = {"pretty","html:test-output-cucumber/cucumber.html",
			"json:test-output-cucumber/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"rerun:rerun/failed_scenarios.txt"
		},
					
		monochrome = true
		)

public class TestRunner {
	 
}

