Feature: Test Crm application

  Background: 
    Given Open Crm application

  @SignIn
  Scenario: Test Sign in link
    When user click on SignIn link
    Then SignIn page should open

  @Login
  Scenario: Test Login feature for valid data
    When user enter email "test@gmail.com" and password "test1234"
    When user click on submit button
    Then for valid data user should be able to login
