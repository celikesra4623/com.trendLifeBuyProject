@US_029
Feature: US_029_Checks the Admin  Dashboard page
  @US_208
  Scenario: US_208 Verify admin panel URL is accessible
    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Verify admin panel URL is accessible
    # TAMAM
  @US_209
  Scenario: US_209 Verify that user logins to the admin Dashboard page

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Verify that user logins to the admin Dashboard page
    # TAMAM
  @US_210
  Scenario: US_210  Verify that the Search TextBox is visible and that the site can be searched using the serach TextBox

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Verify that the Search TextBox is visible in the admin Dashboard page
    And Verify that the site can be searched using the serach TextBox
    ##### ARAMA KUTUSU FONKSIYONU CALISMIYOR (NASIL OLACAK ?) (SD' YORUM YAPTIM)   OLABILIYOR. Kontrol

  @US_211
  Scenario: US_211 Verify that the Dashboard Side Bar narrows and expands
  when the menu icon is clicked on the Dashboard main page

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click the menu icon on the Dashboard home page
    And Verify that the Dashboard Side Bar narrows and expands
    # TAMAM

  @US_212
  Scenario: US_212 Verify that clicking Website button on Dashboard home page redirects to site UI

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click on the Website button on the Dashboard home page
    And Verify that it redirects to the user interface of the site


  @US_213
  Scenario: US_213 When clicking the Today, This Week, This Month, and This Year buttons on the Dashboard home page,
  verify that the data in the Summary Dashboard changes based on the selected value

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Verify that Visitor data in Summary Dashboard changes for clicking Today This Week This Month This Year filters
#    Then Click This Week button
#    And Verify that Visitor data in Summary Dashboard changes to This Week This Month
#    Then Click This Month button
#    And Verify that Visitor data in Summary Dashboard changes to This Month
#    Then Click This Year button
#    And Verify that Visitor data in Summary Dashboard changes to This Year
    ########  DEGISIKLIK NASIL TEST EDILIECEK?

  @US_214
  Scenario: US_214 When the Visitor, Total Order, Total Pending Order, Total Completed Order,
  Total Sale, Total Review, Total Revenue, Active Customer, Total Subscriber buttons are clicked,
  it should be verified that they are directed to the relevant pages

    Given Admin lands on admin login url and logins with "admin.ilhan" email and "password" password
    Then Click Visitor button
    And Verify Visitor Page visible
    Then Click Total Subscriber button
    And Verify Subscriber Page visible
    ##########DEVAMI YOK###########











