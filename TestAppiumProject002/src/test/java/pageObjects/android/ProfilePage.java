package pageObjects.android;



import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
 
     public class ProfilePage extends AndroidActions{
    	 public ProfilePage(AndroidDriver driver) {
    			super(driver);
    			this.driver=driver;
    			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
 		}
    ////..... For Update Profile Details......//////

	@AndroidFindBy(id="in.goindigo.android.debug:id/txv_prfile_name")
	public WebElement profile1;
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/img_forward")
	public WebElement MyProfile;
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/txv_edit_profile")
	public WebElement editprofile;
	
	@AndroidFindBy(xpath="(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[1]")
	public WebElement Name;
	
	@AndroidFindBy(xpath="(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[2]")
	public WebElement Surname;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/edit_profile_email']")
	public WebElement EmailId;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='+91]")
	public WebElement CountryCode;
	
	@AndroidFindBy(xpath="(//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_field'])[3]")
	public WebElement MobileNo;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_update_profile']")
	public WebElement UpdateDetails;
	
	// profile update message
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Profile updated successfully']")
	public WebElement profileUpdatedmsg;

	
       
	public void clcikOnProfile(){
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.elementToBeClickable(profile1));
	        profile1.click();
     }

       public void clickOnMyProfile(){
    		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
   		 wait.until(ExpectedConditions.elementToBeClickable(MyProfile));
	         MyProfile.click();
     }
       public void SelectEditProfile(){
    		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
      		 wait.until(ExpectedConditions.elementToBeClickable(editprofile));
	         editprofile.click();
     }
       public void EnterName(String name){
    	   Name.clear();
	         Name.sendKeys(name);
	         
     }
       public void EnterLastname(String last){
    	   Surname.clear();
	         Surname.sendKeys(last);
     }
       public void EnterEmailId(String Id){
    	   EmailId.clear();
	         EmailId.sendKeys(Id);
     }
       public void EnterMobileNo(String number) {
    	   MobileNo.clear();
	         MobileNo.sendKeys(number);
     }
       public void ClickOnUpdate(){
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	  wait.until(ExpectedConditions.elementToBeClickable(UpdateDetails));
    	   UpdateDetails.click();
     }
  
      ////........................For Logout Page Locators...............///
  
   
       
       @AndroidFindBy(id="in.goindigo.android.debug:id/txv_prfile_name")
   	public WebElement profile2;
  
       @AndroidFindBy(xpath="//android.widget.TextView[@text='Logout']")
       public WebElement Logout;
  
            // we get PoP Up Here 
       @AndroidFindBy(xpath="//android.widget.Button[@index='1']")
       public WebElement Yes;
  
       @AndroidFindBy(xpath="//android.widget.Button[@index='2']")
       public WebElement Cancel;
  

      public void ClickOnProfileStatus() {
	  profile2.click();
      }
      public void ClickOnLogout() {
	  Logout.click();
      }
      public void ForLogoutClickOnYes() {
	  Yes.click();
      }
      public void ForCancelLogout() {
      Cancel.click();
      }
}