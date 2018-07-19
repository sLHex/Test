package Temp2;

import Helpers.DriverHelpers;
import cucumber.api.java.en.Then;

public class OldSchoolRunescapeSmokeTests {
    @Then("^I click on the highscores option on the runescape homepage$")
    public void iClickOnTheHighscoresOptionOnTheRunescapeHomepage(){
        DriverHelpers.clickOnElement("//*[@id=\"osnav-hiscores\"]");
    }

    @Then("^I input my username into the search bar on the highscores page$")
    public void iInputMyUsernameIntoTheSearchBarOnTheHighscoresPage(){
        DriverHelpers.enterText("//*[@id=\"body\"]/div[2]/div[2]/div[2]/div[2]/form[1]/div/p/input[1]", "Flux is back");
    }

    @Then("^I click the search feature on the runescape highscores page$")
    public void iClickTheSearchFeatureOnTheRunecapeHighscoresPage(){
        DriverHelpers.clickOnElement("//*[@id=\"body\"]/div[2]/div[2]/div[2]/div[2]/form[1]/div/p/input[2]");
    }

    @Then("^I check to see if my username is displayed on the highscores page$")
    public void iCheckToSeeIfMyUsernameIsDisplayedOnTheHighscoresPage() {
        DriverHelpers.checkForElement("//*[@id=\"contentHiscores\"]/table/tbody/tr[1]/td/b");
    }


}

