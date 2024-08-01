@US
Feature: US_053_UserActivity
 As an administrator, I want a page to see user activities on the site.

 Scenario: It should be verified that the activities in the Activity Logs list can be cleared / deleted with the Clean All button
  Given Admin lands on admin login url and logins with "admin.fatih" email and "password" password
  Then Click All activity Logs Button
  Then Click Activity Logs Button
  Then Click Clean All Button
    #  Then Click Delete Activity Button

 Scenario:  Verify that the activities in the Login -Logout Activity list are listed under the headings User, Login AT, Logout AT, IP, Agent, Description
  Given Admin lands on admin login url and logins with "admin.fatih" email and "password" password
  Then Click All activity Logs Button
  Then Click Activity Logs Button
  Then Verify that headings are displayed

 Scenario:It should be verified that there are transitions between the pages in the Login - Logout Activity List
  Given Admin lands on admin login url and logins with "admin.fatih" email and "password" password
  Then Click All activity Logs Button
  Then Click Activity Logs Button
  Then Click Next Page