@Gmail
Feature: Gmail functionality

  Scenario: Log In to the account
    Given user open the gmail home
    And user input the username and password
    When user send himself an email
    Then user get a new email
    When user sing out
    Then home screen is displayed





