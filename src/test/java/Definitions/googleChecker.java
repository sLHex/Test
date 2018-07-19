package Definitions;

import Helpers.DriverHelpers;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class googleChecker {
    @Then("^I input hello world into google$")
    public void iInputHelloWorldIntoGoogle() {
        DriverHelpers.enterText("//*[@id=\"lst-ib\"]", "Hello World");

    }

    @Then("^I confirm my search by pushing enter$")
    public void iConfirmMySearchByPushingGoogleSearch(){
        DriverHelpers.pressEnter("//*[@id=\"lst-ib\"]");
    }


    @Then("^I click on the hello world program wiki page$")
    public void iClickOnTheHelloWorldProgramWikiPage(){
        DriverHelpers.clickOnElement("//*[@id=\"rso\"]/div[1]/div/div[2]/div/div/h3/a");

    }

    @Then("^I select the main page option on the wiki page$")
    public void iSelectTheMainPageOptionOnTheWikiPage(){
        DriverHelpers.ClickElementByPartialLinkText("Main pag");

    }

    @Then("^I check to see if I am at the correct url$")
    public void iCheckToSeeIfIAmAtTheCorrectUrl(){
        boolean isCorrect = DriverHelpers.checkForExactUrl("https://en.wikipedia.org/wiki/Main_Page");
        Assert.assertTrue(isCorrect);
    }

}







