@US-380
  Feature: US-380 Brands :As an administrator, I should be able to list the brands on the site through the DataBase
    and verify whether the desired brand is in the Brands table.
    @US-504
    Scenario: US-504 The brands in the Brands table should be saved in a list and it should be verified whether the
    desired brand is in the list
      Then Verify if the desired brand "Nike" is in the Brand table
