
@Profile
Feature: Update Profile Details
  To test that user can update prfile details

  Background: Login into Indigo application
    Given Launch and login into the application
    And User is on Profile Page
    And User click on Edit Profile button

  @Profile
  Scenario Outline: To verify user can update First Name
    When User Changes First Name "<First Name>"
    And User click on Update Profile button
    Then Profile update is successfull

    Examples: 
      | First Name |
      | Mangesh    |

  @Profile
  Scenario Outline: To verify user can update Last Name
    When User Changes Last Name "<Last Name>"
    And User click on Update Profile button
    Then Profile update is successfull

    Examples: 
      | Last Name |
      | Kulkarni  |

  @Profile
  Scenario Outline: To verify user can update Email id
    When User Changes Email ID "<Email>"
    And User click on Update Profile button
    Then Profile update is successfull

    Examples: 
      | Email        |
      | mk@gmail.com |

  @Profile
  Scenario Outline: To verify user can update Contact
    When User Changes Contact "<Mobile>" 
    And User click on Update Profile button
    Then Profile update is successfull

    Examples: 
      | Mobile     |
      | 9766940710 |

  @Profile
  Scenario Outline: To verify user can update Profile Details
    When User Changes "<First Name>" and "<Last Name>" and "<Email>" and "<contact>"
    And User click on Update Profile button
    Then Profile update is successfull

    Examples: 
      | First Name | Last Name | Email        | contact    |
      | Mangesh    | Kulkarni  | mk@gmail.com | 9766940710 |
