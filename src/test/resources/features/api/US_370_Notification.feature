@US-370
Feature: US_370_Notification
  As a user, I want to be able to access and control notifications from the site.

  @US-479
  Scenario: When a GET Request is sent to the /api/user-notifications-setting endpoint, it should be checked that
  the status code returned is 200 and that the information in the Response Body is correct
    * API user sets required path params "api, user-notifications-setting"
    * API user sends requests and gets response
    * API user verify that status code is 200
    * API user verify that user id 2
    * API user verify that notification setting id is 3
    * API user verify that type is "system"
    * API user verify that event is "Withdraw request declined"


  @US-480
  Scenario: When a POST Request Body is sent to the /api/user-notifications-setting/update endpoint with valid
  information, it should be verified that the status code returned is 202 and the message information
  in the Response Body is "updated successfully".
    * API user sets required path params "api, user-notifications-setting, update"
    * API user updates that update the event to "Order Pending" by 2 id and "email" type
    * API user verify that response message is "updated successfully" v1
    * API user verify that status code is 202