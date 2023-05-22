
@CancelChangeFlight
Feature: Cancel Flight
  To test that user should cancel our flight

  Background: Login into Indigo application
    Given Launch the application and login

  @CancelFlight @Demotest3
  Scenario: To Verify User can cancel the booked flight
    Given User is on Home page and click on modify
    When User click on modify booking
    And User click on cancel flight
    And User select Bank Account to refund
    And User click on Cancel flight tab
    And User should select booked flight for cancelling
    And User click on continue tab
    And User select yes for cancel flight
    And User click on finish option
    Then User verify Flight Cancel Message

  @ChangeFlight @Demotest3
  Scenario: To Verify User can change the booked flight
    Given User is on Home Page and click on CheckIn
    And User select view Itenerary
    When User click on change flight Button
    And User click on checkbox
    And User select New date
    And User click on done button
    When User click on select flight button
    And User click on new flight booking
    And User click on continue Tab
    And User skip Addon page click on continue
    And User select Not interested for Travel Asistance
    And User select NetBanking Payemnt Option
    And User select Other
    And User click on Avenue Test
    And User select CheckBox
    And User click on Pay Button
    And User click on Continue
    Then User verify the Message
  