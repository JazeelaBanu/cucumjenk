
Feature: 
  I want to use this template for my feature file

Scenario Outline: Successful search
   Given Login the Testme App
    When I enter enter the "<username>" in the field
    Then I enter the "<password>" in the field
    And page is displayed
    Then  I enter the "<item>" in the find details
    Then  I click on find details
    And item is displayed

    Examples: 
      | username  | password         | item   |
      | Lalitha  |    Password123    | head   |
      