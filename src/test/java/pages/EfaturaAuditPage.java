package pages;

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
        Thread.sleep(1500);

        if(driver.getCurrentUrl().endsWith("tables")){
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else{
            System.out.println(Values.getLoginErrorMessage());
        }

        Thread.sleep(1500);

        WebElement uploadDefter = driver.findElement(By.xpath(Values.geteDefterXpath()));
        uploadDefter.sendKeys("C:\\Users\\dereay\\Desktop\\Muhasebe\\E-Defteri.xml");

        WebElement uploadFatura = driver.findElement(By.xpath(Values.geteFaturaXpath()));
        uploadFatura.sendKeys("C:\\Users\\dereay\\Desktop\\Muhasebe\\gelenler.zip");

        driver.findElement(By.xpath("(//*[@value='Gider Faturası'])[1]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("(//*[@value='Gider Faturası'])[2]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='btn btn-primary mt-4']")).click();
        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

    }
}
