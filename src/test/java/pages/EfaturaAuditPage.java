package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.Values;

import java.util.concurrent.TimeUnit;

public class EfaturaAuditPage {

    @Test
    public void registerThenUploadFile() throws InterruptedException {

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

        driver.findElement(By.xpath(Values.getUsernameXpath())).sendKeys("7840266351");//9000068418
        driver.findElement(By.xpath(Values.getPasswordXpath())).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);

        if(driver.getCurrentUrl().endsWith("tables")){
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else{
            System.out.println(Values.getLoginErrorMessage());
        }

        WebElement uploadDefter = driver.findElement(By.xpath(Values.geteDefterXpath()));
        uploadDefter.sendKeys("C:\\Users\\ozdileto\\Desktop\\E-Defteri.xml");

        WebElement uploadFatura = driver.findElement(By.xpath(Values.geteFaturaXpath()));
        uploadFatura.sendKeys("C:\\Users\\ozdileto\\Desktop\\gelenler.zip");

    }
}
