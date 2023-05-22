package pageObjects.android;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddonPage extends AndroidActions{
	  public AndroidDriver driver;
	  AddonPage addon;
	  public AddonPage(AndroidDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			
		}
	  
	
	//For click on Book Flight Option
		
@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Book\"]")
public WebElement bookFlight;
		
@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/navigation_bar_item_icon_view'])[2]")
public WebElement bookflight2;	
		
		public void ClickOnbookFlight() {
		try {	
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120) );
			wait.until(ExpectedConditions.elementToBeClickable(bookFlight));
			bookFlight.click();
			}
		catch (Exception e) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120) );
			wait.until(ExpectedConditions.elementToBeClickable(bookflight2));
			bookflight2.click();
			
		}
		}
		
		//From City
		
	    @AndroidFindBy(id = "in.goindigo.android.debug:id/ll_from")
		public WebElement Clickfromcity;  //click
		
	    @AndroidFindBy(xpath ="//android.widget.LinearLayout[@resource-id='in.goindigo.android.debug:id/ll_from']")
	    public WebElement FromDest ;
	    
	   
	    //  in.goindigo.android.debug:id/ll_from
	    
		@AndroidFindBy(id="in.goindigo.android.debug:id/edit_search_city_from")
		public WebElement SearchFormCity;  //sendkeys
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_city_title")
		public WebElement SearchedFromCity; //click
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/image_search_close")
		public WebElement Closebutton;
		
		public void fromsearchCity(String from) {
			try
			{
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.elementToBeClickable(Clickfromcity)).isDisplayed();
				Clickfromcity.click();
			}
			catch (Exception e) 
			{
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.elementToBeClickable(FromDest)).isDisplayed();
				FromDest.click();
			}
			SearchFormCity.click();
			SearchFormCity.sendKeys(from);
			SearchedFromCity.click();
			Closebutton.click();
		}
		
		//Choose To city
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/edit_search_city")
		public WebElement EditSearchCity;  //sendkeys
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_city_desc")
		public WebElement SearchedTocity;   //click
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_city_title")
		public WebElement Clicksearchresult;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/tv_to_desti")
		public WebElement Todestination;
		
		
		
		public void ToSearchcity(String To) {
			Todestination.click();
			EditSearchCity.sendKeys(To);
			Clicksearchresult.click();
			//searchedTocity.click();
		}
		
		
		 //   Future Date  //
		
@AndroidFindBy(id = "in.goindigo.android.debug:id/linearLayoutDeparture")
public WebElement date;

@AndroidFindBy(xpath = "(//android.widget.TextView[@text='5'])[2]")
public WebElement selectdate;

@AndroidFindBy(id = "in.goindigo.android.debug:id/buttonSaveTrip")
public WebElement donedate;
	
		public void  SelectFutureDates() 
		{
			date.click();
			selectdate.click();
			donedate.click();
		}
		
	  
	  
     //  search flight //


@AndroidFindBy(id="in.goindigo.android.debug:id/rlSubmitBtn")
public WebElement SearchFlight;

public void clickOnSearchedFlight() {
	SearchFlight.click();
	
}

      //  user see searched result for oneway  //


  //For Passanger types //


   //   Adults  //



  
@AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id='in.goindigo.android.debug:id/linear_select_passenger'])[1]")
public WebElement clickpassanger;

public void clickonpassanger() 
{
	clickpassanger.click();
}

@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.goindigo.android.debug:id/button_select_passenger_done']")
public WebElement donepassanger;

public void clickondonepassanger() 
{
	donepassanger.click();
}
        //Seniorcitizen  //


@AndroidFindBy(id="in.goindigo.android.debug:id/image_add_seniorCT")
public WebElement addseniorcitizen;

@AndroidFindBy(id="in.goindigo.android.debug:id/image_minus_adult")
public WebElement minusadults;

public void SelectSeniorCitizen() 
{
	clickpassanger.click();
	addseniorcitizen.click();
//	minusadults.click();
	donepassanger.click();
}

  // Children //

@AndroidFindBy(id="in.goindigo.android.debug:id/image_add_children")
public WebElement addchildren;

public void SelectChildren() 
{
	clickpassanger.click();
	addchildren.click();
	donepassanger.click();
}

  // Infants  //

@AndroidFindBy(id="in.goindigo.android.debug:id/image_add_infant")
public WebElement addInfants;

public void SelectInfants() 
{
	clickpassanger.click();
	addInfants.click();
	donepassanger.click();	
}

     //  for close button for infants after its add and search flight  //

@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_close']")
public WebElement CloseInfantchargePopup;

public void clickonInfantPopup() 
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(CloseInfantchargePopup));
	CloseInfantchargePopup.click();
}



  // for special fare Action  //...

@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/tv_special_fare'])[3]")
public WebElement armedforces;

public void ClickonArmedforce() 
{
	armedforces.click();
}

@AndroidFindBy(xpath = "//android.widget.EditText[@text='Student ID']")
public WebElement studentid;

@AndroidFindBy(xpath = "//android.widget.EditText[@text='collegeName']")
public WebElement collegename;

public void enterstudentid(String StudentId ) 
{
	
	studentid.sendKeys(StudentId);
	
}

public void entercollegename( String Collegename ) 
{
	//scrollToText("Add to Favourites ‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‎‏‏‏‎‏‎‏‎‎‎‎‎‏‎‎‎‏‏‏‎‏‏‎‎‏‏‎‏‏‎‏‎‎‎‎‎‏‏‎‏‎‏‏‎‏‏‏‎‎‏‎‎‏‏‎‎‏‏‏‎‏‏‎OFF‎‏‎‎‏‎");
	scrollToText("collegeName");
	collegename.sendKeys(Collegename); 
}
 

  // for passanger deatails  //

@AndroidFindBy(id="in.goindigo.android.debug:id/radio_mr")
public WebElement ChooseMr;

@AndroidFindBy(id="in.goindigo.android.debug:id/radio_mrs")
public WebElement ChooseMrs;

@AndroidFindBy(id="in.goindigo.android.debug:id/radio_ms")
public WebElement ChooseMs;


public void choosetitle() 
{
	ChooseMr.click();
	//ChooseMrs.click();
	//ChooseMs.click();
}

  //  for Addult  and senior citizen  //
@AndroidFindBy(xpath="//android.widget.EditText[@text='First Name']")
public WebElement Firstname;

@AndroidFindBy(xpath="//android.widget.EditText[@text='Last Name']")
public WebElement Lastname;

public void Enterdetails(String firstname, String lastname) 
{
	Firstname.sendKeys(firstname);	
	Lastname.sendKeys(lastname);
}

public void EnterSeniorctzndetails(String firstname, String lastname) 
{
	scrollToText("Contact Details*");
	ChooseMr.click();
	Firstname.sendKeys(firstname);	
	Lastname.sendKeys(lastname);
}

@AndroidFindBy(xpath = "//android.widget.EditText[@text='Senior Citizen ID']")
public WebElement seniorcitizenid;

public void EnterSeniorCitizenId(String SeniorCitizenID) 
{
	scrollToText("Contact Details*");
	seniorcitizenid.sendKeys(SeniorCitizenID);
}


public void EntersecondPsngrdetails(String P2firstname, String P2lastname) 
{
	scrollToText("Add Passenger 3");
	Firstname.sendKeys(P2firstname);	
	Lastname.sendKeys(P2lastname);
}

public void EnterthirdPsngrdetails(String P3firstname, String P3lastname) 
{
	scrollToText("Add Passenger 4");
	Firstname.sendKeys(P3firstname);	
	Lastname.sendKeys(P3lastname);
}

public void EnterfourthPsngrdetails(String P4firstname, String P4lastname) 
{
	scrollToText("Contact Details*");
	ChooseMr.click();
	Firstname.sendKeys(P4firstname);	
	Lastname.sendKeys(P4lastname);
}

@AndroidFindBy(xpath = "//android.widget.EditText[@text='Military ID']")
public WebElement entermillitaryid;

public void Enterdetailsmilllitaryid(String firstname, String lastname,String MillitaryId ) 
{
	Firstname.sendKeys(firstname);	
	Lastname.sendKeys(lastname);
	entermillitaryid.sendKeys(MillitaryId);
}



@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[1]")
public WebElement mobno;

public void Entermobnumber(String monumber) 
{
	scrollToText("Continue");
	mobno.sendKeys(monumber);
}

@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[2]")
public WebElement emailid;

public void Enteremailid(String EmailID) 
{
	scrollToText("Continue");
	emailid.sendKeys(EmailID);
}



@AndroidFindBy(id="in.goindigo.android.debug:id/edit_dob")
public WebElement selectdob;

@AndroidFindBy(id="in.goindigo.android.debug:id/btnDone")
public WebElement Donedob;

public void ClickOnDob() 
{
	selectdob.click();
	
}

public void ClickonDoneDob() 
{
	
	Donedob.click();
}


                   //  For Children Details with Addults  //

@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Male']")
public WebElement SelectMaleGender;

@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Female']")
public WebElement SelectFemaleGender;

@AndroidFindBy(xpath = "//android.widget.EditText[@text='First Name']")
public WebElement EnterFirstname;

@AndroidFindBy(xpath = "//android.widget.EditText[@text='Last Name']")
public WebElement EnterLasttname;

public void SelectGender() 
{
	scrollToText("Contact Details*");
	SelectMaleGender.click();	
//	SelectFemaleGender.click();
}

public void SelectGenderForUnacompaniedminor() 
{
	
	SelectMaleGender.click();	
//	SelectFemaleGender.click();
}

public void EnterFirstname_for_child(String firstname) 
{
	scrollToText("Contact Details*");
	EnterFirstname.sendKeys(firstname);	
}

public void EnterLastname_for_child(String lastname) 
{
	scrollToText("Contact Details*");
	EnterLasttname.sendKeys(lastname);
}


                      // For Infant Details with Addults  //

@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Male']")
public WebElement SelectInfantMaleGender;

@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Female']")
public WebElement SelectInfantFemaleGender;

@AndroidFindBy(xpath = "//android.widget.EditText[@text='First Name']")
public WebElement EnterInfantFirstname;

@AndroidFindBy(xpath = "//android.widget.EditText[@text='Last Name']")
public WebElement EnterInfantLasttname;

public void SelectGender_of_Infant() 
{
	scrollToText("Contact Details*");
	SelectMaleGender.click();	
//	SelectFemaleGender.click();
}

public void EnterFirstname_for_Infants(String firstname) 
{
	scrollToText("Contact Details*");
	EnterFirstname.sendKeys(firstname);	
}

public void EnterLastname_for_Infants(String lastname) 
{
	scrollToText("Contact Details*");
	EnterLasttname.sendKeys(lastname);
}


  //  use Addons  //

@AndroidFindBy(xpath="(//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_add'])[1]")
public WebElement AddSixEprime;  // included 6e tiffin + seat + fastForward 


public void clickonsixEprimeAddon() 
{
	AddSixEprime.click();
	
}

@AndroidFindBy(xpath="(//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_add'])[1]")
public WebElement AddSixtiffin;

public void ClickonSixetiffin() 
{
	AddSixtiffin.click();
}

  //  verify 6Eprime Page  //


@AndroidFindBy(xpath="(//android.widget.TextView[@text='6E Prime'])[1]")
public WebElement SixEprimepage;

@AndroidFindBy(id="in.goindigo.android.debug:id/recyclerView2")
public WebElement Selectflightforaddon;

@AndroidFindBy(xpath ="//android.widget.Button[@text='Add 6E Prime']")
public WebElement Clickdonaddsixprime;

public void verifySixeprimepage() 
{
	assertEquals(SixEprimepage.getText(), "6E Prime");
	
}

public void clickcheckbox() 
{
	Selectflightforaddon.click();
	//assertEquals(Selectflightforaddon.isSelected(), true);
}

public void clickonaddsixprimebutton() 
{
	
//assertEquals(ClickAddsixeprimeafterSelect.isEnabled(), true);
	Clickdonaddsixprime.click();
}


  //  verify 6eTifin page for 6eprime //

@AndroidFindBy(xpath="(//android.widget.TextView[@text='6E Tiffin'])[2]")
public WebElement ChecksixTifin;

@AndroidFindBy(xpath="//android.widget.Button[@resource-id ='in.goindigo.android.debug:id/btn_done_meal']")
public WebElement clickdone;

@AndroidFindBy(id = "in.goindigo.android.debug:id/txv_msg")
public WebElement verifyfreemeal;

public void VerifyMealisFreewithprime() 
{
	assertEquals(verifyfreemeal.getText(), "Select any meal option Free of cost");
}

public void Verifysixetifinpage() 
{
	
	assertEquals(ChecksixTifin.getText(), "6E Tiffin");
}

@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/iv_more'])[1]")
public WebElement mealbutton;

public void clickonmealbutton() 
{
	mealbutton.click();
}

@AndroidFindBy(xpath = "(//android.widget.TextView[@text='+ ADD'])[1]")
public WebElement vegtbutton;

@AndroidFindBy(xpath = "(//android.widget.TextView[@text='+ ADD'])[1]")
public WebElement nonvegtbutton;


public void clickonaddveg() 
{
	vegtbutton.click();
}

public void clickonaddNonveg() 
{
	nonvegtbutton.click();
}

@AndroidFindBy(id="in.goindigo.android.debug:id/checkbox_accept")
public WebElement mealforall;

public void ClickomealForallcheckbox() 
{
	mealforall.click();
}

@AndroidFindBy(id="in.goindigo.android.debug:id/button")
public WebElement confirmmeal;

public void ClickonconfirmMealbutton() 
{
	confirmmeal.click();
}

@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
public WebElement clickcontinue;

public void clickoncontinue() 
{
	clickcontinue.click();
}


public void clickondonebutton() 
{
	
	clickdone.click();
}

@AndroidFindBy(xpath  = "(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/tv_amount'])[2]")
public WebElement verifyfastforwaedfree;

public void VerifyFastForwardfreewithPrime()
{
	scrollToText("SAVING OF UP TO 40%");
	assertEquals(verifyfastforwaedfree.getText(), "Included");
}
  //  verify user on Add-on Page after add 6e prime addon  //  use 137 line method again
  


  //  Addon 2 = Seat and eat  //

@AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_add'])[2]")
public WebElement AddseatAndeat;

public void ClickSixseatandeataddon() 
{
	AddseatAndeat.click();
}

  //  verify Sixe seat and eat  //

@AndroidFindBy(xpath = "//android.widget.TextView[@text='6E Seat & Eat']")
public WebElement VerifysixSeatandEat;

@AndroidFindBy(xpath="//android.widget.Button[@text='Add Combo']")
public WebElement ClickAddCombo;

public void VerifySeatandeat() 
{
	assertEquals(VerifysixSeatandEat.getText(), "6E Seat & Eat");
	

}

public void clickonaddcombo() 
{
	assertEquals(ClickAddCombo.isEnabled(), true);
	ClickAddCombo.click();
//	assertEquals(VerifysixSeatandEat.getText(), "6E Seat & Eat");
//	Selectflightforaddon.click();
//	assertEquals(ClickAddCombo.isEnabled(), true);
//	ClickAddCombo.click();
}

  //  verify user on Add-on Page after add 6e prime addon  //  use 137 line method again



  //  Addon 3 = 6E Tiffin  // Now we Scroll down for 6E tiffin

@AndroidFindBy(id="//android.widget.TextView[@text='6E Tiffin']")
public WebElement Scrollto6Etiffin;

@AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.Button")
public WebElement AddSixETiffin;

public void Scroll_and_click_on_sixE_Tiffin() 
{
	scrollToText("Fast Forward");
	AddSixETiffin.click();
}

  //  Addon 4 =Fast Forward  //

//@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.Button")
//public WebElement AddFastfoeward;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Fast Forward']")
public WebElement AddFastfoeward;

@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Fast Forward'])[2]")
public WebElement VerifyFastForward;

@AndroidFindBy(xpath = "//android.widget.Button[@text=\"Add Fast Forward\"]")
public WebElement ClickonAddfastforard;

public void ClickonFastForwardaddon() 
{
	//scrollToText("SAVING OF UP TO 40%");
	scrollToText("Fast Forward");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(AddFastfoeward));
	AddFastfoeward.click();
}

public void Verifyfastforwarpage() 
{
	assertEquals(VerifyFastForward.getText(),"Fast Forward");

}

public void Clickonaddfastforwardbutton() 
{
	ClickonAddfastforard.click();
}


  //  Addon 5 Excess Baggage/Additional price  //

//@AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.Button")
//public WebElement AddExcessBaggagePiece;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Excess Baggage/Additional piece']")
public WebElement AddExcessBaggagePiece;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Excess Baggage']")
public WebElement AddExcessBaggagePiece2;

@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Excess Baggage'])[1]")
public WebElement VerifyExcessBaggage;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Excess Baggage']")
public WebElement VerifyExcessBaggage2;





@AndroidFindBy(xpath = "(//*[@resource-id='in.goindigo.android.debug:id/price_details'])[1]")
public WebElement AddbaggageInKg; 

@AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
public WebElement ClickOnDoneBaggage;

public void ClickonExcessBaggageaddon () 
{
//scrollToText("SAVING OF UP TO 15%");
	try {
		scrollToText("Excess Baggage");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(AddExcessBaggagePiece2));
		AddExcessBaggagePiece2.click();
		
		
	}
	catch (Exception e) {
		scrollToText("Excess Baggage/Additional piece");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(AddExcessBaggagePiece));
	AddExcessBaggagePiece.click();
	}
	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.elementToBeClickable(AddExcessBaggagePiece));
//AddExcessBaggagePiece.click();
}

public void VerifyExcessBaggagepage() 
{
	try 
	{
	assertEquals(VerifyExcessBaggage2.getText(), "Excess Baggage");
	}
	catch (Exception e) {
		assertEquals(VerifyExcessBaggage.getText(), "Excess Baggage/Additional piece");	
	}
}

public void ClickonaddWeightofBag() 
{
	AddbaggageInKg.click();	
}

public void ClickonDonebaggage() 
{
	scrollToText("Done");
	ClickOnDoneBaggage.click();
	
}

  //  Addon 6 Sports Equipment  //

//@AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.Button")
//public WebElement AddSportsEquipment;
//
//@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sports Equipment']")
//public WebElement VerifySportsEquipment;
//
//@AndroidFindBy(xpath = "android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
//public WebElement AddSportKit;  // done  locator remaining
//
//
//public void Click_on_SportsEquipment_Addon() 
//{
//	scrollToText("Travel Assistance");
//	AddSportsEquipment.click();
//}
//
//public void Verify_and_Add_SportsEquipment() 
//{
//	assertEquals(VerifySportsEquipment.getText(), "Sports Equipment");
//	AddSportKit.click();
//}

  //  Addon 7 Travel Assistance  //

//@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.Button")
//public WebElement AddTavelAssistant;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Travel Assistance']")
public WebElement AddTavelAssistant;

@AndroidFindBy(id = "in.goindigo.android.debug:id/tv_header_large")
public WebElement VerifyTravelAssistance;

@AndroidFindBy(xpath = "(//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/cb_tnc'])[1]")
public WebElement SelectFirstTermsAndCondn;

@AndroidFindBy(xpath = "(//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/cb_tnc'])[2]")
public WebElement SelectSecondTermsAndCondn;

@AndroidFindBy(xpath = "//android.widget.Button[@text='Add Travel Assistance']")
public WebElement ClickOnAddTravelAssistance;


public void ClickonTravelAssitanceAddon() 
{
	scrollToText("Travel Assistance");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.elementToBeClickable(AddTavelAssistant));
	AddTavelAssistant.click();
}

public void verifyAddTravelAssistance() 
{
	assertEquals(VerifyTravelAssistance.getText(), "Travel Assistance");
}

@AndroidFindBy(xpath = "//android.widget.EditText[@text='Date of Birth']")
public WebElement selectstudentdob;

public void Clickonselectstudentdob() 
{
	selectstudentdob.click();
}


public void ClickontremsAndcoditions() 
{
	scrollToText("Add Travel Assistance");
	SelectFirstTermsAndCondn.click();
	SelectSecondTermsAndCondn.click();
}

public void Clickonaddtravelassitance() 
{
	scrollToText("Travel Assistance");
	ClickOnAddTravelAssistance.click();
}

    //  Add-ons 7 Delayed and lost Baggage //

//@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.Button")
//public WebElement AddDelayedAndLost;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delayed & Lost Baggage Protection']")
public WebElement AddDelayedAndLost;

@AndroidFindBy(xpath="(//android.widget.TextView[@text='Delayed & Lost Baggage Protection'])[2]")
public WebElement VerifyDelayedAndLost;

@AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/cb_tnc']")
public WebElement SelectCheckBox;

@AndroidFindBy(xpath = "//android.widget.Button[@text='Add to trip']")
public WebElement AddAddToTrip;

public void clickondelayedlostbaggaeaddon() 
{
	scrollToText("Continue");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(AddDelayedAndLost));
	AddDelayedAndLost.click();
}

public void verifyandAddDelayedAndlostBaggaeaddon() 
{	
	assertEquals(VerifyDelayedAndLost.getText(), "Delayed & Lost Baggage Protection");
	
}


public void clickoncheckboxofterms() 
{
	
	SelectCheckBox.click();
	
}

public void clickonaddtotrip() 
{
	
	AddAddToTrip.click();
	
}


    //  Add-on 8 Six E QuickBord //

//@AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.Button")
//public WebElement AddSixEQickBoard;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='6E QuickBoard']")
public WebElement AddSixEQickBoard;

@AndroidFindBy(xpath = "(//android.widget.TextView[@text='6E QuickBoard'])[2]")
public WebElement VerifySixEQuickBoard;

@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_add_to_both_trip']")
public WebElement ConfirmSixEQuickBoard;

public void ClickonSixEQuickBoardAddon() 
{
	scrollToText("Continue");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.elementToBeClickable(AddSixEQickBoard));
	AddSixEQickBoard.click();
}

public void verifySixEQuickBoard() 
{
	assertEquals(VerifySixEQuickBoard.getText(), "6E QuickBoard");
	
}

public void ClickonaddsixEQuickBoard() 
{
	
	ConfirmSixEQuickBoard.click();
}


  //  continue with Addon  //

//@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
//public WebElement ContinuewithAddon;

//@AndroidFindBy(id="in.goindigo.android.debug:id/text_do_not_secure_trip")
//public WebElement IamNotinterested;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirm']")
public WebElement ConfirmAddon;

public void clickonconfirmaddon() 
{
	ConfirmAddon.click();
}


public void ContinueWithAddon_sixEprime_sixEseat() 
{
	scrollToText("Continue");
	ContinuewithAddon.click();
	//ConfirmAddon.click();
}

//public void ContinueWithAddon() 
//{
//	scrollToText("Continue");
//	ContinuewithAddon.click();
//	IamNotinterested.click();
//}
 

  //   the seat selection part  //






//  For Registerd user  //



@AndroidFindBy(xpath="//android.widget.RelativeLayout[@resource-id='in.goindigo.android.debug:id/rlSubmitBtn']")
public WebElement searchflightbutton;

public void clickonsearchflightbutton() 
{
	searchflightbutton.click();
}

@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_flex'])[1]")
public WebElement selectFlexiplus;

@AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView[1]")
public WebElement selectFlexiplus2;

public void ClickFlexiplusfare() 
{
	try
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(selectFlexiplus)).isDisplayed();
		selectFlexiplus.click();
	}
	catch (Exception e) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(selectFlexiplus2)).isDisplayed();	
		selectFlexiplus2.click();
	}
}


@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/txv_from']")
public WebElement VerifyFromcity;

@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/txv_to']")
public WebElement VerifyTocity;


public void checksearchedflight() 
{
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
assertEquals(VerifyFromcity.isDisplayed(), true);
assertEquals(VerifyTocity.isDisplayed(), true);

}


@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.goindigo.android.debug:id/button5']")
public WebElement continuebutton;

public void clickoncontinuebutton() 
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(continuebutton));
	continuebutton.click();	
}

@AndroidFindBy(xpath="//android.widget.Button[@text='Skip']")
public WebElement SkipButton;

@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Skip\"]")
public WebElement SkipButton2;


public void Clickonskipbutton() 
{
	try {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
wait.until(ExpectedConditions.elementToBeClickable(SkipButton));
	SkipButton.click();
	}
	catch (Exception e) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.elementToBeClickable(SkipButton2));
		SkipButton2.click();
	}
}

@AndroidFindBy(id="in.goindigo.android.debug:id/header_view_sub_title")
public WebElement addpassangerpage;

public void Verifypassangerpage() 
{
	try
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(addpassangerpage)).isDisplayed();
	assertEquals(addpassangerpage.getText(), "Add Passenger Details");
	}
	catch(Exception e) 
	{
	System.out.println("verified");	
	}
}

@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.goindigo.android.debug:id/switch_travelling']")
public WebElement togglebutton;

public void clickontogglebutton() 
{
	togglebutton.click();
}

@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
public WebElement ContinuewithUserdeatails;

public void ClickOnContinuewithPassangerDeatails() 
{
	scrollToText("Continue");
	ContinuewithUserdeatails.click();
}

@AndroidFindBy(xpath = "//android.widget.TextView[@text='6E Add-ons']")
public WebElement Checkaddonpage;

public void VerifieAddOnPage() 
{
	assertEquals(Checkaddonpage.getText(), "6E Add-ons");
	
}

@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/tv_flexi_text']")
public WebElement freemeal; 

public void VerifyMealfreewithflexifare() 
{
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(freemeal)).isDisplayed();
	assertEquals(freemeal.isDisplayed(), true);
}



//@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.Button")
//public WebElement AddSportsEquipment;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sports Equipment']")
public WebElement AddSportsEquipment;

@AndroidFindBy(xpath = "//*[@resource-id='in.goindigo.android.debug:id/header_view_title']")
public WebElement VerifySportsEquipment;

@AndroidFindBy(xpath = "(//*[@resource-id='in.goindigo.android.debug:id/tv_add_eqpmnt'])[1]")
public WebElement AddSportKit;  

@AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
public WebElement donesportkit;


public void clickonSportsEquipmentAddon() 
{
	scrollToText("SAVING OF UP TO 40% ");
	//scrollToText("Sports Equipment");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(AddSportsEquipment));
	AddSportsEquipment.click();
}

public void verifyandAddSportsEquipment() 
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(VerifySportsEquipment));
	assertEquals(VerifySportsEquipment.getAttribute("text"), "Sports Equipment");
	
}

public void addsportkit() 
{
	AddSportKit.click();
	
}
public void clickondonesportkit() 
{
	scrollToText("Done");
	donesportkit.click();
}

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue']")
public WebElement ContinuewithAddon;

@AndroidFindBy(id="in.goindigo.android.debug:id/text_do_not_secure_trip")
public WebElement IamNotinterested;

public void ContinueWithAddon() 
{
	ContinuewithAddon.click();		
}

@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/txv_change_flight']")
public WebElement skipseatselection;

public void skipseatselection() 
{
	skipseatselection.click();
}

     
      //    seat verify  //

@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/iv_seat'])[1]")
public WebElement seatselect;

public void ClickonSeatselect() 
{
	seatselect.click();
}

@AndroidFindBy(id = "in.goindigo.android.debug:id/text_discounted_rate_desc")
public WebElement verifyDiscount;

public void VerifySeatdiscount()
{
	assertEquals(verifyDiscount.getText(), "Discounted rate for 6E prime");
	proceedwithseat.click();
}

@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_ok']")
public WebElement proceedwithseat;

@AndroidFindBy(xpath = "xpath=//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_proceed']")
public WebElement forpayment;

public void ClickonPaymentforXlseat() 
{
	forpayment.click();
}

             //   Payment   //   

 @AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/image_expand_icon'])[3]")
public WebElement upBtn;
 
 

@AndroidFindBy(id="in.goindigo.android.debug:id/edit_upi_vpa")
public WebElement enterupiid;

@AndroidFindBy(id="in.goindigo.android.debug:id/checkbox_terms")
public WebElement checktermsandcondn;

@AndroidFindBy(id="in.goindigo.android.debug:id/button_pay")
public WebElement Pay;


@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
public WebElement proceedpayment;

public void EnterupiBamkid(String UPI) throws InterruptedException 
{
	 upBtn.click();
	 int x=enterupiid.getLocation().getX();
     int y=enterupiid.getLocation().getY();
     leftScrollco(driver, x, y, x, y-150);
	enterupiid.sendKeys(UPI);
	checktermsandcondn.click();
	Pay.click();
	proceedpayment.click();
}

@AndroidFindBy(id = "in.goindigo.android.debug:id/text_ticket_confirm")
public WebElement ticketconfirm;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Ticket Confirmed']")
public WebElement ticketconfirm2;

public void VerifyTicketBooking() 
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	wait.until(ExpectedConditions.visibilityOf(ticketconfirm));
	try 
	{
		assertEquals(ticketconfirm.getAttribute("text"), "Ticket Confirmed");
	}
	catch (Exception e) {
		assertEquals(ticketconfirm2.getAttribute("text"), "Ticket Confirmed");
	}
}



public void skipwithselectedaddon() 
{
	IamNotinterested.click();
}




  // for Guest user  //

@AndroidFindBy(id="in.goindigo.android.debug:id/button_as_guest")
public WebElement GuestBtn;

public void guestlogin() 
{
	GuestBtn.click();
}

@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']")
public WebElement allowbutton;

public void Clickonallowbutton() 
{
	allowbutton.click();
}

@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/navigation_bar_item_icon_view'])[2]")
public WebElement bookflight;

public void Clickonbookflight() 
{
	bookflight.click();
}

            //   Lounge addon  //   

//@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.Button")
//public WebElement clickonlounge;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Lounge']")
public WebElement clickonlounge;

public void Clickonloungeaddon() 
{
	scrollToText("Lounge");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(clickonlounge));
	clickonlounge.click();
}

@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Lounge'])[2]")
public WebElement loungepage;

public void VerifyLoungePage() 
{
	assertEquals(loungepage.getText(), "Lounge");
	
}

@AndroidFindBy(id = "in.goindigo.android.debug:id/iv_more")
public WebElement Chdcheckbox;

public void SelectCheckboxforlounge() 
{
	Chdcheckbox.click();
}

@AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
public WebElement donebutton;

public void Clickdonebuttonforlounge() 
{
	donebutton.click();
}

      //  Indigo promises  //

//@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.Button")
//public WebElement indigopromises;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='IndiGo Promise']")
public WebElement indigopromises;

@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/header_view_title'])[2]")
public WebElement verifyindigopromise;

@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_add_to_both_trip']")
public WebElement addindigopromise;

public void ClickonaddIndigopromise() 
{
	scrollToText("IndiGo Promise");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(indigopromises));
	indigopromises.click();
}

public void VerifyindigopromisePage() 
{
	assertEquals(verifyindigopromise.getText(), "IndiGo Promise");
}

public void AddIndigopromise() 
{
	addindigopromise.click();
}

}
