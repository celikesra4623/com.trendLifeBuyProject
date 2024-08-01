Feature: US_034_ProductList
  @US_034 @US_246
  Scenario: Verify that the Product List page is accessible from the Products menu.
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Admin clicks Products dropdown menu
    Then Admin sees Product List of the Products dropdown menu


  @US_034 @US_247
  Scenario: Verify that the Product List page is accessible from the Products menu.
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Admin clicks Products dropdown menu
    Then Admin clicks Product List link in the Products dropdown menu
    Then Admin sees list items in headings of Product List link
    Then Admin clicks table list in the header
    And Verify that they go to the relevant page in list item headings


  @US_034 @US_248
  Scenario: Verifies that the products are listed under the headings
  SL, Name, Product Type, Brand, Image, Stock, Status, Action in the Product List
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Admin clicks Products dropdown menu
    Then Admin clicks Product List link in the Products dropdown menu
    Then Admin clicks table list in the header
    And Verify that the products are listed under the headings

  @US_034 @US_249
  Scenario: Verify that it is possible to search in the Product List with the Quick Search TextBox
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Admin clicks Products dropdown menu
    Then Admin clicks Product List link in the Products dropdown menu
    Then Click on the QUICK SEARCH
    Then Enter the text to be searched in the Quick Search TextBox and press the ENTER key.
    And Verify that The products is searchable in the Quick Search TextBox


  @US_034 @US_250
  Scenario: It should be verified that the product status can be changed
  from the Status column in the Product List.
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Admin clicks Products dropdown menu
    Then Admin clicks Product List link in the Products dropdown menu
    Then Click the checkbox in the Status column in the Product List
    And Check the toast message that it visible Updated successfully!

  @US_034 @US_251
  Scenario: It should be verified that the View link is visible and displays the product
  when the select tab is clicked in the Action column in the Product List.
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Admin clicks Products dropdown menu
    Then Admin clicks Product List link in the Products dropdown menu
    Then Click the SELECT in the ACTION column in the Product List.
    Then Click the VIEW link in the SELECT button
    And Verify that VIEW page is visible and displays the product when clicked



  @US_034 @US_252
  Scenario: It should be verified that the Edit link is visible on the select tab in the Action column
  in the Product List and it redirects to the Edit Product page when clicked.
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Admin clicks Products dropdown menu
    Then Admin clicks Product List link in the Products dropdown menu
    Then Click the SELECT in the ACTION column in the Product List.
    Then Click the EDIT link in the SELECT button
    And Verify that EDIT page is visible and displays the product when clicked