Feature: US_346_PageCoupons
  As an administrator, I want the Product Stock page to be able to check the stock status of the products on the site.

  Background: Go to the home page, log in to the page as a admin, and click the Dashboard and The Product Stock,
  go to the product-stock page.
    Given Go to "url.admin.login" url
    * Admin lands on admin login url and logins with "admin.seher" email and "password" password
    And Go to "url.admin.admin-report.product-stock" url

  @UI
  @US-342 #Test Set
  @US-347 #Story
  @US-391 #Test
  Scenario: In order to filter the product stock information, it must be verified that
  the Type can be selected from the Filter selection criteria For Product stock section.
    And Verifies that the user has the type text above the search bar

  @UI
  @US-342 #Test Set
  @US-347 #Story
  @US-392 #Test
  Scenario: Verify that Select One or All Product List can be selected as the type.
    When The user clicks the Type button
    Then The user clicks the Select One button
    And Verifies that you see select one text in the search bar
    When The user clicks the Type button
    Then The user clicks the All Product List button
    And Verifies that you see select All Product List text in the search bar

  @UI
  @US-342 #Test Set
  @US-347 #Story
  @US-393 #Test
  Scenario: When the Type is selected and the Search button is clicked,
  it should be verified that the stock list of the selected products is displayed.
    When The user clicks the Type button
    Then The user clicks the All Product List button
    Then The user clicks the search button
    And Verifies that the stock list of the selected products is displayed
    When The user clicks the Type button
    Then The user enters the Physical Product as a type in the search bar
    Then The user clicks the search button
    And Verifies that the stock list of the selected products is displayed for select one


