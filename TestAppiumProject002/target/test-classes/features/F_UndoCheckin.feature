
@undoCheckin
Feature: UndoCheckin Functionality
  To test that user can proceed for UndoCheckin

  @undoCheckin @Demotest2 @demoscenario
  Scenario: To Verify  User can Check the Undo Check In
    Given launch the app and login
    And user can select Check In Now
    When User can click on Itinery view page
    And User can select undo check in
    When User select the check Box
    Then User Select Final Undo Checkin
