@US-374 @US-344
Feature: US_374_Staff
  As an administrator, I should be able to verify the ID of the desired Personnel in the Staff table via the DataBase

  @US-496
  Scenario:The IDs in the staff table should be taken to a list and it should be verified
  whether the desired ID is in this list

    When DB User saves all IDs in a list from staff table
    Then Verify that given staff ID 5 is in the list