package pageObjects.android;





import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import testBase.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
 
public class FlightStatusPage extends AndroidActions {
	
   	public AndroidDriver driver;
    public  FlightStatusPage(AndroidDriver driver) {
    super(driver);
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
                     ////......Flight Status By Using PNR Number..////
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Flight Status']")
    public WebElement flightStatus;
    
    @AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
    public WebElement Continue;
    
    @AndroidFindBy(xpath="//android.widget.ImageView[@index='2']")
    public WebElement  SearchYourFlight;
    
    @AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_bypnr']")
    public WebElement PNR;
    
    @AndroidFindBy(id="in.goindigo.android.debug:id/txvPnrNumber")
    public WebElement activepnr;
    
    public String getpnr() {
    	String pnr = activepnr.getAttribute("text");
    	return pnr;
    }
    
    
    @AndroidFindBy(xpath="//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_pnr']")
    public WebElement EnterPNRNo;
    
    @AndroidFindBy(xpath="//android.widget.Button[@text='Search']")
    public WebElement Search;
    
    @AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_arrow']")
    public WebElement Arrow;
    
    @AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.goindigo.android.debug:id/btn_show_on_map']")
    public WebElement ShowONMap;
    
    @AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id='in.goindigo.android.debug:id/constraintLayout']")
    public WebElement confirm;
    
    public void clickOnFlightStatus() {
    	flightStatus.click();
    }
    public void clickOnContinue() {
    	Continue.click();
    }
    public void selectSearchFlight() {
    	SearchYourFlight.click();
    }
    public void clickOnPnrAndEnter(String pnr) {
    	 PNR.click();
    	 EnterPNRNo.sendKeys(pnr);
    }
    public void clickOnSearch() {
    	Search.click();
    }
    
    public void scheduledFlight() {
    	Arrow.click();
    }
    public void ClickOnMap() {
    	scrollToText("showOnMap");
    	ShowONMap.click();
    }
    public void FlightStatusConfirmMap() {
    	
    }
    
                  //////....Flight Status By Route....//////
    
   @AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_byroute']")
    public WebElement ByRoute;
   
   @AndroidFindBy(xpath="//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_from']")
   public WebElement From;
   
   @AndroidFindBy(xpath="//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/edit_search_city_from']")
   public WebElement FromCity;
   
   @AndroidFindBy(xpath="//android.widget.TextView[@text='Delhi, India']")
   public WebElement SelectDelhi;
   
   @AndroidFindBy(xpath="//android.widget.EditText[@text='Search City']")
   public WebElement SearchCity;
   
   @AndroidFindBy(xpath="//android.widget.TextView[@text='Mumbai, India']")
   public WebElement SelectMumbai;
   
   @AndroidFindBy(xpath="//android.widget.EditText[@resource-id='in.goindigo.android.debug:id/et_date']")
   public WebElement Date;
   
   @AndroidFindBy(xpath="//android.widget.Button[@text='Search']")
   public WebElement Search2;
   
   @AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.goindigo.android.debug:id/img_arrow']")
   public WebElement Arrow2;
   
   @AndroidFindBy(xpath="//android.widget.Button[@text='Show on map']")
   public WebElement ShowONMap2;
   
   @AndroidFindBy(xpath="//android.widget.Button[@text='Show on map']")
   public WebElement Verify;
   
  public void SelectFromAndTo(String from, String to  ) {
	  From.click();
	  FromCity.click();
	  FromCity.sendKeys(from);
	  SelectDelhi.click();
	  SearchCity.click();
	  SearchCity.sendKeys(to);
	  scrollToText("Mumbai, India");
	  SelectMumbai.click();
  }
  
  

  
   
}
