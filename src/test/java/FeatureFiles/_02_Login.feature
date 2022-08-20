Feature: Login Functionality

  Background:
    Given Navigate to ParaBank

  Scenario: Login with valid username and password
    And Fill the Username as "Group3"
    And Fill the Password as "grup3123"
    When Click to Log in button
    Then Verification of successfully logging in
    When Click to Log out button

  Scenario Outline:
    And Fill the Username as "<username>"
    And Fill the Password as "<password>"
    When Click to Log in button
    Then User should see error message

    Examples:
      | username  | password            |
      | YANLIS    | grup3123            |
      | Group3 | YANLISYANLISYANLIS  |