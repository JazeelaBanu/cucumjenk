
Feature: Login  

  Scenario Outline: Successful Login
    Given Login the Testme App
    When I enter  the "<username>" in the field
    Then I enter the "<password>" in the field
    And page is displayed

    Examples: 
      | username  | password       | 
      | Lalitha  |    Password123    |
      