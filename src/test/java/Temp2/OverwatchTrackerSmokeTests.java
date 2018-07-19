package Temp2;

import Helpers.DriverHelpers;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OverwatchTrackerSmokeTests {
    @Then("^I input my battletag into the search bar on the homepage$")
    public void iInputMyBattletagIntoTheSearchBarOnTheHomepage() {
        DriverHelpers.enterText("//*[@id=\"search-name\"]", "Rad#21827");
    }

    @Then("^I confirm the cookie acceptance pop-up from the homepage$")
    public void iConfirmTheCookieAcceptancePopUpFromTheHomepage() {
        // Got it, thanks!
        WebElement element = DriverHelpers.findElementByText("Got it, thanks!");
        element.click();
    }

    @Then("^I push enter to go to my overwatch stats page$")
    public void iPushEnterToGoToMyOverwatchStatsPage() {
        WebElement element = DriverHelpers.getDriver().findElement(By.xpath("//*[@id=\"search-name\"]"));
        DriverHelpers.pressEnter(element);
    }


}



