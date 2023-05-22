package testApp;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.UpdateContactDetailsPage;
import testBase.AndroidBaseTest;

public class UpdateContactDetails extends AndroidBaseTest{
    
	UpdateContactDetailsPage  update ;
	public UpdateContactDetails (){
		super();
		ConfigureAppium(); 
	}

      @Given("launch the aplication and login")
      public void launch_the_aplication_and_login()throws Throwable {
	  login(); 
      }

      @Given("User is on home page and click on View Modify")
      public void user_is_on_home_page_and_click_on_view_modify()throws Throwable {
      update= new UpdateContactDetailsPage(driver);
      update.ClickOnView_Modify();
      }

      @Given("User click on update contact details")
      public void user_click_on_update_contact_details()throws Throwable {
      update= new UpdateContactDetailsPage(driver);
      update.SelectUpdateContactDetails();
      }

      @When("User Changes contact {string}")
      public void user_changes_contact(String mobile)throws Throwable {
      update= new UpdateContactDetailsPage(driver);
      update.EnterMobileNo(mobile);
      }

      @When("User click on Update button")
      public void user_click_on_update_button()throws Throwable {
      update= new UpdateContactDetailsPage(driver);
      update.ClickOnUpdate();
      }

      @Then("Update details successfully")
      public void update_details_successfully()throws Throwable {
      update= new UpdateContactDetailsPage(driver);
      update.VerfiyItineryPgae();
      }

      @When("User Changes emailID {string}")
      public void user_changes_emailid(String Email) throws Throwable{
      update= new UpdateContactDetailsPage(driver);
      update.EnterEmailid(Email);
      }
      
       @When("User Changes contact {string} and Email ID {string}")
       public void user_changes_contact_and_email_id(String mobile, String email ) throws Throwable{
       update= new UpdateContactDetailsPage(driver);
       update.EnterMobileNo(mobile);
       update.EnterEmailid(email);
       }

}
