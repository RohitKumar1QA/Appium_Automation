package pageObjects.android;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import testBase.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class CancelBookingPage extends AndroidActions {
	public AndroidDriver driver;

	public CancelBookingPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 

	}
	
	//--------------------Cancel Booking-----------------------------
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='View/Modify']") 
	public WebElement viewModify;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout[@resource-id='in.goindigo.android.debug:id/relative_modify_booking']")
    public WebElement modifyBooking;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
	public WebElement cancelBooking;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='in.goindigo.android.debug:id/radio_refund_subitem']")
    public WebElement bankAccountForRefund;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel Booking']")
	public WebElement cancelBookingTab;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Yes']")
	public WebElement yesForCancelBooking;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_yes']")
	public WebElement confirmCancelBooking;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/text_ticket_confirm']")
	public WebElement bookingHasBeenCancelled;
	
	//--------------------------Methods-----------------------------------
	
	public void ClickViewModify() {
		viewModify.click();
	}
	
	public void ClickModifyBooking() {
		modifyBooking.click();
	}
	
	public void ClickCancelBooking() {
		cancelBooking.click();
	}
	
	public void ClickBankAccountForRefund() {
		bankAccountForRefund.click();
	}
	
	public void ClickCancelBookingTab() {
		cancelBookingTab.click();
	}
	
	public void ClickYesForCancelBooking() {
		yesForCancelBooking.click();
	}
	
	public void ClickConfirmCancelBooking() {
		confirmCancelBooking.click();
	}
	
	public void ClickBookingHasBeenCancelled() {
		String bookingcancelled = bookingHasBeenCancelled.getAttribute("text");
		assertEquals(bookingcancelled, "Your booking has been cancelled! ");
	}
}
	
	
	