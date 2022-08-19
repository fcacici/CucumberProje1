Feature: Payment Functionality

  Scenario: Confirmation of Bill Payment
    Given Navigate to basqar
    When Enter valid username and password and click login button
    Then User should login successfully

  Scenario Outline: Different type of Payment
    And Click to Bill page
    When Enter as "<payee>" as "<amount>" and send payment
    Then User should pay successfully

    Examples:
      | payee               | amount |
      | Hydro (Electricity) | 85     |
      | Water               | 45     |
      | Heat                | 120    |


