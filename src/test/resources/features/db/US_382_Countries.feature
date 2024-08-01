Feature: US_382_Countries
  As an administrator, when I query the code number from the Countries table on the Database,
  it should be verified that the requested information is frozen.

  @US-507
  Scenario: DB Admin be able to verify the name and phonecode of the country
  whose Id is given among the users in the Countries table
    Then Verify country name is "Andorra" and phone code is 376 by given id 5 from country table


