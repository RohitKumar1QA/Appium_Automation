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

public class BoardingPassPage extends AndroidActions {
	
   	public AndroidDriver driver;
    public BoardingPassPage (AndroidDriver driver) {
    super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
                       ////... To Take Boarding Pass Locator....///
        @AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Check-in\"]")
	    public WebElement checkin;
   
        @AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"Find Booking\"]/android.widget.TextView")
        public WebElement FindBooking;
    
	    @AndroidFindBy(id="in.goindigo.android.debug:id/et_field")
	    public WebElement PNRNumber;
	    
	    @AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/txv_pnr_number'])[1]")
	    public WebElement Activepnr;
	    
	    public String Getpnr() {
	    	return Activepnr.getText();
	    }
	    
	    @AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/txv_pnr_number'])[2]")
	    public WebElement Activepnr2 ;
	    
	    public void ScrolltoActivePnr3() throws InterruptedException 
	    {
	    	int x=Activepnr2.getLocation().getX();
			int y=Activepnr2.getLocation().getY();
			leftScrollco(driver, x, y, x, y-400);
	    }
	    
	    public String GetSecondPnr() {
	    	return Activepnr2.getText();
	    }
	    
	    @AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/txv_pnr_number'])[2]")
	    public WebElement Activepnr3 ;
	    
	    public String GerThirdPnr() {
	    	return Activepnr3.getText();
	    }
	    
	   
	    @AndroidFindBy(xpath="//android.widget.EditText[@text='Email/Last Name']")
	    public WebElement Lastname;
	    
	    @AndroidFindBy(xpath="//android.widget.Button[@text='Find Booking']")
		public WebElement Submit;
	   
	    @AndroidFindBy(xpath="//android.widget.TextView[@text='Check-in']")
		public WebElement CheckIn;
		   
		@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/appCompatCheckBox']")
		public WebElement checkBox;
		   
		             //// .......check In Page Open...../////
		@AndroidFindBy(xpath="//android.widget.Button[@text='Check in Now']")
		public WebElement checkinNow;
		
    
    
                 ////............Add Bag Count.....////
	    @AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/image_add_baggage']")
		public WebElement AddBagCount;
		   
		@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/image_minus_baggage']")
		public WebElement MinusBagCount;
		   
		@AndroidFindBy(id="in.goindigo.android.debug:id/btn_next")
		public WebElement Next;
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Continue']")
		public WebElement continues;
       
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_do_not_secure_trip")
		public WebElement NotIntrested;
		   
                        ////...Web Check-In Page....////
    
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Contact No.']")
		public WebElement ContactNumber;
        
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Email ID']")
        public WebElement Email;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Address Line 1']")
        public WebElement AddressLine;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Pin Code']")
        public WebElement PinCode;
		
		@AndroidFindBy(xpath="//android.widget.RadioButton[@text='I am not COVID-19 positive']")
        public WebElement RadioButtonForCovid19;
		
		@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/cb_declare']")
		public WebElement IDeclareThat;
		
		@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/cb_tnc']")
		public WebElement AgreeContinueCheckBox;
		
		@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/checkbox_accept']")
		public WebElement AcceptTerms;
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Agree & Continue']")
		public WebElement SelectAgreeContinue;
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Boarding Pass']")
		public WebElement VerifyMessage;
		
		
		public void SelectCheckin() {
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(checkin));	
		checkin.click();
		}
		
		public void SelectBoardingPass() {
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(FindBooking));
		FindBooking.click();
		}
		
		public void PNRandLastName(String pnr,String lastname) {
		 PNRNumber.click();	
		 PNRNumber.sendKeys(pnr);
		 Lastname.click();
		 Lastname.sendKeys(lastname);
		}
		public void ClickOnSubmit() {
		 Submit.click();
		}
		
		public void ClickOnCheckIn() {
		//	 CheckIn.click();
		checkinNow.click();
		}
		
		public void AddBAG() {
		AddBagCount.click();
		AddBagCount.click();
		scrollToText("Next") ;
		Next.click();
		}
		public void ClickOnContinue() {
		continues.click();
		}
		
		public void SelectNotIntrested() {
		NotIntrested.click(); 
		}
		
		public void WebCheckIn(String number,String email,String address,String pin) throws InterruptedException {
		ContactNumber.sendKeys(number);
		int x=Email.getLocation().getX();
        int y=Email.getLocation().getY();
        leftScrollco(driver, x, y, x, y-700);
		Email.sendKeys(email);
		AddressLine.sendKeys(address);
		int x1=PinCode.getLocation().getX();
        int y1=PinCode.getLocation().getY();
        leftScrollco(driver, x1, y1, x1, y1-500);
		PinCode.sendKeys(pin);
		RadioButtonForCovid19.click();
		IDeclareThat.click();
        scrollToText("Important Notice for passengers");
        int x2=AgreeContinueCheckBox.getLocation().getX();
        int y2=AgreeContinueCheckBox.getLocation().getY();
        leftScrollco(driver, x2, y2, x2, y2-600);
		AgreeContinueCheckBox.click();
		//AcceptTerms.click();
		SelectAgreeContinue.click();
		}
		 public void SuccesFullCheckInMessage() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 assertEquals(VerifyMessage.getText(), "Boarding Pass");
		 }	 
		
		 @AndroidFindBy(id="in.goindigo.android.debug:id/textinput_error")
		 public WebElement  ErrorMessage;
		 
		 @AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/textinput_error'])[2]")
		 public WebElement EmailError;
		 
		 
		 public void VerifyContactmessage() {
		 assertEquals(ErrorMessage.getText(),"Please enter valid mobile number");
		 }
		 
		 public void VerifyEmailId() {
			 assertEquals( EmailError.getText(),"Please enter valid email id");
		 }
		 
		 
}