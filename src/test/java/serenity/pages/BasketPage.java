package serenity.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import serenity.utils.YamlUtil;

import java.io.IOException;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BasketPage extends BasePage {

    YamlUtil readLocatorsYaml = new YamlUtil();

    public void verifyUserRedirectedBasketPage() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath", "cartPage", "cartSubTotal");
        Assert.assertTrue(getDriver().findElement(By.xpath(locator)).isDisplayed());
    }

    public void verifyProductAddedToCart() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath", "productListPage", "cartButton");
        getDriver().findElement(By.xpath(locator)).click();
        String productLocator = readLocatorsYaml.readLocators("xpath", "productListPage", "productSelected");
        Assert.assertTrue(getDriver().findElement(By.xpath(productLocator)).isDisplayed());
    }


    public void clickButtonCart(String productButton) throws IOException {
        switch (productButton) {
            case "Remove":
                String locator = readLocatorsYaml.readLocators("xpath", "cartPage", "cartDeleteHyperlink");
                getDriver().findElement(By.xpath(locator)).click();
                break;
        }
    }

    public void clickCartButton(String cartButton) throws IOException {
        switch (cartButton) {
            case "Cart":
                String locator = readLocatorsYaml.readLocators("xpath", "productListPage", "cartButton");
                getDriver().findElement(By.xpath(locator)).click();
                break;
            case "Proceed to Buy":
                String locatorBuy = readLocatorsYaml.readLocators("xpath", "productListPage", "proceedToBuy");
                getDriver().findElement(By.xpath(locatorBuy)).click();
                break;
        }
    }

    public void verifyUserRedirectCheckoutPage() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath", "cartPage", "checkoutPage");
        Assert.assertTrue(getDriver().findElement(By.xpath(locator)).isDisplayed());
    }

}