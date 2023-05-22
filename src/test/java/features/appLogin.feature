#Author: Sunil
#Date:
@login
Feature: SASAI Application signup and Login feature Automation
  Test signup and login features of the application with mobile number

  Scenario Outline: SASAI app user signup with Mobile number
    Given Launch app and Click on Get Started button
    When Enters "<mobile>" and click on submit
    Then Enter otp "<OTP>" and click on submit
    Then Enter Display name "<DisplayName>" and click on submit
    Then Enter PIN "<PIN>" and click on set PIN
    Then Enter confirm PIN "<PIN>" and click on confirm PIN
    #Then Verify landing home page
    #Then Enter retialer personal details "<pfname>" and "<plname>" and "<dob>"
    #And Enter retialer enrollment details "<FirmName>" and "<ShopAddress>" and "<Street>" and "<Pincode>" and "<emailid>"
   # And Retailer docs details "<seedLicencenum>" and "<seedLicenceExpDate>" and "<dlIDnum>"
   # And Enter Business Deails
   # And click on submit button and vrify application success message
    
	
    Examples: 
      | mobile     | OTP| DisplayName| PIN | FirmName| ShopAddress| Street|Pincode|emailid| seedLicencenum|seedLicenceExpDate|dlIDnum|
     | 0786754834 | 123456 | SASAI Test| 123456 | grukul firm|shop13| advin| 561211| ttxxf@ktp.com| SL634736 | 01-03-2025 |4569954|
     # | 9722222221 | sunil | test| 01-02-1998 | grukul firm|shop13| advin| 561211| atjjjnnx@ktp.com| SL634736 | 01-03-2025 |4569954|
      
   @mobileEnrollment @crmapprove
  Scenario Outline: Corteva Retailers Enrollment approve at CRM portal
  	 Given Launch crm portal
  	 And login into crm portal "<username>" and "<userpass>"
  	 And verify landing page
  	 And click on my Tasks and verify retailers "<rmobilenum>"
    Examples: 
			| username| userpass| rmobilenum|
			|30004    | Welcome@851| 9722222221  |
		
	 @mobileEnrollment @rootapprove @crmapprove
  Scenario Outline: Corteva Retailers Enrollment approve at Root portal
     Given Launch root portal		
     And login into root portal "<username>" and "<userpass>"
     And select roots portal seed
     And click on view and approve retailer "<rtmobilenum>"
    
        Examples: 
			| username| userpass|rtmobilenum|
			|3051    | Welcome@123|9722222221 |
		
	@mobileEnrollment2	
	Scenario Outline: Login for Corteva Retailers on Mobile and verify login
    #Given Launch app and Click on skip button
    When Enters "<mobile>" and click on submit
    And Enter otp and click on submit Verify login of Retailer
    
      Examples: 
   | mobile|
  # |9722222221 |