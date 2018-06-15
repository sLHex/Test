package Definitions;

import Helpers.DriverHelpers;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class OutlookSmokeTests {
    @Then("^I click on the sign in box$")
    public void iClickOnTheSignInBox() {
        DriverHelpers.clickOnElement("//*[@id=\"i0116\"]");

    }

    @Then("^I type my email into outlook log-in$")
    public void iTypeMyEmailIntoOutlookLogIn() {
        DriverHelpers.enterText("//*[@id=\"i0116\"]", "Connor.Lovegrove@test.net");
    }

    @Then("^I click on the next option on the outlook sign-in page$")
    public void iClickOnTheNextOptionOnTheOutlookSignInPage(){DriverHelpers.clickOnElement("//*[@id=\"idSIButton9\"]");
    }
}



