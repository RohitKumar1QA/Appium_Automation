package testApp;

import java.time.Duration;



import testBase.AndroidBaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.AddonPage;
import pageObjects.android.BookingModificationPage;
import pageObjects.android.BookingPage;


public class Addons extends AndroidBaseTest {
	AddonPage addon;
	BookingPage booking;
	BookingModificationPage bookingmodification;
	public Addons(){ 
		super();
		ConfigureAppium();
	}
	
	@Given("Launch the app and lOgin")
    public void launc_the_app()throws Throwable {
     login();  
        
    }
	

	@And("user click on BookFlight")
	public void user_click_on_bookflight()throws Throwable {

		addon=new AddonPage(driver);
		addon.ClickOnbookFlight();  
	}
	
//	@When("user select {string} and {string} cities")
//	public void user_selects_and_cities(String string, String string2)throws InterruptedException {
//		//hread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//		addon=new AddonPage(driver);
//	    addon.fromsearchCity(); 
//	    addon.ToSearchcity();
//	}
	
	@When("user select {string} and {string} cities")
	public void user_selects_and_cities(String from, String To)throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		addon=new AddonPage(driver);
	    addon.fromsearchCity(from); 
	    addon.ToSearchcity(To);
	}
	
	@And("user select future Date")
	public void user_select_future_Dates()throws InterruptedException {
//		addon=new AddonPage(driver);
//	   addon.SelectFutureDates();
		booking =new BookingPage(driver);
    	booking.departureDate.click();
    	booking.selectFutureDatePayment();
    	booking.doneBtn.click();
	}
	
	
	@Given("user adds an Adult passenger from passenger list")
	public void user_select_and_searched_flight_for_adult_passangers()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonpassanger(); 
	    addon.clickondonepassanger();
	     
	}


	


	@And("enter {string} and {string} of Passanger")
	public void enter_and_of_Passanger(String firstname, String lastname)throws Throwable {
	    addon = new AddonPage(driver);
	     addon.Enterdetails(firstname,lastname);
	}
	
	@And("enter {string} and {string} of seniorCitizen")
	public void enter_and_of_seniorCitizen(String firstname, String lastname)throws Throwable {
	    addon = new AddonPage(driver);
	     addon.EnterSeniorctzndetails(firstname,lastname);
	}
	
	@And("enter {string} and {string} of second Passanger")
	public void enter_and_of_second_Passanger(String P2firstname, String P2lastname)throws Throwable {
	    addon = new AddonPage(driver);
	     addon.EntersecondPsngrdetails(P2firstname,P2lastname);
	}
	
	@And("enter {string} and {string} of third Passanger")
	public void enter_and_of_third_Passanger(String P3firstname, String P3lastname)throws Throwable {
	    addon = new AddonPage(driver);
	     addon.EnterthirdPsngrdetails(P3firstname,P3lastname);
	}
	
	@And("enter {string} and {string} of fourth Passanger")
	public void enter_and_of_fourth_Passanger(String P4firstname, String P4lastname)throws Throwable {
	    addon = new AddonPage(driver);
	     addon.EnterfourthPsngrdetails(P4firstname,P4lastname);
	}
	
	@And("enter studentid {string} of students")
	public void enter_and_of_students(String StudentId )throws Throwable {
	    addon = new AddonPage(driver);
	     addon.enterstudentid(StudentId);
	}
	
	@And("enter collegename {string} of students")
	public void enter_of_students( String Collegename )throws Throwable {
	    addon = new AddonPage(driver);
	   addon.entercollegename(Collegename);  
	}  
	
	@And("select gender of Child")
	public void select_gender_of_Child()throws Throwable {
	    addon = new AddonPage(driver);
	     addon.SelectGender();
	}
	
	@And("select gender of infant")
	public void select_gender_of_infant()throws Throwable {
	    addon = new AddonPage(driver);
	     addon.SelectGender();
	}
	
	@And("select gender of passanger")
	public void select_gender_passanger()throws Throwable {
	    addon = new AddonPage(driver);
	     addon.SelectGenderForUnacompaniedminor();
	}
	
	@And("enter {string} and {string} of Child")
	public void enter_and_of_Child(String firstname, String lastname)throws Throwable {
	    addon = new AddonPage(driver);
	     addon.Enterdetails(firstname,lastname);
	}
	
	@And("enter {string} and {string} of infant")
	public void enter_and_of_infant(String firstname, String lastname)throws Throwable {
	    addon = new AddonPage(driver);
	     addon.Enterdetails(firstname,lastname);
	}
	
	@And("select date of birth")
	public void select_date_of_birth()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickOnDob(); 
	}

	@And("done after DOB")
	public void done_after_DOB()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonDoneDob(); 
	}
	
	@And("enter seniorcitizenID {string}")
	public void enter_seniorcitizenID(String SeniorCitizenID)throws Throwable {
	     addon = new AddonPage(driver);
	     addon.EnterSeniorCitizenId(SeniorCitizenID);
	}
	
	@And("select title of passanger")
	public void select_title_of_passanger()throws Throwable {
	    addon = new AddonPage(driver);
	     addon.choosetitle();
	}
	
	@And("enter {string} and {string} and {string} of Passanger")
	public void enter_and_of_guest_user(String firstname, String lastname, String MillitaryId)throws Throwable {
	     addon = new AddonPage(driver);
	     addon.Enterdetailsmilllitaryid(firstname,lastname,MillitaryId);
	}

	@And("Continue with Passanger details")
	public void continue_with_passanger_details()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickOnContinuewithPassangerDeatails();
	     
	}

	@And("user select Six E Prime addon")
	public void user_select_Six_E_Prime_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonsixEprimeAddon();    
	}

	@And("user select free meal")
	public void user_select_free_meal()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonSixetiffin();    
	}

	
	@And("verify six e prime page")
	public void verify_six_e_prime_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.verifySixeprimepage();
	     
	}

	@And("check the checkbox for selected flight")
	public void user_continue_with_six_e_prime_addon_and_confirm_it()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickcheckbox();
	     
	}

	
	
	@And("click on the Add6EPrime button")
	public void click_on_the_Add6EPrime_button()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonaddsixprimebutton();
	     
	}
	
	@And("verify 6E Tiffin page")
	public void verify_6E_Tiffin_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.Verifysixetifinpage();
	     
	}
	
	@And("select meal for passanger")
	public void select_meal_for_passanger()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonmealbutton();
	     
	}
	
	@And("select veg meal type")
	public void select_veg_meal_type()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonaddveg();
	     
	}
	
	@And("select nonveg meal type")
	public void select_nonveg_meal_type()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonaddNonveg();
	     
	}
	
	@And("select meal for all passanger")
	public void select_meal_for_all_passanger()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickomealForallcheckbox();    
	}
	
	@And("click on confirm meal button")
	public void click_on_confirm_meal_button()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonconfirmMealbutton();    
	}
	
	
	@And("click on the continue")
	public void click_on_the_continue()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickoncontinue();
	     
	}
	
	
	
	@And("click on done button")
	public void click_on_add_6e_tiffin()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickondonebutton();
	     
	}
	
	@And("verify meal is free")
	public void verify_meal_is_free()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.VerifyMealisFreewithprime();
	     
	}
	
	@And("verify fast forward is free")
	public void verify_fast_forward_is_free()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.VerifyFastForwardfreewithPrime();
	     
	}
	
	@And("user continue with SixE Prime addon")
	public void user_continue_with_SixE_Prime_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();
	     
	}
	
	@And("user continue with flexi fare")
	public void user_continue_with_flexi_fare()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();
	     
	}
	
	@And("skip with six sixE tiffin")
	public void skip_with_six_sixE_tiffin()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.skipwithselectedaddon();
	     
	}
	
	@And("verify paid seat is free")
	public void verify_paid_seat_is_free()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();
	     
	}
	
	@And("confirm with addon")
	public void confirm_with_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonconfirmaddon();
	     
	}
	
	@And("user select XL Seat")
	public void user_select_XL_Seat()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonSeatselect();
	     
	}
	
	@And("verify get fifty percent on XL seat")
	public void verify_get_fifty_percent_on_XL_seat()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.VerifySeatdiscount();
	     
	}
	
	@And("user proceed for payment")
	public void user_proceed_for_payment()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonPaymentforXlseat();
	     
	}
	
	
	@Then("user select Seat")
	public void user_select_seat()throws Throwable {
	    addon = new AddonPage(driver);
	     
	}

	@Then("user see payment page and done it")
	public void user_see_payment_page_and_done_it()throws Throwable {
	    addon = new AddonPage(driver);
	     
	}

	@Given("user adds a Senior Citizen passenger from passenger list")
	public void user_adds_a_Senior_Citizen_passenger_from_passenger_list()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.SelectSeniorCitizen();
	     
	}

	@And("user select 6E Seat & Eat Prime addon")
	public void user_select_six_e_seat_and_eat_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickSixseatandeataddon(); 
	}

	@And("verify six 6E Seat and Eat page")
	public void verify_six_6E_Seat_and_Eat_page()throws Throwable {
	    addon = new AddonPage(driver);
	     addon.VerifySeatandeat();
	}
	
	@And("click on the Add Combo button")
	public void click_on_the_Add_Combo_button()throws Throwable {
	    addon = new AddonPage(driver);
	     addon.clickonaddcombo();
	}
	
	@And("continue with 6E Tiffin addon")
	public void continue_with_6E_Tiffin_addon_and_confirm_it()throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();  
	}

	@Then("User continue with SixE Seat and Eat addon and confirm it")
	public void user_continue_with_six_e_seat_and_eat_addon_and_confirm_it()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon_sixEprime_sixEseat();
	     
	}

	@Given("User select and searched flight for Children and Addults Passangers")
	public void user_select_and_searched_flight_for_children_and_addults_passangers()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.SelectChildren();
	    addon.clickOnSearchedFlight();
	     
	}



	@Then("User continue with Add Fast Forward and click on not Interested")
	public void user_continue_with_add_fast_forward_and_click_on_not_interested()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();
	     
	}

	
	@Then("User continue with Excess_baggage_addon click on not Interested")
	public void user_continue_with_add_Excess_baggage_addon_and_click_on_not_interested()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();
	     
	}
	
	@Then("User continue with SportEquipment_addon click on not Interested")
	public void user_continue_with_SportEquipment_addon_and_click_on_not_interested()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();
	     
	}
	
	@Then("User continue with Travel_Assistance_addon click on not Interested")
	public void user_continue_with_Travel_Assistance_addon_and_click_on_not_interested()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();     
	}
	
	
	
	


	@Given("user adds a registered user")
	public void user_adds_a_registerd_user()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonpassanger();
	    addon.clickondonepassanger();
	}
	
	@Given("user adds a child from passenger list")
	public void user_adds_a_child_from_passenger_list()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.SelectChildren();
	}
	
	@Given("user adds a infant from passenger list")
	public void user_adds_a_infant_from_passenger_list()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.SelectInfants();
	}
	
//	@Given("user adds an Students from special fare options")
//	public void user_adds_an_Students_from_special_fare_options()throws Throwable {
//		booking =new BookingPage(driver);
//    	booking.selectSpecialfareOption("Students");
//	    
//	}
	
	 @And("user adds an {string} from special fare options")
	    public void user_selects_any_specialfare(String fareOption) throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.selectSpecialfareOption(fareOption);
	         
	    }

	
	@Given("user adds a family and friends from special fare options")
	public void user_adds_a_family_and_friends_from_special_fare_options()throws Throwable {
	    addon = new AddonPage(driver);
	    
	}
	
	
	@And("user clicks on the search flight button")
	public void user_clicks_on_the_search_flight_button()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonsearchflightbutton();
	}
	
	@And("user select flexi plus fare")
	public void user_select_flexi_plus_fare()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickFlexiplusfare();
	}

	@And("close infant notification")
	public void close_infant_notification()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonInfantPopup();
	}
	
	@And("check the searched flight")
	public void check_the_searched_flight()throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    addon = new AddonPage(driver);
	    addon.checksearchedflight();
	     
	}

	
	
	@And("click on continue button")
	public void click_on_continue_button()throws Throwable {
	    addon = new AddonPage(driver);
	    Thread.sleep(3000);
//	    addon.clickoncontinuebutton();
	}
	
	@And("skip the upgrade flexi fare")
	public void skip_the_upgrade_flexi_fare()throws Throwable {
	    addon = new AddonPage(driver);
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    addon.Clickonskipbutton();
	}
	
	@When("user verify Passanger details page")
	public void user_verify_Passanger_details_page()throws Throwable {
	    addon = new AddonPage(driver);
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    addon.Verifypassangerpage();
	}
	
	@And("enter registerd user  details")
	public void  enter_registerd_user_details()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickontogglebutton();
	}
	
	@And("click on continue details")
	public void  click_on_continue()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickOnContinuewithPassangerDeatails();
	}
	

	@Then("visit and verify Six E Addons page")
	public void visit_and_verify_Six_E_Addons_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.VerifieAddOnPage();
	}
	
	@And("verify meal is free with flexi plus")
	public void verify_meal_is_free_with_flexi_plus()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.VerifyMealfreewithflexifare();
	}
	
	@And("select indigo promise addon")
	public void select_indigo_promise_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonaddIndigopromise();
	}
	
	@And("verify indigo promise page")
	public void verify_indigo_promise_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.VerifyindigopromisePage();
	}
	
	@And("add a Indigo promise")
	public void add_a_Indigo_promise()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.AddIndigopromise();
	}
	
	@And("select Lounge addon")
	public void select_Lounge_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.Clickonloungeaddon();
	}
	
	@And("verify lounge page")
	public void verify_lounge_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.VerifyLoungePage();
	}
	
	@And("check the checkbox for passanger")
	public void check_the_checkbox_for_passanger()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.SelectCheckboxforlounge();
	}
	
	@And("click on the done button of lounge")
	public void click_on_the_done_button_of_lounge()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.Clickdonebuttonforlounge();
	}
	
	@And("continue lounge addon")
	public void  continue_lounge_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();
	}
	
	@And("select travel assistance addon")
	public void  select_travel_assistance_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonTravelAssitanceAddon();
	}
	
	@And("verify travel assistance page")
	public void  verify_travel_assistance_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.verifyAddTravelAssistance();
	}
	
	@And("select date of birth of student")
	public void  select_date_of_birth_of_student()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.Clickonselectstudentdob();
	}
	
	@And("click on agree terms and conditions")
	public void  click_on_agree_terms_and_conditions()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickontremsAndcoditions();
	}
	
	@And("add travel assistance addon")
	public void  add_travel_assistance_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.Clickonaddtravelassitance();
	}
	
	@And("continue travel assistance addon")
	public void  continue_travel_assistance_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();
	}
	
	@And("select Six E quick board addon")
	public void select_Six_E_quick_board_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonSixEQuickBoardAddon();
	}
	
	@And("verify six e quick board page")
	public void verify_six_e_quick_board_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.verifySixEQuickBoard();
	}
	
	@And("click on the Add6E qick board button")
	public void click_on_the_Add6E_qick_board_button()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonaddsixEQuickBoard();
	}
	
	@And("continue with SixE quick board addon")
	public void continue_with_SixE_quick_board_addon()throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();  
	}
	
	@And("select Excess Baggage addon")
	public void select_Excess_Baggage_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonExcessBaggageaddon();
	}
	
	@And("verify Excess Baggage page")
	public void verify_Excess_Baggage_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.VerifyExcessBaggagepage();
	}
	
	@And("add a weight of bag")
	public void add_a_weight_of_bag()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonaddWeightofBag();
	} 
	
	@And("click on the done button")
	public void click_on_the_done_button()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonDonebaggage();
	}
	
	@And("continue with Excess baggage")
	public void continue_with_Excess_baggage()throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();  
	}
	
	@And("skip the excess baggage")
	public void skip_the_excess_baggage()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.skipwithselectedaddon();
	}
	
	@And("select Fast Forward  addon")
	public void  select_Fast_Forward_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ClickonFastForwardaddon();
	}
	
	@And("verify six Fast Forward page")
	public void verify_six_Fast_Forward_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.Verifyfastforwarpage();
	}
	
	@And("click on the Add Fast Forward button")
	public void click_on_the_Add_Fast_Forward_button()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.Clickonaddfastforwardbutton();
	}
	
	@And("continue with Fast Forward")
	public void continue_with_Fast_Forward()throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();  
	}
	
	@And("select sports equipment  addon")
	public void  select_sports_equipment_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonSportsEquipmentAddon();
	}
	
	@And("verify sports equipment page")
	public void  verify_sports_equipment_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.verifyandAddSportsEquipment();
	    
	}
	
	@And("add a bagkit")
	public void  add_a_bagkit()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.addsportkit();
	}
	
	@And("click the done button")
	public void  click_the_done_button()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickondonesportkit();
	}
	
	@And("continue with sports equipment")
	public void  continue_with_sports_equipment()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();
	}
	
	@And("skip the sports eqipment")
	public void  skip_the_sports_eqipment()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.skipwithselectedaddon();
	}
	
	
	@And("user skip Seat selection page")
	public void  user_skip_Seat_selection_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.skipseatselection();
	    //Thread.sleep(20000);
	}
	
	@And("user completes payment using UPI {string}")
	public void user_completes_payment_using_UPI( String UPI )throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    addon = new AddonPage(driver);
	   addon.EnterupiBamkid(UPI);  
	}
	@And("user completes payment using Credit Card")
	public void user_completes_payment_using_Credit_Card()throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		bookingmodification=new BookingModificationPage(driver); 
		   bookingmodification.SelectCreditCard();
		   }
	
	@And("enter valid credentials {string} and {string} and {string} and {string} of Credit Card")
	public void enter_valid_credentials_and_and_and_of_credit_card(String cardnumber, String valdate, String cvv, String cardname)throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.EnterValidcredentialsofCC(cardnumber,valdate,cvv,cardname);  
	}
	
	@And("user accept terms and click pay")
	public void user_accept_terms_and_click_pay()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.AccepttermsAndpay();   
	}
	
	@And("user click on confirm Payment")
	public void user_click_on_confirm_Payment()throws Throwable {
		 bookingmodification=new BookingModificationPage(driver); 
		 bookingmodification.Clickonproceedpayment();
	}
	
	@And("user click on back to merchent page")
	public void user_click_on_back_to_merchent_page()throws Throwable {
	   bookingmodification=new BookingModificationPage(driver); 
	   bookingmodification.ClickonbacktoMerchent();
	}
	
	
	
	
	
	
	
	@And("booked ticket is confirmed")
	public void  booked_ticket_is_confirmed()throws Throwable {
	    addon = new AddonPage(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    addon.VerifyTicketBooking();
	}
	
	
	

	@Given("user select as guest login")
	public void user_select_as_guest_login()throws Throwable {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     addon = new AddonPage(driver);
	     addon.guestlogin();
	     addon.Clickonallowbutton();
	}
	
	@Given("user adds an armed forces from special fare options")
	public void user_adds_an_armed_forces_from_special_fare_options()throws Throwable {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     addon = new AddonPage(driver);
	     addon.ClickonArmedforce();
	}
	
	@Given("user adds an Unaccompanied manner from special fare options")
	public void user_adds_an_Unaccompanied_manner_from_special_fare_options()throws Throwable {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     addon = new AddonPage(driver);
	     
	}
	
	
	@Given("click on bookflight")
	public void click_on_bookflight()throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    addon = new AddonPage(driver);
	    addon.Clickonbookflight();
	}

	@And("slect title of guest user")
	public void slect_title_of_guest_user()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.choosetitle();
	     
	}

	@And("enter {string} and {string} of  guest user")
	public void enter_and_of_guest_user(String firstname,String lastname)throws Throwable {
	     addon = new AddonPage(driver);
	     addon.Enterdetails(firstname,lastname);
	}
	
	@And("enter {string}")
	public void enter_mob_no_of_guest(String monumber)throws Throwable {
	     addon = new AddonPage(driver);
	     addon.Entermobnumber(monumber);
	}
	
	@And("enter a {string}")
	public void enter_emailid_of_guest(String EmailID)throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    addon = new AddonPage(driver);
	     addon.Enteremailid(EmailID);
	}
	
	@And("select delayed and lost baggage addon")
	public void select_delayed_and_lost_baggage_addon()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickondelayedlostbaggaeaddon();    
	}
	
	@And("verify delayed and lost baggage page")
	public void verify_delayed_and_lost_baggage_page()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.verifyandAddDelayedAndlostBaggaeaddon();    
	}
	
	@And("click on checkbox")
	public void click_on_checkbox()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickoncheckboxofterms();    
	}
	
	@And("click on add to trip")
	public void click_on_add_to_trip()throws Throwable {
	    addon = new AddonPage(driver);
	    addon.clickonaddtotrip();    
	}
	
	@And("continue with delayed and lost baggage")
	public void continue_with_delayed_and_lost_baggage()throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    addon = new AddonPage(driver);
	    addon.ContinueWithAddon();  
	}
	
	@And("skip travel assistance")
	public void skip_travel_assistance()throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    addon = new AddonPage(driver);
	    addon.skipwithselectedaddon();   
	}
}
