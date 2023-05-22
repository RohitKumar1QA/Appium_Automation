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

public class CancelChangeFlightPage extends AndroidActions {
	public AndroidDriver driver;

	public CancelChangeFlightPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
}

    //-----------------------Cancel Flight---------------------------------//
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='View/Modify']") 
	public WebElement viewModify;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout[@resource-id='in.goindigo.android.debug:id/relative_modify_booking']")
    public WebElement modifyBooking;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/text_modify_add_option'])[2]")
	public WebElement cancelFlight;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='in.goindigo.android.debug:id/radio_refund_subitem']")
    public WebElement bankAccountForRefund;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel Flight']")
	public WebElement cancelFlightTab;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/check_box']")
	public WebElement bookedFlightForCancelling;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
	public WebElement continuetab;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Yes']")
	public WebElement yesForCancelFlight;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Finish']")
	public WebElement finishOption;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/text_ticket_confirm']")
	public WebElement flightCancel;
	
	
	//---------------------Methods---------------------------------------//
	
	public void ClickViewModify() {
		viewModify.click();
	}
	
	public void ClickModifyBooking() {
		modifyBooking.click();
	}
	
	public void ClickCancelFlight() {
		cancelFlight.click();
	}
	
	public void ClickBankAccountForRefund() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(bankAccountForRefund));   
		bankAccountForRefund.click();
	}
	
	public void ClickCancelFlightTab() {
		cancelFlightTab.click();
	}
	
	public void ClickBookedFlightForCancelling() {
		bookedFlightForCancelling.click();
	}
	
	public void ClickContinuetab() {
		continuetab.click();
	}
	
	public void ClickYesForCancelFlight() {
		yesForCancelFlight.click();
	}
	
	public void ClickFinishOption() {
		finishOption.click();
	}
	
	public void VerifyFlightCancelMessage() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(flightCancel));         
		 assertEquals(flightCancel.getText(),"Oops, Your Flight has been cancelled! ");
		 
	}



    //-----------------------Change Flight-----------------------------//

    @AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"My Bookings\"]/android.view.ViewGroup/android.widget.TextView")
    public WebElement MyBookings;

    @AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_forward'])[1]")
    public WebElement bookedFlight;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Change Flight']")
    public WebElement changeflight;

    @AndroidFindBy(id="in.goindigo.android.debug:id/check_box")
    public WebElement checkBox;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Select New Date']")
    public WebElement NewDate;
    
    @AndroidFindBy(xpath="//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
    public WebElement NewDate2;
    
  

    @AndroidFindBy(id = "in.goindigo.android.debug:id/dayPicker_layout_date")
    public WebElement pickdate;

    @AndroidFindBy(id="in.goindigo.android.debug:id/yearPicker_layout_date")
    public WebElement years;

    public void pickadate() throws InterruptedException {
    int x=pickdate.getLocation().getX();
    int y=pickdate.getLocation().getY();
    leftScrollco(driver, x, y+1, x, y-225);    
//    int x1=years.getLocation().getX();
//    int y1=years.getLocation().getY();
//    leftScrollco(driver, x1, y1+1, x1, y1+199);

}

    @AndroidFindBy(id ="in.goindigo.android.debug:id/btnDone")
    public WebElement Done;

    @AndroidFindBy(xpath="//android.widget.Button[@text='Select Flight(s)']")
    public WebElement selectflight;
    
    @AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_done']")
    public WebElement selectFlights2;

    @AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_saver_radio'])[2]")
    public WebElement Newflightselect;

    @AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/button5']")
    public WebElement Continue;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Continue']")
    public WebElement Addonskip;

    @AndroidFindBy(id="in.goindigo.android.debug:id/text_do_not_secure_trip")
    public WebElement NotIntrested ;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Skip']")
    public WebElement skip;

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
    public WebElement checkbox1;

    @AndroidFindBy(id="in.goindigo.android.debug:id/button_pay")
    public WebElement pay;

    public void ClickOnPay() {
	scrollToText("Wallet");
	pay.click();
   }
    
    @AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
    public WebElement Continue1;

    @AndroidFindBy(xpath="//android.widget.Button[@text='Return To the Merchant Site']")
    public WebElement Verifymessage;

    public void ConfirmSeatMessage() {
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      assertEquals( Verifymessage.getText(), "Return To the Merchant Site");
   }
    public void ClickonOtherBank() throws InterruptedException 
    {
    	int x=otherbank.getLocation().getX();
        int y=otherbank.getLocation().getY();
        leftScrollco(driver, x, y, x, y-400);
        otherbank.click();	
    }
}
   