package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utills.AppiumUtills;


public class AndroidBaseTest extends AppiumUtills{

	public static AndroidDriver driver;

 

	public static void ConfigureAppium()
	{
		Properties prop = new Properties();
		FileInputStream fis = null;
		try {
			//System.out.println("data properties::"+System.getProperty("user.dir")+"\\src\\test\\resources\\data.properties");
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\data.properties");
		} catch (FileNotFoundException e2) {
			
			e2.printStackTrace();
		}

		try {
			prop.load(fis);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		String ipAddress = System.getProperty("ipAddress")!=null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
//		System.out.println(ipAddress);
//		
//		String port = prop.getProperty("port");
//			
//		service = startAppiumServer(ipAddress,Integer.parseInt(port));
//			
					
			UiAutomator2Options options = new UiAutomator2Options();
			//System.out.println("Running on device name >> "+ prop.getProperty("AndroidDeviceName"));
			options.setDeviceName(prop.getProperty("AndroidDeviceName"));
		
			options.autoGrantPermissions();
		
			System.out.println("----> Cleaning and Setting the app..." + System.getProperty("user.dir")+"\\src\\test\\resources\\app\\sasaiDev.apk");
			options.setApp(System.getProperty("user.dir")+"\\src\\test\\resources\\app\\sasaiDev.apk");
			// driver = new AndroidDriver(service.getUrl(), options);
			 try {
				 System.out.println("----> Launching the App...");
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}
			
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

			
	}
	
	
	

	
	
	//=========== logout ===========
	
	@AndroidFindBy(id="in.goindigo.android.debug:id/txv_prfile_name")
	public WebElement profilebtn;

	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Profile']")
	public WebElement myProfile;
	
	@AndroidFindBy(id= "in.goindigo.android.debug:id/img_forward")
	public WebElement forwardbtn;
	
	public static void accessallow() {
		UiAutomator2Options options = new UiAutomator2Options();
		options.autoGrantPermissions();
	}
	
	public static void login() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("in.goindigo.android.debug:id/btn_mobile_login"))));
		driver.findElement(By.id("in.goindigo.android.debug:id/btn_mobile_login")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Password\"]/android.widget.TextView")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("in.goindigo.android.debug:id/text_input_contact")).sendKeys("9766940710");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Password']")).sendKeys("Mangeshk@123");
		driver.findElement(By.id("in.goindigo.android.debug:id/button_login_otp")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void login2() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("in.goindigo.android.debug:id/btn_mobile_login"))));
		driver.findElement(By.id("in.goindigo.android.debug:id/btn_mobile_login")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Password\"]/android.widget.TextView")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("in.goindigo.android.debug:id/text_input_contact")).sendKeys("9625987105");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Password']")).sendKeys("Atmarama1@123");
		driver.findElement(By.id("in.goindigo.android.debug:id/button_login_otp")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//logout
	public void logout() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		this.profilebtn.click();
		this.myProfile.click();
		this.forwardbtn.click();
		AndroidActions action = new AndroidActions(driver);
		action.scrollToText("Logout");
		
		
	}
	

}
	
