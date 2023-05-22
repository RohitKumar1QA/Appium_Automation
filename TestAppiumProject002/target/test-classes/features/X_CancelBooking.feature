
@CancelBooking
Feature: Cancel Flight Booking
  To test that user can cancel our flight booking

  @CancelBooking @demoscenario
  Scenario: To Verify User Can cancel our flight booking
    Given Launch and login into the Application
    And User is on home page and click on modify button
    When User click on modify booking option
    And User click on cancel booking
    And User select Bank Account for refund
    And User click on Cancel booking tab
    And User select yes for cancel booking
    And User click on confirm cancel booking option
    Then User validate booking has been cancelled
