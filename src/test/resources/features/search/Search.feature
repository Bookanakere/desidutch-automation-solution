Feature: Search
  User should be able to search any product

  Scenario: Search by collection
    Given I am on the homepage of the desidutchstore
    When I search for collection of "Pickles"
    Then I should see "Pickles"

  Scenario: Search by category
    Given I am on the homepage of the desidutchstore
    When I search for category of "Lentils"
    Then I should see items for "Pickles"