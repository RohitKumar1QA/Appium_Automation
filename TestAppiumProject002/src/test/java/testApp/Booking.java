package testApp;


import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.BookingPage;
import pageObjects.android.PaymentPage;
import pageObjects.android.RoundTripPage;
import testBase.AndroidBaseTest;

public class Booking extends AndroidBaseTest{
	
	BookingPage booking;
	RoundTripPage Roundtrip;
	PaymentPage payment; 
	public Booking(){
		super();
		ConfigureAppium();
	}

	    @Given("User is Logged in")
	     public void user_is_logged_in() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	        login();
	     
	    }
    
	 @Given("User is on Book Flight Page")
	    public void user_is_on_book_flight_page() throws Throwable {
		
		 booking =new BookingPage(driver);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		 
		 try {
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
			 wait.until(ExpectedConditions.elementToBeClickable(booking.bookFlight));
//			 
			 booking.bookFlight.click();
		 }catch(StaleElementReferenceException e){
			 System.out.println("Element Not found trying with another locator");
			 booking.trybookFlight2.click();
			 
			 
			 
		 }}
		 
		 @Given("User navigate back to the Book Flight Page")
		    public void user_navigate_back_to_the_Book_Flight_Page() throws Throwable {			
			 booking =new BookingPage(driver);
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
			 wait.until(ExpectedConditions.elementToBeClickable(booking.searchFlightBtn));
			 assertEquals(booking.searchFlightBtn.isDisplayed(),true);
			 
			 
	    }
		 
	    @And("User click on passengers")
	    public void user_click_on_passengers() throws Throwable {
	    	
	    	 booking =new BookingPage(driver);
	    	 booking.passengers.click();
	    }

	    @When("User add Adults")
	    public void user_add_adults() throws Throwable {
	    	
	    	 booking =new BookingPage(driver);
	    	 for(int i=0;i<=5;i++) {
	    		 
	    		 booking.addAdults.click();
	    		 
	    	 }
	    	 
	        
	    }
	    
	    
	    @When("User adds 2 adult passengers")
	    public void user_add_adult_passangers() throws Throwable {
	    	
	    	 booking =new BookingPage(driver);
	    		 
//	    		 booking.addAdults.click();
	    		 booking.addAdults.click();
	    		 booking.donePassanger.click();
	
	    	 
	        
	    }
	    
	    @And("User add infants more than four")
	    public void user_add_infants_more_than_four() throws Throwable {
	    	
	    	 booking =new BookingPage(driver);
	    	 
	    	 for(int i=0;i<=5;i++) {
	    		 
	    		 booking.addInfant.click();
	    	 }
	    	 
	        
	    }

	    @Then("User validate the infants count")
	    public void user_validate_the_infants_count() throws Throwable {
	    	 booking =new BookingPage(driver);
	    	 String count = booking.infantCount.getAttribute("text");
	    	 assertEquals(count, "4", "The count of infants must not be more than 4");
	    	
	    }
	    
	    @When("User add child more than four")
	    public void user_add_child_more_than_four() throws Throwable {
	    	
	    	 booking =new BookingPage(driver);
	    	 
	    	 for(int i=0;i<=5;i++) {
	    		 
	    		 booking.addChild.click();
	    	 }
	    	 
	        
	    }

	    @Then("User validate the child count")
	    public void user_validate_the_child_count() throws Throwable {
	    	 booking =new BookingPage(driver);
	    	 String count = booking.ChildCount.getAttribute("text");
	    	 assertEquals(count, "4", "The count of Child must not be more than 4");
	    	
	    }

	    @When("User selects {string} and {string} cities")
	    public void user_selects_something_and_something_cities(String to, String from) throws Throwable {
	    	 booking =new BookingPage(driver);
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		    wait.until(ExpectedConditions.visibilityOf(booking.fromCityOption));
	    	 booking.fromCityOption.click();
	    	 booking.fromCity.click();
	    	 booking.fromCity.sendKeys(from);
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	 booking.selectSearchedCity.click();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

	    		 booking.closeSearch.click();
	    
	    	 
	    	 booking.toDestiCityOption.click();
	    	 booking.searchCityDest.sendKeys(to);
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	 booking.selectSearchedCity.click();
	    	
	    
	    	 
	    }
	    

	    @When("User selects same cities for {string} and {string}")
	    public void user_selects_same_cities_for_and(String to, String from)throws Throwable {
	
	    	
	    	 booking =new BookingPage(driver);
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		    wait.until(ExpectedConditions.visibilityOf(booking.fromCityOption));
	    	 booking.fromCityOption.click();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	 booking.fromCity.click();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	 booking.fromCity.sendKeys(from);
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	 booking.selectSearchedCity.click();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

	    		 booking.closeSearch.click();
	    
	    	 
	    	 booking.toDestiCityOption.click();
	    	 booking.searchCityDest.sendKeys(to);
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	 
	    
	    	 
	    }
	    
	    
	    @Then("Destination city not displyed in searched list")
	    public void destination_city_not_displyed_in_searched_list() throws Throwable {
	    	
	    	
	    try {
	    	 Boolean dest_city = booking.selectSearchedCity.isDisplayed();
	    	 assertEquals(dest_city,false);
	    }catch(NoSuchElementException e) {
	    	assertTrue(true);
	    }
	   	
	    	
	    }

	    @And("User selects a departure date")
	    public void user_selects_a_departure_date() throws Throwable {
	    	
	    	booking =new BookingPage(driver);
	    	booking.departureDate.click();
	    	booking.selectFutureDatePayment();
	    	
	    }

	    @And("User clicks on Done button")
	    public void user_clicks_on_done_button() throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.doneBtn.click();
	    	
	       
	    }

	    @And("User Selects Passengers")
	    public void user_selects_passengers() throws Throwable {
	    	booking =new BookingPage(driver);
	    	for(int i=0;i<=6;i++) {
	    		booking.addAdults.click();
	    	}
	    	for(int i=0;i<=2;i++) {
	    		booking.addChild.click();
	    	}
	    	
	    	
	    	booking.addInfant.click();
	    	
	    	booking.donePassanger.click();
	    }
	    

	    @And("User Select a Passenger with infant")
	    public void user_select_a_passenger_with_infant() throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.addInfant.click();
	    	booking.donePassanger.click();
	    }
	    
	    @And("User Select a Passenger")
	    public void user_selects_a_passenger() throws Throwable {
	    	booking =new BookingPage(driver);

	    	booking.donePassanger.click();
	    }


	    @And("User Search and select a {string}")
	    public void user_search_and_select_a_something(String currency) throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.currencyOption.click();
	    	booking.searchCurrency.sendKeys(currency);
	    	booking.searchedCurrency.click();
	        
	    }
	    @Then("User Clicks on Search Flight")
	    public void user_clicks_on_search_flight() throws Throwable {
	    	booking =new BookingPage(driver);
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.elementToBeClickable(booking.searchFlightBtn));
	    	booking.searchFlightBtn.click();	    	
	    	Thread.sleep(2000);	    	
	    }
	    
	    
	    @And("Verify pax count")
	    public void verify_pax_count() throws Throwable {
	    	booking =new BookingPage(driver);
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		      wait.until(ExpectedConditions.visibilityOf(booking.closeInfoForInfantCharges));
		      booking.closeInfoForInfantCharges.click();
	        	wait.until(ExpectedConditions.visibilityOf(booking.paxCount));
	    
	    		
	    		 String paxCountText = booking.paxCount.getAttribute("text");
	    		 System.out.println(paxCountText);
		    	 if(paxCountText.contains("10")) {
		    		 
		    		 assertTrue(false);
		    	 }
		    	 else {
		    		 assertTrue(true);
		    	 }
	    		
	    	}
	    	
	    
 
	    @And("User can see Search results for {string} and {string} cities")
	    public void user_can_see_search_results_for_and_cities(String to,String from) throws Throwable {
	    	booking =new BookingPage(driver);
	   	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    	wait.until(ExpectedConditions.visibilityOf(booking.closeInfoForInfantCharges));
	    	booking.closeInfoForInfantCharges.click();
	    	String actualfrom = booking.fromCityonSearchResult.getText();
	    	String actualto = booking.toCityonSearchResult.getText();
	    	
	    	assertEquals(actualfrom, from);
	    	assertEquals(actualto, to);
	    	
	    }
	    
	    @And("User Click on modify Search")
	    public void user_click_on_modify_search() throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.modifySearch.click();
	        
	    }
	    
	   
	    
	    @And("User Selects any {string}")
	    public void user_selects_any_specialfare(String fareOption) throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.selectSpecialfareOption(fareOption);
	        
	    }
	    
	    @And("User Selects Students special fare option")
	    public void user_selects_students_specialfare() throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.selectStudentsSpecialFare();
	        
	    }
	    
	    
	    
	    
	    @And("User selects saver fare option")
	    public void user_selects_saver_fare_option() throws Throwable {
	    	booking =new BookingPage(driver);
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		    wait.until(ExpectedConditions.elementToBeClickable(booking.SelectSaverfareOption1));
	    	booking.selectSaverFareOption();
	    	
	        
	    }
	    
	    
	    
	    @And("User selects Flexi Plus fare option")
	    public void user_selects_Flexi_Plus_fare_option() throws Throwable {
	    	booking =new BookingPage(driver);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	    	booking.SelectFlexiPlusfareOption.click();
	    	
	        
	    }
	    
	    @And("User select Super6e fare option") 
	    public void  user_select_super6e_fare_option() throws Throwable {
	    	Roundtrip=new RoundTripPage(driver);
	    	booking =new BookingPage(driver);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	
			Roundtrip.toselectSuper6Efair();

	        
	    }
	   
	    
	    @And("User selects Super6E fare option")
	    public void  user_selects_super6E_fare_option() throws Throwable {
	    	Roundtrip=new RoundTripPage(driver);
	    	booking =new BookingPage(driver);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	booking.closeInfoForInfantCharges.click();
			Roundtrip.toselectSuper6Efair();
	    	
//	    	
//    	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(80));
//	      wait.until(ExpectedConditions.visibilityOf(booking.closeInfoForInfantCharges));
//	      booking.closeInfoForInfantCharges.click();
//	      try {
//	    	  booking.SelectSuper6eOption.click();
//	      }catch (NoSuchElementException e) {
//	    	  	
//	    	  booking.SelectSuper6eOption2.click();
//		}
	    	
	    	
	    	
	        
	    }
	   
	    
	    
	    @And("User clicks on continue button")
	    public void user_clicks_on_continue_button() throws Throwable {
	    	booking =new BookingPage(driver);
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		      wait.until(ExpectedConditions.elementToBeClickable(booking.continueBtn));
	    	booking.continueBtn.click();
	    	
	        
	    }
	    
	    @And("User selects a seat")
	    public void user_selects_a_seat() throws Throwable {
	    	Thread.sleep(3000);
	    	Roundtrip=new RoundTripPage(driver);
	    	if(Roundtrip.sixeseatpopup.isDisplayed()==true) {
	    		assertTrue(true);
	    	}
	    	else{
	    		assertTrue(false);
	    	}
	    	Roundtrip.makeASeatSelection();
	    	
	    	
	    }
	    
	    
	    
	    @And("verify user payment successfull using upi {string}")
	    public void verify_user_payment_successfull_using_upi(String vpa) throws Throwable {
	    	
	    	payment=new PaymentPage(driver);
	    	payment.paymentprocessbyUPI(vpa);
	    	
	        
	    }
	    
	    
	    
	    @And("User clicks on continue button and skipFlexi")
	    public void user_clicks_on_continue_button_and_skipFlexi() throws Throwable {
	    	booking =new BookingPage(driver);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    	booking.continueBtn.click();
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		      wait.until(ExpectedConditions.visibilityOf(booking.skipFlexi));
	    	booking.skipFlexi.click();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
	        
	    }
	    
	    @And("click on continue button and skipFlexi")
	    public void click_on_continue_button_and_skipFlexi() throws Throwable {
	    	booking =new BookingPage(driver);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	
	    	booking.continueBtn.click();
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		      wait.until(ExpectedConditions.visibilityOf(booking.skipFlexi));
	    	booking.skipFlexi.click();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
	        
	    }
	    
	    @And("User clicks on continue button on search flight page")
	    public void user_clicks_on_continue_button_on_search_flight_page() throws Throwable {
	    	booking =new BookingPage(driver);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    	booking.closeInfoForInfantCharges.click();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	
	    	booking.continueBtn.click();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    	
	        
	    }
	    
	    
	    @And("User provides passengers and infant details")
	    public void user_provides_passengers_and_infant_details() throws Throwable {
	    	booking =new BookingPage(driver);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	Thread.sleep(3000);
	    	booking.verifyPaxPage();
	    	booking.singlePassengerDetailswithoutmr("Avinash", "Yadav");
	    	
	        
	    }
	    
	    //singleInfantDetailswithData   
	    
	    
	    @And("User provides infant passengers {string} {string} and {string}")
	    public void user_provides_infant_passengers_something_and_something(String title1,String firstname1, String lastname1) throws Throwable {
	    	
	    	booking.singleInfantDetailswithData(title1, firstname1, lastname1);
	    	booking.contPassagenerDetails.click();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    }
    	
    	
    	
    	  @And("User provides passenger details")
  	    public void user_provides_passenger_details() throws Throwable {
  	    	booking =new BookingPage(driver);
  	    	booking.singlePassengerDetailswithoutmr("Avinash", "Yadav");
  	    	booking.contPassagenerDetails.click();
  	        
  	    }
	    
//	    @And("User provides both adult passengers details")
//	    public void user_provides_both_passenger_details() throws Throwable {
////	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
////	    	wait.until(ExpectedConditions.elementToBeClickable(booking.travelingToggleBtn));
//////	    	booking.travelingToggleBtn.click();
//	    	Thread.sleep(2000);
//	    	booking.verifyPaxPage();
//	    	booking.singlePassengerDetails("avinash", "yadav");
//	    	booking.addadult2("John", "wick");
//	        booking.scrollToText("TOTAL FARE");
//	    	booking.contPassagenerDetails.click();
//	    }
	    @And("User provides first adult passengers {string} {string} and {string}")
	    public void user_provides_first_adult_passengers_something_and_something(String title1,String firstname1, String lastname1) throws Throwable {
	    	Thread.sleep(2000);
	    	booking.verifyPaxPage();
	    	booking.singlePassengerDetails(title1,firstname1, lastname1);
	    }
		
		 @And("User provides second adult passengers {string} {string} and {string}")
	    public void user_provides_second_adult_passengers_first2_and_last2(String title2 ,String firstname2, String lastname2) throws Throwable {
			 booking.addadult2(title2,firstname2, lastname2);
		        booking.scrollToText("TOTAL FARE");
		    	booking.contPassagenerDetails.click();
	    }
	    
	    
	    @And("User Enter Unaccompanied Minor details {string} {string} {string}")
	    public void user_enter_unaccompanied_minor_details(String title1,String name,String lname) throws Throwable {
	    	booking =new BookingPage(driver);
	    	
	    	booking.minorDetails(title1,name,lname);
	    	booking.contPassagenerDetails.click();
	        
	    }
	    
	    
	    @And("User provides passenger details for student {string} {string} {string} {string} {string}")
	    public void user_provides_passenger_details_for_student(String title1,String name,String lname,String studentid,String collageName) throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.studentDetails(title1,name,lname,studentid,collageName);
	    	booking.contPassagenerDetails.click();
	        
	    }
	    
	    @And("User provides passenger details for Family & Friends")
	    public void user_provides_passenger_details_for_family() throws Throwable {
	    	booking =new BookingPage(driver);
	    	Thread.sleep(2000);
	    	booking.verifyPaxPage();
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(80));
	    	wait.until(ExpectedConditions.elementToBeClickable(booking.travelingToggleBtn));
	    	booking.travelingToggleBtn.click();
	    	booking.addPassenger2("Mr","John", "Smith");
	    	booking.addPassenger3("Mrs","Nancy", "Blunt");
	    	booking.addPassenger4("Mr","Jolly", "Wick");
	        booking.scrollToText("TOTAL FARE");
	    	booking.contPassagenerDetails.click();
	        
	    }


	    @And("User fills the passenger details")
	    public void user_fills_the_passenger_details() throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.fillPassengerDetailsByToggle();
	    	booking.contPassagenerDetails.click();
	        
	    }
	    
	    @And("User verifies add-ons included in flexi plus fare")
	    public void user_verifies_addons_included_in_flexi_plus_fare() throws Throwable {
	    	booking =new BookingPage(driver);
	    	String textmsg = booking.addOnsIncludedinText.getText();
	        assertEquals(textmsg,"Included in Flexi plus fare");
 
	    }
	    
	    @And("User verifies add-ons included in Super 6E fare")
	    public void user_verifies_addons_included_in_Super6e_fare() throws Throwable {
	    	booking =new BookingPage(driver);
	    	String textmsg = booking.addOnsIncludedinText.getText();
	        assertEquals(textmsg,"Meal Included in 6E Exclusive");
 
	    }
	    
	    
	    @And("User Add a snack and continue")
	    public void user_Add_a_snack_and_continue() throws Throwable {
	    	booking =new BookingPage(driver);
	    	Roundtrip= new RoundTripPage(driver);
	    	booking.add6eTiffin.click();
	    	booking.BtnMoreMeal.click();
			Roundtrip.clickOnAddFood();
			Roundtrip.selectallPassanger();
			Roundtrip.clickOnRefreshmnetcontinueBtn();
	    	booking.BtnDoneMeal.click();
	    	
	  //      booking.scrollToText("TOTAL fare");
	        booking.addOnsContinuebtn2.click();
	    	
	        
	    }
	    
	    @And("User Add a snack and continue for family")
	    public void user_Add_a_snack_and_continue_for_family() throws Throwable {
	    	booking =new BookingPage(driver);
	    	Roundtrip= new RoundTripPage(driver);
	    	booking.add6eTiffin.click();
	    	booking.BtnMoreMeal.click();
			Roundtrip.clickOnAddFood();
			Roundtrip.selectallPassanger();
			Roundtrip.clickOnRefreshmnetcontinueBtn();
	    	booking.BtnDoneMeal.click();
	    	
	  //      booking.scrollToText("TOTAL fare");
	        booking.addOnsContinuebtn2.click();
	    	
	        
	    }
	    
	    @And("User Add a snack for Super 6e and continue")
	    public void user_Add_a_snack_for_super_and_continue() throws Throwable {
	    	booking =new BookingPage(driver);
	    	Roundtrip=new RoundTripPage(driver);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    	booking.firstEditBtn6eTiffin.click();
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	    	wait.until(ExpectedConditions.elementToBeClickable(booking.BtnMoreMeal));
	    	booking.BtnMoreMeal.click();
			Roundtrip.clickOnAddFood();
			Roundtrip.clickOnRefreshmnetcontinueBtn();
			Roundtrip.clickOnDonemeal();
			Roundtrip.clickOnContinueBtn6Eaddon();
			
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			Thread.sleep(3000);
			Roundtrip.clickOnNoButton();
			Thread.sleep(2000);
		
	    }
	    
	    
	    
	    
	    @And("User skips Addons and Insurance and seat selection")
	    public void user_skip_addons_and_insurance_and_seat_selection() throws Throwable {
	    	booking =new BookingPage(driver);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
			 wait.until(ExpectedConditions.visibilityOf(booking.skip));
	    	booking.skip.click();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	booking.skipInsuarance.click();
	    	 WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(30));
		    wait2.until(ExpectedConditions.visibilityOf(booking.skip));
	    	booking.skip.click();
 
	    }
	 
	    @And("User skips Addons and Insurance")
	    public void user_skip_addons_and_insurance() throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.skip.click();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	booking.skipInsuarance.click();

 
	    }
	    
	    @And("User skips Insurance")
	    public void user_skips_insurance() throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.skipInsuarance.click();

 
	    }
	    
	    
	    @And("User skips seat selection")
	    public void user_skips_seat_selection() throws Throwable {
	    	booking =new BookingPage(driver);
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(booking.skip));
	    	booking.skip.click();
 
	    }
	    
	    
	    @Then("verify user is on payment page")
	    public void user_is_on_payment_page() throws Throwable {
	    	booking =new BookingPage(driver);
	    	String paytitle = booking.paymentTitle.getAttribute("text");
	    	assertEquals(paytitle,"Payment ");
	    	payment =new PaymentPage(driver);
	    	payment.CheckTerms();
	    }
	    

	}
