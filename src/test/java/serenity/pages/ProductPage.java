package serenity.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import serenity.utils.YamlUtil;

import java.io.IOException;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ProductPage extends BasePage {

    YamlUtil readLocatorsYaml = new YamlUtil();
    public void verifyUserDisplayedWithSearchResults() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","productListPage","searchResults");
        Assert.assertTrue(getDriver().findElement(By.xpath(locator)).isDisplayed());
    }

    public void verifyPaginationSearchResults() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","productListPage","paginationSearch");
        getDriver().findElement(By.xpath(locator)).click();
    }

    public void selectProductToBeAdded() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","productListPage","productSelected");
        getDriver().findElement(By.xpath(locator)).click();
    }

    public void userSelectsQuantity() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","productListPage","quantitySelected");
        switchToTab();
        selectDropDownByIndex(By.xpath(locator),2);
    }

    public void clickAddToCart() throws IOException {
        String locator = readLocatorsYaml.readLocators("xpath","productListPage","addToCart");
        getDriver().findElement(By.xpath(locator)).click();
    }
}
