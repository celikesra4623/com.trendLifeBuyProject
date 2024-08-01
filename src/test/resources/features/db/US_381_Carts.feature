@US-381 @US-344
Feature: US_381_Carts
  DB As an administrator, I should be able to add products to the cart via DataBase, and verify that the added product is in the Carts list

  @US-505
  Scenario: I should be able to add products to the Carts table
    Then DB user creates a product in the carts table with the 196 id, 1 seller id, "product" product type, 200 product id, 10 qty, 5 price

