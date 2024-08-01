Feature: US_346_PageCoupons
  As an administrator, It should be verified that the visibility of the the Coupons page sections;
  they work and function correctly.

  Background: Go to the home page, log in to the page as a admin, and click the Dashboard and The Marketing,
  go to the Coupon page.
    Given Go to "url.admin.login" url
    * Admin lands on admin login url and logins with "admin.seher" email and "password" password
    And Go to "url.admin.marketing.coupon" url

  @UI
  @US-342 #Test Set
  @US-346 #Story
  @US-386 #Test
  Scenario: Verify that the Coupon Type and Title headers are mandatory fields under the Add Coupons section.
    When The User clicks the Save button
    Then The user sees the text of Select Coupon Type First the Creat Coupon Table
    When The User clicks the Select dropdown to create a coupon
    Then The user clicks the Product Base
    When The user clicks the Coupon Code
    Then The user enters the Coupon Code
    When The user clicks the Products field
    Then The user selects a product and clicks
    When The user clicks the Date field
    Then The user selects today date as first date and clicks
    Then The user selects second date and clicks
    And The use clicks Apply button
    When The users clicks the Discount field
    Then The user enters the Amount of discount
    When The user clicks the Discount Type field
    Then The user clicks the Amount or Percentage button
    Then The user clicks the Save button again
    And The user sees the text of The coupon title field is required

  @UI
  @US-342 #Test Set
  @US-346 #Story
  @US-387 #Test
  Scenario: When the field related to the Save button is filled, it should be verified that the it can be saved.
    When The User clicks the Select dropdown to create a coupon
    Then The user clicks the Product Base
    When The users clicks the Title
    And The users enters title
    When The user clicks the Coupon Code
    Then The user enters the Coupon Code
    When The user clicks the Products field
    Then The user selects a product and clicks
    When The user clicks the Date field
    Then The user selects today date as first date and clicks
    Then The user selects second date and clicks
    And The use clicks Apply button
    When The users clicks the Discount field
    Then The user enters the Amount of discount
    When The user clicks the Discount Type field
    Then The user clicks the Amount or Percentage button
    Then The user clicks the Save button again
    #And The users sees on the coupon list table.

  @UI
  @US-342 #Test Set
  @US-346 #Story
  @US-388 #Test
  Scenario: Verify that units in the Coupons List are displayed under the headings SL, Title, Type, Start Date,
  End Date, and Action
    Then Verify that SL title of the Coupon List table are visible
    Then Verify that TITLE title of the Coupon List table are visible
    Then Verify that CODE title of the Coupon List table are visible
    Then Verify that TYPE title of the Coupon List table are visible
    Then Verify that START DATE title of the Coupon List table are visible
    And Click the plus sign
    Then Verify that END DATE title of the Coupon List table are visible
    Then Verify that ACTION title of the Coupon List table are visible
    And Click the plus sign
    And Verify that first row of the table has its values on the Coupon List table

  @UI
  @US-342 #Test Set
  @US-346 #Story
  @US-389 #Test
  Scenario: When the Edit link is clicked from the select tab in the Coupons List / Action column,
  it should be verified that the add new Coupons section next to the Coupons changes to edit Coupons
  and the information about the selected Coupons can be edited.
    When Click the plus sign8
    Then The user clicks the select button
    Then The user clicks the edit button
    And The user sees the creat coupon title has changed to the edit coupon
    When The users clicks the Title
    Then The user deletes the title for edit
    Then The users enters the new title
    And The user clicks the Update button
    And The user sees that the title has been edited

  @UI
  @US-342 #Test Set
  @US-346 #Story
  @US-390 #Test
  Scenario: It should be verified that the relevant Coupons save can be deleted when the Delete link is clicked
  from the select tab in the Coupons List / Action column.
    When The user goes to the second page
    Then The user sees the text of the Showing "11 to 12 of 12" entries
    Then The user click the twelfth plus sign
    Then The user clicks the select-twelfth button
    When The user clicks the delete-twelfth button
    Then The user clicks the delete button again in the pop-up window
    Then The user verifies that the text "11 to 11 of 11" is display

