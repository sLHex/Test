Feature: Test the web driver

  Scenario: Make sure the Firefox WebDriver works
    Given I open the "Firefox" web driver
    And I go to the website "https://www.google.co.uk"
    Then I expect the website title to be "Google"
    And I close the web driver