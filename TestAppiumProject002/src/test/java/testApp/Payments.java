package testApp;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import java.util.NoSuchElementException;

//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.AddonPage;
import pageObjects.android.BookingPage;
import pageObjects.android.PaymentPage;
//import testBase.AndroidActions;
import testBase.AndroidBaseTest;

public class Payments extends AndroidBaseTest{
	
	BookingPage booking ;
	PaymentPage payment;
	AddonPage addon;
	public Payments(){
		super(); 
		ConfigureAppium();
	}

	    @Given("User logs into the application")
	     public void user_is_logged_in() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	        login();
	     
	    }
    
	 @Given("User is on Book flight page")
	    public void user_on_book_flight_page() throws Throwable {
		
		 
//		 booking =new BookingPage(driver);
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
//		 wait.until(ExpectedConditions.elementToBeClickable(booking.bookFlightImgBtn));
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		 booking.bookFlightImgBtn.click();
		 Thread.sleep(2000);
			addon=new AddonPage(driver);
			addon.ClickOnbookFlight();  
		
	        
	    }
	

	    @When("User Select {string} and {string} cities")
	    public void user_selects__and__cities(String to, String from)throws Throwable {
	    	 booking =new BookingPage(driver);
//	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		    wait.until(ExpectedConditions.visibilityOf(booking.fromCityOption));
//	    	 booking.fromCityOption.click();
//	    	 booking.fromCity.sendKeys(from);
//	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    	 booking.selectSearchedCity.click();
//	    	 booking.closeSearch.click();
//	    	 booking.toDestiCityOption.click();
//	    	 booking.searchCityDest.sendKeys(to);
//	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    	 booking.selectSearchedCity.click();
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
	    

	    
	    
	

	    @And("User select a Departure date")
	    public void user_selects_departure_date() throws Throwable {
	    	
	    	booking =new BookingPage(driver);
	    	booking.departureDate.click();
//	    	booking.selectFutureDate();
	    	booking.selectFutureDatePayment();
	    	
	    }

	    @And("User select a Departure date in future")
	    public void user_selects_departure_date_with_72hrs_infuture() throws Throwable {
	    	
	    	booking =new BookingPage(driver);
	    	booking.departureDate.click();
	    	booking.selectFutureDatePayment();
	    	
	    }
	    @And("User click on Done button")
	    public void user_clicks_on_done_button() throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.doneBtn.click();
	    	
	       
	    }
	    @And("User enter details for passenger")
	    public void user_enter_details_for_passenger() throws Throwable {
	    	booking =new BookingPage(driver);
	    	Thread.sleep(10000);
	    	addon = new AddonPage(driver);
	    	booking.verifyPaxPage();
	    	addon.ChooseMr.click();
	    	addon.Firstname.sendKeys("admin");
	    	addon.Lastname.sendKeys("admin");
//	    	booking.togglebutton.click();
//	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//	    	wait.until(ExpectedConditions.elementToBeClickable(booking.travelingToggleBtn));
//	    	try {
//	    		booking.fillPassengerDetailsByToggle();
//	    		
//	    	}catch (NoSuchElementException e) {
//	    		booking.togglebutton.click();
//			}catch (StaleElementReferenceException e) {
//				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(120));
//		    	wait2.until(ExpectedConditions.elementSelectionStateToBe(booking.travelingToggleBtn,false));
//		    	
//				booking.togglebutton.click();
//			}
	 
//	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    	wait.until(ExpectedConditions.elementToBeClickable(booking.contPassagenerDetails));
	    	//booking.contPassagenerDetails.click();
	    	booking.contntinueWithPassanger();
	    	
	    	
	       
	    }
	    

	    @And("User Selects a special fair")
	    public void user_selects_specialfair() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	payment.selectUnacompaniedMinor("Unaccompanied Minor");
	        
	    }
	    
	

	
	    @Then("User click on search flight")
	    public void user_clicks_on_search_flight() throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.searchFlightBtn.click();
	    	
	    }
	    

	    
	    @And("User click on continue button")
	    public void user_clicks_on_continue_button() throws Throwable {
	    	booking =new BookingPage(driver);
	    	try {
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
			wait.until(ExpectedConditions.elementToBeClickable(booking.continueBtn));
	    	booking.continueBtn.click();
	    	}
	    	catch (NoSuchElementException e) {
	    		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
				wait.until(ExpectedConditions.elementToBeClickable(booking.continueBtn));
		    	booking.continueBtn.click();
			}
	    	
	        
	    }
	    
	    
	    @And("User skips flexi upgrade option")
	    public void user_skips_flexi_upgrade_option() throws Throwable {
	    	booking =new BookingPage(driver);
	    	
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(booking.skipFlexi));
	    	booking.skipFlexi.click();
	    	Thread.sleep(5000);
	        
	    }
	    
	    @And("User clicks on continue button and SkipFlexi")
	    public void user_clicks_on_continue_button_and_skipFlexi() throws Throwable {
	    	booking =new BookingPage(driver);
	    	booking.continueBtn.click();
	    	booking.skipFlexi.click();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
	        
	    }
	    

//	    
//	    
//	    @And("User enter unaccompanied minor details")
//	    public void user_enter_unaccompanied_minor_details() throws Throwable {
//	    	booking =new BookingPage(driver);
//	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	    	booking.minorDetails("Keanu", "Reaves");
//	    	booking.contPassagenerDetails.click();
//	        
//	    }
//	    

	    

	 
	    @And("User skips addons and insurance")
	    public void user_skips_addon_and_insurance() throws Throwable {
	    	booking =new BookingPage(driver);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	Thread.sleep(5000);
	    	booking.skip.click();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	Thread.sleep(5000);
	    	booking.skipInsuarance.click();
	    	Thread.sleep(5000);
//	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    	try {
//	    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//	    		wait.until(ExpectedConditions.elementToBeClickable(addon.skipseatselection));
//	    		  addon = new AddonPage(driver);
//	    		    addon.skipseatselection();
//	    	}catch (StaleElementReferenceException e) {
//	    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
//	    		wait.until(ExpectedConditions.elementSelectionStateToBe(addon.skipseatselection,false));
//	    		    addon.skipseatselection();
//			}
	


 
	    }
	    

	    
	    //=================== Payment Option ===================
	    
	    
	    @Then("User is on Payment Page")
	    public void user_is_on_payment_page() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
			    wait.until(ExpectedConditions.visibilityOf(payment.paymentTitle));
	    	String paytitle = payment.paymentTitle.getText();
	    	assertEquals(paytitle,"Payment ");
	    	payment.CheckTerms();
	    }
	    
	    @Then("User navigate to Payment Page")
	    public void user_navigate_to_payment_page() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
			    wait.until(ExpectedConditions.visibilityOf(payment.paymentTitle));
	    	String paytitle = payment.paymentTitle.getText();
	    	assertEquals(paytitle,"Payment ");
	    	
	    }
	    // UPI
	    
	   
	
	    @And("User select payment method UPI")
	    public void user_select_payment_method_upi() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	payment.selectUPI.click();
	    }
	    
	    @And("User select payment method Credit Card")
	    public void user_select_payment_method_credit() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	payment.selectCreditCard.click();
	    }
	    @And("User select payment method Debit Card")
	    public void user_select_payment_method_dredit() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	payment.selectDebitCard.click();
	    }
	    @And("User select payment method 6E Rewards")
	    public void user_select_payment_method_6erewards() throws Throwable {
	    	payment =new PaymentPage(driver);
//	    	payment.ScrollToSixE();
	    	payment.select6ERewards.click();
	    }

	    @And("User enter {string} Virtual Payment Address")
	    public void user_enter_something_virtual_payment_address(String vpa) throws Throwable {
	    	payment =new PaymentPage(driver);
            
	    	payment.editVPA.sendKeys(vpa);
	        
	    }
	    
	    //select Hold and Pay
	    @And("User click on hold and pay option")
	    public void user_click_on_hold_and_pay_options() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	payment.selectHoldAndPay.click();
	        
	    }
	    @And("User click on Hold button")
	    public void user_click_on_Hold_button() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	payment.holdButton.click();
	        
	    }
	    
	    @Then("User verify ticket confirmation")
	    public void user_verify_ticket_confirmation() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	    	String confirmationmsg = payment.holdAndPayConfirmationText.getAttribute("text");
	    	assertEquals(confirmationmsg, "Your Booking has been put on hold!");
	    }
	  
	    //card payments
	    
	    @And("User enters card number {string}")
	    public void user_enters_card_number_something(String cardnumber) throws Throwable {
	    	
	    	payment =new PaymentPage(driver);
	    	payment.creditdebitcardNumber.sendKeys(cardnumber);
	    }

	    @And("User enters expiry date {string}")
	    public void user_enters_expiry_date_something(String expirydate) throws Throwable {
	     	payment =new PaymentPage(driver);
	     	payment.expiryDate.sendKeys(expirydate);
	    }

	    @And("User enters cvv number {string}")
	    public void user_enters_cvv_number_something(String cvv) throws Throwable {
	     	payment =new PaymentPage(driver);
	     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     	try {
	     	payment.cvvNumber.sendKeys(cvv);
	     	}
	     	catch (NoSuchElementException e) {
	     		payment.cvvNumber.sendKeys(cvv);
			}
	    }

	    @And("User enters fullname {string}")
	    public void user_enters_fullname_something(String fullname) throws Throwable {
	     	payment =new PaymentPage(driver);
	     	payment.fullName.sendKeys(fullname);
	    }

	    @And("User agrees to terms and conditions")
	    public void user_agrees_to_terms_and_conditions() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	payment.checkTerms.click();
	    }
	    @And("User click on pay button")
	    public void user_click_on_pay_button() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	payment.payBtn.click();
	    }
	    
	    
	    @And("User proceed to complete the payment")
	    public void upi_payment_is_successful() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(payment.contPaymnetBtn));
	    	payment.contPaymnetBtn.click();
	    
	    }
	    @And("Payment initiated continue")
	    public void payment_initiated_continue() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(payment.contPaymnetBtn));
	    	payment.contPaymnetBtn.click();
	    
	    }
	   

	    @And("Ticket is confirmed")
	    public void ticket_is_confirmed() throws Throwable {
	    	payment =new PaymentPage(driver);
	    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
			 wait.until(ExpectedConditions.visibilityOf(payment.paymentConfirmationText));
	    	String confirmation = payment.paymentConfirmationText.getText();
	    	assertEquals(confirmation,"Ticket Confirmed");
	    	
	        
	    }
	    
	   //Debit card
	    @And("User select search and select a {string}")
	    public void user_select_search_and_select_a_bank(String bank) throws Throwable {
	       payment =new PaymentPage(driver);
	       payment.debitbankselect.click();
	       payment.debitbankserch.sendKeys(bank);
	       payment.debitsearchedbank.click();
	       
	    }

	    @And("User enters debit card number {string}")
	    public void user_enters_debit_card_number_something(String cardnumber) throws Throwable {
	       payment =new PaymentPage(driver);
	       payment.debitcardNumber.sendKeys(cardnumber);
	    }

	    @And("User enters debit expiry date {string}")
	    public void user_enters_debit_expiry_date_something(String expirydate) throws Throwable {
	       payment =new PaymentPage(driver);
	       payment.debitexpiryDate.sendKeys(expirydate);
	    }

	    @And("User enters debit cvv number {string}")
	    public void user_enters_debit_cvv_number_something(String cvv) throws Throwable {
	       payment =new PaymentPage(driver);
	       payment.debitcvvNumber.sendKeys(cvv);
	    }

	    @And("User enters debit fullname {string}")
	    public void user_enters_debit_fullname_something(String fullname) throws Throwable {
	       payment =new PaymentPage(driver);
	       payment.debitfullName.sendKeys(fullname);
	    }

	    
	    
	    //netbanking
	    
	    @And("User select payment method Net Banking")
	    public void user_select_payment_method_net_banking() throws Throwable {
	       payment =new PaymentPage(driver);
	       payment.selectNetBanking.click();
	    }

	    @And("User selects a bank form displayed option")
	    public void user_selects_a_bank_form_displayed_option() throws Throwable {
	       payment =new PaymentPage(driver);
	       payment.netSelectStateBankofIndia.click();
	    }
	    
	    //Wallet
	    @And("User select payment method Wallet")
	    public void user_select_payment_method_wallet() throws Throwable {
	        payment =new PaymentPage(driver);
	        payment.selectWallet.click();
	        
	    }

	    @And("User select a Wallet {string} from displayed option")
	    public void user_select_a_wallet_from_displayed_option(String walletName) throws Throwable {
	        payment =new PaymentPage(driver);
	        payment.selectWalletname(walletName);
	    }

	    @And("User enters mobile {string}")
	    public void user_enters_mobile_something(String mobilenumber) throws Throwable {
	        payment =new PaymentPage(driver);
	        payment.enterWalletMobileNumber.sendKeys(mobilenumber);
	    }
	    
	    

	    @And("User click on other bank option")
	    public void user_click_on_other() throws Throwable {
	        payment =new PaymentPage(driver);
	        payment.otherBanks.click();
	    }
	    
	    @And("User select test bank for net banking")
	    public void user_select_test_bank_for_net_banking() throws Throwable {
	        payment =new PaymentPage(driver);
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(payment.selectTestBank));
	        payment.selectTestBank.click();
	    }
	    
	    

	    
	    

	}
