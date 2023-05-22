package testApp;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import testBase.AndroidBaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.android.LogoutPage;
import pageObjects.android.ProfilePage;

public class Logout extends AndroidBaseTest{

	LogoutPage logout;
	ProfilePage profile;
	public Logout(){
		super();
		ConfigureAppium();
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	   login();

	}

	@Given("user is click on profile button")
	public void user_is_click_on_profile_button() {
	     profile = new ProfilePage(driver);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     profile.ClickOnProfileStatus();
	}

	@Given("user is scrolled down")
	public void user_is_scrolled_down() {
	    logout=new LogoutPage(driver);
	    logout.scrollToText("Logout");
	      
	}

	@Given("select logout button")
	public void select_logout_button() {
	    logout=new LogoutPage(driver);
	    logout.selectlogout.click();
	      
	}

	@Given("user select yes option")
	public void user_select_yes_option() {
	    logout=new LogoutPage(driver);
	    logout.selectYesforlogout.click();
	      
	}

	@Then("user is on the login page")
	public void user_is_on_the_login_page() {
	    logout=new LogoutPage(driver);
	    assertEquals(logout.VerifyIndigopage.getAttribute("text"), "India’s largest low-cost carrier with 1500+ daily flights to 80+ destinations, is at your service.");
	      
	}

	
	
	
}
