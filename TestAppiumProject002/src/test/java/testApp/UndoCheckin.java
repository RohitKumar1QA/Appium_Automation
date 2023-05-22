package testApp;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.android.UndoCheckinPage;
import testBase.AndroidBaseTest;

public class UndoCheckin extends AndroidBaseTest{
    
	UndoCheckinPage undo;
	public UndoCheckin(){
		super();
		ConfigureAppium();
	}
	@Given("launch the app and login")
	public void launch_the_App_and_Login() {
		login2();  
	} 
	 @Given("user can select Check In Now")
     public void user_can_select_check_in_now()throws Throwable {
		 undo = new UndoCheckinPage (driver);
		 undo.SelectCheckin();
		 
	 }
	@When("User can click on Itinery view page")
	public void user_can_click_on_itinery_view_page()throws Throwable {
	undo = new UndoCheckinPage (driver);
	undo.ClickOnViewItinery();
	}

	@When("User can select undo check in")
	public void user_can_select_undo_check_in()throws Throwable {
		undo = new UndoCheckinPage (driver);
		undo.SelectUndoCheckIn();
	}

	@When("User select the check Box")
	public void user_select_the_check_box()throws Throwable {
		undo = new UndoCheckinPage (driver);
		undo.SelectcheckBox();
	}

	@Then("User Select Final Undo Checkin")
	public void user_select_final_undo_checkin() throws Throwable{
		undo = new UndoCheckinPage (driver);
		undo.FinalUndo();
		
	}
      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
