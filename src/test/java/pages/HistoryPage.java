package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.Values;

import java.util.concurrent.TimeUnit;

public class HistoryPage {

    @Test(priority = 1)
    public void showHistory() throws InterruptedException {

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

        Thread.sleep(1500);

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

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,550)");

        Thread.sleep(1500);

        driver.findElement(By.xpath("(//*[@value='Gider Faturası'])[1]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("(//*[@value='Gider Faturası'])[2]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='btn btn-primary mt-4']")).click();

        Thread.sleep(4000);

        Boolean Display2 = driver.findElement(By.xpath("//table[@style='width: 100%;']")).isDisplayed();

        if(Display2==true) {
            System.out.println("Denetim raporu görüntülendi :" + Display2);
        }
        else{
            System.out.println("Denetim raporu görüntülenemedi :" + Display2);
        }

        Thread.sleep(3000);

        //driver.findElement(By.xpath("(//*[@class='nav-link'])[3]")).click();
        driver.get("https://muhasebe-deploy.herokuapp.com/history");

        Thread.sleep(1500);

        driver.findElement(By.xpath("(//*[@class='btn btn-primary mt4'])[1]")).click();

        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//table[@style='width: 100%;']")).isDisplayed();

        if(Display2==true) {
            System.out.println("Fatura ve defter arasındaki tutar uyuşmazlıkları görüntülendi :" + Display);
        }
        else{
            System.out.println("Fatura ve defter arasındaki tutar uyuşmazlıkları görüntülenemedi :" + Display);
        }

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//*[@class='btn btn-primary mt4'])[1]")).click();

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();
        driver.close();

    }

    @Test(priority = 2)
    public void deleteHistory() throws InterruptedException {

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

        Thread.sleep(1500);

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
        Thread.sleep(1500);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,550)");

        driver.findElement(By.xpath("(//*[@value='Gider Faturası'])[1]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("(//*[@value='Gider Faturası'])[2]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='btn btn-primary mt-4']")).click();


        driver.get("https://muhasebe-deploy.herokuapp.com/history");

        driver.findElement(By.xpath("(//*[@class='btn btn-primary mt4'])[1]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark mt4 fa fa-trash']")).click();
        Thread.sleep(1200);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

    }
}
