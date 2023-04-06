@QA_etsyRegression
Feature: Testing Search Functionality on Etsy

  Scenario: Validation Title of Etsy Hat
    When User searches for 'Hat' on Etsy WebPage
    Then User validates the title 'Hat - Etsy' from Etsy WebPage

  Scenario: Validation Title of Etsy Key
    When User searches for 'Key' on Etsy WebPage
    Then User validates the title 'Key - Etsy' from Etsy WebPage

  Scenario: Validation Title of Etsy Pin
    When User searches for 'Pin' on Etsy WebPage
    Then User validates the title 'Pin - Etsy' from Etsy WebPage

