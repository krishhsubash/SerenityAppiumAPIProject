package serenity.pages;


import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.serenitybdd.rest.SerenityRest.given;

public class BasePage extends PageObject {

    public static Logger log=LogManager.getLogger(HomePage.class.getName());
    public static RequestSpecification requestSpec ;
    public static ResponseSpecification resSpec;
    public Actions action;
    public static String userDir = System.getProperty("user.dir");
    WebDriverWait wait;



    public String getUrl() {
        String url = getDriver().getCurrentUrl();
        if(url==null) {
            log.error("URL is not launched,driver is not be initialized");
        }
        else {
            log.info("driver is navigated to URL: "+url);
        }
        return url;
    }

    public String getBrowserTitle() {
        String browserTitle;
        browserTitle = getDriver().getTitle();
        if(browserTitle==null) {
            log.error("URL is not launched,driver is not be initialized");
        }
        else {
            log.info("Browser is navigated to : "+browserTitle);
        }
        return browserTitle;
    }

    public String getElementText(By element) {
        String elementText = getDriver().findElement(element).getText();
        if(elementText.equals(null)){
            log.error("Could not find the element :"+elementText);
        }
        else {
            log.info("Element text is : "+elementText);
        }
        return elementText;
    }

    public String getElementPlaceHolderText(By element,String attriibuteName) {
        String elementText = getDriver().findElement(element).getAttribute(attriibuteName);
        if(elementText.equals(null)){
            log.error("Could not find the element :"+elementText);
        }
        else {
            log.info("Element text is : "+elementText);
        }
        return elementText;
    }

    public int getElementsCount(By element) {
        int elementCount = getDriver().findElements(element).size();
        if(elementCount==0) {
            log.error("Could not find the element");
        }
        else {
            log.info("element count is:"+elementCount);
        }
        return elementCount;
    }

    public void clickElement(By element) {
        log.info("Before click on the element: "+element);
        getDriver().findElement(element).click();
        log.info("After click on the element: "+element);
    }
    public void clearTextBox(By element) {
        getDriver().findElement(element).clear();
        if(getDriver().findElement(element).getText().equals(null)) {
            log.info("Text box cleared successfully");
        }
        else {
            log.error("Text box is not cleared");
        }
    }
    public void enterText(By element,String value) {
        getDriver().findElement(element).sendKeys(value);
        if(getDriver().findElement(element).getText().equals(value)) {
            log.info("Text is entered successfully in the search box");
        }
        else {
            log.error("Text box is not entered with the text");
        }
    }

    public void selectDropDownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
        if(element.getText().equals(value)) {
            log.info("Element was selected in the drop down successfully");
        }
        else {
            log.error("Element is not selected in the dropdown");
        }
    }

    public void selectDropDownByValue(By element,String value) {
        WebElement element1 = getDriver().findElement(element);
        Select select = new Select(element1);
        select.selectByValue(value);
        if(getDriver().findElement(element).getText().equals(value)) {
            log.info("Element was selected in the drop down successfully");
        }
        else {
            log.error("Element is not selected in the dropdown");
        }
    }

    public void selectDropDownByIndex(WebElement element,int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectDropDownByVisibleText(WebElement element,String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
        if(element.getText().equals(value)) {
            log.info("Element was selected in the drop down successfully");
        }
        else {
            log.error("Element is not selected in the dropdown");
        }
    }

    public void deselectDropDownByValue(WebElement element,String value) {
        Select select = new Select(element);
        select.deselectByValue(value);
        if(element.getText().equals(value)) {
            log.info("Element was de selected in the drop down successfully");
        }
        else {
            log.error("Element is not de selected in the dropdown");
        }
    }

    public void deselectDropDownByIndex(WebElement element,int index) {
        Select select = new Select(element);
        select.deselectByIndex(index);
    }
    public void deselectDropDownByVisibleText(WebElement element,String value) {
        Select select = new Select(element);
        select.deselectByVisibleText(value);
        if(element.getText().equals(value)) {
            log.info("Element was de selected in the drop down successfully");
        }
        else {
            log.error("Element is not de selected in the dropdown");
        }
    }

    public void selectDropDownByIndex(By element,int index) {
        WebElement webElement = getDriver().findElement(element);
        Select select = new Select(webElement);
        select.selectByIndex(index);
    }

    public void selectDropDownByVisibleText(By element,String value) {
        WebElement element1 = getDriver().findElement(element);
        Select select = new Select(element1);
        select.selectByVisibleText(value);
        if(getDriver().findElement(element).getText().equals(value)) {
            log.info("Element was selected in the drop down successfully");
        }
        else {
            log.error("Element is not selected in the dropdown");
        }
    }

    public void deselectDropDownByValue(By element,String value) {
        WebElement webElement = getDriver().findElement(element);
        Select select = new Select(webElement);
        select.deselectByValue(value);
        if(getDriver().findElement(element).getText().equals(value)) {
            log.info("Element was de selected in the drop down successfully");
        }
        else {
            log.error("Element is not de selected in the dropdown");
        }
    }

    public void deselectDropDownByIndex(By element,int index) {
        WebElement webElement = getDriver().findElement(element);
        Select select = new Select(webElement);
        select.deselectByIndex(index);
    }
    public void deselectDropDownByVisibleText(By element,String value) {
        WebElement webElement = getDriver().findElement(element);
        Select select = new Select(webElement);
        select.deselectByVisibleText(value);
    }

    public void multiSelectDropDown(By element,String value1,String value2) {
        WebElement webElement = getDriver().findElement(element);
        Select select  = new Select(webElement);
        if(select.isMultiple()) {
            select.selectByValue(value1);
            select.selectByValue(value2);
        }
    }

    public String getFirstSelectedDropDown(By element) {
        WebElement webElement = getDriver().findElement(element);
        Select select   = new Select(webElement);
        String selectedValue = select.getFirstSelectedOption().getText();
        return selectedValue;
    }

    /*public List<String> getAllSelectedDropDown(By element) {
        WebElement webElement = getDriver().findElement(element);
        Select select   = new Select(webElement);
        List<String> selectedValue = select.getAllSelectedOptions();
        return selectedValue;
    }
 */
    public void clickRadioButton(By radioButtonElement) {
        getDriver().findElement(radioButtonElement).click();
    }

    public void acceptAlert() {
        getDriver().switchTo().alert().accept();
    }
    public void dismissAlert() {
        getDriver().switchTo().alert().dismiss();
    }

    public String getTextOfAlert() {
        String alertText = getDriver().switchTo().alert().getText();
        return alertText;
    }

    public boolean isCheckBoxselected(By element) {
        boolean isChecked =  getDriver().findElement(element).isSelected();
        return isChecked;
    }

    public boolean isCheckBoxUnSelected(By element) {
        boolean isCheckBoxUnSelected = !(getDriver().findElement(element).isSelected());
        return isCheckBoxUnSelected;
    }

    public int countCheckBoxes() {
        int checkBoxCount = getDriver().findElements(By.className("checkbox")).size();
        return checkBoxCount;
    }

    public void waitForVisibilityOfElement(By element) {
        WebElement webElement = getDriver().findElement(element);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitForVisibilityOfAllElements(By elements) {
        List<WebElement> webElements = getDriver().findElements(elements);
        wait.until(ExpectedConditions.visibilityOfAllElements(webElements));
    }

    public void waitForElementToBeClickable(By element) {
        WebElement webElement = getDriver().findElement(element);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitUntilAlertIsPresent(By element) {
        WebElement webElement = getDriver().findElement(element);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void waitUntilInvisibilityof(By element)  {
        WebElement webElement = getDriver().findElement(element);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public void waitUntilInvisiblityOfElementWithText(By element,String text) {
        wait.until(ExpectedConditions.invisibilityOfElementWithText(element,text));
    }

    public void waitUntilTextToBe(By element,String text) {
        wait.until(ExpectedConditions.textToBe(element,text));
    }
    public void waitUntilElementText(By element, String text) {
        wait.until(ExpectedConditions.textToBePresentInElementValue(element,text));
    }

    public void waitUntilElementStateSelected(By element) {
        wait.until(ExpectedConditions.elementSelectionStateToBe(element,true));
    }
    public void waitUntilElementStateUnSelected(By element) {
        wait.until(ExpectedConditions.elementSelectionStateToBe(element,false));
    }

    public void waitUntilFrameSwitchedTo(int frameID) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameID));
    }
    public void waitUntilFrameSwitchedTo(String frame) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
    }
    public void moveToElement(By element) {
        WebElement webElement = getDriver().findElement(element);
        action.moveToElement(webElement).build().perform();
    }
    public void clickAndHold(By element) {
        WebElement webElement = getDriver().findElement(element);
        action.clickAndHold(webElement).build().perform();
    }
    public void doubleClick(By element) {
        WebElement webElement = getDriver().findElement(element);
        action.doubleClick(webElement).build().perform();
    }

    public void dragAndDrop(By source,By destination) {
        WebElement webElement = getDriver().findElement(source);
        WebElement dest = getDriver().findElement(destination);
        action.dragAndDrop(webElement,dest).build().perform();
    }

    public void pauseExecution(long duration) {
        action.pause(duration);
    }

    public void switchWindowHandle(String windowID) {
        Set<String> windowHandles = getDriver().getWindowHandles();
        Iterator<String> itr = windowHandles.iterator();
        while(itr.hasNext()) {
            if(windowID.equals(itr.next())) {
                getDriver().switchTo().window(windowID);
            }
        }
    }

    public void switchToTab() {
        Set<String> handles = getDriver().getWindowHandles();
        String currentHandle = getDriver().getWindowHandle();
        for (String handle : handles) {

            if (!handle .equals(currentHandle))
            {
                getDriver().switchTo().window(handle);
            }
        }
    }

    public void rightClick(By element) {
        WebElement webElement = getDriver().findElement(element);
        action.contextClick(webElement).build().perform();
    }

    public void rightClick(WebElement element) {
        action.contextClick(element).build().perform();
    }

    public void openHyperLinkInSeperateTab(By element){
        String clickOnHyperlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
        getDriver().findElement(element).sendKeys(clickOnHyperlink);
        Set<String> windowHandles = getDriver().getWindowHandles();
        Iterator<String> itr = windowHandles.iterator();
        while(itr.hasNext()) {
            getDriver().switchTo().window(itr.next());
        }
    }

    //Date Pattern	Example
    //dd-MM-yy	31-01-12
    //dd-MM-yyyy	31-01-2012
    //MM-dd-yyyy	01-31-2012
    //yyyy-MM-dd	2012-01-31
    //yyyy-MM-dd HH:mm:ss	2012-01-31 23:59:59
    //yyyy-MM-dd HH:mm:ss.SSS	2012-01-31 23:59:59.999
    // yyyy-MM-dd HH:mm:ss.SSSZ	2012-01-31 23:59:59.999+0100
    // EEEEE MMMMM yyyy HH:mm:ss.SSSZ	Saturday November 2012 10:45:42.720+0100


    public String datePattern(String datePattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
        String dateString = dateFormat.format(new Date());
        return dateString;
    }

    public void switchToFrame(int frameID) {
        getDriver().switchTo().frame(frameID);
    }

    public boolean elementPresent(By element) {
        boolean elementPresent = false;
        if(getDriver().findElements(element).size()>0) {
            elementPresent = true;
        }
        if(elementPresent) {
            log.info("Element is present");
        }
        else {
            log.error("Element is not present");
        }
        return elementPresent;
    }

    public boolean elementDisplayed(By element) {
        boolean elementDisplayed = false;
        if(getDriver().findElement(element).isDisplayed()) {
            elementDisplayed = true;
        }
        if(elementDisplayed) {
            log.info("Element is displayed");
        }
        else {
            log.error("Element is not displayed");
        }
        return elementDisplayed;
    }
    public boolean elementEnabled(By element) {
        boolean elementEnabled = false;
        if(getDriver().findElement(element).isEnabled()) {
            elementEnabled = true;
        }
        if(elementEnabled) {
            log.info("Element is enabled");
        }
        else {
            log.error("Element is disabled");
        }
        return elementEnabled;
    }

    public List<String> displayBrokenLink() {
        List<WebElement> links = getDriver().findElements(By.tagName("a"));
        List<String> invalidLink = new ArrayList<>();
        for(WebElement link : links) {
            try {
                URL url = new URL(link.getText()) ;
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                conn.setConnectTimeout(10000);
                conn.connect();
                if(conn.getResponseCode()!=200) {
                    invalidLink.add(link.getAttribute("href"));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return invalidLink;
    }

    public void maximizeWindow() {
        getDriver().manage().window().maximize();
    }

    public void deleteAllCookies() {
        getDriver().manage().deleteAllCookies();
    }

    public void deleteCookie(Cookie cookie) {
        getDriver().manage().deleteCookie(cookie);
    }

    public void windowURLAuthentication(String username,String password, String url) {
        getDriver().get("http://"+username+":"+password+"@"+url);
    }

    public void uploadFileAutoIT(String autoITFilePath) throws IOException {
        Runtime.getRuntime().exec(autoITFilePath);
    }

    public static void setUpRestURI(String baseURI, int port, String basePath) {
        RestAssured.baseURI = baseURI;
        RestAssured.basePath = basePath;
        RestAssured.port = port;
        given().log().all().when().then().statusCode(200);
    }

    public void scrollToElement(By element) {
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("argument[0].scrollIntoView(true)",element);

    }


    public void waitUntilPageLoad() {
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        int i = 0;
        while(i!=20) {
            String pageState = (String)js.executeScript("return document.readyState;");
            if(pageState.equals("Complete")) {
                break;
            }
            else {
                i++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
