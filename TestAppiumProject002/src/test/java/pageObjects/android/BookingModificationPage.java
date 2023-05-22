package pageObjects.android;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testBase.AndroidActions;

public class BookingModificationPage extends AndroidActions {
	public AndroidDriver driver;
	BookingModificationPage bookingmodification;
	  public BookingModificationPage(AndroidDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			
		}
	  
	           //    for Addon modification   // 
	  
	  @AndroidFindBy(xpath = "//android.widget.Button")
	  public WebElement viewmodify;
	  
	  @AndroidFindBy(xpath = "//android.widget.Button[@text='View/Modify']")
	  public WebElement viewmodify2;
	  
	 @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='in.goindigo.android.debug:id/relative_additional_services']")
	 public WebElement addservices; 
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/text_sheet_title")
	 public WebElement verifyservicespage;
	 
	 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Excess Baggage/Additional piece']")
	 public WebElement Excessbaggage;
	 
	 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Excess Baggage']")
	 public WebElement Excessbaggage2; 
	 
	 @AndroidFindBy(xpath ="(//android.widget.LinearLayout[@resource-id='in.goindigo.android.debug:id/tv_not_available_container'])[2]")
	 public WebElement Selectbag;
	 
	 @AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
	 public WebElement confirmbag;
	 
	 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue']")
	 public WebElement Continuewithaddon;
	 
	 @AndroidFindBy(id="in.goindigo.android.debug:id/text_do_not_secure_trip")
	 public WebElement iamNotinterested;
	 
	 
	         //     for Seat Change mdification   //
	 
	 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Change Seat']")
	 public WebElement changeseatoption;
	 
	 // //android.widget.TextView[@resource-id ='in.goindigo.android.debug:id/tv_seat'] list of seats
	 
	 @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/tv_seat'])[1]")
	 public WebElement seatselect;
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/btn_ok")
	 public WebElement changedseat;
	 
	 @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	 public WebElement changedseat2;
	 
	 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue']")
	 public WebElement contninuetopayment;
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/text_ticket_confirm")
	 public WebElement verifybookedticket;
	 
	        //  Payment  //
	 
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/text_payment_title")
	 public WebElement verifypaymentpage;
	 
	 @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/image_expand_icon'])[4]")
	 public WebElement creditcard;
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/edit_credit_debit_number")
	 public WebElement CCnumber;
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/edit_expiry_validity_date")
	 public WebElement validitydate;
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/edit_cvv")
	 public WebElement Cvvnumber;
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/edit_card_full_name")
	 public WebElement cardname;
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/checkbox_terms")
	 public WebElement terms;
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/button_pay")
	 public WebElement paybutton;
	 
	 @AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
	 public WebElement procedpayment;
	 
	 @AndroidFindBy(xpath = "//android.widget.Button[@text='Return To the Merchant Site']")
	 public WebElement backtomerchant;
	 
	 @AndroidFindBy(xpath  = "//android.widget.TextView[@text='Itinerary']")
	 public WebElement verifyseatchange;
	 
	 
	       //      for contact Details modification  //
	 
	 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Update contact details']")
	 public WebElement updatecontact;
	 
	 
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/edit_send_phone")
	 public WebElement contactnumber;
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/edit_send_email_address")
	 public WebElement emialaddress;
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/button_login_otp")
	 public WebElement doneupdate;
	 
	 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Itinerary']")
	 public WebElement verifyupdatecontact;
	 
	 @AndroidFindBy(id = "in.goindigo.android.debug:id/textinput_error")
	 public WebElement verifyerrormessage;
	 
	 @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Check-in\"]/android.view.ViewGroup/android.widget.TextView")
	 public WebElement checkin;
	 
	 @AndroidFindBy(xpath = "//android.widget.TextView[@text='View Itinerary']")
	 public WebElement viewitenearay;
	 
	//android.widget.FrameLayout[@content-desc=\"Check-in\"]/android.view.ViewGroup/android.widget.TextView
	 
	     //  methods for Addon  //
	 
	 public void ClickonCheckin() // generic method
	 {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			   wait.until(ExpectedConditions.elementToBeClickable(checkin));
			 checkin.click();
		}
		 
	 
	 
	 public void ClickonViewItenerary() 
	 {
		 viewitenearay.click(); 
	 }
	 
	 public void ClickonAdditionalservices() 
	 {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(addservices));
		 addservices.click();
	 }
	 
	 public void VerifyAdditionalservicepage() 
	 {
		 assertEquals(verifyservicespage.getAttribute("text"), "Additional Services");
	 }
	 
	 @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/tv_title'])[1]")
	 public WebElement addonscrooll;
	 
	 public void selectAddon() throws InterruptedException 
	 {
		 int x=addonscrooll.getLocation().getX();
	        int y=addonscrooll.getLocation().getY();
	        leftScrollco(driver, x, y, x, y-200);
		 
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.elementToBeClickable(Excessbaggage2));
			 Excessbaggage2.click();	
		}
	 
	 
	 public void confirmAddon() 
	 {
		 Selectbag.click();
		 scrollToText("Done");
		 confirmbag.click();
	 }
	 
	 public void ContinueselectedAddon() 
	 {
		 Continuewithaddon.click(); 
	 }
	 
	 public void skipTravelAssistance() 
	 {
		 iamNotinterested.click();
	 }
	 
	 public void VerifyPaymentPage() 
	 {
		assertEquals(verifypaymentpage.getText(), "Payment ");
	 }
	 
	     //  methods for seat change  //
	 
	 public void ClickonChangeSeat() 
	 {
		 changeseatoption.click(); 
	 }
	 
	 public void Seatselect() 
	 {
		 seatselect.click(); 
		 changedseat.click();
	 }
	 
	 public void ContinueforPayment() 
	 {
		 contninuetopayment.click();
	 }
	 
	 public void VerifyItineraryPage() 
	 {
		 assertEquals(verifyseatchange.getText(), "Itinerary");
	 }
	 
	 public void VerifyBookedTicket() 
	 {
		 assertEquals(verifybookedticket.getText(), "Ticket Confirmed");
	 }
	 
	      //   methods for modifycontact details  //
	 
	 public void ClickOnUpdatecontactdetails() 
	 {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(updatecontact));
		 updatecontact.click();
	 }
	 
	 public void EnternumberAndEmail(String mobNumber,String emailaddress) 
	 {
		 contactnumber.clear();
		 contactnumber.sendKeys(mobNumber);
		 emialaddress.clear();
		 emialaddress.sendKeys(emailaddress);
	 }
	 
	 public void ClickonUpdtedetais() 
	 {
		 doneupdate.click();
	 }
	 
	 public void verifyupdatecontact() 
	 {
		assertEquals(verifyupdatecontact.getText(),"Itinerary");	 
	 }
	
	 public void verifyIncorrectmessage() 
	 {
		assertEquals(verifyerrormessage.getText(),"Please enter valid mobile number");	 
	 }
	 
	 
	  //    payment methods  //
	 
	 public void SelectCreditCard() 
	 {
		 creditcard.click(); 
	 }
	 
	 public void EnterValidcredentialsofCC(String ccnumber, String valdate, String cvv, String ccname) throws InterruptedException 
	 {
		 CCnumber.sendKeys(ccnumber);
		 validitydate.sendKeys(valdate);
		 Cvvnumber.sendKeys(cvv);
		 int x=cardname.getLocation().getX();
	     int y=cardname.getLocation().getY();
	        leftScrollco(driver, x, y, x, y-250);
		 cardname.sendKeys(ccname);
	 }
	 
	 public void AccepttermsAndpay() 
	 {
		 terms.click(); 
		 paybutton.click();
	 }
	 
	 public void Clickonproceedpayment() 
	 {
		 procedpayment.click(); 
	 }
	 
	 public void ClickonbacktoMerchent() 
	 {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		   wait.until(ExpectedConditions.elementToBeClickable(backtomerchant));
		 backtomerchant.click(); 
	 }
	 
	 
//	       //   extra seat Method  //
	 
	 public void selectASeat() {
     List<WebElement> ele = driver.findElements(By.xpath("//android.widget.FrameLayout[1]/android.widget.TextView"));
     
     for(WebElement e:ele) {
         if(e.getText().equals("₹") && !e.equals(ele.get(0))) {
             e.click();
             break;
         }
     }
 }

	 public void selectAsSeat() {
	     List<WebElement> ele = driver.findElements(By.xpath("//android.widget.FrameLayout[1]/android.widget.ImageView"));
	     
	     for(WebElement e:ele) {
	         if(e.getText().equals("₹") || !e.equals(ele.get(0))) {
	             e.click();
	             break;
	         }
	     }
	 }
	 
	 public void SelectedSeat() 
	 {
		 try
		 {
			 changedseat.click(); 
		 }
		catch (Exception e) {
			 changedseat2.click();
		}
	 }
	 
	 
}
