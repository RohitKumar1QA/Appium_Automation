@Payments
Feature: Indigo Payment Option
  To test avaialable Payment Options of the application

  @Payments @Demotest
  Scenario Outline: Make a Payment Using UPI
    Given User logs into the application
    And User is on Book flight page
    When User Select "DEL" and "MUM" cities
    And User select a Departure date
    And User click on Done button
    And User click on search flight
    And User click on continue button
    And User skips flexi upgrade option
    And User enter details for passenger
    And User skips addons and insurance
    Given User is on Payment Page
    And User select payment method UPI
    And User enter "<VPA>" Virtual Payment Address
    And User agrees to terms and conditions
    Then User click on pay button
    And User proceed to complete the payment
    And Ticket is confirmed

    Examples: 
      | VPA      |
      | john@sbi |

  @Payments @Demotest
  Scenario Outline: Make a Payment Using Credit Card
    Given User logs into the application
    And User is on Book flight page
    When User Select "DEL" and "MUM" cities
    And User select a Departure date
    And User click on Done button
    And User click on search flight
    And User click on continue button
    And User skips flexi upgrade option
    And User enter details for passenger
    And User skips addons and insurance
    Given User is on Payment Page
    And User select payment method Credit Card
    And User enters card number "<card number>"
    And User enters expiry date "<expiry date>"
    And User enters cvv number "<cvv>"
    And User enters fullname "<full name>"
    And User agrees to terms and conditions
    Then User click on pay button
    And User proceed to complete the payment

    #And Ticket is confirmed
    Examples: 
      | card number      | expiry date | cvv | full name |
      | 5200000000000007 |        0123 | 123 | Lee       |

  @Payments @Demotest
  Scenario Outline: Make a Payment Using Debit Card
    Given User logs into the application
    And User is on Book flight page
    When User Select "DEL" and "MUM" cities
    And User select a Departure date
    And User click on Done button
    And User click on search flight
    And User click on continue button
    And User skips flexi upgrade option
    And User enter details for passenger
    And User skips addons and insurance
    Given User is on Payment Page
    And User select payment method Debit Card
    And User select search and select a "<bank>"
    And User enters debit card number "<card number>"
    And User enters debit expiry date "<expiry date>"
    And User enters debit cvv number "<cvv>"
    And User enters debit fullname "<full name>"
    And User agrees to terms and conditions
    Then User click on pay button
    And User proceed to complete the payment
    And Ticket is confirmed

    Examples: 
      | card number      | expiry date | cvv | full name | bank                |
      | 5200000000000007 |        0123 | 123 | admin     | State Bank of India |

  @Payments @Demotest
  Scenario Outline: Make a Payment Using 6E Rewards
    Given User logs into the application
    And User is on Book flight page
    When User Select "DEL" and "MUM" cities
    And User select a Departure date
    And User click on Done button
    And User click on search flight
    And User click on continue button
    And User skips flexi upgrade option
    And User enter details for passenger
    And User skips addons and insurance
    And User navigate to Payment Page
    And User select payment method 6E Rewards
    And User enters card number "<card number>"
    And User enters expiry date "<expiry date>"
    And User enters cvv number "<cvv>"
    And User enters fullname "<full name>"
    And User agrees to terms and conditions
    Then User click on pay button
    And User proceed to complete the payment
    And Ticket is confirmed

    Examples: 
      | card number      | expiry date | cvv | full name |
      | 5200000000000007 |        0123 | 123 | admin     |

  @Payments @Demotest
  Scenario: Make a Payment Using Net Banking
    Given User logs into the application
    And User is on Book flight page
    When User Select "DEL" and "MUM" cities
    And User select a Departure date
    And User click on Done button
    And User click on search flight
    And User click on continue button
    And User skips flexi upgrade option
    And User enter details for passenger
    And User skips addons and insurance
    Given User is on Payment Page
    And User select payment method Net Banking
    And User click on other bank option
    And User select test bank for net banking
    And User agrees to terms and conditions
    Then User click on pay button

  #And Payment initiated continue   #currently failing due to build issue
  @Payments @Demotest
  Scenario Outline: Make a Payment Using Wallet
    Given User logs into the application
    And User is on Book flight page
    When User Select "DEL" and "MUM" cities
    And User select a Departure date
    And User click on Done button
    And User click on search flight
    And User click on continue button
    And User skips flexi upgrade option
    And User enter details for passenger
    And User skips addons and insurance
    Given User is on Payment Page
    And User select payment method Wallet
    And User select a Wallet "<Wallet name>" from displayed option
    And User enters mobile "<mobile number>"
    And User agrees to terms and conditions
    Then User click on pay button
    And Payment initiated continue

    #And Ticket is confirmed
    Examples: 
      | mobile number | Wallet name |
      |    9999999999 | Paytm       |

  @Payments @Demotest
  Scenario Outline: Make a Payment Using hold and pay option
    Given User logs into the application
    And User is on Book flight page
    When User Select "DEL" and "MUM" cities
    And User select a Departure date in future
    And User click on Done button
    And User click on search flight
    And User click on continue button
    And User skips flexi upgrade option
    And User enter details for passenger
    And User skips addons and insurance
    Given User is on Payment Page
    And User click on hold and pay option
    And User click on Hold button
    Then User verify ticket confirmation
