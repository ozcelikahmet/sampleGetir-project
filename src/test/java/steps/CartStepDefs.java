package steps;

import cucumber.api.java.en.And;
import org.junit.Assert;
import utils.CommonUtils;

import static steps.Hooks.*;
import static steps.Hooks.firstProductScreen;

public class CartStepDefs {
    String productPrice, productName;

    @And("^user taps on first product$")
    public void userTapsOnFirstProduct() {
        CommonUtils.tapByElement(androidDriver, waterScreen.allProducts.get(0));
    }

    @And("^user saves product details$")
    public void userSavesProductDetails() {
        productName = firstProductScreen.productName.getText();
        productPrice = firstProductScreen.productPrice.getText();
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
}
