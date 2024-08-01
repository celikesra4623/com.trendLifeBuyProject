@US-368
Feature: US_368_Coupons
  API As a user I want to be able to access my coupon list and delete my coupons

  @US-472
  Scenario: When a GET request is sent to the /api/coupon endpoint, it should be checked that
  the status code returned is 200 and that the information in the Response Body is correct.


  @US-473
  Scenario: When a POST Request Body is sent to the /api/coupon/delete endpoint with valid information,
  it should be verified that the status code returned is 200 and the message information in the Response Body
  is "coupon deleted successfully".
    * API user sets required path params "api, user-notifications-setting, update"
    * API user updates that update the event to "Order Pending" by 2 id and "email" type
    * API user verify that response message is "updated successfully"
    * API user verify that status code is 202