package testApp;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.LoginPage1;
import testBase.AndroidBaseTest;
import testBase.AndroidActions;


public class Login1 extends AndroidBaseTest{

	LoginPage1 loginpage ;
	public Login1(){
		super();
		ConfigureAppium();
	}
	
	
	
	@Given("Launch app and Click on Get Started button")
	public void launch_app_and_click_on_continue_with_mobile_number() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		
		loginpage = new LoginPage1(driver);
		loginpage.getStartedbtnMobile.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		loginpage.inputMobile.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		loginpage.selectCountryDropbtnMobile.click();//click on select country dropdown
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		loginpage.selectCountrybtnMobile.click();//select country
  
	}


	@When("Enters {string} and click on submit")
	public void enters_and_and_click_on_submit(String mobile) {
		loginpage = new LoginPage1(driver);
		loginpage.inputMobile.click();
		loginpage.inputMobile(mobile);
//		loginpage.inputPassword.click();
//		loginpage.inputPassword(password);
		loginpage.submitBtn.click();
	  
	}
	@Then("Verify landing page for new Retailer and click on yes")
	public void verify_landing_page() {
		loginpage = new LoginPage1(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//loginpage.verifyLandingpPage();
		loginpage.yesBtn.click();
		
		
	}
	@Then("Enter otp {string} and click on submit")
	public void otp_submit(String otp) {
		loginpage = new LoginPage1(driver);
		loginpage.enterOtpforMobile(otp);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginpage.submitbtnOtpPage.click();
		
	}
	
	@Then("Enter Display name {string} and click on submit")
	public void Enter_Display_Name(String Display_Name) {
		loginpage = new LoginPage1(driver);
		loginpage.enterDisplaynameProfilePage(Display_Name);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginpage.submitbtnProfilePage.click();
		
	}
	
	@Then("Enter PIN {string} and click on set PIN")
	public void Set_Pin(String PIN) {
		loginpage = new LoginPage1(driver);
		loginpage.setPin(PIN);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginpage.setPin.click();
		
	}
	
	@Then("Enter confirm PIN {string} and click on confirm PIN")
	public void confirm_Pin(String PIN) {
		loginpage = new LoginPage1(driver);
		loginpage.confirmPin(PIN);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginpage.btnConfirmPin.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginpage.profileContinueBtn.click();
		
	}
	
	
	@Given("Enter retialer personal details {string} and {string} and {string}")
	public void Click_yes_new_retailer(String pfname, String plname, String dob) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		
		loginpage = new LoginPage1(driver);
		loginpage.pfirstname.sendKeys(pfname);
		loginpage.plastname.sendKeys(plname);
		loginpage.dob.sendKeys(dob);
		loginpage.next.click();
	   
	}
	
	@Given("Enter retialer enrollment details {string} and {string} and {string} and {string} and {string}")
	public void enrollment_details(String firmname, String saddress, String street, String pincode, String emailid) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		
		loginpage = new LoginPage1(driver);
		loginpage.firmname.sendKeys(firmname);
		loginpage.shaddress.sendKeys(saddress);
		loginpage.street.sendKeys(street);
		loginpage.pincode.sendKeys(pincode);
		loginpage.email.sendKeys(emailid);
		loginpage.scrolltoenroll();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginpage.preferedDistributer();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginpage.next.click();

	   
	}
	@Given("Retailer docs details {string} and {string} and {string}")
    public void retailer_docs_details(String seedLicencenum, String seedLicenceExpDate, String dlIDnum) throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage.slpick.click();
		loginpage.slpickcamera.click();
		loginpage.okcortevabtn.click();
		loginpage.takephoto.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		loginpage.slnum.sendKeys(seedLicencenum);
		loginpage.slexpdate.sendKeys(seedLicenceExpDate);
		loginpage.govproofoption.click();
		loginpage.DLselection.click();
		loginpage.idNum.sendKeys(dlIDnum);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		loginpage.govidpick.click();
		loginpage.slpickcamera.click();
		loginpage.takephoto.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginpage.next.click();
		
    }
	@Given("Enter Business Deails")
    public void Ener_business_deails() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage.riceqtycv.sendKeys("3");
		loginpage.riceqtypv.sendKeys("2");
		
    }
	@Given("click on submit button and vrify application success message")
    public void done_application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
    }
	
	@Given("Launch crm portal")
    public void crm_portal_login() throws Throwable {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		
		
		
    }
	
	@Given("login into crm portal {string} and {string}")
    public void crm_login(String username, String userpass) throws Throwable {

		
    }
	@Given("verify landing page")
    public void crm_landigpage() throws Throwable {
		/*
		 * Bdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 * //loginpage.verifycrmloginLandingpPage();
		 * Bdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); String
		 * landingpageText=Bdriver.findElement(By.
		 * xpath("//h4[contains(text(),'Customer Interactions')]")).getText();
		 * 
		 * assertEquals(landingpageText, "Customer Interactions");
		 */
		
		
    }
	
	@Given("click on my Tasks and verify retailers {string}")
    public void click_myTasks(String mobilenum) throws Throwable {
				
				
    }
	
	@Given("Launch root portal")
    public void root_portal_login() throws Throwable {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		
		
		
    }
	
	
	@Given("login into root portal {string} and {string}")
    public void root_login(String username, String userpass) throws Throwable {
		//browserDrivercrm();
		
    }
	
	@Given("select roots portal seed")
    public void select_rootseed_application() throws Throwable {
    }
	
	@Given("click on view and approve retailer {string}")
    public void approve_retailer_on_root(String rtnum) throws Throwable {
		      
    }
	
	@Given("User Launch the application")
    public void user_launch_the_application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		
		
    }

//    @When("User clicks on continue as guest button")
//    public void user_clicks_on_continue_as_guest_button() throws Throwable {
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
//		
//    	loginpage = new LoginPage1(driver);
//    	loginpage.guestBtn.click();
//    	loginpage.allowLocation.click();
//    }
//
//    @Then("User is on homepage")
//    public void user_is_on_homepage() throws Throwable {
//    	loginpage = new LoginPage1(driver);
//    	loginpage.verifyLandingpPage();
//    }
//    
//    @Then("Verify info message")
//    public void verify_info_message() throws Throwable {
//    	loginpage = new LoginPage1(driver);
//    	loginpage.verifyerrorinfoTitle("Information");
//    	loginpage.verifyerrorinfoDesc("Invalid username or password. Please try again.");
//    }
//
//    @When("User Enters {string} and Click on send OTP")
//    public void user_enters_and_click_on_send_otp(String mobile) throws Throwable {
//    	
//    	loginpage = new LoginPage1(driver);
//    	loginpage.inputMobile(mobile);
//    	loginpage.otpLoginBtn.click();
//        
//    }
//    
//    @And("User Enters {string} and click on confirm")
//    public void user_enters_something_and_click_on_confirm(String otp) throws Throwable {
//    	loginpage = new LoginPage1(driver);
//    	loginpage.enterOtp(otp);
//  
//    }
//
//    @Then("Verify incorrect OTP message")
//    public void verify_incorrect_otp_message() throws Throwable {
//    	loginpage = new LoginPage1(driver);
//    	loginpage.verifyIncorrectOtpMessage("Incorrect OTP");
//    }


}
