Feature: US_037_PageOfflineRecharge

  @US-37 @US-298
  Scenario: Verify that the units in the Subscriber List are displayed under the headings SL, Email, Date, Status, Job Verified, and Action
    Given Admin lands on admin login url and logins with "admin.mehmet" email and "password" password
    When Admin clicks Wallet Manage dropdown menu
    And Admin clicks Offline Recharge menu item
    Then Admin sees headings of the Offline Recharge List