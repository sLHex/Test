package Helpers;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;


public class DriverHelpers {

    private static WebDriver driver;


    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void beforeScenario() throws InterruptedException {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/admim/Downloads/chromedriver");
            driver = new ChromeDriver(); //Will add hooks here for @Firefox and @Chrome. Will add Root locations to tackle directory issues

            //System.setProperty("webdriver.gecko.driver", "/Users/admim/Downloads/geckodriver");
            //driver = new FirefoxDriver();
        }
    }

    @Before("@login")
    public void loginBeforeScenario() {
        System.out.println("I have hit this point"); //Trying to use custom hooks

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

    public static WebElement clickOnElement(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
        return element;


    }

    public static void checkForElement(String xpathid) {
        WebElement checkForElement = driver.findElement(By.xpath(xpathid));
    }

    @Given("^I go to the website \"([^\"]*)\"$")
    public void iGoToTheWebsite(String websiteName) {
        driver.get(websiteName);
    }

    @Then("^I expect the website title to be \"([^\"]*)\"$")
    public void iExpectTheWebsiteTitleToBe(String websiteTitle) {
        String currentTitle = driver.getTitle();
        String expectedTitle = websiteTitle;
        Assert.assertTrue(currentTitle.equals(expectedTitle));

    }

    public static void checkForCssID(String cssID) {
        driver.findElement(By.cssSelector(cssID));
    }

    public static void clickOnElementCss(String cssID) {
        driver.findElement(By.cssSelector(cssID))
                .click();
    }

    public static void inputTextCss(String cssID, String data) {
        driver.findElement(By.cssSelector(cssID))
                .sendKeys(data);

    }

    public static void pressEnter(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        pressEnter(element);
    }

    public static void pressEnter(WebElement element) {
        element.sendKeys(Keys.ENTER);
    }


    public static WebElement findElementByText(String text) {
        String query = String.format("//*[contains(text(), '%s')]", text);
        return driver.findElement(By.xpath(query));

    }

    public static void ClickElementByPartialLinkText(String PartialText) {
        WebElement element = driver.findElement(By.partialLinkText(PartialText));
        element.click();
    }

    public static void clickOnElementByPartialText(String PartialText) {
        WebElement element = driver.findElement(By.partialLinkText(PartialText));
        element.click();
    }

    public static void findElementByClassName(String Class) {
        WebElement element = driver.findElement(By.className(Class));
        element.isDisplayed();
    }

    public static boolean checkUrlContains(String url) {
        return driver.getCurrentUrl().contains(url);
    }

    public static void clickByTagName(String Tag) {
        WebElement element = driver.findElement(By.tagName(Tag));
        element.click();
    }

    public static boolean checkForExactUrl(String url) {
        return driver.getCurrentUrl().equals(url);
    }

    public static void findElementByName(String path) {
        driver.findElement(By.name(path));
    }

    public static void clickOnElementByName(String path) {
        WebElement element = driver.findElement(By.name(path));
        element.click();
    }

    public static void hoverOverElement(String xpath) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xpath));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        Thread.sleep(2000);
        WebElement clickElement = waitForElementWithTimeout("", 3000);
        action.moveToElement(clickElement).click().build().perform();  //Will attempt to add all data types as variables for this method
    }

    private static WebElement waitForElementWithTimeout(String xPath1, int timeoutInMillis) throws InterruptedException {
        Calendar future = Calendar.getInstance();
        future.setTime(new Date());
        future.add(Calendar.MILLISECOND, timeoutInMillis);
        long futureEpoch = future.getTimeInMillis();
        while (futureEpoch >= Calendar.getInstance().getTimeInMillis()) {
            try {
                WebElement element = driver.findElement(By.xpath(xPath1));
                if (element != null) {
                    return element;
                }

            } catch (Exception e) {
                Thread.sleep(500);
            }
        }

        return null;
    }

    public static void clickOnElementWithDelay(String xpath, int delayInMillis) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xpath));
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
        Thread.sleep(delayInMillis);
        element.click();
    }

    public static void HoverOverElementWithTimeoutPolling(String xPath) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xPath));
        Actions act = new Actions(driver);
        act.moveToElement(element);
        WebElement clickElement = waitForElementWithTimeout("", 2000);
        act.moveToElement(clickElement).click().build().perform();

    }

}


















