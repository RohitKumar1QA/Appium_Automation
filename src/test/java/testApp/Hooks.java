package testApp;



//import java.io.File;
import java.io.IOException;
//import java.util.Base64;
//
//import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.EmailException;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testBase.AndroidBaseTest;
import utills.SendMail;

public class Hooks extends AndroidBaseTest{
	
	 

	
	//public AndroidDriver driver;
	
	private static final String ANSI_BLUE = "\u001B[34m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_GREEN = "\u001B[32m";
		

	public Hooks(){
		
		super();
		//this.driver=driver;
		
	}
	
	@Before
	public static  void testinfo(Scenario scenario) {
		
		System.out.println(ANSI_BLUE + "Running Scenario : "+ ANSI_RESET +scenario.getName() );
		
	}
	@After
	public static void closeDriver() throws EmailException {
		
		try {
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Driver running ");
		}
		System.out.println(ANSI_GREEN + "----> Execution Completed "+ ANSI_RESET);
		
	}
	


	
	@AfterStep
	public static void AddScreenshot(Scenario scenario) throws IOException {
		
		if(scenario.isFailed()) {
			System.out.println(ANSI_RED + "----> Test Failed " + ANSI_RESET);

			try { 
			final byte[] screenshot =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");
			}
			catch (Exception e) {
				System.out.println("unable to take screenshot");
			}
		}
		
	}
	

	
	@AfterAll
	public static void sendMailReport() {
	
			try {
				SendMail.sendmail();
			} catch (EmailException e) {
				
				e.printStackTrace();
			}
		
		
	}
	
}
