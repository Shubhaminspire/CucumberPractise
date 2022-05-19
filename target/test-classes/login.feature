/**@Demo
Feature: Demo Feature


  Background: Set up the browser
    Given When the Chrome Browser Setup

  @Functional
  Scenario: Login with valid login credentials
    Given User is on Login Page
    When User enters "Admin" and "admin123"
    And Tap on Submit Button
    Then User login Successfully and navigate on Home Screen

  @Regression
  Scenario: Login with invalid login credentials
    Given User is on Login Page
    When User enters username and password
      | ADMIN | adjh345 |
    And Tap on Submit Button
    Then User login Successfully and navigate on Home Screen


  @Sanity
  Scenario Outline: Login with various credentials
    Given User is on Login Page
    When User enters combinations "<Username>" and "<Passwords>"
    And Tap on Submit Button
    Then User login Successfully and navigate on Home Screen


    Examples:
      | Username | Passwords |
      | Admin    | admin123  |
      | Admins   | admin123  |
      | Admin    | admin123  |
      | sdad     | admin123  |



**/