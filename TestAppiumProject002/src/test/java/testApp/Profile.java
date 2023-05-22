 package testApp;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import testBase.AndroidBaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.ProfilePage;

public class Profile extends AndroidBaseTest{
	ProfilePage profile ;
	public Profile(){
		super();
		ConfigureAppium();
	}
	
	@Given("Launch and login into the application")
    public void launch_and_login_into_the_application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		login();  
        
    }
	
    @And("User is on Profile Page")
    public void user_is_on_profile_page() throws Throwable {
        profile=new ProfilePage(driver);
       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        profile.clcikOnProfile();
        profile.clickOnMyProfile();
        
    }

    @Then("Profile update is successfull")
    public void profile_update_is_successfull() throws Throwable {
        profile=new ProfilePage(driver);
        assertEquals(profile.profileUpdatedmsg.getText(), "Profile updated successfully");   
    }

    @And("User click on Edit Profile button")
    public void user_click_on_edit_profile_button() throws Throwable {
        profile=new ProfilePage(driver);
        profile.SelectEditProfile();
    }

    @And("User click on Update Profile button")
    public void user_click_on_update_profile_button() throws Throwable {
        profile=new ProfilePage(driver);
        profile.ClickOnUpdate();
    }

@When("User Changes First Name {string}")
    public void user_changes_something(String firstName) throws Throwable {
       profile=new ProfilePage(driver);
       profile.EnterName(firstName);
    }

    @When("User Changes Last Name {string}")
    public void user_changes_last_name_something(String lastname) throws Throwable {
       profile=new ProfilePage(driver);
       profile.EnterLastname(lastname);
    }

    @When("User Changes Email ID {string}")
    public void user_changes_email_id_something(String email) throws Throwable {
       profile=new ProfilePage(driver);
       profile.EnterEmailId(email);
    }

    @When("User Changes Contact {string}")
    public void user_change_contact_something(String mobile) throws Throwable {
       profile=new ProfilePage(driver);
       profile.EnterMobileNo(mobile);
    }

    @When("User Changes {string} and {string} and {string} and {string}")
    public void user_changes_something_and_something_and_something_and_something(String firstname, String lastname, String email, String contact) throws Throwable {
        profile=new ProfilePage(driver);
        profile.EnterName(firstname);
        profile.EnterLastname(lastname);
        profile.EnterEmailId(email);
        profile.EnterMobileNo(contact);
        
    }



}
