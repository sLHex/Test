package Definitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import Helpers.DriverHelpers;

public class GamebattlesSmokeTests {

    @Then("^I click on Login on the homepage of gamebattles$")
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

    @Then("^I click log-in on the gamebattles login page$")
    public void iClickOnLogIn() {
        DriverHelpers.clickOnElement("//*[@id=\"login_button\"]");
    }

    }





