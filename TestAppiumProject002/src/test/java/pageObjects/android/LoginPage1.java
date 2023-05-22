package pageObjects.android;



import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testBase.AndroidActions;


public class LoginPage1 extends AndroidActions{
	
  public AndroidDriver driver;
 
	public LoginPage1(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	//----------------------- Customer Login Page Locators ----------------------------
	@AndroidFindBy(id="in.goindigo.android.debug:id/btn_mobile_login")
	public WebElement btnMobile;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Password\"]/android.widget.TextView")
	public WebElement passOption;

	@AndroidFindBy(id="in.goindigo.android.debug:id/text_input_contact")
	public WebElement inputMobile;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter Password']")
	public WebElement inputPassword;
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/button_login_otp")
	public WebElement loginBtn;
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/img_indigo_logo")
	public WebElement Indigologo;
	
	@AndroidFindBy(xpath ="//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]")
	public WebElement bookFlightlogo;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]")
	public WebElement Indigologox;
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	public WebElement allowLocation;
	
	@AndroidFindBy(id ="in.goindigo.android.debug:id/button_login_otp")
	public WebElement otpLoginBtn;
	
	
	
	// Error info invalid login
	@AndroidFindBy(id="in.goindigo.android.debug:id/text_info_title")
	public WebElement infoTtitle;
//		Information
	@AndroidFindBy(id="in.goindigo.android.debug:id/tv_description")
	public WebElement infoDesc;
	//Invalid username or password. Please try again.
	
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/txv_ok")
	public WebElement infoRetryBtn;
	
	//otp field
	
	@AndroidFindBy(id ="in.goindigo.android.debug:id/edt_otp_1")
	public WebElement otp1;
	@AndroidFindBy(id ="in.goindigo.android.debug:id/edt_otp_2")
	public WebElement otp2;
	@AndroidFindBy(id ="in.goindigo.android.debug:id/edt_otp_3")
	public WebElement otp3;
	@AndroidFindBy(id ="in.goindigo.android.debug:id/edt_otp_4")
	public WebElement otp4;
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/btn_confirm")
	public WebElement confirmBtn;
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/textView8")
	public WebElement errOtpmssage;

	//enter mobile number into mobile field
	public void inputMobile(String mobile) {
		//this.inputMobile.click();
		this.inputMobile.sendKeys(mobile);
	}
	
	//enter password into password field
	public void inputPassword(String password) {
		this.inputPassword.sendKeys(password);
	}
	

	
   //-------------------------------Guest Login Locators--------------------------------
	@AndroidFindBy(id="in.goindigo.android.debug:id/button_as_guest")
	public WebElement guestBtn;
	
	
	
	
	
	
	
	//verify landing page
	public void verifyLandingpPage() {
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.elementToBeClickable(bookFlightlogo));
		Boolean landingpagestatus = bookFlightlogo.isDisplayed();
		System.out.println(landingpagestatus);
		assertEquals(landingpagestatus, true);
		
	}
	
	
	//verify info message 
	
	public void verifyerrorinfoTitle(String title) {
		String errInfoTtitle = this.infoTtitle.getText();
		
		assertEquals(errInfoTtitle,title);
	}
	
	public void verifyerrorinfoDesc(String desc) {
		String errInfoTtitle = this.infoDesc.getText();
		
		assertEquals(errInfoTtitle,desc);
	}
	
	
	public void enterOtp(String otp) {
		
		this.otp1.sendKeys(otp);
		this.otp2.sendKeys(otp);
		this.otp3.sendKeys(otp);
		this.otp4.sendKeys(otp);
		this.confirmBtn.click();
	}
	
	public void verifyIncorrectOtpMessage(String message) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		assertEquals(this.errOtpmssage.getText(),message);
		
	}
	

	
	
	
	
	
}
