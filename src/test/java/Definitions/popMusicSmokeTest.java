package Definitions;

import Helpers.DriverHelpers;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.junit.Assert;

public class popMusicSmokeTest {
    @Given("^I have logged in as intended$")
    public void iHaveLoggedInAsIntended(){
        boolean isCorrect = DriverHelpers.checkForExactUrl("");
        Assert.assertTrue(isCorrect);
    }
}
