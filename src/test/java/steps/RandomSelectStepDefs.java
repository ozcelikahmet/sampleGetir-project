package steps;

import cucumber.api.java.en.And;
import io.appium.java_client.android.AndroidElement;
import utils.CommonUtils;

import java.net.MalformedURLException;
import java.util.*;

import static steps.Hooks.*;

public class RandomSelectStepDefs {
    @And("^user taps on random category$")
    public void userTapsOnRandomCategory() throws MalformedURLException {
        List<String> categories = new ArrayList<>();
        for (int i = 1; i >= 1; i++) {
            try {
                AndroidElement category = androidDriver.findElementByXPath("(//android.support.v7.app.ActionBar.Tab/android.widget.TextView)" + "[" + i + "]");
                CommonUtils.tapByElement(androidDriver, category);
                categories.add(category.getText());
            }catch (NoSuchElementException noSuchElementException) {
                System.out.println("No element found!");
                break;
            }
        }
        int randomCategoryByIndex = CommonUtils.randomNumber(0, categories.size() - 1);
        CommonUtils.horizontalSwipeByText(androidDriver, categories.get(randomCategoryByIndex));
    }

    @And("^user taps on random product$")
    public void userTapsOnRandomProduct() {
        List<AndroidElement> products = new ArrayList<>();
        for (int i = 1; i >= 1; i++) {
            try {
                AndroidElement product = androidDriver.findElementByXPath("(//android.widget.ImageView)" + "[" + i + "]");
                CommonUtils.verticalSwipeByPercentages(androidDriver, 80, 20, 50);
                products.add(product);
            }catch (NoSuchElementException noSuchElementException) {
                System.out.println("No element found!");
                break;
            }
        }
        int randomProductByIndex = CommonUtils.randomNumber(0, products.size() - 1);
        CommonUtils.scrollAndClick(androidDriver, products.get(randomProductByIndex).getText());
    }
}
