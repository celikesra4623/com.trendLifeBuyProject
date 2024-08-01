@US-378 @US-344
Feature: US_378_Users
  As an administrator, I should be able to list user phone numbers through the DataBase and
  verify whether the desired phone number is in the Users table.

  @US-502
  Scenario:The phone numbers in the Users table should be saved into a list and it should be verified whether
  the desired phone number is in this list.
    When DB User saves all phone numbers from Users table in a List
    Then Verify that "01729975293" phone number exist in the list