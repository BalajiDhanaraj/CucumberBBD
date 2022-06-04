Feature: This login feature to test Oranges
  Scenario: To Check Login Scenario with header definition
    Given your are in the login page
    When your should enter the login credentials
    |Username|Password|
    |Admin   |admin123|
    And your should click the login button
    Then final close the browser
