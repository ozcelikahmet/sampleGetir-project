package steps;

import cucumber.api.java.en.And;
import org.junit.Assert;
import utils.CommonUtils;

import static steps.Hooks.*;

public class BabyCareStepDefs {
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
