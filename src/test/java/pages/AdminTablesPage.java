package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.Values;

import java.util.concurrent.TimeUnit;

public class AdminTablesPage {

    public static String xpath = "//input[@formcontrolname=";


    @Test(priority = 1)
    public static void changeID() throws InterruptedException {
        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://muhasebe-deploy.herokuapp.com/admin");
        if(driver.getCurrentUrl().endsWith("admin"))
        {
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
    else{
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys(Values.getValidUsername());
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin-dashboard")){
            System.out.println(Values.getSuccessfulLoginMessage());
        }
    else{
            System.out.println(Values.getLoginErrorMessage());
        }
        driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='id']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@placeholder='ID']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@placeholder='ID']")).sendKeys("9000068418");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();
        driver.close();

    }

    @Test(priority = 2)
    public static void restoreID() throws InterruptedException {
        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://muhasebe-deploy.herokuapp.com/admin");
        if (driver.getCurrentUrl().endsWith("admin")) {
            System.out.println(Values.getUrlEndsWithLoginMessage());
        } else {
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("9000068418");
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if (driver.getCurrentUrl().endsWith("admin-dashboard")) {
            System.out.println(Values.getSuccessfulLoginMessage());
        } else {
            System.out.println(Values.getLoginErrorMessage());
        }
        driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='id']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@placeholder='ID']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@placeholder='ID']")).sendKeys(Values.getValidUsername());
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();
        driver.close();


    }
}
