package pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import testBase.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ForgotPasswordPage extends AndroidActions{
	
	public ForgotPasswordPage(AndroidDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
 
		
		//-----------------Forget Password-------------
		
		@AndroidFindBy(xpath="in.goindigo.android.debug:id/text_input_contact")
		public WebElement MobileNumber;
		
		@AndroidFindBy(xpath ="//android.widget.EditText[@text=\"Enter Password\"]")
		public WebElement Password;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/button_login_otp")
		public WebElement Login;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/forget_password")
		public WebElement ForgetPasswordLink;
		
		
		@AndroidFindBy (xpath="//android.widget.Button[@text='Send OTP']")
		public WebElement SendOTP;
		@AndroidFindBy (xpath="//android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
		public WebElement SendOTP2;
		
		
		
		@AndroidFindBy(xpath="//android.view.ViewGroup[3]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
		public WebElement EnterNewPassword;
		
		@AndroidFindBy(xpath="//android.view.ViewGroup[3]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
		public WebElement ConfirmPassword;
		
		@AndroidFindBy(xpath ="//android.widget.Button[@text='Change my password']")
		public WebElement ChangeMyPassword;
		

	
	
		public void EnterNewPassword(String newPassword)
		{
			//EnterNewPassword.click();
			EnterNewPassword.sendKeys(newPassword);
		}
		public void ConfirmPassword(String confPassword) throws InterruptedException {
			//ConfirmPassword.click();
			ConfirmPassword.sendKeys(confPassword);
		}
		public void ChangeMyPassword() {
			ChangeMyPassword.click();
		}
	}

