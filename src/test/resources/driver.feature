Feature: Test the web driver

  Scenario: Make sure the Firefox WebDriver works
    Given I go to the website "http://www.gamebattles.com/"
    Then I click on Login
    Then I type in my email
    Then I type in my password
    Then I click on log-in

