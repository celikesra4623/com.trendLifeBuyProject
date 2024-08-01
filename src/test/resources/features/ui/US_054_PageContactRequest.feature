@US-342 @US-054
Feature: US_054_PageContactRequest
  As an administrator, I would like to have a Contact Mail page
  where I can see the messages of the customers
  who want to communicate with the site authorities from the Contact section.

  @US-451
  Scenario: Verify that the Contact Mail page is accessible
  from the Contact Request tab in the Content menu on the Dashboard Side Bar.
    Given Admin lands on admin login url and logins with "admin.esra" email and "password" password
    When Click Contact Request link
    Then Click Contact Mail link
    And  Verify that the Contact Mail page is accessible

  @US-452
  Scenario: Verify that the Contact Mail List is visible on the Contact Mail page
    Given Admin lands on admin login url and logins with "admin.esra" email and "password" password
    When Click Contact Request link
    Then Click Contact Mail link
    And  Verify that the Contact Mail List is visible on the Contact Mail page

  @US-453
  Scenario: Verify that the messages are listed under Name , Email, Message in the Contact Mail list.
    Given Admin lands on admin login url and logins with "admin.esra" email and "password" password
    When Click Contact Request link
    Then Click Contact Mail link
    And  Verify that the messages are listed under Name , Email, Message in the Contact Mail List.

  @US-454
  Scenario: Verify that the order of the information appearing in the List is changed when the Contact Mail List headers are clicked.
    Given Admin lands on admin login url and logins with "admin.esra" email and "password" password
    When Click Contact Request link
    Then Click Contact Mail link
    And  Verify that the order of the information appearing in the List is changed when the Contact Mail List headers are clicked.

  @US-455
  Scenario: It should be verified that it is possible to do searching in the Contact Mail List with the Quick Search Box.
    Given Admin lands on admin login url and logins with "admin.esra" email and "password" password
    When Click Contact Request link
    Then Click Contact Mail link
    And  Click Quick Search Box button
    And  Verify that it is possible to do searching in the Contact Mail List with the Quick Search Box.

  @US-456
  Scenario: Verify that Show and Delete links are visible in the Select tab under the Action title.
    Given Admin lands on admin login url and logins with "admin.esra" email and "password" password
    When Click Contact Request link
    Then Click Contact Mail link
    And  Click Select button
    And  Verify that Show and Delete links are visible in the Select tab under the Action title.

  @US-457
  Scenario: Verify that when the Show link is clicked on the Select tab under the Action title,
  it redirects to the Contact Mail page and the details of the relevant mail appear on the Contact Mail page.
    Given Admin lands on admin login url and logins with "admin.esra" email and "password" password
    When Click Contact Request link
    Then Click Contact Mail link
    And  Get message text
    And  Click Select button
    And  Click Show link
    And  Verify that when the Show link is clicked on the Select tab under the Action title, it redirects to the Contact Mail page and the details of the relevant mail appear on the Contact Mail page.


  @US-458
  Scenario: Verify that the relevant mail can be deleted from the window that opens when the Delete link is clicked on the Select tab under the Action title.
    Given Admin lands on admin login url and logins with "admin.esra" email and "password" password
    When Click Contact Request link
    Then Click Contact Mail link
    And  Get text
    And  Click Select button
    And  It should be verified that the relevant mail can be deleted from the window that opens when the Delete link is clicked on the Select tab under the Action title.