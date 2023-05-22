@Booking
Feature: Indigo Booking Flow
  Tot test Booking flow of the application

  Background: Indigo Customer login with Mobile
    Given User is Logged in

  @Booking @negativeValidation @Demotest
  Scenario: To Verify the maximum Infants allowed 4
    Given User is on Book Flight Page
    And User click on passengers
    When User add Adults
    And User add infants more than four
    Then User validate the infants count

  @Booking @negativeValidation2 @Demotest
  Scenario: To Verify the maximum Children allowed 4
    Given User is on Book Flight Page
    And User click on passengers
    When User add child more than four
    Then User validate the child count

  @Booking @negativeValidation @Demotest
  Scenario Outline: To Verify the Pax count cannot be more than 9
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Search and select a "<currency>"
    And User click on passengers
    And User Selects Passengers
    Then User Clicks on Search Flight
    And Verify pax count

    Examples: 
      | currency     | To  | From |
      | Indian Rupee | Mum | IXC  |

  @Booking @Demotest
  Scenario Outline: To Verify that user can search a flight
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Search and select a "<currency>"
    And User click on passengers
    And User Selects Passengers
    Then User Clicks on Search Flight
    And User can see Search results for "<To>" and "<From>" cities

    Examples: 
      | currency     | To  | From |
      | Indian Rupee | IXC | BOM  |

  @Booking @Demotest
  Scenario Outline: To Verify that user can modify flight search
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User click on passengers
    And User Selects Passengers
    Then User Clicks on Search Flight
    And User can see Search results for "<To>" and "<From>" cities
    And User Click on modify Search
    And User navigate back to the Book Flight Page
    And User click on passengers
    And User Selects Passengers
    And User Clicks on Search Flight

    Examples: 
      | currency     | To  | From |
      | Indian Rupee | IXC | BOM  |

  @Booking @negativeValidation @Demotest
  Scenario Outline: To Verify that To and From cannot be same
    Given User is on Book Flight Page
    When User selects same cities for "<To>" and "<From>"
    Then Destination city not displyed in searched list

    Examples: 
      | To  | From |
      | MUM | MUM  |

  @Booking @Demotest
  Scenario Outline: Make a booking with saver fare option
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Search and select a "<currency>"
    And User click on passengers
    And User adds 2 adult passengers
    And User Clicks on Search Flight
    And User selects saver fare option
    And click on continue button and skipFlexi
    And User provides first adult passengers "<Title1>" "<Firstname1>" and "<Lastname1>"
    And User provides second adult passengers "<Title2>" "<Firstname2>" and "<Lastname2>"
    And User skips Addons and Insurance and seat selection
    Then verify user is on payment page
    And verify user payment successfull using upi "<VPA>"

    Examples: 
      | currency     | To  | From | Title1 | Firstname1 | Lastname1 | Title2 | Firstname2 | Lastname2 | VPA     |
      | Indian Rupee | DEL | BOM  | Mr     | wicky      | jones     | Mr     | admin      | adminn    | avi@sbi |

  @Booking @Demotest2
  Scenario Outline: Make a booking with special fares Armed Forces
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Search and select a "<currency>"
    And User click on passengers
    And User Select a Passenger with infant
    And User Selects any "<special fare>"
    And User Clicks on Search Flight
    And User clicks on continue button on search flight page
    And User provides first adult passengers "<Title1>" "<Firstname1>" and "<Lastname1>"
    And User provides infant passengers "<Title2>" "<Firstname2>" and "<Lastname2>"
    And User skips Addons and Insurance and seat selection
    Then verify user is on payment page
    And verify user payment successfull using upi "<VPA>"

    Examples: 
      | currency     | To  | From | special fare | Title1 | Firstname1 | Lastname1 | Title2 | Firstname2 | Lastname2 | VPA     |
      | Indian Rupee | DEL | BOM  | Armed Forces | Mr     | wicky      | jones     | male   | admin      | adminn    | avi@sbi |

  @Booking @Demotest2
  Scenario Outline: Make a booking with special fares Armed Forces Super6E fare option
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Search and select a "<currency>"
    And User click on passengers
    And User Select a Passenger with infant
    And User Selects any "<special fare>"
    And User Clicks on Search Flight
    And User selects Super6E fare option
    And User clicks on continue button
    And User provides first adult passengers "<Title1>" "<Firstname1>" and "<Lastname1>"
    And User provides infant passengers "<Title2>" "<Firstname2>" and "<Lastname2>"
    And User Add a snack for Super 6e and continue
    And User selects a seat
    Then verify user is on payment page
    And verify user payment successfull using upi "<VPA>"

    Examples: 
      | currency     | To  | From | special fare | Title1 | Firstname1 | Lastname1 | Title2 | Firstname2 | Lastname2 | VPA     |
      | Indian Rupee | DEL | BOM  | Armed Forces | mRs    | Nancy      | Wick      | Male   | Admin      | Admin     | avi@sbi |

  @Booking @Demotest2
  Scenario Outline: Make a booking with special fares Students
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Search and select a "<currency>"
    And User click on passengers
    And User Select a Passenger
    And User Selects Students special fare option
    And User Clicks on Search Flight
    And User clicks on continue button
    And User provides passenger details for student "<Title>" "<Firstname>" "<Lastname>" "<Stdentid>" "<CollageName>"
    And User skips Addons and Insurance and seat selection
    Then verify user is on payment page

    Examples: 
      | currency     | To  | From | Title | Firstname | Lastname | Stdentid | CollageName |
      | Indian Rupee | DEL | BOM  | Mr    | wicky     | jones    |     1112 | Kellton     |

  @Booking @Demotest2
  Scenario Outline: Make a booking with special fares Students and Super6E fare option
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Search and select a "<currency>"
    And User click on passengers
    And User Select a Passenger
    And User Selects Students special fare option
    And User Clicks on Search Flight
    And User select Super6e fare option
    And User clicks on continue button
    And User provides passenger details for student "<Title>" "<Firstname>" "<Lastname>" "<Stdentid>" "<CollageName>"
    And User Add a snack for Super 6e and continue
    And User selects a seat
    Then verify user is on payment page
    And verify user payment successfull using upi "<VPA>"

    Examples: 
      | currency     | To  | From | Title | Firstname | Lastname | Stdentid | CollageName | VPA     |
      | Indian Rupee | DEL | BOM  | Mr    | wicky     | jones    |     1112 | Kellton     | avi@sbi |

  @Booking @Demotest2
  Scenario Outline: Make a booking with special fares Family & Friends
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Search and select a "<currency>"
    And User Selects any "<special fare>"
    And User Clicks on Search Flight
    And User clicks on continue button and skipFlexi
    And User provides passenger details for Family & Friends
    And User skips Addons and Insurance and seat selection
    Then verify user is on payment page
    And verify user payment successfull using upi "<VPA>"

    Examples: 
      | currency     | To  | From | special fare     | VPA     |
      | Indian Rupee | DEL | BOM  | Family & Friends | avi@sbi |

  @Booking @Demotest2
  Scenario Outline: Make a booking with special fares Family & Friends and Flexi Plus fare option
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Search and select a "<currency>"
    And User Selects any "<special fare>"
    And User Clicks on Search Flight
    And User selects Flexi Plus fare option
    And User clicks on continue button
    And User provides passenger details for Family & Friends
    And User Add a snack and continue for family
    Then verify user is on payment page
    And verify user payment successfull using upi "<VPA>"

    Examples: 
      | currency     | To  | From | special fare     | VPA     |
      | Indian Rupee | DEL | BOM  | Family & Friends | avi@sbi |

  @Booking @Demotest2  
  Scenario Outline: Make a booking with special fares Unaccompanied Minor
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Search and select a "<currency>"
    And User click on passengers
    And User Select a Passenger
    And User Selects any "<special fare>"
    And User Clicks on Search Flight
    And User clicks on continue button
    And User Enter Unaccompanied Minor details "<Title>" "<Firstname>" "<Lastname>"
    And User skips Addons and Insurance and seat selection
    Then verify user is on payment page
    And verify user payment successfull using upi "<VPA>"

    Examples: 
      | currency     | To  | From | special fare        | Title | Firstname | Lastname | VPA     |
      | Indian Rupee | DEL | BOM  | Unaccompanied Minor | Male  | wicky     | jones    | avi@sbi |

  @Booking @Demotest2
  Scenario Outline: Make a booking with special fares Unaccompanied Minor and Super6E fare option
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Search and select a "<currency>"
    And User click on passengers
    And User Select a Passenger
    And User Selects any "<special fare>"
    And User Clicks on Search Flight
    And User select Super6e fare option
    And User clicks on continue button
    And User Enter Unaccompanied Minor details "<Title>" "<Firstname>" "<Lastname>"
    And User Add a snack for Super 6e and continue
    And User selects a seat
    Then verify user is on payment page
    And verify user payment successfull using upi "<VPA>"

    Examples: 
      | currency     | To  | From | special fare        | Title | Firstname | Lastname | VPA     |
      | Indian Rupee | DEL | BOM  | Unaccompanied Minor | Male  | wicky     | jones    | avi@sbi |

  @Booking @Demotest2
  Scenario Outline: Make a booking with FLEXI PLUS
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Clicks on Search Flight
    And User selects Flexi Plus fare option
    And User clicks on continue button
    And User fills the passenger details
    And User verifies add-ons included in flexi plus fare
    And User Add a snack and continue
    And User skips Insurance
    And User skips seat selection
    Then verify user is on payment page
    And verify user payment successfull using upi "<VPA>"

    Examples: 
      | currency     | To  | From | VPA     |
      | Indian Rupee | DEL | BOM  | avi@sbi |

  @Booking @Demotest2
  Scenario Outline: Make a booking with SUPER 6E CAPITAL
    Given User is on Book Flight Page
    When User selects "<To>" and "<From>" cities
    And User selects a departure date
    And User clicks on Done button
    And User Clicks on Search Flight
    And User select Super6e fare option
    And User clicks on continue button
    And User fills the passenger details
    And User verifies add-ons included in Super 6E fare
    And User Add a snack for Super 6e and continue
    And User selects a seat
    Then verify user is on payment page
    And verify user payment successfull using upi "<VPA>"

    Examples: 
      | currency     | To  | From | VPA     |
      | Indian Rupee | DEL | BOM  | avi@sbi |
