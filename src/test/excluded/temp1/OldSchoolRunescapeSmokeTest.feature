
Feature: To load the website and look up my account on the highscores
  Scenario: I can navigate to the runescape high-scores page and input my username
    Given I go to the website "https://oldschool.runescape.com/"
    Then I expect the website title to be "Old School RuneScape - Play Old School RS"
    Then I click on the highscores option on the runescape homepage
    Then I input my username into the search bar on the highscores page
    Then I click the search feature on the runescape highscores page
    Then I check to see if my username is displayed on the highscores page

