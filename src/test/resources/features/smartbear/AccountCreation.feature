@QA_smartBearRegression
Feature: Testing the account creation and validation from SmartBear Website

  Scenario Outline: Testing different data from SmartBear Website
    Given User provides username and password
    When User provides product information '<product>' and '<quantity>'
    And User provides general information '<name>', '<street>', '<city>', '<state>' and '<zip>'
    And User provides payment information '<card>', '<cardNumber>' and '<expDate>'
    Then User validates the message '<message>'
    And User validates '<name>', '<product>', '<quantity>','<street>','<city>','<state>','<zip>','<card>','<cardNumber>','<expDate>'

    Examples:
      | product     | quantity | name   | street | city     | state | zip   | card             | cardNumber | expDate | message   |
      | MyMoney     | 5        | Mert   | 201 Se | Miami    | FL    | 33131 | Visa             | 21333112   | 05/23   | New order |
      | FamilyAlbum | 7        | Ahmet  | 301 os | Chicago  | IL    | 69021 | MasterCard       | 34234233   | 06/27   | New order |
      | ScreenSaver | 10       | Mahmut | 937 ns | New York | NY    | 87231 | American Express | 32131312   | 09/29   | New order |
