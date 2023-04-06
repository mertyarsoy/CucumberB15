Feature: Testing Google Search Functionality

  Scenario: Happy Path(positive) Testing for Search
    Given User navigates to the Google
    When User searches for CodeFish
    Then User gets more than ten links on the first page

  Scenario: Happy Path(positive) Testing Result from Search
    Given User navigates to the Google
    When User searches for Kyrgyz food in USA
    Then User validates the message of the result amount

  Scenario: Happy Path(positive) Testing SearchTime from Search
    Given User navigates to the Google
    When User searches for Turkish Baklava
    Then User validates the message of the searchtime




