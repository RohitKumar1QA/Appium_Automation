package pageObjects.android;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import testBase.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class MyBookingTabPage extends AndroidActions {
	public AndroidDriver driver;

	public MyBookingTabPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
       }
 

     //-----------MyBookingTabHomePage-----------------------
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='My Bookings']")
    public WebElement myBookings;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Current']")
    public WebElement current;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Completed']")
    public WebElement completed;
	
	
	//-------------Methods----------------------------
	
	public void ClickOnMyBookings() {
		myBookings.click();
	}
	
	public void ClickCurrentBookings() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Boolean currentbookingpage = current.isDisplayed();
		assertEquals(currentbookingpage, true);
	}
	
	public void ClickCompletedBookings() {
		completed.click();
	}
}