package cucumberRunOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@rerun/failed_scenarios.txt",
		glue = "testApp",
		stepNotifications = true,dryRun =false,

	
	plugin = {"pretty","html:test-output-cucumber/cucumber.html",
			"json:test-output-cucumber/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			
		},
					
		monochrome = true
		)

public class ReRunRunner {
	 
}



