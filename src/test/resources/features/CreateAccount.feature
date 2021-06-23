Feature: Create Account
  New user should be able to create an account

  Scenario: Create Account
    Given I am on the create my account page
    When I fill in required information
    Then my account should be created