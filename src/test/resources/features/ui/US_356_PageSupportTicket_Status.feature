@US_356  @US-342


Feature: US_356 Page Support Ticket

  @US-436
  Scenario: US_436 Verify that the Status link leads to the Status page
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Support Ticket
    Then Click Status
    And Verify that it to the status page
    #OK

  @US-437
  Scenario: US_437 It should be verified that a new Status can be created for Tickets by entering
  the name and status from the Add new section of the Status page.

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then  Click Support Ticket
    Then  Click Status
    When Enter a name in the name box
    Then Choose the status of status
    Then Click Save
    And  Verify that a new Status has been created
    #OK

  @US-438
  Scenario: US_438 It should be verified that Statuses are displayed according
  to Name, Status, Action titles in the Status List

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then  Click Support Ticket
    Then  Click Status
    And  Verify that Statuses are displayed by Name, Status, Action in Status List
    #OK

  @US-439
  Scenario:  US_439 It should be verified that the status of the statuses can be changed
  under the Status title in the Status List.
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then  Click Support Ticket
    Then  Click Status
    When Click Radio Button Status
    And  Verify that Statuses is displayed by  Action in Status List
    #OK

  @US-440
  Scenario:  US_440 Verify that there is an edit link in the select tab under the Action title in the Status List
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then  Click Support Ticket
    Then  Click Status
    When Click Seleckt
    And  Verify that Edit link is visible
  #OK
  @US-441
  Scenario:  US_441  Verify that the edit page is opened when the edit link is clicked on the select tab
  under the Action title in the Status List.
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then  Click Support Ticket
    Then  Click Status
    When Click Seleckt
    Then Click Edit
    And  Verify that the edit page is opened
    #OK

  @US-442
  Scenario:  US_442 It should be verified that the Name and Status of the Status can be updated on the
  Edit page that opens when the edit link is clicked on the select tab under the Action title in the Status List
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then  Click Support Ticket
    Then  Click Status
    When Click Seleckt
    Then Click Edit
    Then Choose the Inactive of status
    Then Click Update Status
    And  Verify that the Name and Status of the Status can be updated
    When Click Seleckt
    Then Click Edit
    Then Enter a "Veli" in the name box
    Then Click Update Status
    And  Verify that the Name and Status of the Status can be updated







