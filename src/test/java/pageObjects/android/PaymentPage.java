package pageObjects.android;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testBase.AndroidActions;

public class PaymentPage extends AndroidActions{
	
	  public AndroidDriver driver;

		public PaymentPage (AndroidDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		
		
		//payment title
		@AndroidFindBy(id="in.goindigo.android.debug:id/text_payment_title")
		public WebElement paymentTitle;
		
		
		//UPI details
		@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='UPI']")
		public WebElement selectUPI;
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/edit_upi_vpa")
		public WebElement editVPA;
	
	

		
	
		@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
		public WebElement contPaymnetBtn;
		
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/text_ticket_confirm")
		public WebElement paymentConfirmationText;
		
		//terms and cond for all
		@AndroidFindBy(id = "in.goindigo.android.debug:id/checkbox_terms")
		public WebElement checkTerms;
		
		public void CheckTerms() 
		{
			scrollToText("Hold and Pay later");
			
		}
		
		public void ScrollToSixE() 
		{
			scrollToText("6E Rewards");
			
		}
		
		//pay btn  for all
		@AndroidFindBy(id = "in.goindigo.android.debug:id/button_pay")
		public WebElement payBtn;
		
		
		
		//6E RewardsCredit Debit Card details
		
		@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Credit Card']")
		public WebElement selectCreditCard;
		@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Debit Card']")
		public WebElement selectDebitCard;
		@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='6E Rewards']")
		public WebElement select6ERewards;
		@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Hold and Pay later']")
		public WebElement selectHoldAndPay;
		@AndroidFindBy(id = "in.goindigo.android.debug:id/button_receive_otp")
		public WebElement holdButton;
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/text_ticket_confirm")
		public WebElement holdAndPayConfirmationText; //Your Booking has been put on hold!
		
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/edit_credit_debit_number")
		public WebElement creditdebitcardNumber;
		
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/edit_expiry_validity_date")
		public WebElement expiryDate;
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/edit_cvv")
		public WebElement cvvNumber;
		
		//in.goindigo.android.debug:id/edit_cvv
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/edit_card_full_name")
		public WebElement fullName;
		
		//Debit card
		@AndroidFindBy(id = "in.goindigo.android.debug:id/edit_debit_number")
		public WebElement debitcardNumber;
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/edit_debit_expiry_validity_date")
		public WebElement debitexpiryDate;
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/edit_debit_cvv")
		public WebElement debitcvvNumber;
		
		@AndroidFindBy(id = "in.goindigo.android.debug:id/edit_debit_card_full_name")
		public WebElement debitfullName;
		//Debit select a bank
		@AndroidFindBy(id = "in.goindigo.android.debug:id/edit_select_bank")
		public WebElement debitbankselect;
		@AndroidFindBy(id = "in.goindigo.android.debug:id/edit_other_bank_search")
		public WebElement debitbankserch;
		@AndroidFindBy(id = "in.goindigo.android.debug:id/text_other_bank_name")
		public WebElement debitsearchedbank;
		
		//Net Banking
		@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Net Banking']")
		public WebElement selectNetBanking;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='State Bank of India']")
		public WebElement netSelectStateBankofIndia;
		
		@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Information\"])[11]")
		public WebElement otherBanks;
		
		
		
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
		public WebElement selectTestBank;
		
		@AndroidFindBy(xpath="//android.widget.FrameLayout[3]/android.widget.TextView[@text='Unaccompanied Minor']")
		public WebElement unaccompaniedMinorFair;
		
		//Wallet
		
		@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[@text='Wallet']")
		public WebElement selectWallet;
		@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter Mobile Number']")
		public WebElement enterWalletMobileNumber;
		
		//wallet display option
		
		
		public void selectWalletname(String walletName) {
			List<WebElement> ele =driver.findElements(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.TextView"));
			for(WebElement e:ele) {
				if(e.getText().equals(walletName)) {
					e.click();
					break;
				}
			}
		}
		
		
		//net banking select displayed banks
		
		public void selectdisplayedbank(String bankName) {
			
			List<WebElement> ele = driver.findElements(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.TextView"));
			
			for(WebElement e:ele) {
				if(e.getText().equals(bankName)) {
					e.click();
					break;
				}
			}
			
		}
		
	
		
		public void selectUnacompaniedMinor(String option) throws InterruptedException {	
			List<WebElement> ele  = driver.findElements(By.xpath("//android.widget.LinearLayout[4]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.TextView"));
	
			for(WebElement e:ele) {

				if(option.equals("Unaccompanied Minor")) {
					
					if(e.getAttribute("text").equals("Doctors & Nurses") || e.getAttribute("text").equals("Armed Forces")) {
						
						int x=e.getLocation().getX();
						int y=e.getLocation().getY();
						leftScrollco(driver, x+20, y, x-1800, y);	
						unaccompaniedMinorFair.click();
						break;
					}	
				}

			}
			
			
			
		}
		
	
		public void jumpactivity() {
			Activity activity = new Activity("in.goindigo.android.debug","in.goindigo.android.ui.modules.payment.PaymentActivity");
			driver.startActivity(activity);
		}
		
		public void paymentprocessbyUPI(String VPA) throws InterruptedException {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(selectUPI));
				selectUPI.click();
				int x=editVPA.getLocation().getX();
		        int y=editVPA.getLocation().getY();
		        leftScrollco(driver, x, y, x, y-150);
				editVPA.sendKeys(VPA);
				checkTerms.click();
				payBtn.click();
			WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait2.until(ExpectedConditions.visibilityOf(contPaymnetBtn));
				contPaymnetBtn.click();
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(120));
			wait3.until(ExpectedConditions.visibilityOf(paymentConfirmationText));
		
		}
	
}
