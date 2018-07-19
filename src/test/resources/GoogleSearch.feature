Feature: To search something and select the appropriate option from a list
  Scenario: To do a google search
    Given I go to the website "https://www.google.com"
    Then I input hello world into google
    Then I confirm my search by pushing enter
    Then I click on the hello world program wiki page
    Then I select the main page option on the wiki page
    Then I check to see if I am at the correct url