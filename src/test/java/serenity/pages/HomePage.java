package serenity.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import xmlConfig.Constants;


public class HomePage extends PageObject {


    public void launchTestURL() {
       getDriver().get("https://amazon.com");
        //getDriver().get(Constants.testUrl);
    }

    public void verifyUserRedirected() {
        String websiteTitle = getDriver().getTitle();
        if(websiteTitle.equals("Online shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
    }


    public void closeBrowser() {
        getDriver().close();
    }

    public void clickButton(String button) {
        switch(button) {
            case "Login":
                getDriver().findElement(By.xpath("//a/span[text()='Hello, Sign in']")).click();
                break;
        }
    }
}
