Feature: Checkout
  User should be able to add products to the cart and check out

  @desktop @tab @phone
  Scenario: Add products to the cart and checkout
    Given I am on the "Pickles" section
    When I add "Priya Cut Mango Without Garlic Pickle - 300g" to the cart
    And checkout
    Then I should be taken to the information page