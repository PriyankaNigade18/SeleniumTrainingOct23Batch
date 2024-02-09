Feature: Test opencart application

  Scenario: Test register feture with valid dataset using datatable
    Given Open opencart application with register page
    When user enters valid dataset
      | fname   | lname | email             | tphone    | psw     | cpsw    |
      | tester1 | abc   | tester11234@gmail.com | 989797766 | test123 | test123 |
    When user click on yes radio button
    When user select privacy policy checkbox
    When User click on Continue button
    Then USer should able to register into application
