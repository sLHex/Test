package Helpers;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverHelpers {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void beforeScenario() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Flux\\Documents\\Code\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    @After
    public void afterScenario() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void enterText(String path, String data) {
        By elementSearch = By.xpath(path);
        WebElement element = driver.findElement(elementSearch);
        element.sendKeys(data);
    }

    public static void clickOnElement(String path) {
        By elementSearch = By.xpath(path);
        WebElement element = driver.findElement(elementSearch);
        element.click();
    }

    @Given("^I go to the website \"([^\"]*)\"$")
    public void iGoToTheWebsite(String websiteName) throws Throwable {
        driver.get(websiteName);
    }

    @Then("^I expect the website title to be \"([^\"]*)\"$")
    public void iExpectTheWebsiteTitleToBe(String websiteTitle) throws Throwable {
        String currentTitle = driver.getTitle();
        String expectedTitle = websiteTitle;

        Assert.assertTrue(currentTitle.equals(expectedTitle));
    }

}
