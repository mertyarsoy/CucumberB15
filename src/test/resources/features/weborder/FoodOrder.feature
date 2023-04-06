@QA_demoRegression
Feature: Testing Food Order Functionality of WebOrderPage

  Background: Food Order Steps
    Given User provides 'guest1@microworks.com' and 'Guest1!'
    And User validates the 'ORDER DETAILS - Weborder' from HomePage
    When User clicks Group Order Box and Next Button
    And User sends the word 'I love Cucumber' for note to the Invitees Section
    And User sends e-mail address which are 'ahmet@gmail.com,' and 'mehmet@gmail.com' to the Invite List
@smoke @ahmet @mehmet
  Scenario: Testing Happy Path Food Order for MyHouse
    And User chooses the delivery address 'My House' and validates the address 'San Francisco, CA 94123'
    And User clicks the create Group Order Button
    Then User validates the header of the page 'View Group Order'
    And User validates the sentence 'Your group order is now pending' from description

  @smoke @mahmut @ayse
  Scenario: Testing Happy Path Food Order for Office
    And User chooses the delivery address 'Office' and validates the address '2012 EMPIRE BLVD'
    And User clicks the create Group Order Button
    Then User validates the header of the page 'View Group Order'


