Feature: US_027_ShoppingAsRegisteredUser
  As a registered user of the site, I want to be able to shop from the site.

  @US-27 @US-323
  Scenario: Verify that the site is accessible.
    # Launch the borwser # applied with before Hook
    When Go to "url.user.home" url
    Then Verify actual URL is "url.user.home"


  @US-27 @US-324
  Scenario: Verify that the Login button on the main page appears and redirects to the Login page.
    When Go to "url.user.home" url
    Then Verify actual URL is "url.user.home"
    And LOGIN button is visible


  @US-27 @US-325
  Scenario: On the login page, it should be verified that the site can be logged with the
  correct E-mail and the correct Password.
    When Go to "url.user.login" url
    And User lands on user login url and logins with "user.anil" email and "password" password without cancelling toast message
    Then Toast message title is "Success" and message is "Logged In Successfully!"
    * LOGOUT button is visible
    * DASHBOARD button is visible
    * User logout


  @US-27 @US-326
  Scenario: It should be verified that the products are displayed on the Main Page of the site.
    When Go to "url.user.home" url
    Then Trending products are visible


  @US-27 @US-327
  Scenario: It should be verified that the Add to Cart button appears when the user hovers over the product.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    Then Verify that Add to Cart button is displayed

  @US-27 @US-328
  Scenario: when clicking the Add to Cart button that appears when hovering over the product as a user,
  it should be verified that the product has been added to the Cart page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Save the information of the product in an instance variable
    * Click to Add to Card button on the hovered item
    Then Verify that pop up is visible with the product information
    And Click to Add to Card button on the the pop up
    Then Verify that pop up is visible with the message "Item added to your cart"
    And Click to View Cart button on the pop up
    Then Verify that URL of the page is "url.user.cart"
    And Verify that added product is visible in the cart page


  @US-27 @US-329
  Scenario: Verify that the View Cart button is visible in the Item added to your cart window and when clicked,
  it redirects to the Cart page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    Then Verify that View Cart button is visible in the pop up
    And Click to View Cart button on the pop up
    Then Verify that URL of the page is "url.user.cart"


  @US-27 @US-330
  Scenario: Verify that the Proceed to Checkout button is visible on the Cart page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    Then Verify that the Proceed to Checkout button is visible on the Cart page


  @US-27 @US-331
  Scenario: When the Proceed to Checkout button is clicked, it should be verified that it redirects to the Checkout page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    * Click the Proceed to Checkout button on the Cart page
    Then Verify that URL of the page is "url.user.checkout"

  @US-27 @US-332
  Scenario: Verify that the Continue to Shipping button is visible on the checkout page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    * Click the Proceed to Checkout button on the Cart page
    Then Verify that Continue to Shipping button is visible


  @US-27 @US-333
  Scenario: Verify that the Continue to Shipping button redirects to the Shipping page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    * Click the Proceed to Checkout button on the Cart page
    * Fill the required fields
    * Click Continue to Shipping button
    Then Verify that Ship To element is visible

  @US-27 @US-334
  Scenario: Verify that the Continue to Payment button is visible on the Shipping page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    * Click the Proceed to Checkout button on the Cart page
    * Fill the required fields
    * Click Continue to Shipping button
    Then Verify that Continue to Payment button is visible

  @US-27 @US-335
  Scenario: When one of the Shipping Methods is selected and the Continue to Payment button is clicked,
  it should be verified that it redirects to the Payment page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    * Click the Proceed to Checkout button on the Cart page
    * Fill the required fields
    * Click Continue to Shipping button
    * Select Free Shipping option
    * Click Continue to Payment button
    * Verify actual URL is "url.user.checkout.payment"


  @US-27 @US-336
  Scenario: Verify that the Pay Now button is visible on the Payment page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    * Click the Proceed to Checkout button on the Cart page
    * Fill the required fields
    * Click Continue to Shipping button
    * Select Free Shipping option
    * Click Continue to Payment button
    Then Verify that Pay Now button is visible


  @US-27 @US-337
  Scenario: After selecting one of the payment methods and entering the required information, it should be verified
  that it redirects to the Order Summary page when the Pay Now button is clicked.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    * Click the Proceed to Checkout button on the Cart page
    * Fill the required fields
    * Click Continue to Shipping button
    * Select Free Shipping option
    * Click Continue to Payment button
    * Clicks to Pay Now button
    Then Verify actual URL is "url.user.order.summary"
    * Verify that Summary Field is visible

  @US-27 @US-338
  Scenario: It should be verified that the order has been received message is seen on the Order Summary page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    * Click the Proceed to Checkout button on the Cart page
    * Fill the required fields
    * Click Continue to Shipping button
    * Select Free Shipping option
    * Click Continue to Payment button
    * Clicks to Pay Now button
    Then Toast message title is "Success" and message is "Order created successfully"

  @US-27 @US-339
  Scenario: It should be verified that the information about the order is seen on the Order Summary page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    #* Save the information of the product in an instance variable
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    * Click the Proceed to Checkout button on the Cart page
    * Fill the required fields
    * Click Continue to Shipping button
    * Select Free Shipping option
    * Save the tax added price and product name
    * Click Continue to Payment button
    * Clicks to Pay Now button
    Then Verify that information of the product in the summary page are same

  @US-27 @US-340
  Scenario: Verify that the Continue Shopping button is visible on the Order Summary page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    * Click the Proceed to Checkout button on the Cart page
    * Fill the required fields
    * Click Continue to Shipping button
    * Select Free Shipping option
    * Click Continue to Payment button
    * Clicks to Pay Now button
    Then verify that Continue to Shopping button is visible

  @US-27 @US-341
  Scenario: Verify that clicking on the Continue Shopping button redirects to the home page.
    When Go to "url.user.home" url
    And Hover over on the first product in TrendingProducts
    * Click to Add to Card button on the hovered item
    * Click to Add to Card button on the the pop up
    * Click to View Cart button on the pop up
    * Click the Proceed to Checkout button on the Cart page
    * Fill the required fields
    * Click Continue to Shipping button
    * Select Free Shipping option
    * Click Continue to Payment button
    * Clicks to Pay Now button
    * Clicks the Continue to Shopping button
    Then Verify actual URL is "url.user.home"