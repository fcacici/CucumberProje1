Feature: Login Functionality

  Scenario: Login with valid username and password
    Given Navigate to basqar
    When Enter valid username and password and click login button
    Then User should login successfully and logout

  Scenario Outline:
    Given Navigate to basqar
    When Enter unverified as "<username>" as "<password>" and click login button
    Then User should see error message

    Examples:
      | username  | password            |
      | Yanlis    | grup3123            |
      | grup03    | YANLISYANLISYANLIS  |