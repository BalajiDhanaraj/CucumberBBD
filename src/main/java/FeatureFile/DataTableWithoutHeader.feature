Feature: This is login feature to test Orange HRM
  Scenario: To Check Login Scenario
    Given you are in the login page
    When you should enter the login credentials
    |Admin|admin123|
    And you should click the login button
    Then finally close the browser
