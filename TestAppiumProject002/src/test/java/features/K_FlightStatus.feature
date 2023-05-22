
@FlightStatus
Feature: Flight Status Functionality
  To test that user can proceed to check Flight Status

  Background: Login into Indigo application
    Given Launch the App and login

  @FlightStatus
  Scenario Outline: To verfiy user can check the flight status by using PNR Number
    Given user is on Home Page and Click on the Flight Status
    And user click on continue to proceed
    When user click on Search Your Flight
    And user select PNR Option and Enter the pnr number
    And user click on Search
    And user click on the shceduled flight
    Then user select show on Map


  @FlightStatus
  Scenario Outline: To verfiy user can check the flight status By Route
    Given user is on Home Page and Click on the Flight Status
    When user click on continue to proceed
    And user click on Search Your Flight
    And user select By Route option for flight status
    And user  selects "<From>" and "<To>" cities
    And user click on Search
    And user click on the shceduled flight
    Then user select show on Map

    Examples: 
      | From  | To     |
      | Delhi | Mumbai |
