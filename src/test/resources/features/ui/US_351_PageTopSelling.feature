Feature: US_351_PageTopSelling
  As an administrator, I want the Top Selling Item page to be able to see the list of the most sold products on the site.

  @UI
  @US-342 #Test Set
  @US-351 #Stroy
  @US-404 #Test
  Scenario: It should be verified that the Top Selling Item list can be accessed from the Top Selling Item link.
    Given Go to "url.admin.login" url
    * Admin lands on admin login url and logins with "admin.anil" email and "password" password
    When Admin clicks the "Admin Reports" drop down and then clicks the "Top selling item" item
    Then Verify that Top Selling Item table title is visible
    * Verify that first column for the first item of the Top Selling Item table is not empty

  @UI
  @US-342 #Test Set
  @US-351 #Stroy
  @US-405 #Test
  Scenario: It should be verified that it can be searched in the Top Selling Item list from the Quick Search TextBox
    Given Go to "url.admin.login" url
    * Admin lands on admin login url and logins with "admin.anil" email and "password" password
    * Admin clicks the "Admin Reports" drop down and then clicks the "Top selling item" item
    * Admin sends "UnrelatedKey" key to the Quick Search element on Top Selling Item Page
    Then Verify that Table Info element shows "0" result on Top Selling Item Page
    When Admin sends "Tester" key to the Quick Search element on Top Selling Item Page
    Then Verify that Table Info element shows greater then "0" result on Top Selling Item Page
    * Verify that first row of the table has the "Tester" search key on Top Selling Item Page

  @UI
  @US-342 #Test Set
  @US-351 #Stroy
  @US-406 #Test
  Scenario: It must be verified that the best selling products in the Top Selling Item list are listed under
  the headings Seller, Product, Total Sale , Average Rating
    Given Go to "url.admin.login" url
    * Admin lands on admin login url and logins with "admin.anil" email and "password" password
    * Go to "url.admin.admin-report.top-selling-item" url
    Then Verify that "Seller" title of the Top Selling Item table are visible
    * Verify that "Product" title of the Top Selling Item table are visible
    * Verify that "Total Sale" title of the Top Selling Item table are visible
    * Verify that "Average Rating" title of the Top Selling Item table are visible
    * Verify that first row of the table has its values on Top Selling Item table

  @UI
  @US-342 #Test Set
  @US-351 #Stroy
  @US-407 #Test
  Scenario: Verify that there are transitions between pages in the Top Selling List
    Given Go to "url.admin.login" url
    * Admin lands on admin login url and logins with "admin.anil" email and "password" password
    * Go to "url.admin.admin-report.top-selling-item" url
    When Admin clicks the Previous Pagination button on Top Selling List Page
    Then Verify that the List items are not changed on Top Selling List table
    When Admin clicks the Next Pagination button on Top Selling List Page
    Then Verify that the List items are changed on Top Selling List table
    When Admin clicks the Last Pagination item on Top Selling List Page
    * Admin clicks the Next Pagination button on Top Selling List Page
    Then Verify that the List items are not changed on Top Selling List table