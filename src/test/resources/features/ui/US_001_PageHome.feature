Feature: US_001_PageHome
  As a user I should be able to access the home page

  @US-001 @US-072
    Scenario: The home page must be accessible when the URL is entered

      Given Go to "url.user.login" url
      Given User lands on user login url and logins with "user.selman" email and "password" password
      And logout buton is displayed
