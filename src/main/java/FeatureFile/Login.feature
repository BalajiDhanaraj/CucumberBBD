@Simplelogin @Datatable
Feature: This is login feature to test Orange HRM
  @Positive
  Scenario: To Check Login Positive Scenario
    Given user is on login page
    When user enter the login username and password
    And user click the login button
    Then user is nagivate to home page
    And close the browser

  @Negavative
  Scenario: To Check Login Nagvative Scenario
    Given user is on login page
    When user enter the login username and password
    And user click the login button
    Then user is nagivate to home page
    And close the browser
