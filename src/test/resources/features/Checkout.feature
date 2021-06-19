Feature: Checkout
  User should be able to add products to the cart and check out

  Scenario: Add products to the cart and checkout
    Given I am on the "Lentils" section
    When I add "TRS Urid / Urad Dal 500g" to the cart
    And checkout
    Then I should be taken to the information page