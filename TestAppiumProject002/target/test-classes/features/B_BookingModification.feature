
@Bookingmodification
Feature: Booking Modification Functionality
  I want to test booking modification functionality

Background: 
    Given Launch the Indigo app and login

  @BookingModification @Demotest3
  Scenario Outline: To Booking Modifaction for Addons.
    Given user is on home page and click on checkin module
    And click on view Itenerary button
    And user select additional services option
    And verify additional services page
    And select excess baggage addon
    And select checkbox and confirm it
    And click on continue with addon
    And skip the travel assistance addons
    When user verify payment page
    And select Credicard option
    And enter valid credentials "<cardnumber>" and "<valdate>" and "<cvv>" and "<cardname>" of credit card
    And accept terms and click pay
    And Click for confirm Payment
    And click on back to merchent page
    Then verify  modified addon

    Examples: 
      | cardnumber       | valdate | cvv | cardname |
      | 4263982640269299 | 02/23   | 837 | Visa     |

   @BookingModification @demoscenario @Demotest3
  Scenario Outline: To Booking Modifaction for Update contact deatails.
    Given user is on home page and click on checkin module
    And click on view Itenerary button
    And user select update contact details
    When user enters "<mobNumber>" and "<emailaddress>" for update
    And click on update details button
    Then verify updated contact details

    Examples: 
      | mobNumber  | emailaddress       |
      | 9766940710 | mk@gmail.com       |

  

   @BookingModification @Demotest2 @demoscenario @Demotest3
  Scenario Outline: To Booking Modifaction for incorrect Update contact deatails.
    Given user is on home page and click on checkin module
    And click on view Itenerary button
    And user select update contact details
    When user enters incorrect "<mobNumber>" and "<emailaddress>" for update
    And click on update details button
    Then verify enter valid contact details message

    Examples: 
      | mobNumber | emailaddress       |
      | 762082813 | mangeshk@gmail.com |
      
      
      @Bookingmodification @Demotest3
  Scenario Outline: To Booking Modifaction for Change seats.
    Given user is on home page and click on checkin module
    And click on view Itenerary button
    And user select Change seats
    When user select seat
    And click on continue for payment
    Then verify modified seat change

   Examples: 
      | cardnumber       | valdate | cvv | cardname |
      | 4263982640269299 | 02/23   | 837 | Visa     |
