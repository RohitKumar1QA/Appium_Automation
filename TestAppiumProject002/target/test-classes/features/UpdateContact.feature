
@update
Feature: Update Contact Details
To test Coustmer can verify Update Contact Details
  Background: Login into Indigo Application
    Given launch the aplication and login
    Given User is on home page and click on View Modify
    And User click on update contact details

  @update @Demotest3
  Scenario Outline: To Verify user can Update Contact
    When User Changes contact "<Mobile>"
    And User click on Update button
    Then Update details successfully

    Examples: 
      | Mobile     |
      | 9766940710 |

  @update @Demotest3
  Scenario Outline: To Verify user can Update Email id
    When User Changes emailID "<Email>"
    And User click on Update button
    Then Update details successfully

    Examples: 
      | Email        |
      | mk@gmail.com |

  @update @Demotest3
  Scenario Outline: To Verify user can Update Contact and EmailId
    When User Changes contact "<Mobile>" and Email ID "<Email>"
    And User click on Update button
    Then Update details successfully

    Examples: 
      | Mobile     | Email        |
      | 9766940710 | mk@gmail.com |
