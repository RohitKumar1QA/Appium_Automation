package pageObjects.android;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testBase.AndroidActions;

public class UpdateContactDetailsPage extends AndroidActions {
	
   	public AndroidDriver driver;
    public UpdateContactDetailsPage(AndroidDriver driver) {
    super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 

                      ///////.......Update Contact Deatils Locator.........////////
    
    
     @AndroidFindBy(xpath="//android.widget.Button[@text='View/Modify']")
     public WebElement ViewModify;
   
     @AndroidFindBy(xpath="//android.widget.TextView[@text='Update contact details']")
     public WebElement UpdateContact;
    
     @AndroidFindBy(xpath="//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/edit_send_phone']")
     public WebElement MobileNo;
    
     @AndroidFindBy(xpath="//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/edit_send_email_address']")
     public WebElement Emailid;
    
     @AndroidFindBy(xpath="//android.widget.Button[@text='Update']")
     public WebElement Update;
    
     @AndroidFindBy(xpath="//android.widget.TextView[@text='Itinerary']")
     public WebElement ItineryPage;
    
    
     public void ClickOnView_Modify() {
    	ViewModify.click();
     }
     public void SelectUpdateContactDetails(){
    	UpdateContact.click();
     }
    
     public void EnterMobileNo(String number) {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	MobileNo.sendKeys(number);
     }
    
     public void EnterEmailid(String email) {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	Emailid.sendKeys(email);
     }
    
    public void ClickOnUpdate() {
    	Update.click();
    }
    
    public void VerfiyItineryPgae() {
    	assertEquals(ItineryPage.getText(),"Itinerary");
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
