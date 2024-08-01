Feature: US_350_PageTopCustomer
  As an administrator, I would like to have a Top Customer page to access reports on the most active customers on the site.

  @UI
  @US-342 #Test Set
  @US-350 #Stroy
  @US-400 #Test
  Scenario: It should be verified that the Top Customers List can be accessed from the Top Customers
    Given Go to "url.admin.login" url
    * Admin lands on admin login url and logins with "admin.anil" email and "password" password
    When User clicks the Admin Report drop down
    * User click the Top Customers item
    Then Verify actual URL is "url.admin.admin-report.top-customer"
    * Verify that Top Customers table title is visible
    * Verify that Total Spend Time column for the first item of the Top customer table is not empty

  @UI
  @US-342 #Test Set
  @US-350 #Stroy
  @US-401 #Test
  Scenario: Verify that the top customers are listed under Name, Email, Phone, Total Spend, Joined AT in the Top Customers List
    Given Go to "url.admin.login" url
    * Admin lands on admin login url and logins with "admin.anil" email and "password" password
    * Go to "url.admin.admin-report.top-customer" url
    Then Verify that "Name" title of the TopCustomer table are visible
    * Verify that "Phone" title of the TopCustomer table are visible
    * Verify that "Email" title of the TopCustomer table are visible
    * Verify that "Total Spend" title of the TopCustomer table are visible
    * Verify that "Joined At" title of the TopCustomer table are visible
    * Verify that first row of the table has its values

  @UI
  @US-342 #Test Set
  @US-350 #Stroy
  @US-402 #Test
  Scenario: It should be verified that it is possible to search in the Top Customers List from the Quick Search TextBox
    Given Go to "url.admin.login" url
    * Admin lands on admin login url and logins with "admin.anil" email and "password" password
    * Go to "url.admin.admin-report.top-customer" url
    When Admin sends "UnrelatedKey" key to the Quick Search element on Top Customer Page
    Then Verify that Table Info element shows "0" result on Top Customer Page
    When Admin sends "Tester" key to the Quick Search element on Top Customer Page
    Then Verify that Table Info element shows greater then "0" result on Top Customer Page
    And Verify that first row of the table has the "Tester" search key on Top Customer Page


  @UI
  @US-342 #Test Set
  @US-350 #Stroy
  @US-403 #Test
  Scenario: Verify that there are transitions between pages in the Top Customers List
    Given Go to "url.admin.login" url
    * Admin lands on admin login url and logins with "admin.anil" email and "password" password
    * Go to "url.admin.admin-report.top-customer" url
    When Admin clicks the Previous Pagination button
    Then Verify that the List items are not changed
    When Admin clicks the Next Pagination button
    Then Verify that List items are changed
    When Admin clicks the Last Pagination item
    * Admin clicks the Next Pagination button
    Then Verify that the List items are not changed
