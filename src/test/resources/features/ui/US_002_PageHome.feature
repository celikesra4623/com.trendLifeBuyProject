Feature: US_002_PageHome
  Verify that the functions in the top menu of the home page are active

  @US-002 @US-073
  Scenario: Play store and apple store buttons should redirect to the relevant page

    Given Go to "url.user.home" url
    Then Click Play Store button
    Then After clicking, check that the redirected Play Store related webpages is visible
    Then Go back to the home page
    Then Click App Store button
    Then After clicking, check that the redirected Apple Store related webpages is visible

  @US-002 @US-074
  Scenario: Track Your Order button should lead to the relevant page
    Given Go to "url.user.home" url
    When Click Track Your Order button
    Then After clicking, check that the redirected Track Your Order



  @US-002 @US-075
  Scenario: Compare button should lead to the relevant page
    Given Go to "url.user.home" url
    When Click Compare button
    Then After clicking, check that the redirected Compare related webpages is visible

  @US-002 @US-076
  Scenario: Wishlist button should redirect to the relevant page
    Given Go to "url.user.login" url
    Given User lands on user login url and logins with "user.selman" email and "password" password
    When Click Wishlist button
    Then After clicking, check that the redirected Wishlist related webpages is visible

  @US-002 @US-077
  Scenario: cart button should redirect to the relevant page
    Given Go to "url.user.home" url
    When Click Cart button
    Then After clicking, check that the redirected Cart related webpages is visible

  @US-002 @US-078
  Scenario: It should redirect to the home page when the logo is pressed.
    Given Go to "url.user.home" url
    When Click Logo button
    Then After clicking, check that the redirected Homepage related webpages is visible

  #@US-002 @US-079
  #Scenario: It should be possible to search for products from the search box
    #Given Go to "url.user.home" url
   # When It should be possible to search for products from the search box

  @US-002 @US-080
  Scenario: login button should redirect to relevant page
    Given Go to "url.user.home" url
    When Click Login button
    Then After clicking, check that the redirected Login related webpages is visible

  @US-002 @US-081
  Scenario: The register button should lead to the relevant page
    Given Go to "url.user.home" url
    When Click Register button
    Then After clicking, check that the redirected Register related webpages is visible

  @US-002 @US-082
  Scenario: home button should redirect to the relevant page
    Given Go to "url.user.home" url
    When Click home button
    Then After clicking, check that the redirected home related webpages is visible

  @US-002 @US-083
  Scenario: blog button should redirect to relevant page
    Given Go to "url.user.home" url
    When Click blog button
    Then After clicking, check that the redirected blog related webpages is visible

  @US-002 @US-084
  Scenario: Contact button should redirect to relevant page
    Given Go to "url.user.home" url
    When Click Contact button
    Then After clicking, check that the redirected Contact related webpages is visible

  @US-002 @US-085
  Scenario: About Us button should redirect to relevant page
    Given Go to "url.user.home" url
    When Click About Us button
    Then After clicking, check that the redirected About Us related webpages is visible

  @US-002 @US-086
  Scenario: New User Zone button should lead to the relevant page
    Given Go to "url.user.home" url
    When Click New User Zone button
    Then After clicking, check that the redirected New User Zone related webpages is visible

  #@US-002 @US-087
  #button not found