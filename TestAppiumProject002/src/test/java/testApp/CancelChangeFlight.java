package testApp;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.BookingModificationPage;
import pageObjects.android.CancelChangeFlightPage;
import testBase.AndroidBaseTest;

public class CancelChangeFlight extends AndroidBaseTest{
	
	CancelChangeFlightPage cancelchangeflight;
	BookingModificationPage bookingmodification;
	public CancelChangeFlight() {
		super();
		ConfigureAppium(); 
	}

	@Given("Launch the Indigo application and login")
	public void launch_the_Indigo_app_and_login() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		login();   
	}

	@Given("User is on Home page and click on modify")
	public void user_is_on_Home_page_and_click_on_modify() throws Throwable {
		cancelchangeflight=new CancelChangeFlightPage(driver);
		cancelchangeflight.ClickViewModify();
	}

	@When("User click on modify booking")
	public void user_click_on_modify_booking() throws Throwable {
		cancelchangeflight=new CancelChangeFlightPage(driver);
		cancelchangeflight.ClickModifyBooking();
	}
	
	@When("User click on cancel flight")
	public void user_click_on_cancel_flight() throws Throwable {
		cancelchangeflight=new CancelChangeFlightPage(driver);
		cancelchangeflight.ClickCancelFlight();
	}
	
	@When("User select Bank Account to refund")
	public void user_select_bank_account_to_refund() throws Throwable{
		cancelchangeflight=new CancelChangeFlightPage(driver);
		cancelchangeflight.ClickBankAccountForRefund();
	}
	
	@When("User click on Cancel flight tab")
	public void user_click_on_cancel_flight_tab() throws Throwable {
		cancelchangeflight=new CancelChangeFlightPage(driver);
		cancelchangeflight.ClickCancelFlightTab();
	}
	
	@When("User should select booked flight for cancelling")
	public void user_should_select_booked_flight_for_cancelling() throws Throwable {
		cancelchangeflight=new CancelChangeFlightPage(driver);
		cancelchangeflight.ClickBookedFlightForCancelling();
	}
	
	@When("User click on continue tab")
	public void user_click_on_continue_tab() throws Throwable {
		cancelchangeflight=new CancelChangeFlightPage(driver);
		cancelchangeflight.ClickContinuetab();
	}
	
	@When("User select yes for cancel flight")
	public void user_select_yes_for_cancel_flight() throws Throwable {
		cancelchangeflight=new CancelChangeFlightPage(driver);
		cancelchangeflight.ClickYesForCancelFlight();
	}
	
	@When("User click on finish option")
	public void user_click_on_finish_option() throws Throwable {
		cancelchangeflight=new CancelChangeFlightPage(driver);
		cancelchangeflight.ClickFinishOption();
	}
	
	@Then("User verify Flight Cancel Message")
	public void user_validate_flight_has_been_cancelled() throws Throwable {
		cancelchangeflight=new CancelChangeFlightPage(driver);
		cancelchangeflight.VerifyFlightCancelMessage();
	}
	



    //----------------------Chage Flight-----------------------------------//
	
    @Given("User is on Home Page and click on CheckIn")
    public void user_is_on_home_page_and_click_CheckIn()throws Throwable {
    	 bookingmodification=new BookingModificationPage(driver);
  	   bookingmodification.ClickonCheckin();
    }

    @Given("User select view Itenerary")
    public void user_select_Itenerary()throws Throwable {
//    	cancelchangeflight = new CancelChangeFlightPage(driver);
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//    	wait.until(ExpectedConditions.elementToBeClickable(cancelchangeflight.bookedFlight));
//    	cancelchangeflight.bookedFlight.click();
    	bookingmodification=new BookingModificationPage(driver);
 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 	   bookingmodification.ClickonViewItenerary();

    }

    @When("User click on change flight Button")
    public void user_click_on_change_flight_button()throws Throwable {
    	cancelchangeflight = new CancelChangeFlightPage(driver);
    	cancelchangeflight.changeflight.click();

    }

   @When("User click on checkbox")
   public void user_click_on_checkbox()throws Throwable {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	   cancelchangeflight.checkBox.click();
  
    }

   @When("User select New date")
   public void user_select_new_date() throws InterruptedException {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	
   	try {
	   cancelchangeflight.NewDate.click();
	   }
   	catch (Exception e) {
		cancelchangeflight.NewDate2.click();
	}
	   cancelchangeflight.pickadate();
   }

   @When("User click on done button")
   public void user_click_on_done_button()throws Throwable {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	   cancelchangeflight.Done.click();
   }

   @When("User click on select flight button")
   public void user_click_on_select_flight_button()throws Throwable {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	   try 
	   {
	   cancelchangeflight.selectflight.click();
	   }
	   catch (Exception e) {
		   cancelchangeflight.selectFlights2.click();
	}
   }

   @When("User click on new flight booking")
   public void user_click_on_new_flight_booking()throws Throwable {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
   	wait.until(ExpectedConditions.elementToBeClickable(cancelchangeflight.Newflightselect));
	   cancelchangeflight.Newflightselect.click();
   }

   @When("User click on continue Tab")
   public void user_click_on_continue_Tab()throws Throwable {
   cancelchangeflight = new CancelChangeFlightPage(driver);
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
  	wait.until(ExpectedConditions.elementToBeClickable(cancelchangeflight.Continue));
   cancelchangeflight.Continue.click();

   }

   @When("User skip Addon page click on continue")
   public void user_skip_addon_page_click_on_continue()throws Throwable {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	   cancelchangeflight.Addonskip.click();
   }

   @When("User select Not interested for Travel Asistance")
   public void user_select_not_interested_for_travel_asistance()throws Throwable {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	   cancelchangeflight.NotIntrested.click();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	  	wait.until(ExpectedConditions.elementToBeClickable(cancelchangeflight.skip));
	   cancelchangeflight.skip.click();
   }

  @When("User select NetBanking Payemnt Option")
  public void user_select_net_banking_payemnt_option()throws Throwable {
	  cancelchangeflight = new CancelChangeFlightPage(driver);
	  cancelchangeflight.NetBanking.click();
  }

  @When("User select Other")
  public void user_select_other()throws Throwable {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  cancelchangeflight = new CancelChangeFlightPage(driver);
	  
//	  cancelchangeflight.otherbank.click();
	  cancelchangeflight.ClickonOtherBank();
  }

@When("User click on Avenue Test")
   public void user_click_on_avenue_test()throws Throwable {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	   cancelchangeflight.AvenueTest.click();

   }

   @When("User select CheckBox")
   public void user_select_check_box()throws Throwable {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	   cancelchangeflight.checkbox1.click();
   }

   @When("User click on Pay Button")
   public void user_click_on_pay_button()throws Throwable {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	   cancelchangeflight.ClickOnPay();
   }

   @When("User click on Continue")
   public void user_click_on_continue()throws Throwable {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	   cancelchangeflight.Continue1.click();
   }

   @Then("User verify the Message")
   public void User_verify_the_Message ()throws Throwable {
	   cancelchangeflight = new CancelChangeFlightPage(driver);
	   cancelchangeflight.ConfirmSeatMessage();
}
}

