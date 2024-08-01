Feature: US_015_PageUserDashboard
  As a user, I would like to have a special dashboard page
  on the site to control my operations and settings on the site.

  Background: Going to the home page, log in to the page, and click the Dashboard
    Given User lands on user login url and logins with "user.seher" email and "password" password
    When The user clicks the Dashboard button

  @US-15 @US-122
  Scenario: When you click on the Dashboard link from the page, verify that you have gone to the relevant page.
    # Admin launches the browser - Bu islemi hooks sinifinda gerceklestiriyoruz.
    Then The user sees the Dashboard relevant page
    #And Admin logout
    # Admin browser hook araciligi ile otomatik kapatiyor.

  @US-15 @US-123
  Scenario: It should be verified that the User Name and User E-mail address are displayed
  on the Dashboard page.
    Then The user sees the User Name on the dashboard page
    And The user sees the E-mail address on the dashboard page

  @US-15 @US-124
  Scenario: Verify that All Order, My Wishlist, Refund Success, Product in Cart, Coupon Used,
  Completed Order boards are visible on the Dashboard page.
    Then The user sees the All Order boards on the Dashboard page
    Then The user sees the My Wishlist boards on the Dashboard page
    Then The user sees the Refund Success boards on the Dashboard page
    Then The user sees the Product in Cart boards on the Dashboard page
    Then The user sees the Coupon Used boards on the Dashboard page
    And The user sees the Completed Order boards on the Dashboard page

  @US-15 @US-125
  Scenario: Verify that the Total Balance amount is displayed on the Dashboard page.
    And The user sees the Total Balance Amount.

  #@US-15 @US-126
  #Scenario: When the Recharge Wallet button is clicked on the Dashboard page, it should be verified
  #that it redirects to the relevant page and that wallet can be recharged on the opened page.
  #  When The user clicks the Recharge Wallet
  #  Then The user sees the Recharge Amount window the relevant which the Recharge Wallet
  #  Then The user clicks the Enter Recharge Amount button
  #  Then The user enters a number
  #  Then The user clicks the Add Fund button
  #  Then The user clicks the stripe button
  #  Then The user enters her email address
  #  Then The user enters Card Number
  #  Then The user enters month and year knowledge
  #  Then The user enters CVC knowledge
  #  And The user clicks the Pay button
  #  And The user sees that the total Balance Amount has increased.

  @US-15 @US-127
  Scenario: It should be verified that when clicking the See All button on the Purchase History board
  on the Dashboard page, it directs the user to the Purchase History page.
    When The user clicks the See All button on the Purchase History board
    And The user sees the Purchase History relevant page.

  @US-15 @US-128
  Scenario: It should be verified that clicking the See All button on the My Wishlist board
  on the Dashboard page redirects the user to the My Wishlist page.

    When The user clicks the See All button on the My Wishlist board
    And The user sees the My Wishlist relevant page.

  #@US-15 @US-129
  #Scenario: It should be verified that it redirects the user to the Recent Order page when
  #the See All button is clicked on the Recent Order panel on the Dashboard page.
#
  #  When The user clicks the See All button on the Recent Order board
  #  And The user sees the Recent Order relevant page.
#
  #@US-15 @US-130
  #Scenario: When clicking the See All button on the Product in Cart board on the Dashboard page,
  #it should be verified that it redirects the user to the Cart page.
#
  #  When The user clicks the See All button on the Product in Cart board
  #  And The user sees the Product in Cart relevant page.

  #@US-15 @US-145
  #Scenario: When the Dashboard, Purchase History, My Wishlist, My Order, Giftcard, My Wallet,
  #My Coupons, Refund & Dispute, My Account, Digital Products, Referral, Support Ticket, and
  #Notification links are clicked on the Side Bar on the Dashboard page,it should be verified
  #that it redirects to the relevant page.
  #  When The user clicks the Dashboard link on the Side Bar on the Dashboard page
  #  Then The user sees the Dashboard relevant page.
  #  When The user clicks the Purchase History link on the Side Bar on the Dashboard page
  #  Then The user sees the Purchase History relevant page.
  #  When The user clicks the My Wishlist link on the Side Bar on the Dashboard page
  #  Then The user sees the My Wishlist relevant page.
  #  When The user clicks the My Order link on the Side Bar on the Dashboard page
  #  Then The user sees the My Order relevant page.
  #  When The user clicks the Giftcard link on the Side Bar on the Dashboard page
  #  Then The user sees the Giftcard relevant page.
  #  When The user clicks the My Wallet link on the Side Bar on the Dashboard page
  #  Then The user sees the My Wallet relevant page.
  #  When The user clicks the My Coupons link on the Side Bar on the Dashboard page
  #  Then The user sees the My Coupons relevant page.
  #  When The user clicks the Refund & Dispute link on the Side Bar on the Dashboard page
  #  Then The user sees the Refund & Dispute relevant page.
  #  When The user clicks the My Account link on the Side Bar on the Dashboard page
  #  Then The user sees the My Account relevant page.
  #  When The user clicks the Digital Products link on the Side Bar on the Dashboard page
  #  Then The user sees the Digital Products relevant page.
  #  When The user clicks the Referral link on the Side Bar on the Dashboard page
  #  Then The user sees the Referral relevant page.
  #  When The user clicks the Support Ticket link on the Side Bar on the Dashboard page
  #  Then The user sees the Support Ticket relevant page.
  #  When The user clicks the Notification link on the Side Bar on the Dashboard page
  #  Then The user sees the Notification relevant page.










