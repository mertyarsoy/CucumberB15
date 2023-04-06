@QA_demoRegression
Feature: Testing Login Functionality of WebOrderPage

  @smoke
  Scenario: Testing positive login(correct username + correct password)
    When User provides 'guest1@microworks.com' and 'Guest1!'
    Then User validates the 'ORDER DETAILS - Weborder' from HomePage

  Scenario: Testing negative login(correct username + wrong password)
    When User provides 'guest1@microworks.com' and 'Mert!'
    Then User validates the 'Sign in Failed' error message

  Scenario: Testing negative login(wrong username + wrong password)
    When User provides ' ' and 'Mert!'
    Then User validates the 'Sign in Failed' error message

  Scenario: Testing negative login(no username + wrong password)
    When User provides '' and 'Mert!'
    Then User validates the 'Sign in Failed' error message

  Scenario: Testing negative login(wrong username + no password)
    When User provides 'adsasdad@gmail.com' and ''
    Then User validates the 'Sign in Failed' error message

  @smoke
  Scenario: Testing negative login(no username + no password)
    When User provides '' and ''
    Then User validates the 'Sign in Failed' error message

