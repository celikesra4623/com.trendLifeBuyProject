@US-373
  Feature: US_373_MyWishlist
    As a user, I want to be able to access my Wishlist, add new items or delete items from my list.

  @US-489
  Scenario: When sending GET Request to the /api/wishlist endpoint, it should be checked that
  the status code returned is 200 and that the information in the Response Body is correct.

    * API user sets required path params "api, wishlist"
    * API user sends requests and gets response
    * API user verify that status code is 200
    * API User verify that user id 453
    * API user verify that seller id is 1
    * API User verify that type is "product"
    * API user verify that seller product id is 76
    * API user verify that product id is 80
    * API user verify that product name is "Beautiful single size sofa -0099"

  @US-490
  Scenario: When a POST Request Body is sent to the /api/wishlist endpoint with valid information,
  it should be verified that the status code returned is 201 and the message information
  in the Response Body is "Product added to wishlist."

    * API user sets required path params "api, wishlist"
    * API user enters seller id 1, seller product id 9, type "product"
    * API user verify that response message is "Product added to wishlist." v2
    * API user verify that status code is 201



  @US-491
  Scenario: When a POST Request Body is sent to the /api/wishlist endpoint with a product information already
  in Wishlist, it should be verified that the status code returned is 409 Conflict and the message information
  in the Response Body is "Product already in wishlist".

  @US-492
  Scenario: When DELETE Request Body is sent to the /api/wishlist/delete endpoint with valid information,
  it should be verified that the status code returned is 202 Accepted and the message information
  in the Response Body is "product removed from wishlist successfully."

  @US-493
  Scenario: When DELETE Request Body is sent to the /api/wishlist/delete endpoint with invalid information,
  it should be verified that the status code returned is 404 (Not Found) and the message information
  in the Response Body is "product not found".

