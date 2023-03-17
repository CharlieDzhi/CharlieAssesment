@run
Feature: Contact Us Page Feature

  Scenario Outline: Verify that the contact form can be submitted successfully with all required fields filled in correctly.

    Given Given the User is logged on to ryze "<userName>", "<Password>"
    And  User navigates to Repository->Studies
    And  User enter the tech test study view
    And  User enter the Data acquisition asset group view
    And  User Selects forms
    And  User select to view the Medical History form
    And The user select to edit the form by adding a Description property to the form
    And  User saves the changes
    Then A a user logout of the application


    Examples:
      | userName          | Password  |
      | testteamtechtest  | Ryz3T3st! |