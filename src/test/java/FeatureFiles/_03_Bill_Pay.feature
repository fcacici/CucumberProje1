Feature: Payment Functionality

  Scenario Outline: Different type of Payment
    Given Navigate to basqar
    When Enter valid username and password and click login
    Then User should login successfully
    And Click to Bill page
    When Enter as "<payee>" as "<amount>" and send payment
    Then User should pay successfully

    Examples:
      | payee               | amount |
      | Hydro (Electricity) | 85     |
      | Water               | 45     |
      | Heat                | 120    |


