package testApp;

import testBase.AndroidBaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.android.ChangeSeatPage;


public class ChangeSeat  extends AndroidBaseTest{
	ChangeSeatPage seat ;
	public ChangeSeat (){
		super();
		ConfigureAppium();
    
    }
	@Given("Launch the application and login")
	public void launch_the_application_and_login() throws Throwable{
		login(); 
	}

    @Given("User is on Home page click on checkin")
    public void user_is_on_home_page_click_on_checkin() {
    seat = new ChangeSeatPage(driver);
    seat.Checkin.click();
    }

    @Given("user select itinery page")
    public void user_select_itinery_page() {
	seat = new ChangeSeatPage(driver);
	seat.ViewItinery.click();
    }

    @Given("user select chnageSeat option")
    public void user_select_chnageseat_option() {
	seat = new ChangeSeatPage(driver);
	seat.ChangeSeat.click();

    }

    @Given("user select seat and click on ok")
    public void user_select_seat_and_click_on_ok() {
	seat = new ChangeSeatPage(driver);
	seat.Seat.click();
	seat.ok.click();
    }

    @Given("user select Continue to Payment")
    public void user_select_continue_to_payment() {
	seat = new ChangeSeatPage(driver);
	seat.ContinueToPayment.click();
    }

    @Given("user select NetBanking Payemnt Option")
    public void user_select_net_banking_payemnt_option() {
	seat = new ChangeSeatPage(driver);
	seat.NetBanking.click();
    }

    @Given("user select other")
    public void user_select_other() {
	seat = new ChangeSeatPage(driver);
	seat.otherbank.click();
    }

    @Given("user click on Avenue Test")
    public void user_click_on_avenue_test() {
	seat = new ChangeSeatPage(driver);
    seat.AvenueTest.click();
    }

    @Given("user select CheckBox")
    public void user_select_check_box() {
	seat = new ChangeSeatPage(driver);
    seat.checkbox.click();
    }

    @Given("User click on Pay")
    public void user_click_on_pay() {
	seat = new ChangeSeatPage(driver);
    seat.ClickOnPay();
    }

    @Given("user click on continue")
    public void user_click_on_continue() {
	seat = new ChangeSeatPage(driver);
    seat.Continue.click();
    }

    @Then("user verify the message")
    public void user_verify_the_message() {
	seat = new ChangeSeatPage(driver);
    seat.ConfirmSeatMessage();
}

}