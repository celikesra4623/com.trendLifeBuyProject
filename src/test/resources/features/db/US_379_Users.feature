@US-379 @US-344
Feature: US_379_Users
  I query the Id number from the Users table as an administrator,
  it should be verified that the requested information is returned.

  @DB
  @US-344 #TS
  @US-379 #US
  @US-503 #TC
  Scenario: Among the users in the Users table, I should be able to verify
  the ID, name, surname, email and role_id of the user whose Id is given.

    When verify the ID, name, surname, email and role_id of the user whose "Id" is given

