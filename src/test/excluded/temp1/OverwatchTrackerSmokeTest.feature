Feature: To check various stats on OverwatchTracker
  Scenario: To be able to navigate to the site, type in my character and check stats
    Given I go to the website "https://overwatchtracker.com/"
    Then I confirm the cookie acceptance pop-up from the homepage
    Then I input my battletag into the search bar on the homepage
    Then I push enter to go to my overwatch stats page