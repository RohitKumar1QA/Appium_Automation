package testApp;


import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.BoardingPassPage;
import pageObjects.android.CheckInPage;
import testBase.AndroidBaseTest;



public class CheckIn extends AndroidBaseTest{
    
	CheckInPage checkin ;
	BoardingPassPage pass;
	public CheckIn(){
		super();
		ConfigureAppium();
	}
	@Given("Launch the app and login")
	public void Launch_the_app_and_login()throws Throwable{
		login2(); 
		
	}
	
	@Given("User can Select Check In now Option to Proceed")
	 public void user_can_select_check_in_now_option_to_proceed()throws Throwable {
	 checkin =new CheckInPage(driver);
	 checkin.ClickOnFlightChekIn();
	// checkin.ScrolltoActivePnr3();
	}
	
	@Given("user click on check in now")
	public void user_click_on_check_in_now() throws Throwable{
	checkin =new CheckInPage(driver);
	checkin.Checkinnow();
	}

	@Given("user click on Check IN Now button")
	public void user_click_on_check_in_now_button()throws Throwable {
	checkin =new CheckInPage(driver);	
	checkin. ClickOnCheckInNow();
	}
	

	@When("user add the Bag count and click on Next")
	public void user_add_the_bag_count_and_click_on_next() {
	checkin =new CheckInPage(driver);
	checkin.AddBagCount();
	}
	@When("User skip addons and click on continue")
	public void user_skip_addons_and_click_on_continue()throws Throwable{
	 checkin =new CheckInPage(driver);
	 checkin.continues.click();
	}
	

	@When("user select not intrested for Travel Asistance")
	public void user_select_not_intrested_for_travel_asistance() throws Throwable{
	checkin =new CheckInPage(driver);
	checkin.SelectNotIntrested();
	}

	@When("user Enter {string} and {string} and {string} and {string} in Web Check In From")
	public void user_enter_and_and_and_in_web_check_in_from(String number,String email,String address,String pin)throws Throwable {
		 pass = new BoardingPassPage(driver);
		 pass.WebCheckIn(number, email, address, pin);
	}
	
	@Then("User completed checkin process")
	public void user_completed_checkin_process()throws Throwable {
	 checkin =new CheckInPage(driver);
	 checkin.SuccesFullCheckin();
	}
	//////.....................Guest Checkin................/////
	
    @Given("user launch the Application")
    public void user_launch_the_application() throws Throwable {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
   }	
   @When("User clicks on continue as guest Button")
   public void user_clicks_on_continue_as_guest_button() throws Throwable {
   checkin =new CheckInPage(driver);
   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(80));
   wait.until(ExpectedConditions.elementToBeClickable(checkin.guestBtn));
   checkin.Guest();
   }

  @When("User is on HomePage Click On CheckIN")
   public void user_is_on_home_page_click_on_check_in()throws Throwable {
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
   checkin =new CheckInPage(driver);
   checkin.guestChekin.click();
   }

   @When("User Click On Find Booking")
   public void user_click_on_find_booking() throws Throwable{
   checkin =new CheckInPage(driver);
  checkin.FindBooking.click();
   }

   @When("User Enter {string} and {string}")
   public void user_enter_and(String pnr, String LastName)throws Throwable {
   checkin =new CheckInPage(driver);
   checkin.SelectPNRandLastName(pnr, LastName);
   }

   @When("User Click On Submit")
   public void user_click_on_submit()throws Throwable {
   checkin =new CheckInPage(driver);
   checkin.GuestBooking.click();
   }
   @Then("Verify contact information message")
   public void verify_contact_information_message() throws Throwable {
   	checkin=new CheckInPage(driver);
   	checkin.VerifyContactMessage();
   	
   } 
   @Then("Verify Emailid  message")
   public void verify_Emailid_message() throws Throwable {
   	checkin=new CheckInPage(driver);
   	checkin.VerifyEmailIdMessage();
   }
}