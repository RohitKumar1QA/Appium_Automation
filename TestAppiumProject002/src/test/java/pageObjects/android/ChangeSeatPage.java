package pageObjects.android;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import testBase.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class ChangeSeatPage  extends AndroidActions {
	
   	public AndroidDriver driver;
    public ChangeSeatPage (AndroidDriver driver) {
    super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Check-in\"]/android.view.ViewGroup/android.widget.TextView")
	public WebElement Checkin;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='View Itinerary']")
	public WebElement ViewItinery;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Change Seat']")
	public WebElement ChangeSeat;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/iv_seat'])[3]")
	public WebElement Seat;
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/btn_ok")
	public WebElement ok;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/snackbar_text']")
	public WebElement ContinueToPayment;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Net Banking']")
	public WebElement NetBanking;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/image_hdfc'])[7]")
	public WebElement otherbank;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='AvenuesTest']")
	public WebElement AvenueTest;
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/checkbox_terms")
	public WebElement checkbox;
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/button_pay")
	public WebElement pay;
	
	public void ClickOnPay() {
		scrollToText("Wallet");
		pay.click();
	}
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
	public WebElement Continue;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Return To the Merchant Site']")
	public WebElement Verifymessage;
	
	public void ConfirmSeatMessage() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    assertEquals( Verifymessage.getText(), "Return To the Merchant Site");
	}


}
