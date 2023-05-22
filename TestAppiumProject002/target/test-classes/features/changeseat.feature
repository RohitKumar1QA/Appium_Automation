
    @ChangeSeat
    Feature: To change Seat
    To test that user can change the Seat

    Background: Login into Indigo application
    Given Launch the Indigo application and login

    @changeseat
    Scenario: To Verify The chnage seat functionality
    Given User is on Home page click on checkin
    And user select itinery page
    And user select chnageSeat option
    And user select seat and click on ok
    And user select Continue to Payment
    And user select NetBanking Payemnt Option
    And user select other
    And user click on Avenue Test
    And user select CheckBox
    And User click on Pay
    And user click on continue
    Then user verify the message
