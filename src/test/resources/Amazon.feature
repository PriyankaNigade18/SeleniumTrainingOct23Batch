@All
Feature: Test Amazon application

  Background: 
    Given Open Amazon home page

  @Homepage
  Scenario: Test title of homepage
    When User capture current title of homepage
    Then Title should matched with homepage title

  @Bestseller
  Scenario: Test title of BestSeller
    When user open bestsellers page
    When User capture current title of bestSellers
    Then title should match with BestSellers page title

	@ignore
  #@Mobiles
  Scenario: Test title of Mobiles
    When user open mobiles page
    When User capture current title of mobiles
    Then title should match with mobiles page title
	@ignore
  #@Todaysdeal
  Scenario: Test title of TodaysDeal
    When user open todays deal page
    When User capture current title of todays deal
    Then title should match with todays deal page title
