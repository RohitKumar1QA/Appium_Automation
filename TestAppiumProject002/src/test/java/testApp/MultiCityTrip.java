package testApp;

import java.time.Duration;

import dev.failsafe.internal.util.Durations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.BookingPage;
import pageObjects.android.MultiCityTripPage;
import pageObjects.android.RoundTripPage;
import testBase.AndroidBaseTest;

public class MultiCityTrip extends AndroidBaseTest{
	
	MultiCityTripPage Multicity;
	BookingPage booking;
	RoundTripPage Roundtrip;
	public MultiCityTrip () {
		super(); 
		ConfigureAppium();
		}
	
	@Given("Launch the App and Login")
	public void Launch_the_App_and_Login() throws Throwable {
		login();
		
	}
	
	
	@Given("user is on Home page")
	public void user_is_on_home_page() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	      
	   
	}
	
	@Given("user click on Bookflight")
	public void user_click_on_Bookflight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Multicity.clickOnBookFlight();
		
		
	}
	
	
	
	@Given("user click on MultiCity option")
	public void user_click_on_multi_city_option() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOnMultiCity();
	   
	}
	
	

	@When("user click on Popup cross btn")
	public void user_click_on_popup_cross_btn()throws Throwable {
		Multicity= new MultiCityTripPage(driver);
	    Multicity.clickOnPopup();
	}

	@When("user select first {string} city")
	public void user_select_first_city(String from)throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickonFirstToCity(from);
	}
	
	

    @When("user select second {string} city")
    public void user_select_second_city(String secondfrom)throws Throwable {
    	Multicity.clickOnSecondFromCity(secondfrom);
    
   }

    @When("user click on city search cross btn")
    public void user_click_on_city_search_cross_btn() throws Throwable {
    	Multicity.clickOnsearchCloseBtn2();
   
   }

   @When("user click on second {string} city")
   public void user_click_on_second_city(String secondto)throws Throwable {
	   Multicity.clickOnSecondToCity(secondto);
    
   }




	@When("user search a flight")
	public void user_search_a_flight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.ClickonSearchFlight();
	}

	@When("user search a flights")
	public void user_search_a_flights() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.ClickonSearchFlights();
	}
	
	@Then("user verify Searched flight page")
	public void user_verify_searcched_flight_page()throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.verifyMultiTripPage1();
	   
	}
	
	

	@When("user select first To city")
	public void user_select_first_to_city(String from) throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickonFirstToCity(from);
	   
	}

	@When("user select Date for first flight")
	public void user_select_date_for_first_flight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.fisrtDepartureDate.click();
		Multicity.MulticityFirstDeparturedate();
		Multicity.donedate.click();
		
	   
	}
	
	@When("user select back Date for first flight")
	public void user_select_back_Date_for_first_flight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.fisrtDepartureDate.click();
		Multicity.SelectBackdate();
		Multicity.donedate.click();
		
	   
	}
	

	@When("user select on second from city")
	public void user_second_on_second_from_city() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOnSecondFromCity();
	    
	}

	@Then("user click on second to city")
	public void user_click_on_second_to_city() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOnSecondToCity();
	    
	}

	@Then("user select date for second flight")
	public void user_select_date_for_second_flight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.SeconddepartureDate.click();
		Multicity.MulticitySecondDeparturedate();
		Multicity.donedate.click();
	}
	
	@And("user scroll up to special fare")
	public void user_scroll_up_to_special_fare() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.ScrollUptoSpecialFare();	
	}
	

	@Then("user continue with first flight")
	public void user_continue_with_first_flight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOnContinue1();
	    
	}

	@Then("user is on second flight page")
	public void user_is_on_second_flight_page() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toVerify2ndFlightpage();
	    
	}

	@Then("user click on modify search flight")
	public void user_click_on_modify_search_flight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOnModifySearchBtn();
	   
	}

	@Then("user is on multicity Home page")
	public void user_is_on_multicity_home_page() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.verifyMultiCityHomepage();
	    
	}
	
	
	
	
	// 
	
	@And("user click on Armed Force")
	public void user_click_on_Armed_Force() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickonArmedForce();

		
		
	}
	
	@Then("user verify result page with armedforce fare")
	public void user_verify_result_page_with_armedforce_fare() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.verifyMulticityArmedforceFare();
	  
	}

	@Then("user click on continue button with first flight")
	public void user_click_on_continue_button_with_first_flight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOnContinue1();
	   
	}

	@Then("user can see searched results for MultiCity")
	public void user_can_see_searched_results_for_multi_city() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.verifyMultiCitysearchedflight();
	    
	}

	@Then("user click on continue with second flight")
	public void user_click_on_continue_with_second_flight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickonContinue2();
	   
	}

	@Then("user is on step1 add passenger details page")
	public void user_is_on_step1_add_passenger_details_page() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toVerifyAddpassangerpage();
	}

	@Then("user fill {string} and {string} the Passenger Details Form")
	public void user_fill_the_passenger_details_form(String firstname, String lastname) throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.forFilldetails(firstname,lastname);
	    
	}

	@Then("user fill the Military id {string} in form")
	public void user_fill_the_military_in_form(String id) throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.enterMilitaryID(id);
	    
	}

	@Then("user click on step1 continue button")
	public void user_click_on_step1_continue_button() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOnStep1Continue();
	    
	}



	@Then("user click on step 2 skip button")
	public void user_click_on_step_skip_button() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOnStep2SkipBtn();
	    
	}

	@Then("user click on Not Intrested button on travel assitance page")
	public void user_click_on_not_intrested_button_on_travel_assitance_page() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOnNotIntrestedbtn();
	    
	}

	

	@Then("user skip step 3 select seat page")
	public void user_skip_step_select_seat_page() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.ClickonStep3SkipBtn();
	   
	}

	@Then("user click on continue on payment with upi {string}")
	public void user_click_on_continue_on_payment_with_upi(String upi) throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.paymentprocessbyUPI(upi);
	    
	}

	@Then("user is verified payment completed")
	public void user_is_verified_payment_completed() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toVerifyCompleteticket();
	    
	}

	@Then("user select super 6E fare to First Flight")
	public void user_select_super_6e_fare_to_first_flight() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toselectSuper6Efair();
	    
	    
	}

	@Then("user select super 6E fare to Second Flight")
	public void user_select_super_6e_fare_to_second_flight() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toselectSuper6Efair();
	    
	}

	@Then("user click on step2 6E tiffin")
	public void user_click_on_step2_6e_tiffin() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.select6EtiffinAddBtn();
	    
	    
	}

	@Then("user click on 6Etiffin done button")
	public void user_click_on_6etiffin_done_button() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toselect6EdoneBtn();
	    
	    
	}

	@Then("user click on Step2 Addon continue Btn")
	public void user_click_on_step2_addon_continue_btn() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toselectcontinue6Etiffin();
	    
	    
	}

	@Then("user is on step 3 page")
	public void user_is_on_step3_page() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toVerifystep3M();
	    
	    
	}
	

	@Then("user select free seat for First Flight")
	public void user_select_free_seat_for_first_flight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toChooseSeatM();
		
	}

	@Then("user copy seat to Second Flight")
	public void user_copy_seat_to_second_flight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.Tocopyseatflight2M();
		
	    
	}

	@Then("user continue to Payment Page")
	public void user_continue_to_payment_page() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickonContinuepaymentbtnstep3M();
		
	    
	}
	

	
	
	//Make a booking with special fares Family & Friends and Flexi Plus fare option
	
	@And("user select a {string} from special fare options")
	public void user_select_family_and_friends_special_fare(String familyfare) throws Throwable {
		booking =new BookingPage(driver);
    	booking.selectSpecialfareOption(familyfare);
		//for method
	
	    
	    
	}

	@Then("user is on searched result page with Family fare")
	public void user_is_on_searched_result_page_with_family_fare() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
	    
	    
	}

	@Then("user select flexi fare for first flight")
	public void user_select_flexi_fare_for_first_flight() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toSelectfirstflexiFare();
		
		
	    
	    
	}

	@Then("user select flexi fare for second city")
	public void user_select_flexi_fare_for_second_city() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toSelectSecondFlexifare();
	    
	    
	}

	@Then("user Fills details for first Passenger")
	public void user_fills_details_for_first_passenger() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.tofill1stPassdetails();
	    
	}

	@Then("user fill {string} and {string} the Second Passenger Details Form")
	public void user_fills_details_for_second_passenger(String firsname,String lastname) throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.tofill2ndPassdetails(firsname,lastname);
	    
	   //user fill {string} and {string} the Passenger Details Form 
	}

	@Then("user fill {string} and {string} the Third Passenger Details Form")
	public void user_fills_details_for_third_passenger(String firstname, String lastname) throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.tofill3rdPassdetails(firstname,lastname);
	    
	    
	}

	@Then("user fill {string} and {string} the Fourth Passenger Details Form")
	public void user_fills_details_for_fourth_passenger(String firstname, String lastname) throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.tofill4thPassdetails(firstname,lastname);
	    
	    
	}

	@Then("user is on 6E add-ons page")
	public void user_is_on_6e_add_ons_page() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Thread.sleep(3000);
	    
	    
	}

	@Then("user click on 6E tiffin")
	public void user_click_on_6e_tiffin() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toSelctaddBtn6Etiffinflexi();
	    
	    
	}

	@Then("user click first passenger arrow button")
	public void user_click_first_passenger_arrow_button() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toSelectfirstpassMoreBtn();
	    
	}

	@Then("user add food combo")
	public void user_add_food_combo() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toSelectfirstFlightcombomealadd();
	}

	@Then("user select this for all passanger")
	public void user_select_this_for_all_passanger() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toClickcheckBoxtoallpass();
	    
	}

	@Then("user click on confirm Button")
	public void user_click_on_confirm_button() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toClickonconfirmBtnforfood();
	    
	}

	@Then("user click on continue after confirm")
	public void user_click_on_continue_after_confirm() throws Throwable  {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOnContinueBtnAfterconfirm();
	    
	    
	}

	@Then("user selct second flight box")
	public void user_selct_second_flight_box() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.toSelectsecondFlightContainer();
	   
	}

	@Then("user click on done button after choose food of both flight")
	public void user_click_on_done_button_after_choose_food_of_both_flight() throws Throwable  {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOnDoneMealafterboth();
	    
	}

	@Then("user click on continue with Addon")
	public void user_click_on_continue_with_addon() throws Throwable {
		Multicity= new MultiCityTripPage(driver);
		Multicity.clickOncontinueAfterdoneMeal();
	   
	}

	
	
	

}
