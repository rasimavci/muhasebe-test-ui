package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    @Test
    public static void successfulLoginThenLogout() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ozdileto\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://muhasebe-deploy.herokuapp.com/login");

        if(driver.getCurrentUrl().endsWith("login")){
            System.out.println("\nUrl ends with 'login'.\n");
        }
        else{
            System.out.println("Url does not ends with 'login'!");
        }

        driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys("586126");
        driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@class='btn btn-primary my-4']")).click();
        Thread.sleep(3000);

        if(driver.getCurrentUrl().endsWith("tables")){
            System.out.println("Login successful.");
        }
        else{
            System.out.println("Login error!");
        }
        driver.findElement(By.xpath("//*[@class='media align-items-center']")).click();

    }

    @Test
    public void validUsernameInvalidPassword() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ozdileto\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://muhasebe-deploy.herokuapp.com/login");

        if(driver.getCurrentUrl().endsWith("login")){
            System.out.println("\nUrl ends with 'login'.\n");
        }
        else{
            System.out.println("Url does not ends with 'login'!");
        }

        driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys("586126");
        driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@class='btn btn-primary my-4']")).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text + "!");

    }

    @Test
    public void invalidUsernameValidPassword() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ozdileto\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://muhasebe-deploy.herokuapp.com/login");

        if(driver.getCurrentUrl().endsWith("login")){
            System.out.println("\nUrl ends with 'login'.\n");
        }
        else{
            System.out.println("Url does not ends with 'login'!");
        }

        driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys("111111111");
        driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@class='btn btn-primary my-4']")).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text + "!");

    }


}
