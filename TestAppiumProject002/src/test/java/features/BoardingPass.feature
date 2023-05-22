@BoardingPass
Feature: BoardingPass Functionality
  To test that user can proceed for Boarding Pass

  Background: Login into Indigo application
    Given Launch the Application and Login

  @BoardingPass @Demotest2 @demoscenario 
  Scenario Outline: To verify the procees for Boarding pass with valid Credentials
    Given user is on Home Page and click on Checkin
    When user click on find booking
    And user Enter PNR and "<LastName>"
    And user click On Submit
    And user click On Check IN Now button
    When user add the Bag count and Click on Next
    And user Skip the addons page and Click on continue
    And user select Not intrested for Travel Asistance
    And user Enter "<MobileNo>" and "<Email>" and "<Address>" and "<Pincode>" in Web Check In from
    Then verify user complete Boarding Pass Process

    Examples: 
      | LastName | MobileNo   | Email              | Address | Pincode |
      | Kulkarni | 8668399134 | yoyo3557@gmail.com | latur   |  413512 |

  @BoardingPass @Demotest2 @demoscenario   
  Scenario Outline: To Verify the process for Boarding Pass with invalid credetials
    Given user is on Home Page and click on Checkin
    And user get a pnr and click on find booking
    And user Enter PNR and "<LastName>"
    And user click On Submit
    And user click On Check IN Now button
    When user add the Bag count and Click on Next
    And user Skip the addons page and Click on continue
    And user select Not intrested for Travel Asistance
    And user Enter "<mobileNo>" and "<email>" and "<Address>" and "<pincode>" in Web Check In from
    Then Verify contact info message

    Examples: 
      | LastName | mobileNo   | email             | Address | pincode |
      | Kulkarni | 567        | yoyo3557gmail.com | pune    |  413512 |

  @BoardingPass @Demotest2 @Demotest3 
  Scenario Outline: To verify the process for complete the HealthFrom
    Given user is on Home Page and click on Checkin
    When user get new PNR and click on find booking
    And user Enter PNR and "<LastName>"
    And user click On Submit
    And user click On Check IN Now button
    When user add the Bag count and Click on Next
    And user Skip the addons page and Click on continue
    And user select Not intrested for Travel Asistance
    And user Enter "<MobileNo>" and "<Email>" and "<Address>" and "<Pincode>" in Web Check In from
    Then verify user complete Boarding Pass Process

    Examples: 
      | LastName | MobileNo   | Email              | Address | Pincode |
      | Kulkarni | 8668345124 | yoyo3557@gmail.com | latur   |  413512 |
