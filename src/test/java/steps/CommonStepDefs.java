package steps;


import cucumber.api.PendingException;
import cucumber.api.java.bs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import utils.CommonUtils;

import static steps.Hooks.*;

public class CommonStepDefs {

    @Given("^user taps on \"([^\"]*)\"$")
    public void userTapsOn(String elementToTab) {
        CommonUtils.tapByElement(androidDriver, CommonUtils.elementByText(androidDriver, elementToTab));
    }

    @Then("^user validates \"([^\"]*)\" is displayed$")
    public void userValidatesIsDisplayed(String textToBeVisible) {
        Assert.assertEquals(textToBeVisible, CommonUtils.elementByText(androidDriver, textToBeVisible).getText());
    }

    @And("^user goes back$")
    public void userGoesBack() {
        androidDriver.navigate().back();
    }
}
