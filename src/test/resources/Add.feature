Feature: Addition
  As a user
  I want add two values
  So that I get the result of this operation

  Scenario Outline: Add two values
    Given a calculator able to perform basic operations
    When I have the addition option available
    Then I add <x> and <y> obtaining as result <total>

    Examples:
      | x  | y  | total |
      | 2  | 3  | 5     |
      | 7  | -1 | 6     |
      | -2 | -2 | -4    |
      | 0  | 0  | 0     |