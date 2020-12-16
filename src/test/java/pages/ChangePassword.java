package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.Values;
import java.util.concurrent.TimeUnit;


public class ChangePassword {

    @Test(priority = 1)
    public void changePass() throws InterruptedException {

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

        Thread.sleep(3000);

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath(Values.getChangePassXpath())).click();

        driver.findElement(By.xpath("//*[@id='oldPass']")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id='newPass']")).sendKeys("abc123");
        driver.findElement(By.xpath("//*[@id='newPass2']")).sendKeys("abc123");
        driver.findElement(By.xpath("//*[text()='Şifremi Değiştir']")).click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println("Şifre değiştirme" + text + "!");

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

    }

    @Test(priority = 2)
    public void changePasstoOldOne() throws InterruptedException {

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
        driver.findElement(By.xpath(Values.getPasswordXpath())).sendKeys("abc123");
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);

        if(driver.getCurrentUrl().endsWith("tables")){
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else{
            System.out.println(Values.getLoginErrorMessage());
        }

        Thread.sleep(3000);

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath(Values.getChangePassXpath())).click();

        driver.findElement(By.xpath("//*[@id='oldPass']")).sendKeys("abc123");
        driver.findElement(By.xpath("//*[@id='newPass']")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id='newPass2']")).sendKeys("1234");
        driver.findElement(By.xpath("//*[text()='Şifremi Değiştir']")).click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println("Şifre değiştirme" + text + "!");

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

    }
}

