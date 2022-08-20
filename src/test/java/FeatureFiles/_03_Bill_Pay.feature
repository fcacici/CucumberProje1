Feature: Payment Functionality

  Scenario Outline: Different type of Payment
    Given Navigate to ParaBank
    And Fill the Username as "Group3"
    And Fill the Password as "grup3123"
    When Click to Log in button
    Then Verification of successfully logging in
    When Click to Bill page
    And Fill the Bill Payee Name as "<payee>"
    And Fill the Bill Address as "<address>"
    And Fill the Bill City as "<city>"
    And Fill the Bill State as "<state>"
    And Fill the Bill Zip Code as "<zip>"
    And Fill the Bill Phone # as "<phone>"
    And Fill the Bill Account # as "<account>"
    And Fill the Bill Verify Account # as "<verify>"
    And Fill the Bill Amount: $ as "<amount>"
    When Click to Send Payment
    Then User should pay successfully

    Examples:
      | payee          |address  |city       |state      |zip   |phone      |account  |verify   |amount |
      | Hydro (Elect.) |Address1 |Istanbul   |Istanbul   |00001 |+123456789 |12345678 |12345678 |85     |
      | Water          |Address2 |Vancouver  |Colombia   |00002 |+234567891 |23456789 |23456789 |45     |
      | Heat           |Address3 |California |California |00003 |+345678912 |34567891 |34567891 |120    |


