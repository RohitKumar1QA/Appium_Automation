package cucumberRunOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\mangesh.kulkarni\\.eclipse\\Workspace2\\TestAppiumProject01\\src\\test\\java\\features" , 
		glue = "testApp",
		stepNotifications = true,dryRun=false,
		
				tags="@Login",	
					
	plugin = {"pretty","html:test-output-cucumber/cucumber.html",
			"json:test-output-cucumber/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"rerun:rerun/failed_scenarios.txt"
		},
					
		monochrome = true
		)

public class TestRunner {
	 
}



