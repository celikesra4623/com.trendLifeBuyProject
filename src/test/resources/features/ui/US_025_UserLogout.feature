@US_025
Feature:US_025 User Logout Test

  @US_204
  Scenario: US_204 Verify that the Logout link is visible on the home page

    Given User lands on user login url and logins with "user.ilhan" email and "password" password
  #  Then User clicks the signin button
    When User clicks the Dashboard button
    And Verify that the Logout button appears on the page

  @US_205
  Scenario: US_205 Logout by clicking the logout button

    Given User lands on user login url and logins with "user.ilhan" email and "password" password
  #  And User clicks the signin button
    Then User clicks the Dashboard button
    And User clicks the Logout button
    And Verify logout

  @US_206
  Scenario: US_206 Verify that there is a Logout link in the Dashboard Side Bar

    Given User lands on user login url and logins with "user.ilhan" email and "password" password
  #  Then User clicks the signin button
    When User clicks the Dashboard button
    And Verify that the Logout button appears on the Sidebar

  @US_207
  Scenario: US_207 Logout by clicking the logout button in the Sidebar

    Given User lands on user login url and logins with "user.ilhan" email and "password" password
  #  Then User clicks the signin button
    When User clicks the Dashboard button
    And User clicks the Logout button on the Sidebar
    And Verify logout




