Feature: Check-in Functionality
  To test that user can proceed for CheckIn

  @Demotest @demoscenario
  Scenario Outline: To verify that registered user can check-in
    Given Launch the app and login
    And User can Select Check In now Option to Proceed
    And user click on check in now
    And user click on Check IN Now button
    When user add the Bag count and click on Next
    And User skip addons and click on continue
    And user select not intrested for Travel Asistance
    And user Enter "<MobileNo>" and "<Email>" and "<Address>" and "<pincode>" in Web Check In From
    Then User completed checkin process

    Examples: 
      | MobileNo   | Email              | Address | pincode |
      | 8668399124 | yoyo3557@gmail.com | latur   |  413512 |


  @Demotest2
  Scenario Outline: To verify that Guest user can check-in
    Given user launch the Application
    When User clicks on continue as guest Button
    And User is on HomePage Click On CheckIN
    And User Click On Find Booking
    When User Enter "<PNR>" and "<Lastname>"
    And User Click On Submit
    And user click on Check IN Now button
    When user add the Bag count and click on Next
    And User skip addons and click on continue
    And user select not intrested for Travel Asistance
    And user Enter "<MobileNo>" and "<Email>" and "<Address>" and "<pincode>" in Web Check In From
    Then User completed checkin process

    Examples: 
      | PNR    | Lastname | MobileNo   | Email              | Address | pincode |
      | FLWRNX | Kulkarni | 8668399124 | yojo3557@gmail.com | latur   |  413512 |

  @Demotest2
  Scenario Outline: To verify Checkin Through Invalid Mobile Number
    Given Launch the app and login
    And User can Select Check In now Option to Proceed
    And user click on check in now
    And user click on Check IN Now button
    When user add the Bag count and click on Next
    And User skip addons and click on continue
    And user select not intrested for Travel Asistance
    And user Enter "<MobileNo>" and "<Email>" and "<Address>" and "<pincode>" in Web Check In From
    Then Verify contact information message

    Examples: 
      | MobileNo | Email              | Address | pincode |
      |     8634 | yoyo3557@gmail.com | latur   |  413512 |

  @Demotest2
  Scenario Outline: To verify Checkin Through Invalid Email-id
    Given Launch the app and login
    And User can Select Check In now Option to Proceed
    And user click on check in now
    And user click on Check IN Now button
    When user add the Bag count and click on Next
    And User skip addons and click on continue
    And user select not intrested for Travel Asistance
    And user Enter "<MobileNo>" and "<Email>" and "<Address>" and "<pincode>" in Web Check In From
    Then Verify Emailid  message

    Examples: 
      | MobileNo   | Email             | Address | pincode |
      | 8668399124 | yoyo3557gmail.com | latur   |  413512 |
