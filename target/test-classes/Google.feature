Feature: Test Google application

  Background: 
    Given Open Google application

  Scenario: Test google home page title
    #Given Open Google application
    When I capture current title of the page
    Then Title should match with Google

  Scenario: Test google search feature with valid keyword
    #Given Open Google application
    When I enter valid keywrod "testng" into search box
    Then I should get valid search result
