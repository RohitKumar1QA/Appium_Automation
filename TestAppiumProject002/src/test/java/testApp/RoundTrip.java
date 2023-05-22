package testApp;

import java.time.Duration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.BookingPage;
import pageObjects.android.RoundTripPage;
import testBase.AndroidBaseTest;

public class RoundTrip extends AndroidBaseTest {
	
	RoundTripPage Roundtrip;
	BookingPage booking;
	public RoundTrip(){
		super();
		ConfigureAppium(); 
	}
	@Given("Launch the app and Login")
    public void launc_the_app() throws Throwable {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
     login();  
        
    }
	
	@Given("user is on homepage")
	public void user_is_on_homepage() throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	   
	      
	}

	@Given("user click on bookflight")
	public void user_click_on_bookflight() throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    Roundtrip.clickOnbookFlight();  
	}

	@Given("user select roundtrip option")
	public void user_select_roundtrip_option() throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    Roundtrip.clickOnroundTripBtn();
	}

	@When("user selects {string} and {string} cities")
	public void user_selects_and_cities(String From, String To) throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    Roundtrip.FromsearchCity(From); 
	    Roundtrip.toSearchcity(To);
	}


	@When("user select passenger option")
	public void user_select_passenger_option() throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    Roundtrip.clickOnPassanger();
	    Roundtrip.donepassangerlist();
	      
	}

	

	@Then("user click on Searchflight")
	public void user_click_on_searchflight() throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    Roundtrip.clickOnSearchFlight();
	      
	}
	
	@Given("user is on flight serached result page")
	public void user_is_flight_serached_result_page() throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    Roundtrip.VerifyRoundTripPage1();
	      
	}
	
	@Given("user click on continue button")
	public void user_click_on_continue_button() throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    Roundtrip.clickoncontinuePage1();
	      
	}
	
	
    
	
	

	@Given("user can see searched results for RoundTrip")
	public void user_can_see_searched_results_for_round_trip() throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    Roundtrip.Verifysearchedflight();
	      
	}
	
	@And("user click on continue with return flight")
	public void user_click_on_continue_with_return_flight() throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    Roundtrip.clickOnselectFlight2();
	      
	}

	

	

	

	@When("user click on skip button")
	public void user_click_on_skip_button()throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    Roundtrip.ClickonUpgradeFlexiskipbutton();   
	}
	@Then("user is on add passenger details page")
	public void user_is_on_add_passenger_details_page()throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    Roundtrip.Verifypassangerpage();      
	}
	
	@Given("user fill {string} and {string} the Passenger Details Forms")
	public void user_fill_the_passenger_details_form(String firstname, String lastname) throws Throwable {
	    Roundtrip=new RoundTripPage(driver);
	    Roundtrip.fillPassengerDetails(firstname,lastname);
	}
	
	@And("user click on continue button with step1")
	public void user_click_on_continue_button_with_step1()throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickOnContinueStep1();
	}
	
	@And("user click on skip button at step 2")
	public void user_click_on_skip_button_at_step_2() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickOnSkipForStep2();
		
	}

	@Given("user click on No button on travel assitance page")
	public void user_click_on_no_button_on_travel_assitance_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
	    Roundtrip.clickOnNoButton();
	}

	@Then("user is on seat selection page")
	public void user_is_on_seat_selection_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toVerifyseatpage();
	}

	@Then("user skip the select seat page")
	public void user_skip_the_select_seat_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.ClickonSkipBtnseatpage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	   
	}
	
	@Then("user select a seat")
	public void user_select_a_seat() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		
		
	   
	}


	@Then("user make a payment using upi {string}")
	public void user_is_on_payment_page(String upi) throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.paymentprocessbyUPI(upi);		
	}
	
	@And("verify confirm ticket")
	public void verify_confirm_ticket() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Roundtrip.verifyCompleteticket();
		
	}
	
//	Then user make a payment using upi
//    And verify confirm ticket
	
	// When user select military id
	
	@Given("user click on Armed force")
	public void user_click_on_armed_force() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
	    Roundtrip.clickOnArmedForce();
	}
	
	@Then("user is on searched Flightpage with armedforce fare")
	public void user_is_on_searched_flightpage_with_armedforce_fare() throws Throwable  {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.VerifyRoundTripArmedforceFare();
	   
	}

	@Given("user fill the military Id")
	public void user_fill_the_military_id() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
	    Roundtrip.fillMilitaryId();
	}
	
	@Given("user fills the military Id {string}")
	public void user_fills_the_military_id(String id) throws Throwable {
		Roundtrip=new RoundTripPage(driver);
	    Roundtrip.fillsMilitaryId(id);
	}

	
	
	//For Round trip 4th scenrio Super 6E with armed force 
	
	@Then("user select Super 6E for first flight")
	public void user_select_super_6e_for_first_flight() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toselectSuper6Efair();
	   
	}

	@Then("user contnue with first flight")
	public void user_contnue_with_first_flight() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toselctFlightbtn1();
	    
	}

	@Then("user select Super 6E for second flight")
	public void user_select_super_6e_for_second_flight() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toselectSuper6Efair();
	}

	@Then("user is on 6E addOn page")
	public void user_is_on_6e_add_on_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toverifyAddonPage();
	   
	}
	
	@Then("user clickon skip Btn at addon page")
	public void user_clickon_skip_Btn_at_addon_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickOnaddonSkipVtn();
		
	}

	@Then("User click on Select snack now for first flight")
	public void user_click_on_select_snack_now_for_first_flight() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		
		Roundtrip.clickonselectSnack();
	   
	}
	

	@Then("user click on Done Meal")
	public void user_click_on_done_meal() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Roundtrip.ClickonDoneselectMeal();
	   
	}

	@Then("user click on continue button for 6E addon page")
	public void user_click_on_continue_button_for_6e_addon_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Roundtrip.ClickonAddOncontinueBtn();
	
	
	}

	@Then("user is on Travel Assistance Page")
	public void user_is_on_travel_assistance_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toverifyTravelassistant();
	}

	@Then("user click on not intrested Btn")
	public void user_click_on_not_intrested_btn() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.ClickOnnotintrestedBtn();
	   
	}
	@Then("user is on step3 page")
	public void user_is_on_step3_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toVerifyseatpage();
	    
	}

	@Then("user select free seat for first flight")
	public void user_select_free_seat_for_first_flight() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
	    Roundtrip.toChooseSeat();
	}

	@Then("user copy seat to second flight")
	public void user_copy_seat_to_second_flight() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.Tocopyseatflight2();
	    
	}

	@Then("user continue to payment page")
	public void user_continue_to_payment_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickonContinuepaymentbtnstep3();
	    
	}
	
	
	// For make a booking on with Family & friends 
	
	@When("user click on Family & Friends {string}")
	public void user_click_on_family_friends(String family) throws Throwable {
		Roundtrip=new RoundTripPage(driver);
//		Roundtrip.clickOnFamilyAndFriends();
		booking=new BookingPage(driver);
		booking.selectSpecialfareOption(family);
	   
	}

	@Then("user is on flight serached result page with Family and friends fare")
	public void user_is_on_flight_serached_result_page_with_family_and_friends_fare() throws Throwable{
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.verifyFamilyfare();
		
	    
	}

	@Then("user fill first user details {string} and {string}")
	public void user_fill_first_user_details(String firstname, String lastname) throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.firstPassDetails(firstname,lastname);
	   
	}
	
	@And("user select title of Passanger")
	public void user_select_title_of_Passanger() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.TitleMr.click();
		
	}

	@Then("user fill 2nd user Details {string} and {string}")
	public void user_fill_2nd_user_details(String firstname, String lastname) throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.secondPassDeatails(firstname,lastname);
	}

	@Then("user fill 3rd user details {string} and {string}")
	public void user_fill_3rd_user_details(String firstname,String lastname) throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.thirdPassDeatails(firstname,lastname);
		
	   
	}

	@Then("user fill 4th user details {string} and {string}")
	public void user_fill_4th_user_details(String firstname,String lastname) throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.fourthPassDeatails(firstname,lastname);
	    
	}


	@And("user click on step1 continue  button")
	public void user_click_on_step1_continue_button() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toClickOnStep1ContinueButton();
		
	}
	
	//To Verify a RoundTrip booking with Flexi plus
	
	@Then("user select flexi plus fare for first flight")
	public void user_select_flexi_plus_fare_for_first_flight() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   Roundtrip.clickOnfirstflexiFare();
	}

	@Then("user select flexi fare for return flight")
	public void user_select_flexi_fare_for_return_flight() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
	    Roundtrip.clickOnSecondFlexifare();
	}

	@Then("user add 6E tiffin")
	public void user_add_6e_tiffin() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickOn6EtiffinaddBtn();
	   
	}
	
	@Then("user select second Flight Box")
	public void user_select_second_flight_box() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickOnsecondFlightBox();
	}

	@Then("user click on passenger arrow btn")
	public void user_click_on_passenger_arrow_btn() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickOnPassArrowBtn();
		
	}

	@Then("user add the food on refreshment page")
	public void user_add_the_food_on_refreshment_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickOnAddFood();
	   
	}
	


	@Then("user click on continue btn at refreshment page")
	public void user_click_on_continue_btn_at_refreshment_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickOnRefreshmnetcontinueBtn();
	    
	}

	@Then("user click on done Button at tiffin page")
	public void user_click_on_done_button_at_tiffin_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickOnDonemeal();
	}

	@Then("user click on continue at step 2 page")
	public void user_click_on_continue_at_step_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickOnContinueBtn6Eaddon();
	    
	}

	@Then("user click on Ok Button at Seat page")
	public void user_click_on_ok_button_at_seat_page() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.clickOnOkBtnstep3();
	   
	}
	
	@Then("user verify the invalid fare")
	public void user_verify_the_invalid_fare() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toVerifyInvalidfare();
		
	}
	
	@And("user select date for travel")
	public void user_select_date_for_travel() throws Throwable {
		Roundtrip=new RoundTripPage(driver);
		Roundtrip.toChooseTravelDate();
		
	}
	

	

}
