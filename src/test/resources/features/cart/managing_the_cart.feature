Feature: Managing the cart

  Background:
    Given Colin has logged onto the application

  Scenario: Colin adds an item to the cart
    Given Colin is browsing the product catalog
    When Colin adds "Sauce Labs Backpack" to the cart
    Then his cart should contain the following items:
      | Title               | Price  |
      | Sauce Labs Backpack | $29.99 |

