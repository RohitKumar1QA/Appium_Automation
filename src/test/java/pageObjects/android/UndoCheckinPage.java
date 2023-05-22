package pageObjects.android;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testBase.AndroidActions;

public class UndoCheckinPage extends AndroidActions {
	
   	public AndroidDriver driver;
    public UndoCheckinPage(AndroidDriver driver) {
    super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
	                //////....Undo Checkin...../////
    
       @AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Check-in\"]")
	   public WebElement FlightChekIn;
	 
	   @AndroidFindBy(xpath="//android.widget.TextView[@text='View Itinerary']")
	   public WebElement ViewItinery;
	   
	   @AndroidFindBy(xpath="//android.widget.TextView[@text='Undo Check-in']")
	   public WebElement UndoCheckin;
	   
	   @AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='in.goindigo.android.debug:id/checkbox_undo_check_in']")
	   public WebElement checkbox;
	   
	   @AndroidFindBy(xpath="//android.widget.TextView[@text='Cancel']")
	   public WebElement Cancel;
	   
	   @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.goindigo.android.debug:id/text_yes_undo_check_in']")
	   public WebElement FinalUndoCheckin;
	   
	   
	   public void SelectCheckin() {
		   FlightChekIn.click();
	   }
	   
	   public void ClickOnViewItinery() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		   wait.until(ExpectedConditions.elementToBeClickable(ViewItinery));
		   ViewItinery.click();
	   }
	   
	   public void SelectUndoCheckIn() {
		   UndoCheckin.click();
	   }
	   public void SelectcheckBox() {
		   checkbox.click();
		  
	   }
	   
	   public void FinalUndo() {
		   FinalUndoCheckin.click();
	   }
}
