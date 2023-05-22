package testApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.time.Duration;
import java.util.Scanner;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.BoardingPassPage;
import testBase.AndroidBaseTest;


   public class BoardingPass extends AndroidBaseTest{
    
	BoardingPassPage pass ;
	public BoardingPass(){
		super();
		ConfigureAppium();
	}
	@Given("Launch the Application and Login")
	public void launch_the_Application_and_login() throws Throwable{
		login2(); 
	  
	} 
	@Given("user is on Home Page and click on Checkin")
	public void user_is_on_Home_Page_and_click_on_checkin() throws Throwable{
	    pass = new BoardingPassPage(driver);
	    pass.SelectCheckin();
	}

	@When("user click on find booking")
	public void user_clcik_on_find_booking()throws Throwable {
		 pass = new BoardingPassPage(driver);
		 FileWriter output = new FileWriter(System.getProperty("user.dir")+"\\src\\test\\resources\\pnr\\pnr.txt");
		 String mypnr= pass.Activepnr.getText();
		 output.write(mypnr);
		 output.close();
		 pass.SelectBoardingPass();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@And("user get a pnr and click on find booking")
	public void  user_get_pnr_from_upcoming_booking_for_invalid_credentials_scenario()throws Throwable {
		 pass = new BoardingPassPage(driver);
		 FileWriter output = new FileWriter(System.getProperty("user.dir")+"\\\\src\\\\test\\\\resources\\\\pnr\\\\pnr.txt");
		 String mypnr= pass.Activepnr2.getText();
		 output.write(mypnr);
		 output.close();
		  pass.SelectBoardingPass();
	
	}
	@And("user get new PNR and click on find booking")
	public void user_get_NEW_PNR_and_click_on_find_booking()throws Throwable {
		 pass = new BoardingPassPage(driver);
		// pass.ScrolltoActivePnr3();
		 Thread.sleep(20000);
		 FileWriter output = new FileWriter(System.getProperty("user.dir")+"\\src\\test\\resources\\pnr\\pnr.txt");
		 String mypnr= pass.Activepnr3.getText();
		 output.write(mypnr);
		 output.close();
		  pass.SelectBoardingPass();
	
	}
	
    @When("user Enter PNR and {string}")
    public void user_enter_and( String lastname)throws Throwable {
    pass = new BoardingPassPage(driver);
    try {
    Scanner scanner = new Scanner(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\pnr\\pnr.txt"));
           while (scanner.hasNextLine()) {
           String filepnr = scanner.nextLine();
           pass.PNRandLastName(filepnr, lastname);
                
             }
             scanner.close();
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
    	 	 
    
    }
	@When("user click On Submit")
	public void user_click_on_submit()throws Throwable {
		 pass = new BoardingPassPage(driver);
		 pass.ClickOnSubmit();
	}

	@When("user click On Check IN Now button")
	public void user_click_on_check_in_now_button()throws Throwable {
		 pass = new BoardingPassPage(driver);
		 pass.ClickOnCheckIn();
	}

	@When("user add the Bag count and Click on Next")
	public void user_add_the_bag_count_and_click_on_next()throws Throwable {
		 pass = new BoardingPassPage(driver);
		 pass.AddBAG();
	}

	@When("user Skip the addons page and Click on continue")
	public void user_skip_the_addons_page_on_click_on_continue()throws Throwable {
		 pass = new BoardingPassPage(driver);
		 pass.ClickOnContinue();
	}

	@When("user select Not intrested for Travel Asistance")
	public void user_select_not_intrested_for_travel_asistance() throws Throwable{
		 pass = new BoardingPassPage(driver);
		 pass.SelectNotIntrested();
	}

	@When("user Enter {string} and {string} and {string} and {string} in Web Check In from")
	public void user_enter_and_and_and_in_web_check_in_from(String number,String email,String address,String pin)throws Throwable {
		 pass = new BoardingPassPage(driver);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		 pass.WebCheckIn(number, email, address, pin);
		 
	}
	  @Then("verify user complete Boarding Pass Process")
	  public void user_get_message_for_complete_check_in_process()throws Throwable {
	  pass =new BoardingPassPage(driver);
	  pass.SuccesFullCheckInMessage();
	}
	  @Then("Verify contact info message")
	    public void verify_contact_info_message() throws Throwable {
		pass =new BoardingPassPage(driver);
		pass.VerifyContactmessage();
		pass.VerifyEmailId();
	  }
}
