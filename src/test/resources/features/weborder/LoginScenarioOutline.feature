@QA_demoRegression
Feature: Negative Login Functionality Testing with Scenario Outline

  Scenario Outline: Negative Login
    When User provides '<Username>' and '<Password>'
    Then User validates the '<Message>' error message
    Examples:
    | Username | Password | Message |
    | guest1@microworks.com | Mert! | Sign in Failed |
    | adsasdad@gmail.com    | Mert! | Sign in Failed |
    |                       | Mert! | Sign in Failed |
    | adsasdad@gmail.com    |       | Sign in Failed |
    |                       |       | Sign in Failed |

