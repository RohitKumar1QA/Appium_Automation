@MultiCityTrip
Feature: MultiCityTrip Functionality
   To test MultiCityTrip functionality

  Background: 
    Given Launch the App and Login

  @MultiCityTrip @Demotest 
  Scenario Outline: To Verify that user can search a flight for Multicity
    Given user click on Bookflight
    And user click on MultiCity option
    When user click on Popup cross btn
    And user select first "<to>" city
    And user select Date for first flight
    And user select second "<secondfrom>" city
    And user click on city search cross btn
    And user click on second "<secondto>" city
    And user select date for second flight
    And user search a flight
    Then user verify Searched flight page

    Examples: 
      | to  | secondfrom | secondto |
      | MUM | COK        | IXE      |

  @MultiCityTrip @Demotest2
  Scenario Outline: To Verify that user can modify the MultiCity flight
    Given user click on Bookflight
    And user click on MultiCity option
    When user click on Popup cross btn
    And user select first "<to>" city
    And user select Date for first flight
    And user select second "<secondfrom>" city
    Then user click on city search cross btn
    And user click on second "<secondto>" city
    And user select date for second flight
    And user search a flights
    Then user verify Searched flight page
    And user continue with first flight
    Then user is on second flight page
    And user click on modify search flight
    Then user is on multicity Home page

    Examples: 
      | to  | secondfrom | secondto |
      | MUM | COK        | IXE      |

  @MultiCityTrip @Demotest2
  Scenario Outline: To Verify that user can Make a MultiCity booking with special fares Armed Forces
    Given user click on Bookflight
    And user click on MultiCity option
    When user click on Popup cross btn
    And user select first "<to>" city
    And user select Date for first flight
    And user select second "<secondfrom>" city
    Then user click on city search cross btn
    And user click on second "<secondto>" city
    And user select date for second flight
    And user scroll up to special fare
    And user click on Armed Force
    And user search a flight
    Then user verify result page with armedforce fare
    And user click on continue button with first flight
    And user can see searched results for MultiCity
    And user click on continue with second flight
    Then user is on step1 add passenger details page
    And user fill "<firstname>" and "<lastname>" the Passenger Details Form
    And user fill the Military id "<ID>" in form
    And user click on step1 continue button
    And user click on step 2 skip button
    And user click on Not Intrested button on travel assitance page
    And user skip step 3 select seat page
    And user click on continue on payment with upi "<UPIID>"
    Then user is verified payment completed

    Examples: 
      | firstname | lastname | ID   | to  | secondfrom | secondto | UPIID     | 
      | harry     | kane     | 1234 | MUM | COK        | IXE      | admin@sbi | 

  @MultiCityTrip @Demotest2
  Scenario Outline: To Verify that Make a Multicity booking with Armed Force and SUPER 6E CAPITAL
    Given user click on Bookflight
    And user click on MultiCity option
    When user click on Popup cross btn
    And user select first "<to>" city
    And user select Date for first flight
    And user select second "<secondfrom>" city
    Then user click on city search cross btn
    And user click on second "<secondto>" city
    And user select date for second flight
    And user scroll up to special fare
    And user click on Armed Force
    And user search a flight
    Then user verify result page with armedforce fare
    And user select super 6E fare to First Flight
    And user click on continue button with first flight
    And user can see searched results for MultiCity
    And user select super 6E fare to Second Flight
    And user click on continue with second flight
    Then user is on step1 add passenger details page
    And user fill "<firstname>" and "<lastname>" the Passenger Details Form
    And user fill the Military id "<ID>" in form
    And user click on step1 continue button
    And user click on step2 6E tiffin
    And user click first passenger arrow button
    And user add food combo
    And user click on continue after confirm
    And user selct second flight box
    And user click first passenger arrow button
    And user add food combo
    And user click on continue after confirm
    And user click on 6Etiffin done button
    And user click on Step2 Addon continue Btn
    And user click on Not Intrested button on travel assitance page
    Then user is on step 3 page
    And user select free seat for First Flight
    And user copy seat to Second Flight
    And user continue to Payment Page
    And user click on continue on payment with upi "<UPIID>"
    Then user is verified payment completed

    Examples: 
      | firstname | lastname | ID   | to  | secondfrom | secondto | UPIID     |
      | harry     | kane     | 1234 | MUM | MUM        | DeL      | admin@sbi |

  @MultiCityTrip @Demotest2
  Scenario Outline: Make a booking with special fares Family & Friends and Flexi Plus fare option
    Given user click on Bookflight
    And user click on MultiCity option
    When user click on Popup cross btn
    And user select first "<to>" city
    And user select Date for first flight
    And user select second "<secondfrom>" city
    Then user click on city search cross btn
    And user click on second "<secondto>" city
    And user select date for second flight
    And user scroll up to special fare
    And user select a "<SpecialFare>" from special fare options
    And user search a flight
    Then user is on searched result page with Family fare
    And user select flexi fare for first flight
    And user click on continue button with first flight
    And user can see searched results for MultiCity
    And user select flexi fare for second city
    And user click on continue with second flight
    Then user is on step1 add passenger details page
    And user fill "<firstname>" and "<lastname>" the Passenger Details Form
    And user fill "<p2firstname>" and "<p2lastname>" the Second Passenger Details Form
    And user fill "<p3firstname>" and "<p3lastname>" the Third Passenger Details Form
    And user fill "<p4firstname>" and "<p4lastname>" the Fourth Passenger Details Form
    And user click on step1 continue button
    Then user is on 6E add-ons page
    And user click on 6E tiffin
    And user click first passenger arrow button
    And user add food combo
    And user select this for all passanger
    And user click on confirm Button
    And user click on continue after confirm
    And user selct second flight box
    And user add food combo
    And user select this for all passanger
    And user click on confirm Button
    And user click on continue after confirm
    And user click on done button after choose food of both flight
    And user click on continue with Addon
    And user click on Not Intrested button on travel assitance page
    And user skip step 3 select seat page
    And user click on continue on payment with upi "<UPIID>"
    Then user is verified payment completed

    Examples: 
      | to  | secondfrom | secondto | firstname | lastname | p2firstname | p2lastname | p3firstname | p3lastname | p4firstname | p4lastname | SpecialFare      | UPIID     |
      | MUM | COK        | IXE      | admin     | adminn   | sam         | jones      | harry       | kane       | martin      | luther     | Family & Friends | admin@sbi |

  @MultiCityTrip @Demotest2
  Scenario Outline: In multi city we not choose back date for travel
    Given user click on Bookflight
    And user click on MultiCity option
    When user click on Popup cross btn
    And user select first "<to>" city
    And user select back Date for first flight

    Examples: 
      | to  |
      | MUM |
