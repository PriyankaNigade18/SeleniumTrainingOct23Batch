Feature: Test Orangehrm application

  Scenario Outline: Test data driven for login fetaure
    Given Open Hrm application
    When User enters username "<un>"  and enters password "<psw>"
    When User click on login button from hrm page
    Then As per test data for valid dataset user should able to login

    Examples: 
      | un    | psw      |
      | Admin | admin123 |
      | Pooja | test123  |
      | Admin | admin123 |
      | Amit  | test123  |
