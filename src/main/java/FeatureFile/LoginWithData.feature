Feature: This is login feature to test Orange
  Scenario: To Check Login With Data Scenario
    Given user is on the login page
    When user enter the login "Admin" and "admin123"
    And user click the login button succesfully
    Then user is nagivate to home and view
    And close the browser
