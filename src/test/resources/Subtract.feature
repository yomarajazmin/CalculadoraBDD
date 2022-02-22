Feature: Subtraction
  As a user
  I want subtract two values
  So that I get the result of this operation

  Scenario Outline: Add two values
    Given a calculator able to perform basic operations
    When I have the subtraction option available
    Then I subtract <x> and <y> obtaining as result <total>

    Examples:
      | x  | y  | total |
      | 5  | 3  | 2     |
      | 7  | -1 | 8     |
      | -2 | -2 | 0     |
      | 9  | 0  | 9     |