package testApp;

import testBase.AndroidBaseTest;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.BookingModificationPage;

public class Bookingmodifications extends AndroidBaseTest {
	BookingModificationPage bookingmodification;
	public Bookingmodifications(){
		super();
		ConfigureAppium();
	}
	
	@Given("Launch the Indigo app and login")
    public void launc_the_app()throws Throwable{
     login2();  
        
    }
	
	@Given("user is on home page and click on checkin module")
	public void user_is_on_home_page_and_select_modify_option()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver);
	   bookingmodification.ClickonCheckin();
	  
	}
	
	@Given("click on view Itenerary button")
	public void click_on_view_Itenerary_button()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   bookingmodification.ClickonViewItenerary();
	}

	@Given("user select additional services option")
	public void user_select_additional_services_option()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver);; 
	   bookingmodification.ClickonAdditionalservices();
	}

	@And("verify additional services page")
	public void verify_additional_services_page()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.VerifyAdditionalservicepage();
	}

	@And("select excess baggage addon")
	public void select_six_e_quickboard_addon()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.selectAddon();
	}

	@And("select checkbox and confirm it")
	public void select_checkbox_and_confirm_it()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.confirmAddon();  
	}

	@And("click on continue with addon")
	public void click_on_continue_with_addon()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.ContinueselectedAddon();  
	}

	@And("skip the travel assistance addons")
	public void skip_the_travel_assistance_addons()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.skipTravelAssistance();   
	}

	@When("user verify payment page")
	public void user_verify_payment_page()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.VerifyPaymentPage(); 
	}

	@And("select Credicard option")
	public void select_credicard_option()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.SelectCreditCard();  
	}

	@And("enter valid credentials {string} and {string} and {string} and {string} of credit card")
	public void enter_valid_credentials_and_and_and_of_credit_card(String cardnumber, String valdate, String cvv, String cardname)throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.EnterValidcredentialsofCC(cardnumber,valdate,cvv,cardname);  
	}

	@And("accept terms and click pay")
	public void accept_terms_and_click_pay()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.AccepttermsAndpay();   
	}

	@And("Click for confirm Payment")
	public void click_for_confirm_payment()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.Clickonproceedpayment(); 
	}
 
	@And("click on back to merchent page")
	public void click_on_back_to_merchent_page()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.ClickonbacktoMerchent();
	}

	@And("verify  modified addon")
	public void verify_modified_addon()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.VerifyItineraryPage();   
	}

	@And("user select update contact details")
	public void user_select_update_contact_details()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.ClickOnUpdatecontactdetails(); 
	}

	@When("user enters {string} and {string} for update")
	public void user_enters_and_for_update(String mobNumber, String emailaddress)throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.EnternumberAndEmail(mobNumber,emailaddress );  
	}

	@And("click on update details button")
	public void click_on_update_details_button()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.ClickonUpdtedetais();   
	}

	@Then("verify updated contact details")
	public void verify_updated_contact_details()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.verifyupdatecontact();  
	}

	@Given("user select Change seats")
	public void user_select_change_seats()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.ClickonChangeSeat(); 
	}

	@When("user select seat")
	public void user_select_seat()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.selectASeat();
	   bookingmodification.SelectedSeat();
	}

	@When("click on continue for payment")
	public void click_on_continue_for_payment()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.ContinueselectedAddon();
	}

	@Then("verify modified seat change")
	public void verify_modified_seat_change()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.VerifyBookedTicket(); 
	}

	@When("user enters incorrect {string} and {string} for update")
	public void user_enters_incorrect_and_for_update(String mobNumber, String emailaddress)throws Throwable {
	   bookingmodification=new BookingModificationPage(driver);; 
	   bookingmodification.EnternumberAndEmail(mobNumber,emailaddress );
	}

	@Then("verify enter valid contact details message")
	public void verify_enter_valid_contact_details_message()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver);
	   bookingmodification.verifyIncorrectmessage();

	}

}
