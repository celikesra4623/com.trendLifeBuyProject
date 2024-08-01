Feature: US_014_PageAboutUs
  As a user, I would like to have an About Us page on the site
  so that I can have more information about the site I shopped at.

  @US-14 @US-116
  Scenario: Verify that you have access to the About Us page from the home page
     # User launches the browser - Bu islemi hooks sinifinda gerceklestiriyoruz.
    Given Go to "url.user.home" url
    When The user clicks About Us button
    And The user sees About Us page.
    # Admin browser hook araciligi ile otomatik kapatiyor.

  @US-14 @US-117 @US-118 @US-119 @US-120
  Scenario Outline: Verify that the text Quality and Reasonable Price is visible on the About Us page.

    Given Go to "url.user.home" url
    When The user clicks About Us button
    And The user sees the text of "<Texts Of Web Element>"
    Examples:
      |Texts Of Web Element|
      |Quality and Reasonable Prices|
      |Client Worldwide|
      | Successful Project|
      | Work Employed|
      | Planning Services|
      | online shopping easy and cost-efficient|
      | Team member|
      | Robert Pattinson|
      | Founder & CEO|
      | Johnny Depp|
      | Jason Statham|
      | Bradley Cooper|

  @US-14 @US-121
  Scenario: The About Us page should verify that the characters, statuses and images of
            Robert Pattison, Johnny Depp, Jason Statham, Bradley Cooper are visible on the page.

    Given Go to "url.user.home" url
    When The user clicks About Us button
    Then The user sees the image of Robert Pattison
    Then The user sees the image of Johnny Depp
    Then The user sees the image of Jason Statham
    And The user sees the image of Bradley Cooper