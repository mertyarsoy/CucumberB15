@QA_smartBearRegression2
Feature: Testing the account creation and validation from SmartBear Website

  Scenario:Testing different data from SmartBear Website
    Given User provides username and password
    When User provides product information
      | product  | MyMoney |
      | quantity | 5       |
    And User provides general information
      | name   | Mert   |
      | street | 201 Se |
      | city   | Miami  |
      | state  | FL     |
      | zip    | 33131  |
    And User provides payment information
      | card       | Visa     |
      | cardNumber | 21333112 |
      | expDate    | 05/23    |

    Then User validates the message
      | New order |

#    And User validates '<name>', '<product>', '<quantity>','<street>','<city>','<state>','<zip>','<card>','<cardNumber>','<expDate>'
#    Examples:
#      | product | quantity | name | street | city  | state | zip   | card | cardNumber | expDate | message   |
#      | MyMoney | 5        | Mert | 201 Se | Miami | FL    | 33131 | Visa | 21333112   | 05/23   | New order |

