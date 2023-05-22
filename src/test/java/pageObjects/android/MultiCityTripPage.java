package pageObjects.android;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
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

public class MultiCityTripPage extends AndroidActions {

	public MultiCityTripPage(AndroidDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	 
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Book\"]/android.widget.FrameLayout/android.widget.ImageView")
	public WebElement BookBtn;
	
	public void clickOnBookFlight() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(BookBtn)).isDisplayed();
		BookBtn.click();
	}
	
	
	//To click on multicity   Btn
		@AndroidFindBy(id="in.goindigo.android.debug:id/textView_book_flight_multi_city")
		public WebElement multicityBtn;
		
		public void clickOnMultiCity() {
			multicityBtn.click();
		}
		
		//To click on Pop up close

		@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_close']")
		public WebElement closeBtn;
		
		public void clickOnPopup() {
			closeBtn.click();
		}
		//select First search city to

		
		@AndroidFindBy(xpath=("(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/tv_to_desti'])[1]"))
		public WebElement firstToCity;
		
		
		
		//To click first To searchCity and send city
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/edit_search_city")
		public WebElement firstTosearchCity;
		
		
		//For click serchedToCity1
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_city_title")
		public WebElement searchedToCity1;
		
		
		public void clickonFirstToCity(String from) {
			firstToCity.click();
			firstTosearchCity.click();
			try{firstTosearchCity.sendKeys(from);
			searchedToCity1.click();
			}
			catch (Exception e) {
				System.out.println("please use correct data" +e);
			}
		}
	
		
		//First Departure Date 
		@AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/tv_departure_date'])[1]")
		public WebElement fisrtDepartureDate;
		
		@AndroidFindBy(xpath="(//android.widget.TextView[@text=\"1\"])[2]")
		public WebElement firstselectdate;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/buttonSaveTrip")
		public WebElement donedate;
		
		public void clickOnFirstDeprtDate() {
			fisrtDepartureDate.click();
			firstselectdate.click();
			donedate.click();
		}
		
		public void MulticityFirstDeparturedate() 
		{
			List<WebElement> ele2 = driver.findElements(By.xpath("//android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));
			
			for(WebElement x2:ele2) {
				if(x2.getText().equals("4")) {
					System.out.println(x2.getText());
					x2.click();
					break;
				}
			}

		}
		
		public void MulticitySecondDeparturedate() 
		{
			List<WebElement> ele2 = driver.findElements(By.xpath("//android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));
			
			for(WebElement x2:ele2) {
				if(x2.getText().equals("5")) {
					System.out.println(x2.getText());
					x2.click();
					break;
				}
			}

		}
		
	@AndroidFindBy(id = "in.goindigo.android.debug:id/tv_start_date")
	public WebElement selectedDate; 
		
		
		public void SelectBackdate() 
		{
			List<WebElement> ele = driver.findElements(By.xpath("//android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));

            Date date = new Date();
              SimpleDateFormat formatter = new SimpleDateFormat("d");
              String str1 = formatter.format(date);
               int today =Integer.parseInt(str1);
      
        for(WebElement pastdate : ele){

            int datetoverify =Integer.parseInt(pastdate.getText());
            
           if(datetoverify < today && pastdate.isEnabled()==false){

               try{
                   pastdate.click();
                   String seletedatetext = selectedDate.getAttribute("text");
                  
                   if(seletedatetext.equals(pastdate.getAttribute("text"))) {
                	   assertTrue(false);
                   }else {
                	   assertTrue(true);
                   }
 
               }catch(Exception e) {
               
            	   	System.out.println(e);

               }
       } 

               
}
				
				

			
			
		}
		
		
		//For 2nd from city Click
		
		@AndroidFindBy(xpath="(//android.widget.LinearLayout[@resource-id ='in.goindigo.android.debug:id/ll_from'])[2]")
		public WebElement SecondFromCity;
		
		
		
		// For click on search from city and enter city for 2nd trip
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/edit_search_city_from")
		public WebElement SearchFromCity2;
		
		
		
		// For click on searched from city for 2nd trip
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_city_title")
		public WebElement SearchedFromCity2;
		
		public void clickOnSecondFromCity(String secondfrom) {
			SecondFromCity.click();
			SearchFromCity2.click();
			SearchFromCity2.sendKeys(secondfrom);
			SearchedFromCity2.click();
		}
		
		public void clickOnSecondFromCity() {
			SecondFromCity.click();
			SearchFromCity2.click();
			SearchFromCity2.sendKeys("MUM");
			SearchedFromCity2.click();
		}
		
		//For click search close Btn for 2 nd flight 
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/image_search_close")
		public WebElement searchClose2;
		
		public void clickOnsearchCloseBtn2() {
			searchClose2.click();
		}
		
		//To select 2nd to city 
		
		@AndroidFindBy(xpath=("(//android.widget.LinearLayout[@resource-id='in.goindigo.android.debug:id/ll_to'])[2]"))
		public WebElement secondToCity;
		
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/edit_search_city")
		public WebElement secondToSearchCity;
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_city_title")
		public WebElement searchedToCity2;
		
		public void clickOnSecondToCity(String secondto) {
			secondToCity.click();
			secondToSearchCity.click();
			secondToSearchCity.sendKeys(secondto);
			searchedToCity2.click();
		}
		
		
		public void clickOnSecondToCity() {
			secondToCity.click();
			secondToSearchCity.click();
			secondToSearchCity.sendKeys("IXE");
			searchedToCity2.click();
		}
		
		
		
		//2nd Departure Date 
		@AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/tv_departure_date'])[2]")
		public WebElement SeconddepartureDate;
		
		@AndroidFindBy(xpath="(//android.widget.TextView[@text='3'])[2]")
		public WebElement secondselectdate;
		
		
		public void clickOnSecondDepartDate() {
			SeconddepartureDate.click();
//			secondselectdate.click();
//			donedate.click();
		}
		
		
		
		//   Change in Add/Remove  Flight
		//to add flight
		@AndroidFindBy(id="in.goindigo.android.debug:id/tv_add")
		public WebElement addMoreFlight;
		
		public void clickOnaddBtn() {
			addMoreFlight.click();
		}
		//To Remove flight
		@AndroidFindBy(id="in.goindigo.android.debug:id/tv_remove")
		public WebElement removeFlight;
		
		public void clickOnRemoveFight() {
			removeFlight.click();
		}
		
		//For verify searched flight page
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='SAVER']")
		public WebElement verifyflightsaverfare;
		
		
		
		public void verifyMultiTripPage1() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			assertEquals(verifyflightsaverfare.getText(), "SAVER");
			
		}
		
		
		
		
		//With Armed Force Special Fare 
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Armed Forces']")
		public WebElement armedForceBtn;
		
		public void clickonArmedForce() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			armedForceBtn.click();
			
		}
		
		//For search flight 
		@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/text_search_flight']")
		public WebElement forSearchFlight;
		
		public void ClickonSearchFlight() throws InterruptedException {
//			int x=Passangerelement.getLocation().getX();
//			int y=Passangerelement.getLocation().getY();
//			leftScrollco(driver, x, y, x, y-1800);	
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//			wait.until(ExpectedConditions.visibilityOf(forSearchFlight)).isDisplayed();
			
			forSearchFlight.click();
		}
		
		public void ClickonSearchFlights() throws InterruptedException {
			int x=Passangerelement.getLocation().getX();
			int y=Passangerelement.getLocation().getY();
			leftScrollco(driver, x, y, x, y-1800);	
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(forSearchFlight)).isDisplayed();	
			forSearchFlight.click();
		}
		
		public void ScrollUptoSpecialFare() throws InterruptedException {
			int x=Passangerelement.getLocation().getX();
			int y=Passangerelement.getLocation().getY();
			leftScrollco(driver, x, y, x, y-1800);	
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(forSearchFlight)).isDisplayed();
			
		}
		
		//Continue With first Departure Flight
		
		@AndroidFindBy (id="in.goindigo.android.debug:id/button5")
		public WebElement continueFirstDeparture;
		
		public void clickOnContinue1() {
			continueFirstDeparture.click();
		}
		
		//verify second flight page
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Check the state-wise regulations for domestic travel. Know more']")
		public WebElement verify2ndflightpage;
		
		public void toVerify2ndFlightpage() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			assertEquals(verify2ndflightpage.getText(), "Check the state-wise regulations for domestic travel. Know more");
		}
		
		
		//To modify flight
		@AndroidFindBy(id="in.goindigo.android.debug:id/txv_modify_search")
		public WebElement modifySearchBtn;
		
		public void clickOnModifySearchBtn() {
			modifySearchBtn.click();
		}
		
		
		//For verify MultiCity Home page
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_search_flight")
		public WebElement verifyMHomepage;
		
		public void verifyMultiCityHomepage() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			assertEquals(verifyMHomepage.getText(), "Search Flight");
			
		}
		
		// To continue with 2nd flight 
		@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
		public WebElement continueSecondDeparture;
		
		
		public void  clickonContinue2() {
			continueSecondDeparture.click();
		}
		

		
		
		//verify step 1 page 
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Add Passenger Details']")
		public WebElement addpassenger;
		
		public void verifyStep1Page() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			assertEquals(addpassenger.isDisplayed(), true);
		}
		
		//To verify step1 Page
		
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Add Passenger Details']")
		public WebElement verifyAddPassangerpage;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/rl_add_bttn")
		public WebElement Passangerelement;
		
		
		public void toVerifyAddpassangerpage() 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			assertEquals(verifyAddPassangerpage.getText(), "Add Passenger Details");	
		}
		
		
		//To fill form 
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/radio_mr")
		public WebElement mrBtn;
		
		@AndroidFindBy(xpath="(//android.widget.EditText[@resource-id=\"in.goindigo.android.debug:id/et_field\"])[1]")
		public WebElement FirstName;
		
		@AndroidFindBy(xpath="(//android.widget.EditText[@resource-id=\"in.goindigo.android.debug:id/et_field\"])[2]")
		public WebElement LastName;
		
		
		
		public void forFilldetails(String firstname, String lastname) 
		{
			
			mrBtn.click();
			FirstName.sendKeys(firstname);
            LastName.sendKeys(lastname);	
			
		}
			
	
		
		     //For selection of miletary id
		
			@AndroidFindBy(xpath="//android.widget.EditText[@text='Military ID']")
			public WebElement militaryIdfield;
			
			public void enterMilitaryID(String id)
			{
				scrollToText("Military ID");
				militaryIdfield.sendKeys(id);
			}
			
			
		
			@AndroidFindBy(xpath="(//android.widget.LinearLayout[@resource-id=\"in.goindigo.android.debug:id/text_input\"])[1]")
			public WebElement ForContactNumber;
			
			@AndroidFindBy(xpath="(//android.widget.LinearLayout[@resource-id=\"in.goindigo.android.debug:id/text_input\"])[2]")
			public WebElement ForEmailId;
			
			public void ContactDetails(String Mobile ,String Email) {
				
				ForContactNumber.sendKeys(Mobile);
				ForEmailId.sendKeys(Email);	
			}
			
			@AndroidFindBy(id="in.goindigo.android.debug:id/checkBox")
			public WebElement CheckBoxForWhatsappDetails;
		
			public void clickOnWhatsup() {
				CheckBoxForWhatsappDetails.click();
			}
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
		public WebElement step1Continue;
		
		public void clickOnStep1Continue() {
			scrollToText("Continue");
			step1Continue.click();
		}
		
		//For Addon skip Btn at Step 2
		
		 @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Skip\"]")
		    public WebElement step2SkipBtn;
					
		
					
			public void clickOnStep2SkipBtn() {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
				wait.until(ExpectedConditions.visibilityOf(step2SkipBtn)).isDisplayed();
			    step2SkipBtn.click();
					}
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_do_not_secure_trip")
		public WebElement notIntrestedBtn;
		
		public void clickOnNotIntrestedbtn() {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(notIntrestedBtn)).isDisplayed();
			
			notIntrestedBtn.click();
			
		}
		
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_proceed']")
		public WebElement selectstep3btn;
		
		
		//To Verify that Make a Multicity booking with Armed Force and SUPER 6E CAPITAL
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/txv_fare_option")
		public WebElement armedForceFare;
		
		public void verifyMulticityArmedforceFare() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			assertEquals(armedForceFare.getText(), "ARMED FORCES FARE");
			
		}
		
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/txv_from")
		public WebElement verifyMulticityFromCity;
		@AndroidFindBy(id="in.goindigo.android.debug:id/txv_to")
		public WebElement verifyMulticityToCity;
		@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/txv_from_price']")
		public WebElement verifyMulticityFromPrice;
		
		
		
		
		public void verifyMultiCitysearchedflight() 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			assertEquals(verifyMulticityFromCity.isDisplayed(), true);
			assertEquals(verifyMulticityToCity.isDisplayed(), true);
			assertEquals(verifyMulticityFromPrice.isDisplayed(), true);
			
		}
		
		
		
		//For skip seat slection Page
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/txv_change_flight")
		public WebElement step3SkipBtn;
		
		public void ClickonStep3SkipBtn() {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(step3SkipBtn)).isDisplayed();
			step3SkipBtn.click();
		}
		
		
		// To payment with Upi
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/image_expand_icon'])[3]")
		public WebElement extendUpiBtn;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/edit_upi_vpa")
		public WebElement upiBankName;
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/checkbox_terms")
		public WebElement upiNotifyBtn;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/button_pay")
		public WebElement upiPayBtn;
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
		public WebElement upiContinuePaybtn;
		
		public void paymentprocessbyUPI(String upi) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(extendUpiBtn)).isDisplayed();
			
			extendUpiBtn.click();
			upiBankName.sendKeys(upi);
			upiNotifyBtn.click();
			upiPayBtn.click();
			upiContinuePaybtn.click();
			
		}
		
		
		//For confirm the payment
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_ticket_confirm")
		public WebElement forTicketConfirmed;
		
		public void toVerifyCompleteticket() {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(forTicketConfirmed)).isDisplayed();
			assertEquals(forTicketConfirmed.getText(), "Ticket Confirmed");
		}
			
		
		//To Verify that Make a Multicity booking with Armed Force and SUPER 6E CAPITAL
		
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_super'])[1]")
		public WebElement firstFlight6EFair;
		
		public void toSelect1stFlight6Efare() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(firstFlight6EFair)).isDisplayed();
			firstFlight6EFair.click();
			
		}
		
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_super'])[1]")
		public WebElement secondFlight6Efair;
			
		
		public void toSelect2ndflight6EFare() {
			secondFlight6Efair.click();
		}
		
		
		@AndroidFindBy(xpath="(//android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView)[1]")
		public WebElement editBtn6Etiffin;
		
		public void select6EtiffinAddBtn() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(editBtn6Etiffin)).isDisplayed();
			
			editBtn6Etiffin.click();
			
		}
		
//		@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/iv_more']")
//		public WebElement passengerarrowBtn;
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_done_meal']")
		public WebElement EtiffinDoneBtn;
		
		public void toselect6EdoneBtn() {
			EtiffinDoneBtn.click();
			
		}
		
		@AndroidFindBy(xpath="(//android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView)[1]")
		public WebElement continue6Etiffin;
		
		public void toselectcontinue6Etiffin() {
			continue6Etiffin.click();
		}
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Select Seat']")
		public WebElement verfystep3pge;
		
		public void toVerifystep3M() {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			assertEquals(verfystep3pge.getText(), "Select Seat");
		}
		
		@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/text_no_flight_dialog_done']")
		public WebElement seatDialogeokM;
		
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/iv_seat'])[13]")
		public WebElement selectwindowSeatM;
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_ok']")
		public WebElement seatConfirmOkBtnM;
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_proceed']")
		public WebElement proceedWithFirstFlightM;
		
		public void toChooseSeatM() {
			
			seatDialogeokM.click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(selectwindowSeatM)).isDisplayed();
			selectwindowSeatM.click();
			
			seatConfirmOkBtnM.click();
			proceedWithFirstFlightM.click();
			
		}
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_copy_seat']")
	    public WebElement copyseatforflight2M;
		
		@AndroidFindBy(xpath="//android.widget.ScrollView/android.widget.LinearLayout")
	    public WebElement pageelementlocator;
		
		public void Tocopyseatflight2M() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			copyseatforflight2M.click();
		}
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Continue to Payment']")
		public WebElement continueToPaymentM;
		
		public void clickonContinuepaymentbtnstep3M() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			continueToPaymentM.click();
		}
		
		
		//Make a booking with special fares Family & Friends and Flexi Plus fare option
		
		
		
		
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_flex'])[1]")
		public WebElement flexiFarefirstflight;
		
		public void toSelectfirstflexiFare() {
			flexiFarefirstflight.click();
		}
		
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_flex'])[1]")
		public WebElement felxifarereturnFlight;
		
		public void toSelectSecondFlexifare() {
			felxifarereturnFlight.click();
		}
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/radio_mr")
		public WebElement mrbtn1;
		
		@AndroidFindBy(xpath="(//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText)[1]")
		public WebElement pass1stfirstName;
		
		@AndroidFindBy(xpath="(//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText)[2]")
		public WebElement pass1stlastName;
		
		
		
		public void tofill1stPassdetails() 
		{
			
			mrbtn1.click();
			pass1stfirstName.sendKeys("Svm");
			pass1stlastName.click();
		
         	
			
		}
		
		
		//for Second passenger
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/radio_mr")
		public WebElement mrBtn2;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='First Name']")
		public WebElement pass2ndfirstName;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Last Name']")
		public WebElement pass2ndlastName;
		
		public void tofill2ndPassdetails(String firstname, String lastname) 
		{
			
			scrollToText("Add Passenger 3");
			mrBtn2.click();
			pass2ndfirstName.sendKeys(firstname);
			pass2ndlastName.sendKeys(lastname);
		
         	
			
		}
		
		
		//for 3rd passanger
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/radio_mr")
		public WebElement mrBtn3;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='First Name']")
		public WebElement pass3rdfirstName;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Last Name']")
		public WebElement pass3rdlastName;
		
		public void tofill3rdPassdetails(String firstname,String lastname) 
		{
			
			scrollToText("Add Passenger 4");
			mrBtn3.click();
			pass3rdfirstName.sendKeys(firstname);
			pass3rdlastName.sendKeys(lastname);
		
         	
			
		}
		
		//for 4th passenger 
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/radio_mr")
		public WebElement mrBtn4;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='First Name']")
		public WebElement pass4thfirstName;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Last Name']")
		public WebElement pass4thlastName;
		
		public void tofill4thPassdetails(String firstname,String lastname) 
		{
			
			scrollToText("Contact Details*");
			mrBtn4.click();
			pass4thfirstName.sendKeys(firstname);
			pass4thlastName.sendKeys(lastname);
		
         	
			
		}
		
		
		@AndroidFindBy(xpath="(//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_add'])[1]")
		public WebElement addBtn6Etiffinflexi;
		
		public void toSelctaddBtn6Etiffinflexi() {
			addBtn6Etiffinflexi.click();
		}
		
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/iv_more'])[1]")
		public WebElement firstpassMoreBtn;
		
		public void toSelectfirstpassMoreBtn() {
			firstpassMoreBtn.click();
		}
		
		@AndroidFindBy(xpath="(//android.widget.TextView[@text='+ ADD'])[1]")
		public WebElement firstFlightcombomealadd;
		
		public void toSelectfirstFlightcombomealadd() {
			firstFlightcombomealadd.click();
		}
		
		@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/checkbox_accept']")
		public WebElement checkBoxtoallpass;
		
		public void toClickcheckBoxtoallpass() {
			checkBoxtoallpass.click();
		}
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/button']")
		public WebElement confirmBtnforfood;
		
		public void toClickonconfirmBtnforfood() {
			confirmBtnforfood.click();
		}
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_done_meal']")
		public WebElement continueBtnAfterconfirm;
		
		public void clickOnContinueBtnAfterconfirm() {
			continueBtnAfterconfirm.click();
		}
		
		
		@AndroidFindBy(xpath="(//android.view.ViewGroup[@resource-id='in.goindigo.android.debug:id/container'])[2]")
		public WebElement secondFlightContainer;
		
		public void toSelectsecondFlightContainer() {
			secondFlightContainer.click();
		}
		
		@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_done_meal']")
		public WebElement doneMealafterboth;
		
		public void clickOnDoneMealafterboth() {
			doneMealafterboth.click();
		}
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Continue']")
		public WebElement continueAfterdoneMeal;
		
		public void clickOncontinueAfterdoneMeal() {
			continueAfterdoneMeal.click();
		}
		
		
		
		
		
		
		
		
	
			
			
		
		
			
			}
		
		

		
	

	
	


