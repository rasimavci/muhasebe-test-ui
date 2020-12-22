package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.Values;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("9000068418");//9000068418
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin-tables")){
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else{
            System.out.println(Values.getLoginErrorMessage());
        }
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='id']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).sendKeys("7840266351");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();
        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'7840266351')]")).isDisplayed();

        if(Display==true) {
            System.out.println("Değiştirilen ID kullanıcılar tablosunda görüntülendi :" + Display);
        }
        else{
            System.out.println("Değiştirilen ID kullanıcılar tablosunda görüntülenemedi :" + Display);
        }

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println("Başarıyla çıkış yapıldı.");
        }
        else{
            System.out.println("Çıkış yapılamadı!");
        }

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
        }
        else {
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("7840266351");
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if (driver.getCurrentUrl().endsWith("admin-tables")) {
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else {
            System.out.println(Values.getLoginErrorMessage());
        }
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='id']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).sendKeys("9000068418");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();
        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'9000068418')]")).isDisplayed();

        if(Display==true) {
            System.out.println("Değiştirilen ID kullanıcılar tablosunda görüntülendi :" + Display);
        }
        else{
            System.out.println("Değiştirilen ID kullanıcılar tablosunda görüntülenemedi :" + Display);
        }

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println("Başarıyla çıkış yapıldı.");
        }
        else{
            System.out.println("Çıkış yapılamadı!");
        }
        driver.close();

    }

    @Test(priority = 3)
    public static void changeName() throws InterruptedException {
        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://muhasebe-deploy.herokuapp.com/admin");
        if (driver.getCurrentUrl().endsWith("admin")) {
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else {
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("7840266351");
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if (driver.getCurrentUrl().endsWith("admin-tables")) {
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else {
            System.out.println(Values.getLoginErrorMessage());
        }
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='name']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).sendKeys("Aysu");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();
        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'Aysu')]")).isDisplayed();

        if(Display==true) {
            System.out.println("Değiştirilen NAME kullanıcılar tablosunda görüntülendi :" + Display);
        }
        else{
            System.out.println("Değiştirilen NAME kullanıcılar tablosunda görüntülenemedi :" + Display);
        }

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println("Başarıyla çıkış yapıldı.");
        }
        else{
            System.out.println("Çıkış yapılamadı!");
        }
        driver.close();

    }
    @Test(priority = 4)
    public static void restoreName() throws InterruptedException {
        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://muhasebe-deploy.herokuapp.com/admin");
        if (driver.getCurrentUrl().endsWith("admin")) {
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else {
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("7840266351");
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if (driver.getCurrentUrl().endsWith("admin-dashboard")) {
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else {
            System.out.println(Values.getLoginErrorMessage());
        }
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='name']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).sendKeys("Tohan");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();
        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'Tohan')]")).isDisplayed();

        if(Display==true) {
            System.out.println("Değiştirilen NAME kullanıcılar tablosunda görüntülendi :" + Display);
        }
        else{
            System.out.println("Değiştirilen NAME kullanıcılar tablosunda görüntülenemedi :" + Display);
        }

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println("Başarıyla çıkış yapıldı.");
        }
        else{
            System.out.println("Çıkış yapılamadı!");
        }
        driver.close();

    }

    @Test(priority = 5)
    public static void changeCompany() throws InterruptedException {
        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://muhasebe-deploy.herokuapp.com/admin");
        if (driver.getCurrentUrl().endsWith("admin")) {
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else {
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("7840266351");
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if (driver.getCurrentUrl().endsWith("admin-tables")) {
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else {
            System.out.println(Values.getLoginErrorMessage());
        }
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='company']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).sendKeys("Dormakaba");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();
        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'Dormakaba')]")).isDisplayed();

        if(Display==true) {
            System.out.println("Değiştirilen COMPANY kullanıcılar tablosunda görüntülendi :" + Display);
        }
        else{
            System.out.println("Değiştirilen COMPANY kullanıcılar tablosunda görüntülenemedi :" + Display);
        }

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println("Başarıyla çıkış yapıldı.");
        }
        else{
            System.out.println("Çıkış yapılamadı!");
        }
        driver.close();

    }

    @Test(priority = 6)
    public static void restoreCompany() throws InterruptedException {
        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://muhasebe-deploy.herokuapp.com/admin");
        if (driver.getCurrentUrl().endsWith("admin")) {
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else {
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("7840266351");
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if (driver.getCurrentUrl().endsWith("admin-tables")) {
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else {
            System.out.println(Values.getLoginErrorMessage());
        }
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='company']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).sendKeys("Ronwell");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();
        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'Ronwell')]")).isDisplayed();

        if(Display==true) {
            System.out.println("Değiştirilen COMPANY kullanıcılar tablosunda görüntülendi :" + Display);
        }
        else{
            System.out.println("Değiştirilen COMPANY kullanıcılar tablosunda görüntülenemedi :" + Display);
        }

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println("Başarıyla çıkış yapıldı.");
        }
        else{
            System.out.println("Çıkış yapılamadı!");
        }
        driver.close();

    }
    @Test(priority = 7)
    public static void changePhoneNumber() throws InterruptedException {
        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://muhasebe-deploy.herokuapp.com/admin");
        if (driver.getCurrentUrl().endsWith("admin")) {
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else {
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("7840266351");
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if (driver.getCurrentUrl().endsWith("admin-tables")) {
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else {
            System.out.println(Values.getLoginErrorMessage());
        }
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='phonenumber']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).sendKeys("05342561545");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();
        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'05342561545')]")).isDisplayed();

        if(Display==true) {
            System.out.println("Değiştirilen PHONE NUMBER kullanıcılar tablosunda görüntülendi :" + Display);
        }
        else{
            System.out.println("Değiştirilen PHONE NUMBER kullanıcılar tablosunda görüntülenemedi :" + Display);
        }

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println("Başarıyla çıkış yapıldı.");
        }
        else{
            System.out.println("Çıkış yapılamadı!");
        }

        driver.close();

    }
    @Test(priority = 8)
    public static void restorePhoneNumber() throws InterruptedException {
        System.setProperty(Values.getChromeDriver(), Values.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://muhasebe-deploy.herokuapp.com/admin");
        if (driver.getCurrentUrl().endsWith("admin")) {
            System.out.println(Values.getUrlEndsWithLoginMessage());
        }
        else {
            System.out.println(Values.getUrlDoesNotEndsWithLoginMessage());
        }
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("7840266351");
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if (driver.getCurrentUrl().endsWith("admin-tables")) {
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else {
            System.out.println(Values.getLoginErrorMessage());
        }
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='phonenumber']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).sendKeys("5555555555");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();
        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'5555555555')]")).isDisplayed();

        if(Display==true) {
            System.out.println("Değiştirilen PHONE NUMBER kullanıcılar tablosunda görüntülendi :" + Display);
        }
        else{
            System.out.println("Değiştirilen PHONE NUMBER kullanıcılar tablosunda görüntülenemedi :" + Display);
        }

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println("Başarıyla çıkış yapıldı.");
        }
        else{
            System.out.println("Çıkış yapılamadı!");
        }

        driver.close();

    }

    @Test(priority = 9)
    public static void changeAddress() throws InterruptedException {
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
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("7840266351");
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin-tables")){
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else{
            System.out.println(Values.getLoginErrorMessage());
        }
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='addres']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).sendKeys("istanbul");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();
        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'istanbul')]")).isDisplayed();

        if(Display==true) {
            System.out.println("Değiştirilen ADDRESS kullanıcılar tablosunda görüntülendi :" + Display);
        }
        else{
            System.out.println("Değiştirilen ADDRESS kullanıcılar tablosunda görüntülenemedi :" + Display);
        }

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println("Başarıyla çıkış yapıldı.");
        }
        else{
            System.out.println("Çıkış yapılamadı!");
        }

        driver.close();

    }

    @Test(priority = 10)
    public static void changeEmail() throws InterruptedException {
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
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("7840266351");
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin-tables")){
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else{
            System.out.println(Values.getLoginErrorMessage());
        }
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='Email']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).clear();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).sendKeys("fatih123@gmail.com");
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();
        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'fatih123@gmail.com')]")).isDisplayed();

        if(Display==true) {
            System.out.println("Değiştirilen EMAIL kullanıcılar tablosunda görüntülendi :" + Display);
        }
        else{
            System.out.println("Değiştirilen EMAIL kullanıcılar tablosunda görüntülenemedi :" + Display);
        }

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println("Başarıyla çıkış yapıldı.");
        }
        else{
            System.out.println("Çıkış yapılamadı!");
        }

        driver.close();

    }

    @Test(priority = 11)
    public static void changeActiveUntil() throws InterruptedException {
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
        driver.findElement(By.xpath(xpath + "'username']")).sendKeys("7840266351");
        driver.findElement(By.xpath(xpath + "'password']")).sendKeys(Values.getValidPassword());
        driver.findElement(By.xpath(Values.getLoginButtonXpath())).click();
        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin-tables")){
            System.out.println(Values.getSuccessfulLoginMessage());
        }
        else{
            System.out.println(Values.getLoginErrorMessage());
        }
        //driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("(//button[@class='btn btn-sm btn-primary'])[1]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//select[@class='btn btn-outline-primary ng-untouched ng-pristine ng-valid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='activeuntil']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).clear();
        Thread.sleep(1500);

        LocalDate date = LocalDate.now().plusYears(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("Üyelik tarihi bir yıl uzatıldı. Yeni son geçerlilik tarihi: "+date.format(formatter));
        DateTimeFormatter formatterForTable = DateTimeFormatter.ofPattern("dd.MM.yyyy");


        driver.findElement(By.xpath("//*[@class='form-control form-control-alternative']")).sendKeys(date.format(formatter));
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@class='btn btn-outline-dark']")).click();
        Thread.sleep(2000);

        Boolean Display = driver.findElement(By.xpath("//*[contains(text(),'"+date.format(formatterForTable)+"')]")).isDisplayed();

        if(Display==true) {
            System.out.println("Değiştirilen ACTIVE UNTIL kullanıcılar tablosunda görüntülendi :" + Display);
        }
        else{
            System.out.println("Değiştirilen ACTIVE UNTIL kullanıcılar tablosunda görüntülenemedi :" + Display);
        }

        driver.findElement(By.xpath(Values.getMenuButtonXpath())).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath(Values.getLogoutButtonXpath())).click();

        Thread.sleep(3000);
        if(driver.getCurrentUrl().endsWith("admin")){
            System.out.println("Başarıyla çıkış yapıldı.");
        }
        else{
            System.out.println("Çıkış yapılamadı!");
        }

        driver.close();

    }

}
