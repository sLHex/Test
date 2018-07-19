package Temp2;
import Helpers.DriverHelpers;
import cucumber.api.java.en.Then;

public class GuitarFlashSmokeTests {

    @Then("^I input my e-mail into the sign in box on guitarflash homepage$")
    public void iInputMyEMailIntoTheSignInBoxOnTheHomepage(){
        DriverHelpers.enterText("//*[@id=\"fEmail\"]","Connor-Lovegrove@hotmail.co.uk");
    }


    @Then("^I input my password into the sign in box on guitarflash homepage$")
    public void iInputMyPasswordIntoTheSignInBoxOnGuitarflashHomepage(){
        DriverHelpers.enterText("//*[@id=\"fSenha\"]","ownedbyme");
    }

    @Then("^I click on okay to confirm login on the guitarflash homepage$")
    public void iClickOnOkayToConfirmLoginOnTheGuitarflashHomepage(){
        DriverHelpers.clickOnElement("//*[@id=\"menuGX2\"]/span[3]/input");
    }
}
