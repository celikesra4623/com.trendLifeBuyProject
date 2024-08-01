@US-353  @US-342


Feature: US_353_PageReportProductReview

  @US-416
  Scenario: US_416 It should be verified that the Product Review page can be accessed with the Product Review link
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then User clicks the Admin Report drop down
    Then Clicks Products Review
    And Verify Product Review Page is visible

  @US-417
  Scenario: US_417 Verify that the Product Review List is visible on the Product Review page

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then User clicks the Admin Report drop down
    Then Clicks Products Review
    And Verify that the Product Review List visible

  @US-418
  Scenario: US_418 Verify that it is possible to search within the Product Review List
  from the Quick Search TextBox

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then User clicks the Admin Report drop down
    Then Clicks Products Review
    When Enter "Sun glass" in the Quick Search box
    And Verify that it is possible to search from the Quick Search TextBox

  @US-419
  Scenario: US_419 In the Product Review List, it should be verified that the products are listed
  under the headings Product, Rating, Number of Review

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then User clicks the Admin Report drop down
    Then Clicks Products Review
    And Verify that products are listed under Product, Rating, Number of Review





