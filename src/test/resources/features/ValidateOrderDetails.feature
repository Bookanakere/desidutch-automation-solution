Feature: Validate order details
  User logged into the site should be able to check order details

  Scenario: Validate order details
    Given User is logged in to the application with valid credentials "email" and "password"
    When user visits my orders page
    Then following order details should be present "DD2203 July 14, 2021 Paid Fulfilled €3.98"
