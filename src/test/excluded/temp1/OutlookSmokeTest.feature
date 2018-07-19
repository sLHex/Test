
Feature: I can log in to outlook
  Scenario: I can go to the log-in page of outlook
    Given I go to the website "https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1529065880&rver=6.7.6640.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fauthRedirect%3dtrue%26RpsCsrfState%3d6905dd8b-3d30-0411-20ce-71f22cfb205a&id=292841&whr=live.co.uk&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015"
    Then I expect the website title to be "Sign in to your Microsoft account"
    Then I type my email into outlook log-in
    Then I click on the next option on the outlook sign-in page


