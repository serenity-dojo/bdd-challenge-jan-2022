Feature: Complete a purchase
  In order to acquire more swag
  As a collectioner
  I want to purchase items online

  Colin wants to buy the new Saucelabs backpack.
  He finds the backpack in the product catalog and adds it to the cart.
  He opens his cart and reviews the content to make sure he doesn't buy anything
  by mistake. Then he provides his payment details and receives a confirmation email.

  Background:
    Given Colin has logged onto the application

  Scenario: Colin purchases a single item
    Given Colin's shopping cart is empty
    When he adds an item to his cart
    And he completes the purchase
    Then the order should be placed with procurement
    And he should be informed "Your order has been dispatched"

