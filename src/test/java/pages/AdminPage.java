package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.Values;

import java.util.concurrent.TimeUnit;

public class AdminPage {
    public static String xpath = "//input[@formcontrolname=";

    @Test
    public static void successfulLoginThenLogout() throws InterruptedException {

        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://muhasebe-deploy.herokuapp.com/admin");

        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else{
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }

        driver.findElement(By.xpath(xpath + "'username']")).sendKeys(Values.getValidUsername());
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);

        if(driver.getCurrentUrl().endsWith("admin-tables")){
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else{
            System.out.println(Values.getLoginErrorMessage());
        }
        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();
        driver.close();

    }

    @Test
    public void validUsernameInvalidPassword() throws InterruptedException {

        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://muhasebe-deploy.herokuapp.com/admin");

        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else{
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }

        driver.findElement(By.xpath(xpath + "'username']")).sendKeys(Values.getValidUsername());
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getInvalidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text + "!");
        driver.close();

    }

    @Test
    public void invalidUsernameValidPassword() throws InterruptedException {

        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://muhasebe-deploy.herokuapp.com/admin");

        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else{
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }

        driver.findElement(By.xpath(xpath + "'username']")).sendKeys(Values.getInvalidUsername());
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text + "!");
        driver.close();

    }

    @Test
    public void invalidUsernameAndPassword() throws InterruptedException {

        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://muhasebe-deploy.herokuapp.com/admin");

        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else{
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }

        driver.findElement(By.xpath(xpath + "'username']")).sendKeys(Values.getInvalidUsername());
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getInvalidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text + "!");
        driver.close();

    }


}
