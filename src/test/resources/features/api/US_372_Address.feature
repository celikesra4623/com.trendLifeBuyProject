@US-372
Feature: US_372_Address
  As a user, I should be able to access my registered address information,
  delete my address information and add a new address.

  @US-484
  Scenario: When a GET Request is sent to the /api/profile/address-list endpoint, it should be checked
  that the status code returned is 200 and that the information in the Response Body is correct.

    * API user sets required path params "api, profile/address-list"
    * API user sends requests and gets response
    * API user verify that status code is 200
    * API user verify that id 19
    * API user verify that customer id is 453
    * API user verify that address is "myAdress"
    * API user verify that country name is "United States"

  @US-485
  Scenario:When a POST Request Body is sent to the /api/profile/address-store endpoint with valid information,
  it should be verified that the status code returned is 201 and the message information in the Response Body is
  "address added successfully".

    * API user sets required path params "api, profile, address-store"
    * API user enters name "deneme22", email "enim@enim.com", address "aut", phone "tempore", city "quisquam", state "est", country "quidem", postal_code "mollitia", address_type "11"
    * API user verify that response message is "address added successfully" v2
    * API user verify that status code is 201

  @US-488
  Scenario:When a PATCH Request Body is sent to the /api/profile/address-update/:id endpoint, it should be verified
  that the status code returned is 202 (Accepted) and the message information in the Response Body is
  "address updated successfully".

    * API user sets required path params "api, profile, address-update, :id "
    * API user enters name "eos", email "d@d.com", address "11", phone "ullam", city "labore", state "omnis", country "unde", postal_code "saepe", address_type "11" by 24 id
    * API user verify that response message is "address updated successfully" v2
    * API user verify that status code is 202

