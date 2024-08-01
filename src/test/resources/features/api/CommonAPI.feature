Feature: CommonAPI

  @Biz
  Scenario: Get ornegi
    When API user sets required path params "api, get-user"
    * API user sends requests and gets response
    Then API user verify that status code is 200
    Then API user verify response with matcher class
    Then API user verify response with json path