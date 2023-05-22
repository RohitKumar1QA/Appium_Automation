package testApp;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.AndroidBaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.BookingPage;
import pageObjects.android.ForgotPasswordPage;
import pageObjects.android.LoginPage1;

public class ForgotPassword extends AndroidBaseTest {
	ForgotPasswordPage password;
	LoginPage1 loginpage;
	BookingPage booking;
	public ForgotPassword(){
		super();
		ConfigureAppium();
	}
	
	@Given("User is on Login Page")
    public void user_is_on_login_page() throws Throwable {
       loginpage=new LoginPage1(driver);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       loginpage.btnMobile.click();
       loginpage.allowLocation.click();
    }

    @When("User selects Password option")
    public void user_selects_password_option() throws Throwable {
    	 loginpage=new LoginPage1(driver);
    	 loginpage.passOption.click();
    }



    @And("User enter Mobile Number {string}")
    public void user_enter_mobile_number_something(String mobile) throws Throwable {
    	 loginpage=new LoginPage1(driver);
    	 loginpage.inputMobile(mobile);
    }

    @And("User click on Forgot Password link")
    public void user_click_on_forgot_password_link() throws Throwable {
        password=new ForgotPasswordPage(driver);
        password.ForgetPasswordLink.click();
    }

    @And("User click on Send OTP button and waits for OTP")
    public void user_click_on_send_otp_button_and_waits_for_otp() throws Throwable {
       
    	 password=new ForgotPasswordPage(driver);
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	 wait.until(ExpectedConditions.elementToBeClickable(password.SendOTP2));
         password.SendOTP2.click();
       
       
        
    }

//    @And("User populate the otp in otp field")
//    public void user_populate_the_otp_in_otp_field() throws Throwable {
//        password=new ForgotPasswordPage(driver);
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
//		 wait.until(ExpectedConditions.visibilityOf((password.EnterNewPassword)));
//    }

    @And("User enter {string} and {string}")
    public void user_enter_something_and_something(String newpassword, String confirmpassword) throws Throwable {
        password=new ForgotPasswordPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   	 wait.until(ExpectedConditions.elementToBeClickable(password.EnterNewPassword));
        password.EnterNewPassword(newpassword);
        password.ConfirmPassword(confirmpassword);
    }
    @Then("User click on change my password button")
    public void user_click_on_change_my_password_button() throws Throwable {
        password=new ForgotPasswordPage(driver);
        password.ChangeMyPassword();
        }
    
    @Then("Password change successfull")
    public void Password_change_successfull() throws Throwable {
    	booking =new BookingPage(driver);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		 
		
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
			 wait.until(ExpectedConditions.visibilityOf(booking.bookFlight));
			 if(booking.bookFlight.isDisplayed()==true) {
				 assertTrue(true);
		
			 }else {
				 assertTrue(false);
			 }
        
        }
	
}
