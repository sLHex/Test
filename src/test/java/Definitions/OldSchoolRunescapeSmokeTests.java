package Definitions;

import Helpers.DriverHelpers;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class OldSchoolRunescapeSmokeTests {
    @Then("^I click on the highscores option on the runescape homepage$")
    public void iClickOnTheHighscoresOptionOnTheRunescapeHomepage(){
        DriverHelpers.clickOnElement("//*[@id=\"osnav-hiscores\"]");
    }
}
