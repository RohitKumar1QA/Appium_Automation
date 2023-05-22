package testApp;



import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.CancelBookingPage;
import testBase.AndroidBaseTest;


public class CancelBooking extends AndroidBaseTest{
	
	CancelBookingPage cancelbooking;
	public CancelBooking() {
		super();
		ConfigureAppium();
	}
	
	
	@Given("Launch and login into the Application")
  public void launch_and_login_into_the_application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		login();  
      
  }
	@Given("User is on home page and click on modify button")
	public void user_is_on_home_page_and_click_on_modify_button() throws Throwable {
		cancelbooking=new CancelBookingPage(driver);
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		 wait.until(ExpectedConditions.elementToBeClickable(cancelbooking.viewModify));
		cancelbooking.ClickViewModify();
	}

	@When("User click on modify booking option")
	public void user_click_on_modify_booking_option() throws Throwable {
		cancelbooking=new CancelBookingPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cancelbooking.ClickModifyBooking();
	}
     
	@When("User click on cancel booking")
	public void user_click_on_cancel_booking() throws Throwable{
		cancelbooking=new CancelBookingPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cancelbooking.ClickCancelBooking();

	}

	@When("User select Bank Account for refund")
	public void user_select_bank_account_for_refund() throws Throwable{
		cancelbooking=new CancelBookingPage(driver);
		cancelbooking.ClickBankAccountForRefund();
	}

	@When("User click on Cancel booking tab")
	public void user_click_on_cancel_booking_tab() throws Throwable{
		cancelbooking=new CancelBookingPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		cancelbooking.ClickCancelBookingTab();
	}

	@When("User select yes for cancel booking")
	public void user_select_yes_for_cancel_booking() throws Throwable{
		cancelbooking=new CancelBookingPage(driver);
		cancelbooking.ClickYesForCancelBooking();
	}

	@When("User click on confirm cancel booking option")
	public void user_click_on_confirm_cancel_booking_option() throws Throwable{
		cancelbooking=new CancelBookingPage(driver);
		cancelbooking.ClickConfirmCancelBooking();
	}
    
	@Then("User validate booking has been cancelled")
	public void user_validate_booking_has_been_cancelled() throws Throwable{
		cancelbooking=new CancelBookingPage(driver);
		cancelbooking.ClickBookingHasBeenCancelled();
	}
}
