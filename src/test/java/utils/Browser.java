package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Browser implements WebDriver {

    private String xpath;

    //public WebDriver driver = new FirefoxDriver();

    public WebDriver getWebDriver() {
        return WebUtil.getInitial().getWebDriver();
    }

    public void get(String s) {
        getWebDriver().get(s);
    }

    public String getCurrentUrl() {
        return getWebDriver().getCurrentUrl();
    }

    public String getTitle() {
        return getWebDriver().getTitle();
    }

    public List<WebElement> findElements(By by) {
        return getWebDriver().findElements(by);
    }

    public WebElement findElement(By by) {
        return getWebDriver().findElement(by);
    }

    public String getPageSource() {
        return getWebDriver().getPageSource();
    }

    public void close() {
        getWebDriver().close();
    }

    public void quit() {
        getWebDriver().quit();
    }

    public Set<String> getWindowHandles() {
        return getWebDriver().getWindowHandles();
    }

    public String getWindowHandle() {
        return getWebDriver().getWindowHandle();
    }

    public TargetLocator switchTo() {
        return getWebDriver().switchTo();
    }

    public Navigation navigate() {
        return getWebDriver().navigate();
    }

    public Options manage() {
        return getWebDriver().manage();
    }


    public void maximizeWindow(){
        System.err.println("INFO: Will maximize window");
        getWebDriver().manage().window().maximize();
    }

    public void acceptAlert(){
        waitForAjax();
        System.err.println("INFO: Will accept alert");
        getWebDriver().switchTo().alert().accept();
    }

    public void moveToElementAndClickByXPath(String xpath){
        Actions action = new Actions(getWebDriver());
        WebElement we = getWebDriver().findElement(By.xpath(xpath));
        action.moveToElement(we).click().build().perform();
    }

    public void clickSpanByText(String innerText){
        waitForAjax();
        System.err.println("INFO: Will click span with text: " + innerText);
        xpath = ".//span[text()='" + innerText + "']/..";
        clickByXPath(xpath);
        System.err.println("INFO: Clicked span with text: " + innerText);
    }

    public void clickDivByText(String innerText) throws InterruptedException {
        waitForAjax();
        Thread.sleep(1000);
        System.err.println("INFO: Will click span with text: " + innerText);
        xpath = ".//div[text()='" + innerText + "']";
        clickByXPath(xpath);
    }

    public void waitForVisibility(int seconds, By elementLocator) {
        WebDriverWait wait = new WebDriverWait(this, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    }

    public void waitForPresenceOf(int seconds, By elementLocator) {
        (new WebDriverWait(getWebDriver(), seconds)).until(ExpectedConditions.presenceOfElementLocated(elementLocator));

    }

    public void sendKeysForId(String id, String text) {
        getWebDriver().findElement(By.id(id)).sendKeys(text);
        waitForAjax();
    }

    public void sendKeysForXPath(String xpath, String text) {
        getWebDriver().findElement(By.xpath(xpath)).sendKeys(text);
        waitForAjax();
    }

    public void selectOptionTextById(String id, String data) {
        Select select = new Select(getWebDriver().findElement(By.id(id)));
        select.selectByVisibleText(data);
    }

    public void selectFromComboBoxByVisibleText(WebElement label, String visibleText){

        label.click();
        waitForAjax();
        findElement(By.xpath("//ul/li[text()='" + visibleText + "']")).click();
        waitForAjax();
    }

    public String selectFromComboBoxByIndex(WebElement label, WebElement input, int indexNo){

        waitForAjax();
        label.click();
        waitForAjax();
        Select select = new Select(input);
        select.getOptions().get(indexNo).click();
        waitForAjax();

        return select.getOptions().get(indexNo).getText();
    }

    public void checkRadioButtonByClass(String className ) {
        getWebDriver().findElement(By.className(className)).click();

    }

    public void checkRadioButtonById(String id) {
        getWebDriver().findElement(By.id(id)).click();
    }

    public void clickById(String id) {
        getWebDriver().findElement(By.id(id)).click();
        waitForAjax();
    }

    public void clickByClass(String className) {
        getWebDriver().findElement(By.className(className)).click();
    }

    public void clickByXPath(String xpath) {
        getWebDriver().findElement(By.xpath(xpath)).click();
    }

    public WebElement findElementByXPath(String xpath) {
        return getWebDriver().findElement(By.xpath(xpath));
    }

    public WebElement findElementById(String id) {
        return getWebDriver().findElement(By.id(id));
    }

    public void checkRadioButtonByName(String name) {
        getWebDriver().findElement(By.name(name)).click();
    }

    public void waitForAjax() {
        AjaxWaiter.waitForAjaxToLoad();
    }

    public void waitTillInvisibilityOf(int seconds, By elementLocator) {
        WebDriverWait wait = new WebDriverWait(this, seconds);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elementLocator));
    }

    public void checkRadioButtonByXPath(String attributeExp) {
        getWebDriver().findElement(By.xpath(attributeExp)).click();
    }

    // public void clickHomeButton(){
    //     getWebDriver().findElement(By.xpath("//*[@class='icon-khome']")).click();
    //}
    // public void clickNextButtonOnHomeScreen(){
    //    getWebDriver().findElement(By.xpath("//*[@class='bx-next']")).click();
    // }

    public Set<String> getAllWindows(){

        System.err.println("INFO: Will get all windows");
        String currentWindow = getWebDriver().getWindowHandle();
        System.err.println("INFO: Current window is: " + currentWindow);
        Set<String> allWindows = getWebDriver().getWindowHandles();
        for (String childWindow : allWindows) {
            if (!childWindow.equalsIgnoreCase(currentWindow)) {
                getWebDriver().switchTo().window(childWindow);
                System.err.println("INFO: The child window is " + childWindow);
            } else {
                System.err.println("INFO: There are no child windows");
            }
        }
        return allWindows;
    }


}

