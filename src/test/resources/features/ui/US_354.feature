Feature: US_354
  As an administrator, I want a page to be able to perform operations regarding the categories
  that users will choose when opening a ticket.

  @UI
  @US-342 #Test Set
  @US-420 #Test
  Scenario:It should be verified that the Categories page can be accessed from the Category link.
    When Admin lands on admin login url and logins with "admin.mesut" email and "password" password
    Then The user clicks Support Tickets
    When The User clicks Category Link
    Then The User verify that text of Add New is visible


  @UI
  @US-342 #Test Set
  @US-421 #Test
  Scenario:UI It should be verified that a new category can be created for the Tickets
  by entering the name and status from the Add new section on the Categories page.
    * Admin lands on admin login url and logins with "admin.mesut" email and "password" password
    Then The user clicks Support Tickets
    When The User clicks Category Link
    And The user sends any text on name field
    * The user clicks on inactive button
    Then The user clicks on save button
    Given Verify that the toast message which state that new category created is visible


  @UI
  @US-342 #Test Set
  @US-422 #Test
  Scenario:It should be verified that the ticket categories are displayed according to Name,
  Status, Action titles in the Category List.
    * Admin lands on admin login url and logins with "admin.mesut" email and "password" password
    When The User clicks Category Link
    Then Verify that Name, Status and Action titles are visible


  @UI
  @US-342 #Test Set
  @US-423 #Test
  Scenario:It should be verified that the status of the categories can be changed under
  the Status title in the Category List.
    * Admin lands on admin login url and logins with "admin.mesut" email and "password" password
    When The User clicks Category Link
    Then Verify that statu of any title under the Status title is changeable


  @UI
  @US-342 #Test Set
  @US-424 #Test
  Scenario:It should be verified that there are edit and delete links in the select
  tab under the Action title in the Category List.
    * Admin lands on admin login url and logins with "admin.mesut" email and "password" password
    When The User clicks Category Link
    Then The user clicks on Select button
    Then Verify that Edit and Delete texts are visible


  @UI
  @US-342 #Test Set
  @US-425 #Test
  Scenario:Verify that the edit page is opened when the edit link is clicked on the select tab under
  the Action title in the Category List.
    * Admin lands on admin login url and logins with "admin.mesut" email and "password" password
    When The User clicks Category Link
    Then The user clicks on Select button
    And The user click on Edit link
    Then Verify that Edit text is visible


  @UI
  @US-342 #Test Set
  @US-426 #Test
  Scenario:It should be verified that the Name and Status of the category can be updated on the Edit page
  that opens when the edit link is clicked on the select tab under the Action title in the Category List.
    Given Admin lands on admin login url and logins with "admin.mesut" email and "password" password
    When The User clicks Category Link
    Then The user clicks on Select button
    And The user click on Edit link
    And The user sends any text on name field
    Then Clicks on Update Button
    And Verify that the category in question is updated


  @UI
  @US-342 #Test Set
  @US-427 #Test
  Scenario:It should be verified that the category can be deleted on the delete page that opens when
  the delete link is clicked on the select tab under the Action title in the Category List.
    * Admin lands on admin login url and logins with "admin.mesut" email and "password" password
    When The User clicks Category Link
    Then The user clicks on Select button
    Then The user clicks on Delete button
    And The user clicks on sure Delete button
    Then Verify that the category in question is deleted succesfully










