package pageObjects.android;



import static org.testng.Assert.assertEquals;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testBase.AndroidActions;


public class LoginPage1 extends AndroidActions{
	
  public AndroidDriver driver;

	public LoginPage1(AndroidDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	//----------------------- Customer Login Page Locators ----------------------------
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Get Started\"]")
	public WebElement getStartedbtnMobile;
	
	@AndroidFindBy(xpath="//android.view.View/android.widget.ImageView[1]")
	public WebElement selectCountryDropbtnMobile;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"South Africa (+27)\"]")
	public WebElement selectCountrybtnMobile;
	
	@AndroidFindBy(xpath="//android.view.View/android.view.View[2]/android.widget.EditText")
	public WebElement enterOtpforMobile;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Submit\"]")
	public WebElement submitbtnOtpPage;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Submit\"]")
	public WebElement submitbtnProfilePage;
	
	@AndroidFindBy(xpath="//android.view.View[2]/android.view.View/android.widget.EditText")
	public WebElement enterSetPin;
	
	@AndroidFindBy(xpath="//android.view.View/android.view.View[2]/android.widget.EditText")
	public WebElement enterConfirmPin;
	
	@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Confirm PIN\"])[2]")
	public WebElement btnConfirmPin;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Continue\"]")
	public WebElement profileContinueBtn;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Set PIN\"]")
	public WebElement setPin;
	
	
	@AndroidFindBy(xpath="//android.view.View[2]/android.widget.EditText")
	public WebElement enterDisplaynameProfilePage;
	
	
	
	
	@AndroidFindBy(id="com.corteva.rootsapplication:id/et_proprietor_first_name")
	public WebElement pfirstname;
	
	@AndroidFindBy(id="com.corteva.rootsapplication:id/et_proprietor_last_name")
	public WebElement plastname;
	
	@AndroidFindBy(id="com.corteva.rootsapplication:id/et_dob")
	public WebElement dob;
	
	@AndroidFindBy(id="com.corteva.rootsapplication:id/iv_next")
	public WebElement next;
	
	//enrollment
	@AndroidFindBy(id="com.corteva.rootsapplication:id/et_firm_name")
	public WebElement firmname;
	
	@AndroidFindBy(id="com.corteva.rootsapplication:id/et_shop_address")
	public WebElement shaddress;
	
	@AndroidFindBy(id="com.corteva.rootsapplication:id/et_street_name")
	public WebElement street;
	@AndroidFindBy(id="com.corteva.rootsapplication:id/et_pincode")
	public WebElement pincode;
	@AndroidFindBy(id="com.corteva.rootsapplication:id/et_email")
	public WebElement email;
	@AndroidFindBy(id="com.corteva.rootsapplication:id/et_pref1_seed")
	public WebElement pd1;
	@AndroidFindBy(xpath="//android.widget.LinearLayout[4]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")
	public WebElement pdselect;
	
	public void preferedDistributer() {
		pd1.click();
		pd1.sendKeys("KRISHI");
		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		pdselect.click();
	}
	
	public void scrolltoenroll() {
		scrollToText("Seed Distributors");
	}
	//slphoto
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/iv_seed_doc")
	public WebElement slpick;
	
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/iv_any_govt_proof")
	public WebElement govidpick;
	
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/from_camera")
	public WebElement slpickcamera;
	
	@AndroidFindBy(id = "android:id/button1")
	public WebElement okcortevabtn;
	
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/take_photo")
	public WebElement takephoto;
	
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/et_seed_license_no")
	public WebElement slnum;
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/et_seed_licns_expiry_date")
	public WebElement slexpdate;
	
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/sp_govt_proof")
	public WebElement govproofoption;
	
	@AndroidFindBy(xpath = "//android.widget.ListView/android.widget.CheckedTextView[3]")
	public WebElement DLselection;
	
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/et_identity_no")
	public WebElement idNum;
	//
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/et_cv_rice")
	public WebElement riceqtycv;
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/et_pv_rice")
	public WebElement riceqtypv;
	//------------------------------------------------
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/btn_submit")
	public WebElement submitbtn;
	
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/header_txt")
	public WebElement cortevasuccess_msz;
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/alert_text")
	public WebElement corteva_rootID;
	@AndroidFindBy(id = "com.corteva.rootsapplication:id/process_btn")
	public WebElement lastokbtn;
	//--------------------------------------------
	
	@FindBy(xpath="//input[@name='txtUserName']")
	public WebElement enteruserid;
	@FindBy(xpath="//input[@name='txtPassWord']")
	public WebElement enteruserpass;
	@FindBy(xpath="//input[@name='btnLogin']")
	public WebElement crmloginbtn;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Password\"]/android.widget.TextView")
	public WebElement entermobilenum;

	@AndroidFindBy(xpath="//android.view.View/android.view.View/android.widget.EditText")
	public WebElement inputMobile;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter Password']")
	public WebElement inputPassword;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Submit\"]")
	public WebElement submitBtn;
	
	@AndroidFindBy(id="com.corteva.rootsapplication:id/process_btn")
	public WebElement yesBtn;
	
	@AndroidFindBy(id="com.corteva.rootsapplication:id/et_otp")
	public WebElement enterotp;
	
	@AndroidFindBy(id="com.corteva.rootsapplication:id/btn_otp_submit")
	public WebElement otpsubmit;
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/img_indigo_logo")
	public WebElement Indigologo;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]")
	public WebElement Indigologox;
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")
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
		this.inputMobile.click();
		this.inputMobile.sendKeys(mobile);
	}
	
	public void enterOtpforMobile(String otp) {
		this.enterOtpforMobile.click();
		this.enterOtpforMobile.sendKeys(otp);
	}
	
	public void enterDisplaynameProfilePage(String Display_Name) {
		this.enterDisplaynameProfilePage.click();
		this.enterDisplaynameProfilePage.sendKeys(Display_Name);
	}
	
	public void setPin(String PIN) {
		//this.setPin.click();
		this.enterSetPin.sendKeys(PIN);
	}
	
	public void confirmPin(String PIN) {
		//this.enterDisplaynameProfilePage.click();
		this.enterConfirmPin.sendKeys(PIN);
	}
	
	
	//enter password into password field
	public void inputPassword(String password) {
		this.inputPassword.sendKeys(password);
	}
	

	
   //-------------------------------Guest Login Locators--------------------------------
	@AndroidFindBy(id="in.goindigo.android.debug:id/button_as_guest")
	public WebElement guestBtn;

	
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
