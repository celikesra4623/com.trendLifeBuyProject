@US-355
Feature: US_050_TicketPriority

  @UI
  @US-342 #Test Set
  @US-428 #Test
  Scenario:Verify that the Priority link leads to the Priority page
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Clicks Support Ticket DDM
    Then Clicks Priority Links
    And Verify that the Priority link leads to the Priority page

  @UI
  @US-342 #Test Set
  @US-429 #Test
  Scenario:Verify that a new Priority can be created for Tickets  from the Add new section
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Clicks Support Ticket DDM
    Then Clicks Priority Links
    Then Click in the Name field and enter Name
    Then Click the Status radio checkbox button
    Then Click Save button
    And Verify that a new Priority can be created for Tickets  from the Add new section

  @UI
  @US-342 #Test Set
  @US-430 #Test
  Scenario:Verify that the Priorities titles are displayed under the Priority List
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Clicks Support Ticket DDM
    Then Clicks Priority Links
    And Verify that the Priorities titles are displayed under the Priority List

  @UI
  @US-342 #Test Set
  @US-431 #Test
  Scenario:Verify that the status of the Priorities can be changed under the Status title in the Priority List
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Clicks Support Ticket DDM
    Then Clicks Priority Links
    Then Clicks Status checkbox button
    And Verify that the status of the Priorities can be changed under the Status title in the Priority List

  @UI
  @US-342 #Test Set
  @US-432 #Test
  Scenario:Verify that there are edit and delete links in the select tab under the Action title in the Priority List
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Clicks Support Ticket DDM
    Then Clicks Priority Links
    Then Clicks SELECT DDM
    And Verify that there are edit and delete links

  @UI
  @US-342 #Test Set
  @US-433 #Test
  Scenario:Verify that the edit page is opened when the edit link is clicked on the select tab
  under the Action title in the Priority List
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Clicks Support Ticket DDM
    Then Clicks Priority Links
    Then Clicks SELECT DDM
    Then Clicks EDIT links
    And Verify that the edit page is opened

  @UI
  @US-342 #Test Set
  @US-434 #Test
  Scenario:Verify It should be verified that the Name and Status of the category can be updated on the Edit page
  that opens when the edit link is clicked on the select tab under the Action title in the Category List.
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Clicks Support Ticket DDM
    Then Clicks Priority Links
    Then Clicks SELECT DDM
    Then Clicks EDIT links
    Then Edit Name and Status with new information
    Then Clicks UPDATE button
    And Verify that the Name and Status of the category can be updated

  @UI
  @US-342 #Test Set
  @US-435 #Test
  Scenario:Verify that Priority can be deleted on the delete page that opens when the delete link is clicked
  on the select tab under the Action title in the Priority List
    Given Admin lands on admin login url and logins with "admin.bicer" email and "password" password
    When Clicks Support Ticket DDM
    Then Clicks Priority Links
    Then Clicks SELECT DDM
    Then Clicks DELETE Link
    Then Clicks DELETE button
    And Verify that Priority can be deleted