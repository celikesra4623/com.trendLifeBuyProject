@US-360
Feature: US_360_Login
  API As a user, I should be able to establish an API connection with the correct E-mail and Password.

  @US-459
  Scenario: API When sending POST Request to the /api/login endpoint, it should be verified that
  the status code returned is 200 and the message information in the Response Body is "Successfully logged In".
    * API user sets required path params "api, login"
    * API user enters email to "admin@gmail.com" email and "123123123" password and send post request
    * API user verify that response message is "Successfully logged In" v2
    * API user verify that status code is 200