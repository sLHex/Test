package Definitions;

import cucumber.api.java.en.Then;

import Helpers.DriverHelpers;

public class GamebattlesTests {

    @Then("^I click on Login$")
    public void iClickOnLogin() {
        DriverHelpers.clickOnElement("//*[@id=\"mlg-header-menu\"]/div[3]/a/div/div");
    }

    @Then("^I type in my email$")
    public void iTypeInMyEmail() {
        DriverHelpers.enterText("//*[@id=\"login\"]", "ComingALongWayYouAreYoungOne");
    }

    @Then("^I type in my password$")
    public void iTypeInMyPassword() {
        DriverHelpers.enterText("//*[@id=\"login_password\"]", "123456789");
    }

    @Then("^I click on log-in$")
    public void iClickOnLogIn() {
        DriverHelpers.clickOnElement("//*[@id=\"login_button\"]");
    }

}




