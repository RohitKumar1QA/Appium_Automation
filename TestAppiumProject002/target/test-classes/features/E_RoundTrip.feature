@Roundtrip
Feature: Roundtrip Functionality
  To test roundtrip functionality

  Background: 
    Given Launch the app and Login
    Then user is on homepage

  @Roundtrip @Demotest
  Scenario Outline: To Verify that user can search a flight for RoundTrip
    Given user click on bookflight
    When user select roundtrip option
    And user selects "<From>" and "<To>" cities
    And user select date for travel
    And user select passenger option
    And user click on Searchflight
    Then user is on flight serached result page
    And user click on continue button
    And user can see searched results for RoundTrip
    And user click on continue with return flight
    And user click on skip button
    Then user is on add passenger details page
    And user fill "<firstname>" and "<lastname>" the Passenger Details Forms
    And user click on continue button with step1
    And user click on skip button at step 2
    And user click on No button on travel assitance page
    And user skip the select seat page
    Then user make a payment using upi "<VPA>"
    And verify confirm ticket

    Examples: 
      | From | To  | firstname | lastname |VPA      |
      | MUM  | DEl | wick      | jones    |admin@sbi|

  @Roundtrip @Demotest
  Scenario Outline: Make a RoundTrip booking with special fares Armed Forces
    Given user click on bookflight
    When user select roundtrip option
    And user selects "<From>" and "<To>" cities
    And user select date for travel
    And user select passenger option
    And user click on Armed force
    And user click on Searchflight
    Then user is on searched Flightpage with armedforce fare
    And user click on continue button
    And user can see searched results for RoundTrip
    And user click on continue with return flight
    Then user is on add passenger details page
    And user fill "<firstname>" and "<lastname>" the Passenger Details Forms
    And user fills the military Id "<millitaryid>"
    And user click on continue button with step1
    And user click on skip button at step 2
    And user click on No button on travel assitance page
    And user skip the select seat page
    Then user make a payment using upi "<VPA>"
    And verify confirm ticket

    Examples: 
      | From | To  | firstname | lastname | millitaryid |VPA      |
      | MUM  | DEl | wick      | jones    |      123456 |admin@sbi|

  @Roundtrip @Demotest2
  Scenario Outline: To Verify a RoundTrip booking with special fares Family & Friends
    Given user click on bookflight
    When user select roundtrip option
    And user selects "<From>" and "<To>" cities
    And user select date for travel
    And user click on Family & Friends "<specialfare>"
    And user click on Searchflight
    Then user is on flight serached result page with Family and friends fare
    And user click on continue button
    And user can see searched results for RoundTrip
    And user click on continue with return flight
    And user click on skip button
    Then user is on add passenger details page
    And user select title of Passanger
    And user fill first user details "<firstname>" and "<lastname>"
    And user select title of Passanger
    And user fill 2nd user Details "<secondfirstname>" and "<secondlastname>"
    And user select title of Passanger
    And user fill 3rd user details "<thirdfirstname>" and "<thirdlastname>"
    And user select title of Passanger
    And user fill 4th user details "<Fourthfirstname>" and "<fourthlastname>"
    And user click on step1 continue  button
    And user click on skip button at step 2
    And user click on No button on travel assitance page
    Then user is on seat selection page
    And user skip the select seat page
    Then user make a payment using upi "<VPA>"
    And verify confirm ticket

    Examples: 
      | From | To  | specialfare      | firstname | lastname | secondfirstname | secondlastname | thirdfirstname | thirdlastname | Fourthfirstname | fourthlastname |VPA      |
      | MUM  | DEl | Family & Friends | nancy     | jones    | wick            | jones          | admin          | james         | harry           | smith          |admin@sbi|

  @Roundtrip @Demotest  
  Scenario Outline: Make a RoundTrip booking with special fares Armed Forces and super 6E
    Given user click on bookflight
    When user select roundtrip option
    And user selects "<From>" and "<To>" cities
    And user select date for travel
    And user click on Armed force
    And user click on Searchflight
    And user select Super 6E for first flight
    And user contnue with first flight
    And user select Super 6E for second flight
    And user click on continue with return flight
    Then user is on add passenger details page
    And user fill "<firstname>" and "<lastname>" the Passenger Details Forms
    And user fills the military Id "<millitaryid>"
    And user click on continue button with step1
    Then user is on 6E addOn page
    And user clickon skip Btn at addon page
    And User click on Select snack now for first flight
    And user click on passenger arrow btn
    And user add the food on refreshment page
    And user click on continue btn at refreshment page
    And user select second Flight Box
    And user click on passenger arrow btn
    And user add the food on refreshment page
    And user click on continue btn at refreshment page
    And user click on Done Meal
    And user click on continue at step 2 page
    Then user is on Travel Assistance Page
    And user click on not intrested Btn
    Then user is on step3 page
    And user select free seat for first flight
    And user copy seat to second flight
    And user continue to payment page
    Then user make a payment using upi "<VPA>"
    And verify confirm ticket

    Examples: 
      | From | To  | firstname | lastname | millitaryid |VPA      |
      | MUM  | DEl | wick      | jones    |      123456 |admin@sbi|

  @Roundtrip @Demotest  
  Scenario Outline: To Verify a RoundTrip booking with Flexi plus
    Given user click on bookflight
    When user select roundtrip option
    And user selects "<From>" and "<To>" cities
    And user select date for travel
    And user select passenger option
    And user click on Searchflight
    Then user is on flight serached result page
    And user select flexi plus fare for first flight
    And user click on continue button
    And user can see searched results for RoundTrip
    And user select flexi fare for return flight
    And user click on continue with return flight
    Then user is on add passenger details page
    And user fill "<firstname>" and "<lastname>" the Passenger Details Forms
    And user click on continue button with step1
    Then user is on 6E addOn page
    And user add 6E tiffin
    And user click on passenger arrow btn
    And user add the food on refreshment page
    And user click on continue btn at refreshment page
    And user select second Flight Box
    And user click on passenger arrow btn
    And user add the food on refreshment page
    And user click on continue btn at refreshment page
    And user click on done Button at tiffin page
    And user click on continue at step 2 page
    And user click on No button on travel assitance page
    And user skip the select seat page
    Then user make a payment using upi "<VPA>"
    And verify confirm ticket

    Examples: 
      | From | To  | firstname | lastname |VPA      |
      | MUM  | DEl | shvam     | jones    |admin@sbi|

  @Roundtrip @Demotest
  Scenario Outline: To verify that Round trip  cannot club two different fares.
    Given user click on bookflight
    When user select roundtrip option
    And user selects "<From>" and "<To>" cities
    And user select date for travel
    And user select passenger option
    And user click on Searchflight
    Then user is on flight serached result page
    And user select flexi plus fare for first flight
    And user click on continue button
    And user can see searched results for RoundTrip
    And user select Super 6E for second flight
    And user click on continue with return flight
    Then user verify the invalid fare

    Examples: 
      | From | To  |
      | MUM  | DEl |
