package testApp;

import java.time.Duration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.LoginPage1;
import testBase.AndroidBaseTest;


public class Login1 extends AndroidBaseTest{

	LoginPage1 loginpage ;
	public Login1(){
		super();
		ConfigureAppium();
	}
	
	
	
	@Given("Launch app and Click on continue with mobile number")
	public void launch_app_and_click_on_continue_with_mobile_number() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		
		loginpage = new LoginPage1(driver);
		loginpage.btnMobile.click();
		loginpage.allowLocation.click();
	
	   
	}
	@When("User select Password option")
	public void user_select_password_option() {
		loginpage = new LoginPage1(driver);
		loginpage.passOption.click();
		
	   
	}
	@When("Enters {string} and {string} and click on submit")
	public void enters_and_and_click_on_submit(String mobile, String password) {
		loginpage = new LoginPage1(driver);
		//loginpage.inputMobile.click();
		loginpage.inputMobile(mobile);
		loginpage.inputPassword.click();
		loginpage.inputPassword(password);
		loginpage.loginBtn.click();
	  
	}
	@Then("Verify landing page")
	public void verify_landing_page() {
		loginpage = new LoginPage1(driver);
		loginpage.verifyLandingpPage();
		
	}
	
	@Given("User Launch the application")
    public void user_launch_the_application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		
		
    }

    @When("User clicks on continue as guest button")
    public void user_clicks_on_continue_as_guest_button() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		
    	loginpage = new LoginPage1(driver);
    	loginpage.guestBtn.click();
    	loginpage.allowLocation.click();
    }

    @Then("User is on homepage")
    public void user_is_on_homepage() throws Throwable {
    	loginpage = new LoginPage1(driver);
    	loginpage.verifyLandingpPage();
    }
    
    @Then("Verify info message")
    public void verify_info_message() throws Throwable {
    	loginpage = new LoginPage1(driver);
    	loginpage.verifyerrorinfoTitle("Information");
    	loginpage.verifyerrorinfoDesc("Invalid username or password. Please try again.");
    }

    @When("User Enters {string} and Click on send OTP")
    public void user_enters_and_click_on_send_otp(String mobile) throws Throwable {
    	
    	loginpage = new LoginPage1(driver);
    	loginpage.inputMobile(mobile);
    	loginpage.otpLoginBtn.click();
        
    }
    
    @And("User Enters {string} and click on confirm")
    public void user_enters_something_and_click_on_confirm(String otp) throws Throwable {
    	loginpage = new LoginPage1(driver);
    	loginpage.enterOtp(otp);
    	loginpage.confirmBtn.click();
  
    }

    @Then("Verify incorrect OTP message")
    public void verify_incorrect_otp_message() throws Throwable {
    	loginpage = new LoginPage1(driver);
    	loginpage.verifyIncorrectOtpMessage("Incorrect OTP");
    }
    
    
    @And("User clicks on confirm")
    public void User_clicks_on_confirm() throws Throwable {
    	loginpage = new LoginPage1(driver);
    	
    	Thread.sleep(3000);
    	
    	//loginpage.confirmBtn.click();
    	
    }

}
