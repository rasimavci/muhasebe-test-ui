package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.Values;


import java.util.concurrent.TimeUnit;

public class LoginPage {

    @Test
    public static void successfulLoginThenLogout() throws InterruptedException {

        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(Values.getLoginURL());

        if(driver.getCurrentUrl().endsWith("login")){
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else{
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }

        driver.findElement(By.xpath(Values.getUsernameXpath())).sendKeys(Values.getValidUsername());
        driver.findElement(By.xpath(Values.getPasswordXpath())).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);

        if(driver.getCurrentUrl().endsWith("tables")){
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else{
            System.out.println(Values.getLoginErrorMessage());
        }
        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

    }

    @Test
    public void validUsernameInvalidPassword() throws InterruptedException {

        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(Values.getLoginURL());

        if(driver.getCurrentUrl().endsWith("login")){
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else{
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }

        driver.findElement(By.xpath(Values.getUsernameXpath())).sendKeys(Values.getValidUsername());
        driver.findElement(By.xpath(Values.getPasswordXpath())).sendKeys(Values.getInvalidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text + "!");

    }

    @Test
    public void invalidUsernameValidPassword() throws InterruptedException {

        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(Values.getLoginURL());

        if(driver.getCurrentUrl().endsWith("login")){
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else{
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }

        driver.findElement(By.xpath(Values.getUsernameXpath())).sendKeys(Values.getInvalidUsername());
        driver.findElement(By.xpath(Values.getPasswordXpath())).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text + "!");

    }

    @Test
    public void invalidUsernameAndPassword() throws InterruptedException {

        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(Values.getLoginURL());

        if(driver.getCurrentUrl().endsWith("login")){
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else{
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }

        driver.findElement(By.xpath(Values.getUsernameXpath())).sendKeys(Values.getInvalidUsername());
        driver.findElement(By.xpath(Values.getPasswordXpath())).sendKeys(Values.getInvalidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text + "!");

    }

}
