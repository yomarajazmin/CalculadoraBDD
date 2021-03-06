Feature: Division
  As a user
  I want divide two values
  So that I get the result of this operation

  Scenario Outline: Divide two values
    Given a calculator able to perform basic operations
    When I have the division option available
    Then I divide <x> and <y> obtaining as result <total>

    Examples:
      | x   | y  | total |
      | 10  | 2  | 5     |
      | 7   | 7  | 1     |
      | -15 | 3  | -5    |
      | -6  | -3 | 2     |
      | 5   | 0  | 0     |
