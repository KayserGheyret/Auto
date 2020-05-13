Feature: testing on github

  @SearchTest
  Scenario Outline: Go to the main page of github and search term
    When user reach the home page of github
    Then user search "<term>" in the search box
    Then user wait some time before the test finish

    Examples:
    |     term     |
    |KaisierAilaiti|
    |KudretAilaiti |
    |GheyretZayir  |


  @LoginTest
  Scenario Outline: Go to the login page of github and log in with credential
    When user reach the home page of github
    Then user click on Sign In and come to the sign in page
    Then user put in the "<username>" and "<password>" and log in
    Then user wait some time before the test finish

    Examples:
    |        username        |         password        |
    |KayserGheyret           |menkeldim981020KSR!      |
