@US-384
Feature: As an administrator, I should be able to list a customer's orders from the orders table through the Database
  @US-509
  Scenario: US-509 All orders of the customer with the specified Id number should be saved in a list and verified
    Then Verify if the desired order of the customer with the specified Id number 20 is in the orders table
    Then Verify if the desired order of the customer with the specified customer_email "customer2@gmail.com" is in the orders table

