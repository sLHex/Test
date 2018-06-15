
Feature: To load the website and look up my account on the highscores
  Scenario: I can navigate to the runescape high-scores page and input my username
    Given I go to the website "https://oldschool.runescape.com/"
    Then I expect the website title to be "Old School RuneScape - Play Old School RS"
    Then I click on the highscores option on the runescape homepage

