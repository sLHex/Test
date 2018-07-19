package Helpers;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.Select;
import javax.xml.bind.Element;
import javax.xml.xpath.XPath;
import java.net.PortUnreachableException;
import java.security.PublicKey;
import java.sql.Driver;
import java.util.Calendar;
import java.util.Date;

public class DriverHelpers {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void beforeScenario() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/admim/Downloads/chromedriver");
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

    public static void clickOnElement(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();

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

    public static boolean checkForExactUrl(String exactUrl) {
        return driver.getCurrentUrl().equals(exactUrl);
    }

    public static void findElementByName(String path) {
        driver.findElement(By.name(path));
    }

    public static void clickOnElementByName(String path) {
        WebElement element = driver.findElement(By.name(path));
        element.click();
    }

    public static void hoverOverElement (String xpath, String xpath1) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(xpath));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        WebElement clickElement = waitForElementWithTimeout(xpath1, 2000);
        action.moveToElement(clickElement).click().perform();
    }

        private static WebElement waitForElementWithTimeout(String xPath, int timeoutInMillis) throws InterruptedException {
            Calendar future = Calendar.getInstance();
            future.setTime(new Date());
            future.add(Calendar.MILLISECOND, timeoutInMillis);

            long futureEpoch = future.getTimeInMillis();

            while (futureEpoch >= Calendar.getInstance().getTimeInMillis()) {
                try {
                    WebElement element = driver.findElement(By.xpath(xPath));
                    if (element != null) {
                        return element;
                    }

                } catch (Exception e) {
                    Thread.sleep(500);
                }
            }

            return null;
        }

}

















