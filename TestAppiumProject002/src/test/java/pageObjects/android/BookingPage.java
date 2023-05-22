package pageObjects.android;

import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testBase.AndroidActions;

public class BookingPage extends AndroidActions{
	
	  public AndroidDriver driver; 

		public BookingPage(AndroidDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		@AndroidFindBy(xpath ="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/iv_tab_icon'])[1]")
		public WebElement bookFlight;
		
		@AndroidFindBy(xpath ="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")
		public WebElement trybookFlight2;
		

		@AndroidFindBy(xpath ="//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]")
		public WebElement bookFlightlogo;
		
		
		@AndroidFindBy(xpath ="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/iv_tab_icon'])[1]")
		public WebElement bookFlightImgBtn;
		
		
		
		//to and from
		//from old
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/ll_from")
		public WebElement fromCityOption;
		
		//from new  
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/tv_from_desti")
		public WebElement fromCityOption2;
		@AndroidFindBy(id="in.goindigo.android.debug:id/edit_search_city_from")
		public WebElement fromCity;
		//Delhi(DEL)
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/tv_to_desti")
		public WebElement toDestiCityOption;
		@AndroidFindBy(id="in.goindigo.android.debug:id/edit_search_city")
		public WebElement searchCityDest;
		//Mumbai(BOM)
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_city_title")
		public WebElement selectSearchedCity;
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/image_search_close")
		public WebElement closeSearch;
		
		@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView")
		public WebElement closeSearch2;
		
		
	
		
		//currency option
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_flight_currency")
		public WebElement currencyOption;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/edit_search_currency")
		public WebElement searchCurrency;
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_currency")
		public WebElement searchedCurrency;
		
		
		//Dates
		@AndroidFindBy(id="in.goindigo.android.debug:id/tv_departure_date")
		public WebElement departureDate;
		
		
		//skip flexi
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/appCompatButton")
		public WebElement skipFlexi;
		
		// SelectFlexiPlusfareOption
		@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_flex'])[1]")
		public WebElement SelectFlexiPlusfareOption;
		
		
		//select saver option
		@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
		public WebElement SelectSaverfareOption1;
		
		@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
		public WebElement SelectSaverfareOption2;
		
		public void selectSaverFareOption() {
			
			try {
				SelectSaverfareOption2.click();
			}catch (NoSuchElementException e) {
				SelectSaverfareOption1.click();
			}
			
		}
		
		
		
		
		//select super 6e fare option
		

		
		@AndroidFindBy(xpath ="(//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_super'])[1]")
		public WebElement SelectSuper6eOption2;
		
		@AndroidFindBy(xpath ="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[3]")
		public WebElement SelectSuper6eOption;
		
		
		
		
//		@AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
//		public WebElement monthOneDates;
//		
		
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/tv_return_date")
		public WebElement returnDate;
		
		@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.TextView[5]")
		public WebElement selectDate;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/buttonSaveTrip")
		public WebElement doneBtn;
		
		//passengers
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/linear_select_passenger")
		public WebElement passengers;
		@AndroidFindBy(id="in.goindigo.android.debug:id/image_add_infant")
		public WebElement addInfant;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_infant_count")
		public WebElement infantCount;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/image_add_children")
		public WebElement addChild;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_children_count")
		public WebElement ChildCount;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/image_add_adult")
		public WebElement addAdults;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/button_select_passenger_done")
		public WebElement donePassanger;
		
		//special fare scrolling 
		@AndroidFindBy(id="in.goindigo.android.debug:id/rv_book_flight_special_fare")
		public WebElement scrollfares;
		//special fare
		
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[4]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.TextView")
		public WebElement speacialFareOption;
		
		
		@AndroidFindBy(xpath="//android.widget.FrameLayout[3]/android.widget.TextView[@text='Unaccompanied Minor']")
		public WebElement unaccompaniedMinorfare;
		@AndroidFindBy(xpath="//android.widget.FrameLayout[3]/android.widget.TextView[@text='Students']")
		public WebElement studentsfareOption1;
		@AndroidFindBy(xpath="(//*[@resource-id='in.goindigo.android.debug:id/tv_special_fare'])[2]")
		public WebElement studentsfareOption;
		@AndroidFindBy(xpath="(//*[@resource-id='in.goindigo.android.debug:id/tv_special_fare'])[1]")
		public WebElement familyfareOption;
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Family & Friends']")
		public WebElement friendsAndFamilyfareOption;
		
	   
		@AndroidFindBy(id ="in.goindigo.android.debug:id/rlSubmitBtn")
		public WebElement searchFlightBtn;
		
		@AndroidFindBy(id ="in.goindigo.android.debug:id/txv_psngr_count")
		public WebElement paxCount;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/img_close")
		public WebElement closeInfoForInfantCharges;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/txv_from")
		public WebElement fromCityonSearchResult;
		@AndroidFindBy(id="in.goindigo.android.debug:id/txv_to")
		public WebElement toCityonSearchResult;
		
		
		// modify search
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/txv_modify_search")
		public WebElement modifySearch;
		
		
		
		//continue
		
		@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.goindigo.android.debug:id/button5']")
		public WebElement continueBtn;
		
		//Passenger details

		@AndroidFindBy(id="in.goindigo.android.debug:id/radio_mr")
        public WebElement radio_mr;

        @AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[1]")
        public WebElement firstName;
        @AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[2]")
        public WebElement lastName;
        @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
        public WebElement dob;
		
		
		//infant details
		

        
        @AndroidFindBy(id="in.goindigo.android.debug:id/radio_male")
        public WebElement infantGender;
        
        @AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[1]")
        public WebElement infantfirstName;
        @AndroidFindBy(xpath ="(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[2]")
        public WebElement infantlastName;
        @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/edit_dob']")
        public WebElement infantdob;

        //student details
        @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
        public WebElement studentiId;
        @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
        public WebElement collagename;
		//Date
        
        @AndroidFindBy(id="in.goindigo.android.debug:id/dayPicker_layout_date")
		public WebElement days;
        @AndroidFindBy(id="in.goindigo.android.debug:id/monthPicker_layout_date")
		public WebElement months;
        @AndroidFindBy(id="in.goindigo.android.debug:id/yearPicker_layout_date")
		public WebElement years;
		@AndroidFindBy(id="in.goindigo.android.debug:id/btnDone")
		public WebElement dateDoneBtn;
		
		 @AndroidFindBy(id="in.goindigo.android.debug:id/header_view_sub_title")
			public WebElement paxPageValidation;
		 
		
		 public void verifyPaxPage() {
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));	
			 String paxtext = paxPageValidation.getAttribute("text");
			 assertEquals(paxtext, "Add Passenger Details");
		 }
		
		//passenger details continue button
		@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
		public WebElement contPassagenerDetails;
		
		
		
		
		public void contntinueWithPassanger() 
		{
			scrollToText("Continue");
			contPassagenerDetails.click();
		}
		
		//skip options
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Skip']")
		public WebElement skip;
		
		//skip insurance
		@AndroidFindBy(id = "in.goindigo.android.debug:id/text_do_not_secure_trip")
		public WebElement skipInsuarance;
		
		
		
	
		//I am traveling switch
		@AndroidFindBy(id="in.goindigo.android.debug:id/switch_travelling")
		public WebElement travelingToggleBtn;
		@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.goindigo.android.debug:id/switch_travelling']")
		public WebElement togglebutton;
		
		
		//add on included in flexi plus text
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/tv_flexi_text")
		public WebElement addOnsIncludedinText;
		
		
		//Add 6Etiffin
		
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.Button")
		public WebElement add6eTiffin;
		
		
		//6Etiffin more option
		@AndroidFindBy(id="in.goindigo.android.debug:id/iv_more")
		public WebElement BtnMoreMeal;
		
		
		//Add 6Etiffin Done button
		@AndroidFindBy(id="in.goindigo.android.debug:id/btn_done_meal")
		public WebElement BtnDoneMeal;
		
		
		//Add 6Etiffin Edit button
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]")
		public WebElement firstEditBtn6eTiffin;
		
		
		//Addons continue button
		@AndroidFindBy(id="in.goindigo.android.debug:id/btn_continue")
		public WebElement addOnsContinueBtn;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue']")
		public WebElement addOnsContinuebtn2;
		
    
    	
    	@AndroidFindBy(xpath = "//android.widget.TextView[@text='+ ADD'])[1]")
		public WebElement addanItem;
    	
    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='+  Add']")
		public WebElement addanItem2;
    	
		@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
		public WebElement addOnsContinueBtn2;
		
		//payment title
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_payment_title")
		public WebElement paymentTitle;
		
		//seat elements
		@AndroidFindBy(id="in.goindigo.android.debug:id/btn_ok")
		public WebElement Seatokbtn;
		
		@AndroidFindBy(id="in.goindigo.android.debug:id/txv_change_flight ")
		public WebElement SeatContbtn;
		
		//seat selection method first col only
		public void performSeatSelection() {
			List<WebElement> ele = driver.findElements(By.xpath("//android.widget.FrameLayout[1]/android.widget.TextView"));
		     
		     for(WebElement e:ele) {
		         if(e.getText().equals("₹") && !e.equals(ele.get(0))) {
		             e.click();
		             break;
		         }
		     }
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		     Seatokbtn.click();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    SeatContbtn.click();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
		
		public void selectFutureDate() {
			
			
			try {
				List<WebElement> ele = driver.findElements(By.xpath("//android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));

				

				for(WebElement e:ele) {
					
					 Date date = new Date();
				      SimpleDateFormat formatter = new SimpleDateFormat("d");
				      
				       String str = formatter.format(date);
				       int todayis =Integer.parseInt(str);
				       todayis = todayis+2;
				       
				      
				       
				       String setDate = Integer.toString(todayis);
				       
			
					if(e.getText().equals(setDate)){
						e.click();
						break;
					}}
			}catch(Throwable e) {
					
					driver.findElement(By.xpath("(//android.widget.TextView[@text='4'])[2]")).click();
				}
			
			
			}
		
		
		public void  selectFutureDatePayment() {
			
			
			try {
				List<WebElement> ele = driver.findElements(By.xpath("//android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));
					
				
				 Date date = new Date();
			      SimpleDateFormat formatter = new SimpleDateFormat("d");
			       String str = formatter.format(date);
			       int todayis =Integer.parseInt(str);
			       todayis = todayis+4;
			       String setDate = Integer.toString(todayis);
			    if(todayis <= 26) {
				for(WebElement e:ele) {
					
//				    	System.out.println("*****************checking if");
				    	if(e.getText().equals(setDate)){
							e.click();
							break;
						}
				    	
				    }
					
									
				}else {
					
					
//					System.out.println("*****************checking else");
				List<WebElement> ele2 = driver.findElements(By.xpath("//android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));
					
					for(WebElement x2:ele2) {
						if(!"1".equals(x2.getText()) && !"2".equals(x2.getText())) {
							System.out.println(x2.getText());
							x2.click();
							break;
						}
					}
				}
	
			}catch(NoSuchElementException e) {
//				System.out.println("*****************checking catch");
				List<WebElement> ele2 = driver.findElements(By.xpath("//android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));
				
				for(WebElement x2:ele2) {
					if(!"1".equals(x2.getText()) || !"2".equals(x2.getText())) {
						System.out.println(x2.getText());
						x2.click();
						break;
					}
				}
				
					
				
				}
			
			
			}
		
		
		
		public void selectStudentsSpecialFare() throws InterruptedException {
			
			int x=scrollfares.getLocation().getX();
			int y=scrollfares.getLocation().getY();
			leftScrollco(driver, x+400, y, x-1900, y);	
			studentsfareOption.click();
		
			
		}
		
		
		public void selectSpecialfareOption(String option) throws InterruptedException {	
			List<WebElement> ele  = driver.findElements(By.xpath("//android.widget.LinearLayout[4]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.TextView"));
	
			for(WebElement e:ele) {

				if(option.equals("Unaccompanied Minor")) {
					
					if(e.getAttribute("text").equals("Doctors & Nurses") || e.getAttribute("text").equals("Armed Forces")) {
						
						int x=e.getLocation().getX();
						int y=e.getLocation().getY();
						leftScrollco(driver, x+20, y, x-1800, y);	
						unaccompaniedMinorfare.click();
						
						break;
					}	
				}
				else if(option.equals("Doctors & Nurses")) {
					
					if(e.getAttribute("text").equals("Doctors & Nurses")) {
							
						e.click();
						break;
					}	
				}
				else if(option.equals("Armed Forces")) {
					
					if(e.getAttribute("text").equals("Armed Forces")) {
						
						e.click();
						break;
					}	
				}
				else if(option.equals("Students")) {
					
					if(e.getAttribute("text").equals("Doctors & Nurses") || e.getAttribute("text").equals("Armed Forces")) {
						
						int x=e.getLocation().getX();
						int y=e.getLocation().getY();
						leftScrollco(driver, x+20, y, x-1800, y);	
						studentsfareOption.click();
						break;
					}	
				}
				else if(option.equals("Family & Friends")) {
					
					if(e.getAttribute("text").equals("Doctors & Nurses") || e.getAttribute("text").equals("Armed Forces")) {
						
						
						int x=e.getLocation().getX();
						int y=e.getLocation().getY();
						leftScrollco(driver, x+20, y, x-1500, y);	
						
						WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
						wait.until(ExpectedConditions.elementToBeClickable(friendsAndFamilyfareOption));
						friendsAndFamilyfareOption.click();
						break;
					}	
				}

			}
			
			
			
		}	
		
		

	
	public void selectDOB(String day,String month,String year) {

		days.sendKeys(day);
		months.sendKeys(month);
		years.sendKeys(year);
		dateDoneBtn.click();
		

	}
	
	public void singlePassengerDetailswithoutmr(String name,String lname) {
		
		radio_mr.click();
	    
		firstName.sendKeys(name);
		
		lastName.sendKeys(lname);
		
	
		
	}
	public void singlePassengerDetails(String title1,String name,String lname) {
		

		try {
			if(title1.equalsIgnoreCase("Mr")) {
				driver.findElement(By.id("in.goindigo.android.debug:id/radio_mr")).click();
				
			}else if(title1.equalsIgnoreCase("Mrs")) {
				driver.findElement(By.id("in.goindigo.android.debug:id/radio_mrs")).click();
				
			}else if(title1.equalsIgnoreCase("Ms")){
				driver.findElement(By.id("in.goindigo.android.debug:id/radio_ms")).click();
			}
		}catch (Exception e) {
			System.out.println("Wrong title, Please make sure title is either mr or ms or mrs");
		}
		
	    
		firstName.sendKeys(name);
		
		lastName.sendKeys(lname);
		
	
		
	}
	public void singleInfantDetails(String name,String lname) {
		
		scrollToText("Infant travelling with you");
		infantGender.click();
		infantfirstName.sendKeys(name);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		infantlastName.sendKeys(lname);
		infantdob.click();
		dateDoneBtn.click();
		scrollToText("TOTAL FARE");
		
	}
	
    public void singleInfantDetailswithData(String title1,String name,String lname) {
		
		scrollToText("Infant travelling with you");
		
		try {
			if(title1.equalsIgnoreCase("male")) {
				driver.findElement(By.id("in.goindigo.android.debug:id/radio_male")).click();
				
			}else if(title1.equalsIgnoreCase("female")) {
				driver.findElement(By.id("in.goindigo.android.debug:id/radio_female")).click();
				
			}
		}catch (Exception e) {
			System.out.println("Wrong title for the infant, Please choose male or female"+e);
		}
		
		
		infantfirstName.sendKeys(name);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		infantlastName.sendKeys(lname);
		infantdob.click();
		dateDoneBtn.click();
		scrollToText("TOTAL FARE");
		
	}
	
	
	
	public void minorDetails(String title1,String name,String lname) throws InterruptedException {
           Thread.sleep(2000);
           verifyPaxPage();
		try {
			if(title1.equalsIgnoreCase("male")) {
				driver.findElement(By.id("in.goindigo.android.debug:id/radio_male")).click();
				
			}else if(title1.equalsIgnoreCase("female")) {
				driver.findElement(By.id("in.goindigo.android.debug:id/radio_female")).click();
				
			}
		}catch (Exception e) {
			System.out.println("Wrong title for the infant, Please choose male or female"+e);
		}
		
		infantfirstName.sendKeys(name);
		infantlastName.sendKeys(lname);
		infantdob.click();
		dateDoneBtn.click();

		scrollToText("TOTAL FARE");
		
	}
	
	public void fillPassengerDetailsByToggle() {
		verifyPaxPage();
		travelingToggleBtn.click();
		scrollToText("TOTAL FARE");
		
	}
	

	public void studentDetails(String title1,String name,String lname,String studentid,String collageName) throws InterruptedException {
		verifyPaxPage();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOf(firstName));
		if(title1.equalsIgnoreCase("Mr")) {
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_mr")).click();
			
		}else if(title1.equalsIgnoreCase("Mrs")) {
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_mrs")).click();
			
		}else if(title1.equalsIgnoreCase("Ms")){
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_ms")).click();
		}
		int x=firstName.getLocation().getX();
        int y=firstName.getLocation().getY();
        leftScrollco(driver, x, y, x, y-199);
		firstName.sendKeys(name);
		lastName.sendKeys(lname);
		studentiId.sendKeys(studentid);
		collagename.sendKeys(collageName);
	
		scrollToText("TOTAL FARE");
		
	}
	
	//friends and family fare option passenger details
	 
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.ScrollView/android.view.ViewGroup/android.widget.RadioButton[1]")
	public WebElement p2mr;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[1]")
	public WebElement p2fname;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[2]")
	public WebElement p2lname;
	@AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Date of Birth (Optional)']")
	public WebElement optionaldob;
	
	
	@AndroidFindBy(id = "in.goindigo.android.debug:id/dayPicker_layout_date")
	public WebElement pickdate;
	
	
	public void pickadate() throws InterruptedException {
		int x=pickdate.getLocation().getX();
		int y=pickdate.getLocation().getY();
		leftScrollco(driver, x, y+1, x, y+199);	
		int x1=years.getLocation().getX();
		int y1=years.getLocation().getY();
		leftScrollco(driver, x1, y1+1, x1, y1+199);

	}
	
	
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[5]/android.widget.ScrollView/android.view.ViewGroup/android.widget.RadioButton[2]")
	public WebElement p3ms;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[1]")
	public WebElement p3fname;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[2]")
	public WebElement p3lname;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.ScrollView/android.view.ViewGroup/android.widget.RadioButton[1]")
	public WebElement p4mr;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[1]")
	public WebElement p4fname;
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[2]")
	public WebElement p4lname;

	public void addadult2(String title2,String fname,String lname) throws InterruptedException {
		scrollToText("Contact Details*");
		
		
		if(title2.equalsIgnoreCase("Mr")) {
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_mr")).click();
			
		}else if(title2.equalsIgnoreCase("Mrs")) {
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_mrs")).click();
			
		}else if(title2.equalsIgnoreCase("Ms")){
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_ms")).click();
		}
		
		driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[1]")).sendKeys(fname);
		driver.findElement(By.xpath("(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[2]")).sendKeys(lname);
		optionaldob.click();
		pickadate();
		dateDoneBtn.click();
	}
	
	
	public void addPassenger2(String title2,String fname,String lname) {
		scrollToText("Add Passenger 3");
		if(title2.equalsIgnoreCase("Mr")) {
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_mr")).click();
			
		}else if(title2.equalsIgnoreCase("Mrs")) {
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_mrs")).click();
			
		}else if(title2.equalsIgnoreCase("Ms")){
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_ms")).click();
		}
		p2fname.sendKeys(fname);
		p2lname.sendKeys(lname);
		
	}
	public void addPassenger3(String title2,String fname,String lname) {
		scrollToText("Add Passenger 4");
		if(title2.equalsIgnoreCase("Mr")) {
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_mr")).click();
			
		}else if(title2.equalsIgnoreCase("Mrs")) {
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_mrs")).click();
			
		}else if(title2.equalsIgnoreCase("Ms")){
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_ms")).click();
		}
		p3fname.sendKeys(fname);
		p3lname.sendKeys(lname);
		
	}
	public void addPassenger4(String title2,String fname,String lname) {
		scrollToText("Contact Details*");
		if(title2.equalsIgnoreCase("Mr")) {
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_mr")).click();
			
		}else if(title2.equalsIgnoreCase("Mrs")) {
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_mrs")).click();
			
		}else if(title2.equalsIgnoreCase("Ms")){
			driver.findElement(By.id("in.goindigo.android.debug:id/radio_ms")).click();
		}
		
		p4fname.sendKeys(fname);
		p4lname.sendKeys(lname);
		
	}
	
		
	
}
