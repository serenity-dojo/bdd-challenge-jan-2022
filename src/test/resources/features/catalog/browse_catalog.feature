Feature: Browse the catalog

  Background:
    Given Colin has logged onto the application

  Rule: Should show the top 6 best selling items on the home page
    Example: The top 6 products are displayed
      When Colin is browsing the product catalog
      Then he should be presented with 6 top-selling products

  Rule: Should show the price and title of each product
    Example: Colin views information about the top 6 products
      When Colin is browsing the product catalog
      Then he should be presented with the following products:
        | Title                 | Price  |
        | Sauce Labs Backpack   | $29.99 |
        | Sauce Labs Bike Light | $9.99  |
        | Sauce Labs Onesie     | $7.99  |

#
#    Example: Only 5 products quality as top-selling
#      Given there are 6 items in the catalog
#      But 1 item has no sales logged
#      When Colin is browsing the product catalog
#      Then he should be presented with 5 top-selling products
#
#  Rule: Customers should be able to view product details for a specific product
#    Scenario Outline: Colin views the details for a specific product
#      Given Colin is browsing the product catalog
#      When Colin views the product details for <Product Name>
#      Then he should see a product with the following details:
#        | Name           | Price   | Description   |
#        | <Product Name> | <Price> | <Description> |
#      And the product should have an image displayed
#
#      Examples:
#        | Product Name            | Price | Description                   |
#        | Sauce Labs Backpack     | 29.99 | carry.allTheThings()          |
#        | Sauce Labs Bolt T-Shirt | 15.99 | Get your testing superhero on |
#

