@Addons
Feature: Add-on Functionality
 To test Add-on functionality

  @Addons @Demotest2 @demoscenario
  Scenario Outline: To select Six E Prime Add-on for Adult passangers
    Given Launch the app and lOgin
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    Given user adds an Adult passenger from passenger list
    And user clicks on the search flight button
    And click on continue button
    And skip the upgrade flexi fare
    When user verify Passanger details page
    And select title of passanger
    And enter "<firstname>" and "<lastname>" of Passanger
    And Continue with Passanger details
    Then visit and verify Six E Addons page
    And user select Six E Prime addon
    And verify six e prime page
    And check the checkbox for selected flight
    And click on the Add6EPrime button
    And verify 6E Tiffin page
    And select meal for passanger
    And select veg meal type
    And select nonveg meal type
    And click on the continue
    And click on done button
    And user continue with SixE Prime addon
    And confirm with addon
    And user skip Seat selection page
    And user completes payment using Credit Card
    And enter valid credentials "<cardnumber>" and "<valdate>" and "<cvv>" and "<cardname>" of Credit Card
    And user accept terms and click pay
    And user click on confirm Payment
    And user click on back to merchent page
    And booked ticket is confirmed

    Examples: 
      | firstname | lastname | UPI       | From | To  | cardnumber       | valdate | cvv | cardname |
      | Harry     | jones    | admin@sbi | MUM  | DeL | 4263982640269299 | 02/23   | 837 | Visa     |

  @Addons @Demotest
  Scenario Outline: To select Fast Forward Add-on for Child
    Given Launch the app and lOgin
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    Given user adds a child from passenger list
    And user clicks on the search flight button
    And click on continue button
    And skip the upgrade flexi fare
    When user verify Passanger details page
    And select title of passanger
    And enter "<firstname>" and "<lastname>" of Passanger
    And select gender of Child
    And enter "<childfirstname>" and "<childlastname>" of Child
    And Continue with Passanger details
    Then visit and verify Six E Addons page
    And select Fast Forward  addon
    And verify six Fast Forward page
    And check the checkbox for selected flight
    And click on the Add Fast Forward button
    And continue with Fast Forward
    And skip travel assistance

    Examples: 
      | firstname | lastname | childfirstname | childlastname | UPI       | From | To  |
      | wicky     | jones    | wick           | kane          | admin@sbi | MUM  | DeL |

  @Addons @Demotest2
  Scenario Outline: To select Excess Baggage Add-on
    Given Launch the app and lOgin
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    Given user adds a infant from passenger list
    And user clicks on the search flight button
    And close infant notification
    And click on continue button
    When user verify Passanger details page
    And enter registerd user  details
    And select gender of infant
    And enter "<infantfirstname>" and "<infantlastname>" of infant
    And select date of birth
    And done after DOB
    And click on continue details
    Then visit and verify Six E Addons page
    And select Excess Baggage addon
    And verify Excess Baggage page
    And add a weight of bag
    And click on the done button
    And continue with Excess baggage
    And skip the excess baggage

    Examples: 
      | infantfirstname | infantlastname | UPI       | From | To  |
      | Harry           | jones          | admin@sbi | MUM  | DeL |

  @Addons @Demotest2
  Scenario Outline: To select Sports Equipment Add-on
    Given Launch the app and lOgin
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    Given user adds a registered user
    And user clicks on the search flight button
    And check the searched flight
    And click on continue button
    And skip the upgrade flexi fare
    When user verify Passanger details page
    And enter registerd user  details
    And click on continue details
    Then visit and verify Six E Addons page
    And select sports equipment  addon
    And verify sports equipment page
    And add a bagkit
    And click the done button
    And continue with sports equipment
    And skip the sports eqipment

    Examples: 
      | UPI       | From | To  |
      | admin@sbi | MUM  | DeL |

  @Addons @Demotest2
  Scenario Outline: To select Delayed and Lost Baggage addon
    Given user select as guest login
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    And user clicks on the search flight button
    And check the searched flight
    And click on continue button
    And skip the upgrade flexi fare
    When user verify Passanger details page
    And slect title of guest user
    And enter "<firstname>" and "<lastname>" of  guest user
    And enter "<monumber>"
    And enter a "<EmailID>"
    And click on continue details
    Then visit and verify Six E Addons page
    And select delayed and lost baggage addon
    And verify delayed and lost baggage page
    And click on checkbox
    And click on add to trip
    And continue with delayed and lost baggage
    And skip travel assistance

    Examples: 
      | firstname | lastname | monumber   | EmailID              | UPI       | From | To  |
      | Harry     | jones    | 7620828139 | wickykul25@gmail.com | admin@sbi | MUM  | DeL |

  @Addons @Demotest
  Scenario Outline: To select 6E QickBoard Add-on
    Given Launch the app and lOgin
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    Given user adds an armed forces from special fare options
    And user clicks on the search flight button
    And click on continue button
    When user verify Passanger details page
    And select title of passanger
    And enter "<firstname>" and "<lastname>" and "<MillitaryId>" of Passanger
    And Continue with Passanger details
    Then visit and verify Six E Addons page
    And select Six E quick board addon
    And verify six e quick board page
    And check the checkbox for selected flight
    And click on the Add6E qick board button
    And continue with SixE quick board addon
    And skip travel assistance

    Examples: 
      | firstname | lastname | UPI       | MillitaryId | From | To  |
      | Harry     | jones    | admin@sbi |      123456 | MUM  | DeL |

  @Addons @Demotest2
  Scenario Outline: To select Lounge Add-on
    Given Launch the app and lOgin
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    Given user adds an "<SpecialFare>" from special fare options
    And user clicks on the search flight button
    And click on continue button
    When user verify Passanger details page
    And select gender of passanger
    And enter "<firstname>" and "<lastname>" of Passanger
    And select date of birth
    And done after DOB
    And Continue with Passanger details
    Then visit and verify Six E Addons page
    And select Lounge addon
    And verify lounge page
    And check the checkbox for passanger
    And click on the done button of lounge
    And continue lounge addon
    And skip travel assistance

    Examples: 
      | firstname | lastname | UPI       | SpecialFare         | From | To  |
      | Harry     | jones    | admin@sbi | Unaccompanied Minor | MUM  | DeL |

  @Addons @Demotest2
  Scenario Outline: To select Travel Assistance Add-on
    Given Launch the app and lOgin
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    Given user adds an "<SpecialFare>" from special fare options
    And user clicks on the search flight button
    And click on continue button
    When user verify Passanger details page
    And select title of passanger
    And enter "<firstname>" and "<lastname>" of Passanger
    And enter studentid "<StudentId>" of students
    And enter collegename "<Collegename>" of students
    And Continue with Passanger details
    Then visit and verify Six E Addons page
    And select travel assistance addon
    And verify travel assistance page
    And select date of birth of student
    And done after DOB
    And click on agree terms and conditions
    And add travel assistance addon
    And continue travel assistance addon
    And skip travel assistance

    Examples: 
      | firstname | lastname | UPI       | StudentId  | Collegename    | SpecialFare | From | To  |
      | Harry     | jones    | admin@sbi | 2018bme024 | bharatvidyalay | Students    | MUM  | DeL |

  @Addons @Demotest2
  Scenario Outline: To select Indigo Promise Add-on
    Given Launch the app and lOgin
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    Given user adds an "<SpecialFare>" from special fare options
    And user clicks on the search flight button
    And click on continue button
    And skip the upgrade flexi fare
    When user verify Passanger details page
    And enter registerd user  details
    And select title of passanger
    And enter "<P2firstname>" and "<P2lastname>" of second Passanger
    And select title of passanger
    And enter "<P3firstname>" and "<P3lastname>" of third Passanger
    And select title of passanger
    And enter "<P4firstname>" and "<P4lastname>" of fourth Passanger
    And click on continue details
    Then visit and verify Six E Addons page
    And select indigo promise addon
    And verify indigo promise page
    And check the checkbox for selected flight
    And add a Indigo promise
    And continue with sports equipment
    And skip the sports eqipment

    Examples: 
      | UPI       | P2firstname | P2lastname | P3firstname | P3lastname | P4firstname | P4lastname | SpecialFare      | From | To  |
      | admin@sbi | admin       | smith      | john        | jack       | wick        | admin      | Family & Friends | MUM  | DeL |

  @Addons @Demotest
  Scenario Outline: To select SixE Seat and Eat Add-on for Senior Citizen passangers
    Given Launch the app and lOgin
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    Given user adds a Senior Citizen passenger from passenger list
    And user clicks on the search flight button
    And click on continue button
    And skip the upgrade flexi fare
    When user verify Passanger details page
    And select title of passanger
    And enter "<firstname>" and "<lastname>" of Passanger
    And enter "<Seniorfirstname>" and "<Seniorlastname>" of seniorCitizen
    And select date of birth
    And done after DOB
    And enter seniorcitizenID "<SeniorCitizenID>"
    And Continue with Passanger details
    Then visit and verify Six E Addons page
    And user select 6E Seat & Eat Prime addon
    And verify six 6E Seat and Eat page
    And check the checkbox for selected flight
    And click on the Add Combo button
    And select meal for passanger
    And select veg meal type
    And select meal for all passanger
    And click on confirm meal button
    And click on the continue
    And click on done button
    And continue with 6E Tiffin addon
    And confirm with addon

    Examples: 
      | firstname | lastname | UPI       | SeniorCitizenID | Seniorfirstname | Seniorlastname | From | To  |
      | Harry     | jones    | admin@sbi |            5284 | sam             | robin          | MUM  | DeL |

  @Addons @Demotest
  Scenario Outline: Verify For 6e prime fast forward ,meal and Normal seats are free and 50% discount on XL seats
    Given Launch the app and lOgin
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    Given user adds an Adult passenger from passenger list
    And user clicks on the search flight button
    And check the searched flight
    And click on continue button
    And skip the upgrade flexi fare
    When user verify Passanger details page
    And enter "<firstname>" and "<lastname>" of Passanger
    And select title of passanger
    And Continue with Passanger details
    Then visit and verify Six E Addons page
    And user select Six E Prime addon
    And verify six e prime page
    And check the checkbox for selected flight
    And click on the Add6EPrime button
    And verify meal is free
    And select meal for passanger
    And select veg meal type
    And select nonveg meal type
    And click on the continue
    And click on done button
    And verify fast forward is free
    And user continue with SixE Prime addon
    And confirm with addon

    Examples: 
      | firstname | lastname | UPI       | From | To  |
      | Harry     | jones    | admin@sbi | MUM  | DeL |

  @Addons @Demotest
  Scenario Outline: For flexi  plus fare meal is free
    Given Launch the app and lOgin
    And user click on BookFlight
    And user select "<From>" and "<To>" cities
    And user select future Date
    Given user adds an Adult passenger from passenger list
    And user clicks on the search flight button
    And user select flexi plus fare
    And click on continue button
    When user verify Passanger details page
    And enter "<firstname>" and "<lastname>" of Passanger
    And select title of passanger
    And Continue with Passanger details
    Then visit and verify Six E Addons page
    And verify meal is free with flexi plus
    And user select free meal
    And select meal for passanger
    And select veg meal type
    And click on the continue
    And click on done button
    And user continue with flexi fare
    And skip with six sixE tiffin

    Examples: 
      | firstname | lastname | UPI       | From | To  |
      | Harry     | jones    | admin@sbi | MUM  | DeL |
