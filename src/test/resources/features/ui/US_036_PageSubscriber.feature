Feature: US_036_PageSubscriber
  As an administrator, It should be verified the visibility and functions
  of the sections of the subscriber page are working correctly.

  @US-36 @US-294
  Scenario: Verify that the units in the Subscriber List are displayed under the headings SL, Email, Date, Status, Job Verified, and Action
    # Admin launches the browser - Bu islemi hooks sinifinda gerceklestiriyoruz.
    Given Admin lands on admin login url and logins with "admin.mehmet" email and "password" password
    When Admin clicks Marketing dropdown menu
    And Admin clicks Subscribers menu item
    Then Admin sees headings of the Subscriber List
    #And Admin logout
    # Admin browser hook araciligi ile otomatik kapatiyor.


  @US-36 @US-295
  Scenario: As an administrator, It should be verified the visibility and functions of the sections of the subscriber page are working correctly.
    Given Admin lands on admin login url and logins with "admin.mehmet" email and "password" password
    When Admin clicks Marketing dropdown menu
    And Admin clicks Subscribers menu item
    Then Admin should see the text indicating that the Verification link was sent successfully


  @US-36 @US-296
  Scenario: As an administrator, It should be verified the visibility and functions of the sections of the subscriber page are working correctly.
    // Given admin subscribes to newsletter
    Given Admin lands on admin login url and logins with "admin.mehmet" email and "password" password
    When Admin clicks Marketing dropdown menu
    And Admin clicks Subscribers menu item
    Then Admin should see that the Subscriber List record has been deleted when the Delete link is clicked.



  @US-36 @US-297
  Scenario:
    Given Admin lands on admin login url and logins with "admin.mehmet" email and "password" password
    When Admin clicks Marketing dropdown menu
    And Admin clicks Subscribers menu item
    Then Admin should see that the records can be changed to active/inactive.

