Feature: Test OpenCart application

  Scenario: Test login with valid data
    Given Open OPencart login page
    When user enters valid credentials
      | email                 | pas     |
      | tester11234@gmail.com | test123 |
      When user click on login button
      Then USer should be able to logon into opencart application
