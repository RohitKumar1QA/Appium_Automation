
@MyBookingTab
Feature: My Booking Tab
  To test that user check my booking tab

  Background: Login into Indigo application
    

  @MyBookingTab
  Scenario: To verify user can check my booking tab
    Given launch the application and login
    And User is on home page and click on my bookings
    When  User is on my booking page and current booking is displayed
    Then user click on completed booking
