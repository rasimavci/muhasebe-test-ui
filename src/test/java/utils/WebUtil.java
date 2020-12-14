package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class WebUtil {

    private static WebUtil webDriverFactory;
    private WebDriver webDriver;
    private static Browser browser;

    public static WebUtil getInitial(){

        if(webDriverFactory==null){
            webDriverFactory = new WebUtil();
            try{
                webDriverFactory.createChromeBrowser();
                //webDriverFactory.createFirefoxBrowser();
            }catch(Exception e){
                System.err.println("INFO: Error occurred while creating browser");
            }
        }
        return webDriverFactory;
    }

    private WebDriver createChromeBrowser(){

        /**
         * https://stackoverflow.com/questions/43143014/chrome-is-being-controlled-by-automated-test-software
         * ChromeOptions options = new ChromeOptions();
         * options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
         * WebDriver driver = new ChromeDriver(options);
         */

        //This path may not work, not tested
        //System.setProperty("webdriver.chrome.driver", "../../../../../chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "chromeDriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        //Disabled save password popup
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);

        webDriver = new ChromeDriver(options);
        browser = new Browser();
        return browser;
    }

    private WebDriver createFirefoxBrowser(){

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ozdileto\\Desktop\\Projects\\ProjeMaven\\geckodriver.exe");
        webDriver = new FirefoxDriver();
        browser = new Browser();
        return browser;
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

    public static Browser getBrowser(){
        return browser;
    }


}








	/*public static WebUtil getInitial(){

		if(webDriverFactory==null){
			webDriverFactory = new WebUtil();
			try{
				webDriverFactory.createBrowser();
			}catch(Exception e){
				System.err.println("INFO: Error occurred while creating browser");
			}
		}
		return webDriverFactory;
	}*/