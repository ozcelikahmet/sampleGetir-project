package steps;


import cucumber.api.PendingException;
import cucumber.api.java.bs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import utils.CommonUtils;

import static steps.Hooks.*;

public class SampleGetirStepDefs {
    String productPrice, productName;

    @Given("^user taps on \"([^\"]*)\"$")
    public void userTapsOn(String elementToTab) {
        CommonUtils.tapByElement(androidDriver, CommonUtils.elementByText(androidDriver, elementToTab));
    }

    @Then("^user validates \"([^\"]*)\" is displayed$")
    public void userValidatesIsDisplayed(String textToBeVisible) {
        Assert.assertEquals(textToBeVisible, CommonUtils.elementByText(androidDriver, textToBeVisible).getText());
    }

    @And("^user taps on first product$")
    public void userTapsOnFirstProduct() {
        CommonUtils.tapByElement(androidDriver, waterScreen.allProducts.get(0));
    }

    @And("^user saves product details$")
    public void userSavesProductDetails() {
        productName = firstProductScreen.productName.getText();
        productPrice = firstProductScreen.productPrice.getText();
    }

    @And("^user goes back$")
    public void userGoesBack() {
        androidDriver.navigate().back();
    }

    @And("^user taps on cart icon$")
    public void userTapsOnCartIcon() {
        CommonUtils.tapByElement(androidDriver, waterScreen.cartIcon);
    }

    @And("^user validates product details and price$")
    public void userValidatesProductDetailsAndPrice() {
        Assert.assertEquals(productName, cartScreen.productName.getText());
        Assert.assertEquals(productPrice, cartScreen.productPrice.getText());
    }

    @And("^user taps on menu button$")
    public void userTapsOnMenuButton() {
        CommonUtils.tapByElement(androidDriver, homeScreen.menuButton);
    }

    @And("^user taps on third product$")
    public void userTapsOnThirdProduct() {
        CommonUtils.tapByElement(androidDriver, babyCareScreen.thirdProduct);
    }

    @And("^user validates product price is \"([^\"]*)\"$")
    public void userValidatesProductPriceIs(String expectedProductPrice) {
        Assert.assertEquals(expectedProductPrice,
                thirdProductScreen.productPrice.getText());
    }
}
