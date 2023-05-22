@ForgotPassword
Feature: Forgot Password
  To test Forgot Password Functionality of Indigo App

  @ForgotPassword 
  Scenario Outline: To test forgot password functionality
    Given User is on Login Page
    When User selects Password option
    And User enter Mobile Number "<mobile>"
    And User click on Forgot Password link
    And User click on Send OTP button and waits for OTP
    And User enter "<new password>" and "<confirm password>"
    Then User click on change my password button
    And Password change successfull

    Examples: 
      | mobile     | new password | confirm password |
      | 9766940710 | Mangeshk@123 | Mangeshk@123     |
