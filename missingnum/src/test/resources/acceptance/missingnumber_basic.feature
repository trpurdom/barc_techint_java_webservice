Feature: Missing Natural Number Basic Scenario

  Scenario: Basic Missing Number
    When I provide the following number sequence
    | 3 | 5 | 2 | 1 |
    Then the missing number returned should be 4

  Scenario: No number Missing
    When I provide the following number sequence
    | 5 | 4 | 3 | 2 | 1 |
    Then the missing number returned should be null

  Scenario: Invalid non natural input
    When I provide the following number sequence
    | -1 | 1 | 2 | 3 | 4 |
    Then the service throws an exception advising "Non Natural Number Input"