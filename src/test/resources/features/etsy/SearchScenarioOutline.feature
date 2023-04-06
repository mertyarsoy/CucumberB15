@QA_etsyRegression
Feature: Testing Search Functionality on Etsy Scenario Outline

  Scenario Outline: Testing different data for Search Function
    When User searches for '<Item>' on Etsy WebPage
    Then User validates the title '<Title>' from Etsy WebPage
    Examples:
      | Item | Title      |
      | Hat  | Hat - Etsy |
      | Key  | Key - Etsy |
      | Pin  | Pin - Etsy |