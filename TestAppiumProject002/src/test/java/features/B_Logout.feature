
@Logout
Feature: Logout Functionality
  I want to test the logout functionality

  @Logout
  Scenario: To test logout functionality
    Given user is on home page
    And user is click on profile button
    And user is scrolled down
    And select logout button
    And user select yes option
    Then user is on the login page
