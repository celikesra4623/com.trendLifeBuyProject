
Feature: Common

  #Hoooks Tagleri
  @SampleHookTag

  #Jira Tagleri
  @US-32   #Jiradaki User Story ticket numarasi
  @US-292  #Jiradaki Test Case ticket numarasi
  @US-350  #Jiradaki Test Set ticket numarasi (Bunlar simdilik yok)
  @US-450  #Jiradaki Test Plan ticket numarasi (Bunlar simdilik yok)
  Scenario: User logins to the trendlifebuy web page with email and password
    Given User lands on user login url and logins with "user.selman" email and "password" password
    And Go to "url.user.login" url


