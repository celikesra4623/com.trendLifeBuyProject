
Feature: US_052_UserLoginActivity
  As an administrator, I want a page where I can see login/logout activities on the site.


  Scenario:It should be verified that the Login - Logout Activity page can be accessed with the Login Activity link from the All Activity Logs menu
    Given Admin lands on admin login url and logins with "admin.fatih" email and "password" password
    Then Click All activity Logs Button
    Then Click Login Activity Button


  Scenario:  Verify that the activities in the Login -Logout Activity list are listed under the headings User, Login AT, Logout AT, IP, Agent, Description
    Given Admin lands on admin login url and logins with "admin.fatih" email and "password" password
    Then Click All activity Logs Button
    Then Click Login Activity Button
    Then Verify that headings are displayed

  Scenario: It should be verified that it is possible to search in Login - Logout Activity list with Quick Search Text Box
    Given Admin lands on admin login url and logins with "admin.fatih" email and "password" password
    Then Click All activity Logs Button
    Then Click Login Activity Button
    Then Click Quick Search Field and Enter Any User

  Scenario:It should be verified that there are transitions between the pages in the Login - Logout Activity List
    Given Admin lands on admin login url and logins with "admin.fatih" email and "password" password
    Then Click All activity Logs Button
    Then Click Login Activity Button
    Then Click Next Page


  Scenario:It should be verified that the activities in the Login - Logout Activity list can be cleared / deleted with the Clean All button
    Given Admin lands on admin login url and logins with "admin.fatih" email and "password" password
    Then Click All activity Logs Button
    Then Click Login Activity Button
    Then Click Clean All Button
    #  Then Click Delete Activity Button