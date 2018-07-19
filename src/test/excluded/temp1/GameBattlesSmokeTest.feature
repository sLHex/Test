
  Feature: Test the web driver

  Scenario: Emulate a log on to gamebattles
    Given I go to the website "http://www.gamebattles.com/"
    Then I click on Login on the homepage of gamebattles
    Then I type in my email
    Then I type in my password
    Then I click log-in on the gamebattles login page
    Then I confirm the login has failed as the inputs were test credentials
    Then I want to do some shit

