@US-376
Feature: US_376_Users
  As an administrator, I should be able to create a User entry from the DataBase,
  and verify that the entry I created is in the User list.

  @US-499
  Scenario: Must be able to create an entry in the user table
    Then DB user creates a user in the user table with the "Anil" First Name, "S." Last Name, "anils" User Name, 1 Role ID, "powercoders35@gmail.com" Email, "123456" Password information


  @US-500
  Scenario: It should be checked from the Users table whether the newly created entry is successfully saved or not.
    When DB user creates a user in the user table with the "Emin" First Name, "S." Last Name, "emins" User Name, 2 Role ID, "powercoders35@gmail.com" Email, "123456" Password information
    Then DB user verify that last created user who has "emins" username and "powercoders35@gmail.com" email addressis is exists
