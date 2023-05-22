package testBase;



import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

@SuppressWarnings("deprecation")
public class AndroidActions extends AndroidBaseTest{

	public AndroidDriver driver;
	
	public AndroidActions(AndroidDriver driver)
	{
		super();
		this.driver=driver;

	}
	
	
	//Long Press Action 
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	

	// Scroll to the end
	public void scrollToEndAction()
	{
		boolean canScrollMore;
		do
		{
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			    
			));
		}while(canScrollMore);
	}
	
	
	//Scroll to a text
	public void scrollToText(String text)
	{
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
	}
	
	
	//swipe action
	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.75
			));
		
		
	}
	
   //refresh page
    public void refresh() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("direction", "down");
        params.put("velocity", 3000);
        js.executeScript("mobile: swipe", params);
    }

    //left scroll
    
    public void leftScroll(AndroidDriver driver, double start_xd, double start_yd,double end_xd, double end_yd) throws InterruptedException {
    	
    	Dimension dimension = driver.manage().window().getSize();
    	int start_x = (int) (dimension.width * start_xd); 
    	int start_y = (int) (dimension.height * start_yd);
    	int end_x = (int) (dimension.width * end_xd); 
    	int end_y = (int) (dimension.height * end_yd);
    	
    	@SuppressWarnings("rawtypes")
		TouchAction touch = new TouchAction(driver); 
    	touch.press(PointOption.point(start_x, start_y))
    	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
    	.moveTo(PointOption.point(end_x, end_y)).release().perform();
    	
    	Thread.sleep(3000);

    	
    }
    
    public void leftScrollco(AndroidDriver driver, int start_x,int start_y,int end_x, int end_y) throws InterruptedException {
    	
    
    	
    	@SuppressWarnings("rawtypes")
		TouchAction touch = new TouchAction(driver); 
    	touch.press(PointOption.point(start_x, start_y))
    	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
    	.moveTo(PointOption.point(end_x, end_y)).release().perform();
    	
    	Thread.sleep(3000);

    	
    }
    
    
}
