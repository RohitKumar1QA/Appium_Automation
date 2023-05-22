package pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import testBase.AndroidActions;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LogoutPage extends AndroidActions{

	 public AndroidDriver driver;
 
		public LogoutPage(AndroidDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		@AndroidFindBy(xpath="//android.widget.Button[@index='1']")
		public WebElement selectYesforlogout;
		
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Logout']")
		public WebElement selectlogout;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/landing_text")
		public WebElement VerifyIndigopage;
		
}
