
@Login
Feature: Application Login
  Test login features of the application

  @Login  
  Scenario Outline: Indigo Customer login with Mobile number
    Given Launch app and Click on continue with mobile number
    When User select Password option
    And Enters "<mobile>" and "<password>" and click on submit
    Then Verify landing page

    Examples: 
      | mobile     | password      |
      | 9766940710 | Mangeshk@123 |

  @Login
  Scenario Outline: Indigo Customer login with incorrect Mobile number
    Given Launch app and Click on continue with mobile number
    When User select Password option
    And Enters "<mobile>" and "<password>" and click on submit
    Then Verify info message

    Examples: 
      | mobile     | password      |
      | 9625987111 | Mangeshk@123 |

  @Login
  Scenario Outline: Indigo Customer login Mobile number char validation
    Given Launch app and Click on continue with mobile number
    When User select Password option
    And Enters "<mobile>" and "<password>" and click on submit
    Then Verify info message

    Examples: 
      | mobile   | password      |
      | 96259871 | Mangeshk@123 |

  @Login
  Scenario Outline: Indigo Customer login with incorrect Password
    Given Launch app and Click on continue with mobile number
    When User select Password option
    And Enters "<mobile>" and "<password>" and click on submit
    Then Verify info message

    Examples: 
      | mobile     | password    |
      | 9766940710 | @34#invalid |

  @Login
  Scenario Outline: Indigo Customer login with incorrect OTP
    Given Launch app and Click on continue with mobile number
    When User Enters "<mobile>" and Click on send OTP
    And User Enters "<OTP>" and click on confirm
    Then Verify incorrect OTP message

    Examples: 
      | mobile     | OTP |
      | 9766940711 |   3 |

  @Login
  Scenario Outline: Indigo Customer login with correct OTP
    Given Launch app and Click on continue with mobile number
    When User Enters "<mobile>" and Click on send OTP
    And User clicks on confirm
    Then Verify landing page

    Examples: 
      | mobile     |
      | 9766940710 |

  @Login
  Scenario: Guest Login
    Given User Launch the application
    When User clicks on continue as guest button
    Then User is on homepage
