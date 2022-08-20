Feature: Register Functionality

  Scenario: Login with valid username and password
    Given Navigate to ParaBank
    Then Click to Register Button
    And Fill the First Name as "Group"
    And Fill the Last Name as "3"
    And Fill the Address as "Techno"
    And Fill the City as "Toronto"
    And Fill the State as "USA"
    And Fill the Zip Code as "34000"
    And Fill the Phone # as "+123456789"
    And Fill the SSN as "123456"
    And Fill the Customer Username as "Group3"
    And Fill the Customer Password as "grup3123"
    And Fill the Confirm as "grup3123"
    When Click to SecondRegister Button
    Then Verification of successfully registering