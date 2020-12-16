package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.AjaxWaiter;
import utils.Browser;
import utils.Values;
import java.util.Random;
import java.util.concurrent.TimeUnit;

//import static utils.WebUtil.browser;

public class RegisterPage {


    @Test
    public static void registerLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String xpath = "//input[@formcontrolname=";

        driver.get("https://muhasebe-deploy.herokuapp.com/login");
        Thread.sleep(2500);

        driver.findElement(By.xpath("//a[@class = 'nav-link nav-link-icon']")).click();

        WebElement VKNo = driver.findElement(By.xpath("//input[@placeholder='VKN']"));
        VKNo.sendKeys(Values.getVKN());
        System.err.println("INFO: Will fill VKN as " + Values.getVKN());
        Thread.sleep(1200);

        WebElement fullname1 = driver.findElement(By.xpath(xpath + "'name']"));
        fullname1.sendKeys(Values.getFullname());
        System.err.println("INFO: Will fill fullname as " + Values.getFullname());
        Thread.sleep(1200);

        WebElement company = driver.findElement(By.xpath(xpath + "'company']"));
        company.sendKeys(Values.getCompany());
        System.err.println("INFO: Will fill company as " + Values.getCompany());
        Thread.sleep(1200);

        WebElement phone = driver.findElement(By.xpath(xpath + "'phoneNumber']"));
        phone.sendKeys(Values.getPhone());
        System.err.println("INFO: Will fill phone as " + Values.getPhone());
        Thread.sleep(1200);

        WebElement address = driver.findElement(By.xpath(xpath + "'address']"));
        address.sendKeys(Values.getAddress());
        System.err.println("INFO: Will fill address as " + Values.getAddress());
        Thread.sleep(1200);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        WebElement email = driver.findElement(By.xpath(xpath + "'email']"));
        email.sendKeys(Values.getEmail());
        System.err.println("INFO: Will fill email as " + Values.getEmail());
        Thread.sleep(1200);

        WebElement password = driver.findElement(By.xpath(xpath + "'password']"));
        password.sendKeys(Values.getPassword());
        System.err.println("INFO: Will fill password as " + Values.getPassword());
        Thread.sleep(1200);

        WebElement confirmPass = driver.findElement(By.xpath(xpath + "'confirmPass']"));
        confirmPass.sendKeys(Values.getPassword());
        System.err.println("INFO: Will fill confirmPass as " + Values.getPassword());
        Thread.sleep(1200);

        driver.findElement(By.xpath("//button[@class='btn btn-primary mt-4']")).click();

        driver.findElement(By.xpath("//li[@placement='bottom-right']")).click();
        Thread.sleep(1500);
        driver.findElement(By.linkText("Çıkış Yap")).click();


    }

    @Test
    public static void registerInvalidPassword() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String xpath = "//input[@formcontrolname=";

        driver.get("https://muhasebe-deploy.herokuapp.com/login");
        Thread.sleep(2500);

        driver.findElement(By.xpath("//a[@class = 'nav-link nav-link-icon']")).click();

        WebElement VKNo = driver.findElement(By.xpath("//input[@placeholder='VKN']"));
        VKNo.sendKeys(Values.getVKN());
        System.err.println("INFO: Will fill VKN as " + Values.getVKN());
        Thread.sleep(1200);

        WebElement fullname1 = driver.findElement(By.xpath(xpath + "'name']"));
        fullname1.sendKeys(Values.getFullname());
        System.err.println("INFO: Will fill fullname as " + Values.getFullname());
        Thread.sleep(1200);

        WebElement company = driver.findElement(By.xpath(xpath + "'company']"));
        company.sendKeys(Values.getCompany());
        System.err.println("INFO: Will fill company as " + Values.getCompany());
        Thread.sleep(1200);

        WebElement phone = driver.findElement(By.xpath(xpath + "'phoneNumber']"));
        phone.sendKeys(Values.getPhone());
        System.err.println("INFO: Will fill phone as " + Values.getPhone());
        Thread.sleep(1200);

        WebElement address = driver.findElement(By.xpath(xpath + "'address']"));
        address.sendKeys(Values.getAddress());
        System.err.println("INFO: Will fill address as " + Values.getAddress());
        Thread.sleep(1200);

        WebElement email = driver.findElement(By.xpath(xpath + "'email']"));
        email.sendKeys(Values.getEmail());
        System.err.println("INFO: Will fill email as " + Values.getEmail());
        Thread.sleep(1200);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        WebElement password = driver.findElement(By.xpath(xpath + "'password']"));
        password.sendKeys(Values.getPassword());
        System.err.println("INFO: Will fill password as " + Values.getPassword());
        Thread.sleep(1200);

        WebElement confirmPass = driver.findElement(By.xpath(xpath + "'confirmPass']"));
        confirmPass.sendKeys("1254");
        System.err.println("INFO: Will fill confirmPass as wrong");
        Thread.sleep(1200);

        if(Values.getPassword().equals(password)) {
            driver.findElement(By.xpath("//button[@class='btn btn-primary mt-4']")).click();

            System.err.println("INFO: Password entered correctly");
            driver.findElement(By.xpath("//li[@placement='bottom-right']")).click();
            Thread.sleep(1500);
            driver.findElement(By.linkText("Çıkış Yap")).click();
        }
        else {
            driver.findElement(By.xpath("//button[@class='btn btn-primary mt-4']")).click();

            System.err.println("INFO: Password entered incorrectly");
            String fail = driver.findElement(By.xpath("//div[@class='alert alert-text']")).getText();
            System.out.println(fail);

        }

    }
    @Test
    public static void registerInvalidUserID() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String xpath = "//input[@formcontrolname=";

        driver.get("https://muhasebe-deploy.herokuapp.com/login");
        Thread.sleep(2500);


        driver.findElement(By.xpath("//a[@class = 'nav-link nav-link-icon']")).click();

        WebElement VKNo = driver.findElement(By.xpath("//input[@placeholder='VKN']"));
        VKNo.sendKeys(Values.getVKN());
        System.err.println("INFO: Will fill VKN as " + Values.getVKN());
        Thread.sleep(1200);

        WebElement fullname1 = driver.findElement(By.xpath(xpath + "'name']"));
        fullname1.sendKeys(Values.getFullname());
        System.err.println("INFO: Will fill fullname as " + Values.getFullname());
        Thread.sleep(1200);

        WebElement company = driver.findElement(By.xpath(xpath + "'company']"));
        company.sendKeys(Values.getCompany());
        System.err.println("INFO: Will fill company as " + Values.getCompany());
        Thread.sleep(1200);

        WebElement phone = driver.findElement(By.xpath(xpath + "'phoneNumber']"));
        phone.sendKeys(Values.getPhone());
        System.err.println("INFO: Will fill phone as " + Values.getPhone());
        Thread.sleep(1200);

        WebElement address = driver.findElement(By.xpath(xpath + "'address']"));
        address.sendKeys(Values.getAddress());
        System.err.println("INFO: Will fill address as " + Values.getAddress());
        Thread.sleep(1200);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");


        WebElement email = driver.findElement(By.xpath(xpath + "'email']"));
        email.sendKeys(Values.getEmail());
        System.err.println("INFO: Will fill email as " + Values.getEmail());
        Thread.sleep(1200);

        WebElement password = driver.findElement(By.xpath(xpath + "'password']"));
        password.sendKeys(Values.getPassword());
        System.err.println("INFO: Will fill password as " + Values.getPassword());
        Thread.sleep(1200);

        WebElement confirmPass = driver.findElement(By.xpath(xpath + "'confirmPass']"));
        confirmPass.sendKeys(Values.getPassword());
        System.err.println("INFO: Will fill confirmPass as " + Values.getPassword());
        Thread.sleep(1200);

        driver.findElement(By.xpath("//button[@class='btn btn-primary mt-4']")).click();
        Thread.sleep(1200);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text + "!");


    }



}
