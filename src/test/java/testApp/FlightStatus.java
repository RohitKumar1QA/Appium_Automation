package testApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.time.Duration;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.FlightStatusPage;
import testBase.AndroidBaseTest;

public class FlightStatus extends AndroidBaseTest{
    
	FlightStatusPage status ;
	public FlightStatus(){
		super();
		ConfigureAppium();
	}
	@Given("Launch the App and login")
	public void launch_the_App_and_login() {
		login();  
	}
	@Given("user is on Home Page and Click on the Flight Status")
	public void user_is_on_home_page_and_click_on_the_flight_status()throws Throwable {
		status= new FlightStatusPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		FileWriter output = new FileWriter(System.getProperty("user.dir")+"\\src\\test\\resources\\pnr\\pnr.txt");
		String data=status.getpnr();
	    output.write(data);
	    output.close();
		status.clickOnFlightStatus();
	}

	@Given("user click on continue to proceed")
	public void user_click_on_continue_to_proceed()throws Throwable {
		status= new FlightStatusPage(driver);
		status.clickOnContinue();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user click on Search Your Flight")
	public void user_click_on_search_your_flight() throws Throwable{
		status= new FlightStatusPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		status.selectSearchFlight();
	}
	@When("user select PNR Option and Enter the pnr number")
	public void user_select_pnr_option_and_enter_the_number() {
		status= new FlightStatusPage(driver);
		try {
			Scanner scanner = new Scanner(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\pnr\\pnr.txt"));
			while (scanner.hasNextLine()) {
				String filepnr = scanner.nextLine();
				status.clickOnPnrAndEnter(filepnr);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	@When("user click on Search")
	public void user_click_on_search()throws Throwable {
	   status= new FlightStatusPage(driver);
	   status.clickOnSearch();
	}

	@When("user click on the shceduled flight")
	public void user_click_on_the_shceduled_flight() throws Throwable{
		status= new FlightStatusPage(driver);
		status.scheduledFlight();
	}
	@Then("user select show on Map")
	public void user_select_show_on_map()throws Throwable {
		  status= new FlightStatusPage(driver);
		  status.ClickOnMap();
	}
	
	@When("user select By Route option for flight status")
	public void user_select_by_route_option_for_flight_status() throws Throwable{
		status= new FlightStatusPage(driver);
        status.ByRoute.click();
	}

	@When("user  selects {string} and {string} cities")
	public void user_selects_and_cities(String string, String string2) throws Throwable{
		status= new FlightStatusPage(driver);
	    status.SelectFromAndTo(string, string2);
	}

	
}
