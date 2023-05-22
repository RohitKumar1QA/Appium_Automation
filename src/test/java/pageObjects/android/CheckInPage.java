package pageObjects.android;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


            public class CheckInPage extends AndroidActions {
	 
	       	public AndroidDriver driver;
		    public CheckInPage(AndroidDriver driver) {
		    super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			}
		 
		               //............CheckIn Page locator.........//
		 
		    @AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Check-in\"]")
			   public WebElement FlightChekIn;
			 
			
			 
			                      // ...........Select Check IN  Now.......//
			   
			   @AndroidFindBy(xpath="//android.widget.TextView[@text='Check in Now']")
			   public WebElement CheckInNow;
			   
			   @AndroidFindBy(xpath="//android.widget.Button[@text='Select/ Modify Seat(s)']")
			   public WebElement SelectModify;
			
			   @AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_check_in']")
			   public WebElement CNW;
			   
			   @AndroidFindBy(id="in.goindigo.android.debug:id/image_add_baggage")
			   public WebElement AddBag;
			   
			   @AndroidFindBy(id="in.goindigo.android.debug:id/btn_next")
			   public WebElement Next;
			   
			   @AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
			   public WebElement Continue;
			   
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
		        public WebElement pincode;
				
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
				public WebElement BoardingPass;
				
				
				@AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/txv_pnr_number'])[2]")
			    public WebElement Activepnr2 ;
				
				public void ScrolltoActivePnr3() throws InterruptedException 
			    {
			    	int x=Activepnr2.getLocation().getX();
					int y=Activepnr2.getLocation().getY();
					leftScrollco(driver, x, y, x, y-600);
			    }
				
			   public void ClickOnFlightChekIn () {                                                                         
				   FlightChekIn.click();
			   }
			   public void Checkinnow() {
			   CheckInNow.click();
			   }
			   public void ClickOnCheckInNow() {
				   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				   wait.until(ExpectedConditions.elementToBeClickable(CNW));
			   CNW.click();
			   }

			   public void AddBagCount(){   
			   AddBag.click();
			   AddBag.click();
			   scrollToText("Next") ;
			   Next.click();
			   }
			   public void ContinueOnAddOnsPage() {
				  scrollToText("Continue");
				  Continue.click();
			   }
			  
			   public void SelectNotIntrested() {
				   NotIntrested.click();
			   }
			   public void WebCheckIn(String number,String email,String address,String pin) {
			   ContactNumber.sendKeys(number);
			   Email.sendKeys(email);
			   scrollToText("Address Line 1");
			   AddressLine.sendKeys(address);
			   scrollToText("Pin Code");
			   pincode.sendKeys(pin);
			   scrollToText("I am not COVID-19 positive");
			   RadioButtonForCovid19.click();
			   IDeclareThat.click();
			   scrollToText("Important Notice for passengers");
			   AgreeContinueCheckBox.click();
			   SelectAgreeContinue.click();
				}
			   
			   public void SuccesFullCheckin() {
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			   assertEquals(BoardingPass.getText(), "Boarding Pass");
				   
			   }
			   
			   
			                ////....Check in  by Guest Login....////
			  @AndroidFindBy(id="in.goindigo.android.debug:id/button_as_guest")
			  public WebElement guestBtn;
			  @AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
			  public WebElement allowLocation;
			 
	          public void Guest() {
	       	  guestBtn.click();
	       	  allowLocation.click();
	          }
			  
	         @AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id='in.goindigo.android.debug:id/check_in']")
			 public WebElement guestChekin;  
			         
			 @AndroidFindBy(xpath="//android.widget.Button[@text='Find Booking']")
			 public WebElement FindBooking;
			 
			 @AndroidFindBy(id="in.goindigo.android.debug:id/et_field")
			 public WebElement BookingRefrence;
			 
			 @AndroidFindBy(xpath="//android.widget.EditText[@text='Email/Last Name']")
			 public WebElement Lastname;
			 
			 @AndroidFindBy(xpath="//android.widget.Button[@text='Find Booking']")
			 public WebElement GuestBooking;
			   
			 @AndroidFindBy(xpath="//android.widget.Button[@text='Check in Now']")
			 public WebElement Check_in_Now;
			 
			 @AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/image_add_baggage']")
			 public WebElement BagCount;
			 
			 @AndroidFindBy(xpath="//android.widget.Button[@text='Next']")
			 public WebElement Selectnext;
			 
			 @AndroidFindBy(xpath="//android.widget.TextView[@text='Continue']")
			 public WebElement continues;
			 
			 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/text_do_not_secure_trip']")
			 public WebElement No_am_not_Interested;
			 
			   ///////////.............Web Check IN FROM.......//////
			 
			 @AndroidFindBy(xpath="//android.widget.EditText[@text='Contact No.']")
			 public WebElement MobileNumber;
		        
		     @AndroidFindBy(xpath="//android.widget.EditText[@text='Email ID']")
		     public WebElement EmailId;
				
		     @AndroidFindBy(xpath="//android.widget.EditText[@text='Address Line 1']")
		     public WebElement Address;
				
		     @AndroidFindBy(xpath="//android.widget.EditText[@text='Pin Code']")
		     public WebElement PinCode;
				
		     @AndroidFindBy(xpath="//android.widget.RadioButton[@text='I am not COVID-19 positive']")
		     public WebElement covid19;
				
			 @AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/cb_declare']")
			 public WebElement IDeclare;
				
			 @AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/cb_tnc']")
			 public WebElement Agree_Continue;
				
			 @AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/checkbox_accept']")
			 public WebElement Accept_Terms;
				
			 @AndroidFindBy(xpath="//android.widget.Button[@text='Agree & Continue']")
			 public WebElement AgreeContinue2;
				
			 @AndroidFindBy(xpath="//android.widget.TextView[@text='Boarding Pass']")
			 public WebElement Message;
				
		     public void CheckinComplete() {
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		     assertEquals( Message.getText(), "Boarding Pass");
				   
			 }
			   
			 public void SelectPNRandLastName(String pnr,String lastname) {
			 BookingRefrence.click();
			 BookingRefrence.sendKeys(pnr);
			 Lastname.click();
			 Lastname.sendKeys(lastname);
			 }
			 public void AddBagAndSelectNext() {
			 BagCount.click();
			 BagCount.click();
			 scrollToText("Next");
			 Selectnext.click();
			 }
			 
			 @AndroidFindBy(id="in.goindigo.android.debug:id/textinput_error")
			 public WebElement  verifyMobile;
			 
			 @AndroidFindBy(xpath="//android.widget.TextView[@text='Please enter valid email id']")
			 public WebElement verifyEmail;
			 
			 
			 public void VerifyContactMessage() {
			 assertEquals(verifyMobile.getText(),"Please enter valid mobile number");
			 }
			 
			 public void VerifyEmailIdMessage() {
				 assertEquals( verifyEmail.getText(),"Please enter valid email id");
			 }
			 
			 
			 
	}