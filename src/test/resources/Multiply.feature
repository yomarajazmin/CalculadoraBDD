Feature: Multiplication
  As a user
  I want multiply two values
  So that I get the result of this operation

  Scenario Outline: Multiply two values
    Given a calculator able to perform basic operations
    When I have the multiplication option available
    Then I multiply <x> and <y> obtaining as result <total>

    Examples:
      | x  | y  | total |
      | 2  | 3  | 6     |
      | 7  | -1 | -7    |
      | -2 | -2 | 4     |
      | 7  | 0  | 0     |