@US_033
Feature: US_Customer Page: The Admin should be able to see all active and passive customers on the site together

  @US_215
  Scenario: US_215 Admin clicks the All Customers button on the Dashboard Sidebar and
  accesses the All Customers Page
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And Verify that all customers page is accessible
    #TAMAM

  @US_216
  Scenario: US_216 The entire Customer List appears on the All Customers page

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And Verify that the All Customer List is visible on the All Customer page
    #TAMAM

  @US_217
  Scenario: US_217  Clicking the radio button in the Active column in the All Customer List
  changes the active status of the customer

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click the Radio Button is Active
    And Verify if the customer 's active state has changed
    # TAMAM

  @US_218
  Scenario: US_218 When the Active Customer button on the All Customers page is pressed,
  the active customer list appears

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click Active Costumer
    And Verify Active Customer is visible
     #TAMAM

  @US_219
  Scenario: US_219 Details, Edit, Delete links are visible on the select tab
  under the Action title in the Active Customer List

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click Active Costumer
    Then Click button Plus
    Then Click seleckt DropDown
    And Verify that Details, Edit, Delete links are visible


  @US_220
  Scenario: US_220

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click Active Costumer
    Then Click button Plus
    Then Click seleckt DropDown
    Then Click Details button
    And Verify Customer Profil is visible


  @US_221
  Scenario: US_221

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click Active Costumer
    Then Click button Plus
    Then Click seleckt DropDown
    Then Click Details button
    And Verify Name is visible
    And Verify Email is visible
    And Verify Phone is visible
    And Verify Registered  is visible
    And Verify Active Status is visible
    And Verify Total Orders is visible
    And Verify Confirmed Order is visible
    And Verify Pending Order is visible
    And Verify Completed Order is visible
    And Verify Cancelled Order is visible
    And Verify Total Recharge is visible
    And Verify Pending Balance Approval is visible
    And Verify Total Balance is visible

  @US_222
  Scenario: US_222 Orders, Wallet History, Addresses can be listed from the selected customer profile
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click Active Costumer
    Then Click button Plus
    Then Click seleckt DropDown
    Then Click Details button
    And Verify Orders is visible
    And Verify Wallet Histories is visible
    And Verify Adresses is visible

  @US_223
  Scenario:   US_223 When the select button under the ACTION title is clicked, the details link leads to the relevant page
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click Active Costumer
    Then Click button Plus
    Then Click seleckt DropDown
    Then Click Details button
    And Verify Customer Profil is visible

  @US_224
  Scenario: US_224 When the Wallet History button is clicked, the top headings should appear above the list on the page
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click Active Costumer
    Then Click button Plus
    Then Click seleckt DropDown
    Then Click Details button
    Then Click Wallet Histories
    And Verify Date is visible
    And Verify User is visible
    And Verify TxnId is visible
    And Verify Amaunt is visible
    And Verify Type is visible
    And Verify PaymentMethod is visible
    And Verify Approval is visible

  @US_225
  Scenario: US_225 When the Addresses button is clicked, SL, NAME, ADDRESS, REGION,
  E-MAIL, PHONE NUMBER and POSTCODE titles should appear above the list on the page.
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click Active Costumer
    Then Click button Plus
    Then Click seleckt DropDown
    Then Click Details button
    Then Click Address
    And Verify Sl is visible
    And Verify Full Name is visible
    And Verify Region is visible
    And Verify Address is visible
    And Verify Phone Number is visible
    And Verify Postcode is visible
    And Verify Emaill is visible

  @US_226_
  Scenario: US_226


  @US_227
  Scenario: US_227
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click Active Costumer
    Then Click button Plus
    Then Click seleckt DropDown
    Then Click Edit button
    And Verify Update Customer is visible

  @US_228
  Scenario: US_228 When the Update button is clicked on the Customer Update Page,
  the relevant customer information should be updated
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click Active Costumer
    Then Click button Plus
    Then Click seleckt DropDown
    Then Click Edit button
    Then Click Update
    And Verify it's updated

  @US_229
  Scenario: US_229 When the Delete link under the Select tab is clicked,
  the Delete window appears and the Delete operation is performed in the opened window
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    And  Click Active Costumer
    Then Click button Plus
    Then Click seleckt DropDown
    Then Click Delete button
    Then Verify Delete Window is visible
    Then Click Delete on Delete Window
    And Verify it's deleted

    @US_230
    Scenario: US_230 When the Inactive Customer button on the All Customers page is pressed,
    the Inactive customer list appears

      Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
      Then Click Customer
      Then Click All Customer
      And  Click Inactive Costumer
      And Verify Inactive Customer is visible
      #TAMAM

      ## ****************************** ###
  Scenario: US_238 Clicking the Create Customer button on the All Customers page shows the Create Customer list
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Customer
    Then Click All Customer
    Then Click Create Customer
    And Verify Create Customer is visible
    #TAMAM
















