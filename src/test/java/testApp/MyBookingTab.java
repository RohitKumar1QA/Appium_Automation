package testApp;

import testBase.AndroidBaseTest;

import java.time.Duration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.MyBookingTabPage;



public class MyBookingTab extends AndroidBaseTest {
	
	MyBookingTabPage mybookingtab;
	public MyBookingTab() {
		super();
		ConfigureAppium();
	}
	
	@Given("launch the application and login")
	public void launch_the_application_and_login() throws Throwable{
		login();   
	}

	
	@Given("User is on home page and click on my bookings")
	public void user_is_on_home_page_and_click_on_my_bookings() {
		mybookingtab=new MyBookingTabPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		mybookingtab.ClickOnMyBookings();
	}

	@When("User is on my booking page and current booking is displayed")
	public void user_is_on_my_booking_page_and_current_booking_is_displayed() {
		mybookingtab.ClickCurrentBookings();
		}

	@Then("user click on completed booking")
	public void user_click_on_completed_booking() {
		mybookingtab.ClickCompletedBookings();
	
	}
}
