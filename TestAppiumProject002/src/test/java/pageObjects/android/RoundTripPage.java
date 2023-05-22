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

public class RoundTripPage extends AndroidActions{

	public RoundTripPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//For click on Book Flight Option
	
		@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Book\"]/android.widget.FrameLayout/android.widget.ImageView")
		public WebElement bookBtn;
		
		public void clickOnbookFlight() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			wait.until(ExpectedConditions.visibilityOf(bookBtn));
			bookBtn.click();
		}
		
		
		//For Selecting Round Trip
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='ROUND TRIP']")
		public WebElement roundTripBtn;
		
		public void clickOnroundTripBtn() {
			roundTripBtn.click();
		}
		
		//From City
		
	    @AndroidFindBy(id="in.goindigo.android.debug:id/ll_from")
		public WebElement clickfromcity;  //click
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/edit_search_city_from")
		public WebElement searchFormCity;  //sendkeys
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_city_title")
		public WebElement searchedFromCity; //click
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/image_search_close")
		public WebElement closebutton;
		
		public void FromsearchCity(String From) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			clickfromcity.click();
			searchFormCity.click();
			searchFormCity.sendKeys(From);
			searchedFromCity.click();
			closebutton.click();
		}
		
		//Choose To city
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/edit_search_city")
		public WebElement editSearchCity;  //sendkeys
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_city_desc")
		public WebElement searchedTocity;   //click
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_city_title")
		public WebElement clicksearchresult;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/tv_to_desti")
		public WebElement todestination;
		
		public void toSearchcity(String To) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			todestination.click();
			editSearchCity.sendKeys(To);
			clicksearchresult.click();
			//searchedTocity.click();
		}
		
		//For Choosing departure Date/Return Date
		
		@AndroidFindBy(id= "in.goindigo.android:id/tv_departure")
		public WebElement DepartureDate;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/ll_return")
		public WebElement ReturnDate;
		
		
		
		public void clickOnDate() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			DepartureDate.click();
			ReturnDate.click();
		}
		

		
		
		// To select passengers 
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/linear_select_passenger")
		public WebElement passengers;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/image_add_adult")
		public WebElement addAdults;
		
	   public void clickOnPassanger() {
			
			passengers.click();
			
		}
			

		// submit Pasanger Qty
				
		@AndroidFindBy(id="in.goindigo.android.debug:id/button_select_passenger_done")
	    public WebElement donePassanger;
		
		public void donepassangerlist() {
			donePassanger.click();
		}
		
			
			//For Flight Search
			
			@AndroidFindBy(id="in.goindigo.android.debug:id/rlSubmitBtn")
			public WebElement SearchFlight;
			
			public void clickOnSearchFlight() {
				SearchFlight.click();
				
			}
			
			// verify to RoundTrip fisrt flight departure page and click on continue Btn
			
			@AndroidFindBy(xpath = "//android.widget.TextView[@text='ROUND TRIP']")
			public WebElement verifyflight;
			
			
			
			public void VerifyRoundTripPage1() {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				assertEquals(verifyflight.getText(), "ROUND TRIP");
			
				
			}
			
			// To click on continue at  page of return flight
			
			@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/button5']")
			public WebElement selectFlightContinuePage1;
			
			public void clickoncontinuePage1() 
			{
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(selectFlightContinuePage1));
				selectFlightContinuePage1.click();	
			}
			
			
			//To verify Roundtrip return flight Page 
			
			@AndroidFindBy(id="in.goindigo.android.debug:id/txv_from")
			public WebElement verifyfromcity;
			@AndroidFindBy(id="in.goindigo.android.debug:id/txv_return_to")
			public WebElement verifytocity;
			@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/txv_from_price']")
			public WebElement verifyfromprice;
			@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/txv_return_price']")
			public WebElement verifyreturnprice;
			
			
			
			
			public void Verifysearchedflight() 
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				assertEquals(verifyfromcity.isDisplayed(), true);
				assertEquals(verifytocity.isDisplayed(), true);
				assertEquals(verifyfromprice.isDisplayed(), true);
				assertEquals(verifyreturnprice.isDisplayed(), true);
			}
				
		
		//For select flight and continue Btn
				@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/button5']")
				public WebElement continueSelectFlight2;
		
				public void clickOnselectFlight2() {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
					wait.until(ExpectedConditions.visibilityOf(continueSelectFlight2));
					continueSelectFlight2.click();

				}
		
		
		
		//To Skip upgrade Flexi fare button
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Skip']")
		public WebElement SkipButton;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Skip\"]")
		public WebElement SkipButton2;
		
		
		
		public void ClickonUpgradeFlexiskipbutton() 
		{
			try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(SkipButton));
			SkipButton.click();
			}
			catch (Exception e) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.visibilityOf(SkipButton2));
				SkipButton2.click();
			}
		}
		
		//verify passenger details
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Add Passenger Details']")
		public WebElement addpassangerpage;
		
		public void Verifypassangerpage() 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(addpassangerpage));
			assertEquals(addpassangerpage.getText(), "Add Passenger Details");	
		}
		
		
		
		
		
		
		//Register Ticket with Name (Fill form Name,LastName)
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/radio_mr")
		public WebElement TitleMr;
		
		@AndroidFindBy(xpath="(//android.widget.EditText[@resource-id=\"in.goindigo.android.debug:id/et_field\"])[1]")
		public WebElement FirstName;
		
		@AndroidFindBy(xpath="(//android.widget.EditText[@resource-id=\"in.goindigo.android.debug:id/et_field\"])[2]")
		public WebElement LastName;
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/checkBox")
		public WebElement CheckBoxForWhatsapp;
		
		
		public void fillPassengerDetails(String firstname, String lastname) throws InterruptedException
		{
			TitleMr.click();
			int x=FirstName.getLocation().getX();
	        int y=FirstName.getLocation().getY();
	        leftScrollco(driver, x, y+1, x, y-300);
			FirstName.sendKeys(firstname);
			LastName.sendKeys(lastname);
		}

			


		//Continue
		
		@AndroidFindBy(xpath="//android.widget.Button[@text=\"Continue\"]")
		public WebElement ContinueWithStep1;
		
		public void clickOnContinueStep1() {
			scrollToText("Continue");
			ContinueWithStep1.click();
		}

		//For Step 2 No flexi/super6e select skip Btn
		
	    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Skip\"]")
	    public WebElement SkipForStep2;
				
	
				
		public void clickOnSkipForStep2() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			wait.until(ExpectedConditions.visibilityOf(SkipForStep2));
		SkipForStep2.click();
				}


		//secureBag
		
		
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_do_not_secure_trip")
		public WebElement NotIntersted;
		
		public void clickOnNoButton()
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(NotIntersted));	
			NotIntersted.click();
		}
		
		// To verify Seat Selection Page 
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/header_view_sub_title")
		public WebElement verifyseatpage;
		
		public void toVerifyseatpage() {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(verifyseatpage));
			assertEquals(verifyseatpage.getText(), "Select Seat");
			
		}
		
		//For skip seat slection Page
		
				@AndroidFindBy(id="in.goindigo.android.debug:id/txv_change_flight")
				public WebElement seatslectionskipBtn;
				
				public void ClickonSkipBtnseatpage() {
					
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
					wait.until(ExpectedConditions.visibilityOf(seatslectionskipBtn));
					seatslectionskipBtn.click();
				}
				
				@AndroidFindBy(id="in.goindigo.android.debug:id/btn_ok")
				public WebElement okbtn;
				
				@AndroidFindBy(id="in.goindigo.android.debug:id/btn_proceed")
				public WebElement continuetopayment;
				
				@AndroidFindBy(id="in.goindigo.android.debug:id/text_no_flight_dialog_done")
				public WebElement sixeseatpopup;
				
				public void makeASeatSelection() throws InterruptedException{
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.elementToBeClickable(sixeseatpopup));
					sixeseatpopup.click();
					selectAseat();
					}
				
				public void selectAseat() throws InterruptedException 
				{
					List<WebElement> ele = driver.findElements(By.xpath("//android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView"));
				      
				      for(WebElement e:ele) {
				          if(!e.equals(ele.get(0))) {
				              e.click();
				            break;
				              
				          }
				else if(e.getText().isEmpty()==true && !e.equals(ele.get(0)))
				{
					e.click();
				    break;
				}
				      }
				      okbtn.click();
				      continuetopayment.click();
				     Thread.sleep(2000);
				}
				
				
				// To payment with Upi
				@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/image_expand_icon'])[3]")
				public WebElement upiextendBtn;
				
				@AndroidFindBy(id="in.goindigo.android.debug:id/edit_upi_vpa")
				public WebElement banknameUpi;
				
				
				@AndroidFindBy(id="in.goindigo.android.debug:id/checkbox_terms")
				public WebElement UpiRadioBtn;
				
				@AndroidFindBy(id="in.goindigo.android.debug:id/button_pay")
				public WebElement PayBtn;
				
				@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
				public WebElement ContinuePaybtn;
				
				@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='UPI']")
				public WebElement selectUPI;
				
public void paymentprocessbyUPI2() {
					
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
					wait.until(ExpectedConditions.elementToBeClickable(selectUPI));
					
					selectUPI.click();
					banknameUpi.sendKeys("rahul@sbi");
					UpiRadioBtn.click();
					PayBtn.click();
		 			ContinuePaybtn.click();
					WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(120));
					wait2.until(ExpectedConditions.visibilityOf(TicketConfirmed));
					
				}
				
				public void paymentprocessbyUPI(String upi) throws InterruptedException {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
					wait.until(ExpectedConditions.elementToBeClickable(upiextendBtn));
					
					upiextendBtn.click();
					int x=banknameUpi.getLocation().getX();
			        int y=banknameUpi.getLocation().getY();
			        leftScrollco(driver, x, y, x, y-150);
					banknameUpi.sendKeys(upi);
					UpiRadioBtn.click();
					PayBtn.click();
					ContinuePaybtn.click();
					WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(120));
					wait2.until(ExpectedConditions.visibilityOf(TicketConfirmed));
					
				}
				
				
				//For confirm the payment
				@AndroidFindBy(id="in.goindigo.android.debug:id/text_ticket_confirm")
				public WebElement TicketConfirmed;
				
				public void verifyCompleteticket() {
					
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
					wait.until(ExpectedConditions.visibilityOf(TicketConfirmed));
					assertEquals(TicketConfirmed.getText(), "Ticket Confirmed");
					
				}
		
		
		// Scenerio 2- Make a RoundTrip booking with special fares Armed Forces
		
		@AndroidFindBy(xpath ="//android.widget.TextView[@text='Armed Forces']")
		public WebElement armedForce;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/txv_fare_option")
		public WebElement armedforcefare;
		
		public void VerifyRoundTripArmedforceFare() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			assertEquals(armedforcefare.getText(), "ARMED FORCES FARE");
			
		}
		
		
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Military ID']")
		public WebElement MilitaryId;
		
		public void clickOnArmedForce()
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(armedForce));
			armedForce.click();
		}
		
		public void fillMilitaryId() throws InterruptedException
		{
			int x=MRradioBtn.getLocation().getX();
			int y=MRradioBtn.getLocation().getY();
			leftScrollco(driver, x, y, x, y+600);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(MilitaryId));	
			MilitaryId.sendKeys("ID123");
		}

		public void fillsMilitaryId(String id) throws InterruptedException
		{	
			MilitaryId.sendKeys(id);
		}
		
		
		//To Make a roundTripBooking with super 6E and armed force 
		
		@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/tv_departure_date']")
		public WebElement deptDate;
		
		@AndroidFindBy(xpath="(//android.widget.TextView[@text='1'])[2]")
		public WebElement selectDate1;
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/buttonSaveTrip']")
		public WebElement datedone1;
		
		
		public void toChooseTravelDate() {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
			wait.until(ExpectedConditions.visibilityOf(deptDate));
			deptDate.click();
			selectDate1.click();
			datedone1.click();
		}
		
		
		
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_super'])[1]")
		public WebElement firstflightSuper6Efair;
		
		@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[3]")
		public WebElement firstflightSuper6Efair2;
		
		@AndroidFindBy(xpath="(//android.view.ViewGroup[1]/android.view.ViewGroup[1])[3]")
		public WebElement notavilableoption;
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/button5")
		public WebElement selctflightBtn1;
		
		//super6E click

		public void toselectSuper6Efairfor1stFlight() throws InterruptedException {
			int x = firstflightSuper6Efair2.getLocation().getX();
			int y = firstflightSuper6Efair2.getLocation().getY();
			leftScrollco(driver, x+5, y, x+500, y);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			firstflightSuper6Efair.click();
		}
		
//		public void toselectSuper6Efair() throws InterruptedException {
//			int x = notavilableoption.getLocation().getX();
//			int y = notavilableoption.getLocation().getY();
//			leftScrollco(driver, x+5, y, x+500, y);
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//			firstflightSuper6Efair.click();
//		}
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/fare_header")
        public WebElement saveroptionscroll;
        
        
        
        public void toselectSuper6Efair() throws InterruptedException {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(saveroptionscroll));
            int x = saveroptionscroll.getLocation().getX();
            int y = saveroptionscroll.getLocation().getY();
            leftScrollco(driver, x+500, y, x-800, y);
            firstflightSuper6Efair.click();
         }
		
		
		
			public void toselctFlightbtn1() 
			{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(selctflightBtn1));
			selctflightBtn1.click();
			
		}
			
			
		
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_super'])[1]")
		public WebElement secondflightsuper6Efair;
			
		
		public void toselect2ndsuper6Efair() {
			secondflightsuper6Efair.click();
		}
		
		// For 6E add onpage 
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='6E Add-ons']")
		public WebElement verifyAddonpage;
		
		public void toverifyAddonPage() {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			wait.until(ExpectedConditions.visibilityOf(verifyAddonpage));
			assertEquals(verifyAddonpage.getText(), "6E Add-ons");
		}
		
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Skip']")
		public WebElement addonskipBtn;
		
//		@AndroidFindBy(xpath="(//android.widget.TextView[@text='Edit'])[1]")
//		public WebElement addOnEditBtn;
		
		public void clickOnaddonSkipVtn() {
			addonskipBtn.click();
		}
		
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Select snack now']")
		public WebElement selectsnackBtn;
		
		public void clickonselectSnack() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(selectsnackBtn));
			
			
			selectsnackBtn.click();
		}
		
	
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_done_meal']")
		public WebElement donebtnselectmeal;
		
		public void ClickonDoneselectMeal()
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(donebtnselectmeal));
			donebtnselectmeal.click();
		}
		
		@AndroidFindBy(id="//android.widget.TextView[@text='Continue']")
		public WebElement addoncontinue;
		
		public void ClickonAddOncontinueBtn() {
			
			
			addoncontinue.click();
		}
		
		
		
		// Verify and travel assistant page
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_heading")
		public WebElement verifyTravelassistantPage;
		
		public void toverifyTravelassistant() {
			assertEquals(verifyTravelassistantPage.getText(), "Travel Assistance");
		}
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_do_not_secure_trip")
		public WebElement notintrestedBtn;
		
		public void ClickOnnotintrestedBtn() {
			notintrestedBtn.click();
		}
		
		// To seat selction page 
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Select Seat']")
		public WebElement verfystep3pge;
		
		public void toVerifystep3() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			assertEquals(verfystep3pge.getText(), "Select Seat");
		}
		
		@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/text_no_flight_dialog_done']")
		public WebElement seatDialogeok;
		
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/iv_seat'])[13]")
		public WebElement selectwindowSeat;
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_ok']")
		public WebElement seatConfirmOkBtn;
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_proceed']")
		public WebElement proceedWithFirstFlight;
		
		public void toChooseSeat() {
			
			seatDialogeok.click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(selectwindowSeat));
			selectwindowSeat.click();
			
			seatConfirmOkBtn.click();
			proceedWithFirstFlight.click();
			
		}
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_copy_seat']")
	    public WebElement copyseatforflight2;
		
		public void Tocopyseatflight2() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			copyseatforflight2.click();
		}
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Continue to Payment']")
		public WebElement continueToPayment;
		
		public void clickonContinuepaymentbtnstep3() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			continueToPayment.click();
		}
		
		
		
		
		// Scenerio For make a booking on with Family & friends 
		
		@AndroidFindBy(xpath="(//android.widget.TextView[@text='Family & Friends']")
		public WebElement familyandfrindsbtn;
		
		public void clickOnFamilyAndFriends() throws Throwable
		{
			Thread.sleep(30000);  //For Scroll Method Pending
			
		}
		
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/txv_fare_option")
		public WebElement familyfare;
		
		public void verifyFamilyfare() {
			
			
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				assertEquals(familyfare.getText(), "FAMILY FARE");
				
			}
		
		//For pasnager 1
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/radio_mr")
		public WebElement MRradioBtn;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='First Name']")
		public WebElement pass1FristName;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Last Name']")
		public WebElement pass1LastName;
		
		public void firstPassDetails(String firstname,String lastname) {
			pass1FristName.sendKeys(firstname);
			pass1LastName.sendKeys(lastname);
		}
		
		//For pasanger2
		
		@AndroidFindBy(xpath="(//android.widget.RadioButton[@text='Mr.'])")
		public WebElement passMrRadioBtn;
		
		public void clickOnTitleOfPass() {
			passMrRadioBtn.click();
			
		}
		
		@AndroidFindBy(xpath="(//android.widget.EditText[@text='First Name'])[1]")
		public WebElement pass2firstName;
		
		@AndroidFindBy(xpath="(//android.widget.EditText[@text='Last Name'])[1]")
		public WebElement pass2LastName;
		
		public void secondPassDeatails(String firstname,String lastname) {
			
			
			scrollToText("Add Passenger 3");
		    pass2firstName.sendKeys(firstname);
			pass2LastName.sendKeys(lastname);
		
			}
		
		//Passenger 3
		
		
		@AndroidFindBy(xpath="(//android.widget.EditText[@text='First Name'])[1]")
		public WebElement pass3firstName;
		
		@AndroidFindBy(xpath="(//android.widget.EditText[@text='Last Name'])[1]")
		public WebElement pass3LastName;
		
		public void thirdPassDeatails(String firstname,String lastname) {
			scrollToText("Add Passenger 4");
			pass3firstName.sendKeys(firstname);
			pass3LastName.sendKeys(lastname);
		
			}

		// For Passnenger 4
		
		@AndroidFindBy(xpath="(//android.widget.EditText[@text='First Name'])[1]")
		public WebElement pass4firstName;
		
		@AndroidFindBy(xpath="(//android.widget.EditText[@text='Last Name'])[1]")
		public WebElement pass4LastName;
		
		public void fourthPassDeatails(String firstname,String lastname) {
			
			scrollToText("Contact Details*");
			pass4firstName.sendKeys(firstname);
			pass4LastName.sendKeys(lastname);
		
			}
		
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
		public WebElement step1ContinueButton;
		
		public void toClickOnStep1ContinueButton() {
			AndroidActions action = new AndroidActions(driver);
			action.scrollToText("Continue");
			step1ContinueButton.click();
			
		}
		
		
		
		//	//For Make a RoundTrip booking with Flexi Plus Fare 
		
		
		
		
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_flex'])[1]")
		public WebElement firstflightflexifare;
		
		public void clickOnfirstflexiFare() {
			firstflightflexifare.click();
		}
		
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_flex'])[1]")
		public WebElement returnFlightFlexiFare;
		
		public void clickOnSecondFlexifare() {
			returnFlightFlexiFare.click();
		}
		
		@AndroidFindBy(xpath="(//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_add'])[1]")
		public WebElement tiffinaddBtn;
		
		
		public void clickOn6EtiffinaddBtn() {
			tiffinaddBtn.click();
		}
		
		
//		@AndroidFindBy(id="in.goindigo.android.debug:id/btn_select")
//		public WebElement selectSnackBtn1;
		
		
		
		@AndroidFindBy(xpath="(//android.view.ViewGroup[@resource-id='in.goindigo.android.debug:id/container'])[2]")
		public WebElement secondflightContainer;
		
		
		public void clickOnsecondFlightBox() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			secondflightContainer.click();
		}
		
		@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/iv_more']")
		public WebElement passenger2ndflightBtn;
		
		public void clickOnPassArrowBtn() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			passenger2ndflightBtn.click();
		}
		
		
		@AndroidFindBy(xpath="(//android.widget.TextView[@text='+ ADD'])[1]")
		public WebElement foodaddBtn;
		
		public void clickOnAddFood() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			foodaddBtn.click();
		}
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/checkbox_accept")
		public WebElement selectcheckbox;
		
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/button")
		public WebElement confirm;
		
         public void selectallPassanger() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			selectcheckbox.click();
			confirm.click();
		}
		
		
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
		public WebElement refreshmentContinueBtn;
		
		public void clickOnRefreshmnetcontinueBtn() {
			
			refreshmentContinueBtn.click();
		}
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/btn_done_meal")
		public WebElement donemealretunflight;
		
		public void clickOnDonemeal() {
			donemealretunflight.click();
		}
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Continue']")
		public WebElement continueBtn6EAddon;
		
		public void clickOnContinueBtn6Eaddon() {
			continueBtn6EAddon.click();
		}
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_no_flight_dialog_done")
		public WebElement seatInformOkBtn;
		 
		public void clickOnOkBtnstep3() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			seatInformOkBtn.click();
			
		}
		
		//For verify different fare can not be club
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid Fare Combination.']")
		public WebElement invalidFare;
		
		public void toVerifyInvalidfare() {
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		assertEquals(invalidFare.getText(), "Invalid Fare Combination.");
		
		}
		
		
		
		
			
		
		
		
		}
		
		
		
		

		
		
		
		
		
		
		

		
		
		


	
	
	
	
	
	
	
	
	
	
	
	


