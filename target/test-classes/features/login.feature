Feature: Login feature
  User Story:
  As a user, I should be able login with correct
  credentials to the web page.

  Accounts are: salesManager, posManager

  @wip
  Scenario: Login as salesManager
    When user enters salesManager username
    And user enters salesManager password
    Then user should see the dashboard



  Scenario: Login as posManager
    When user enters posManager username
    And user enters posManager password
    Then user should see the dashboard




