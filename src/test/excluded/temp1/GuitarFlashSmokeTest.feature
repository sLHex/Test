Feature: I can navigate the Guitar Flash website
  Scenario: I can go to various pages within the Guitar Flash
    Given I go to the website "http://guitarflash.com/index2.asp"
    Then I expect the website title to be "Guitar Flash"
    Then I input my e-mail into the sign in box on guitarflash homepage
    Then I input my password into the sign in box on guitarflash homepage
    Then I click on okay to confirm login on the guitarflash homepage
