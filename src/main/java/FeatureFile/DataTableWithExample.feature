Feature: This is the Loign page of orangehrm
  Scenario Outline: This is login with scenario outline for orangehrm
    Given procced with login page
    When Using the "<Username>" and "<Password>" in the login page
    And Click on the button
    Then close all the browser

Examples:
    |Username|Password|
    |Admin   |admin123|






