import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;

public class WebDriverTests {


    WebDriver driver;

    @Given("^I open the \"([^\"]*)\" web driver$")
    public void iOpenTheWebDriver(String driverName) throws Throwable {
        driver = new SafariDriver();
    }

    @And("^I go to the website \"([^\"]*)\"$")
    public void iGoToTheWebsite(String websiteName) throws Throwable {
        driver.get(websiteName);
    }

    @Then("^I expect the website title to be \"([^\"]*)\"$")
    public void iExpectTheWebsiteTitleToBe(String websiteTitle) throws Throwable {
        String currentTitle = driver.getTitle();
        String expectedTitle = websiteTitle;

        Assert.assertTrue(currentTitle.equals(expectedTitle));
    }

    @And("^I close the web driver$")
    public void iCloseTheWebDriver() throws Throwable {
        if (driver != null) {
            driver.close();
        } else {
            Assert.fail("Firefox is already closed");
        }
    }

}
