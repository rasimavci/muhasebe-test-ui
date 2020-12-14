package utils;

import org.openqa.selenium.JavascriptExecutor;

public class AjaxWaiter {

    public static void waitForAjaxToLoad() {

        try {
            //Thread.sleep(250);
            Thread.sleep(800);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        JavascriptExecutor executor = (JavascriptExecutor) new Browser().getWebDriver();
        boolean stillRunningAjax = (Boolean) executor.executeScript("return window.jQuery != undefined && jQuery.active != 0");

        while (stillRunningAjax) {

            stillRunningAjax = (Boolean) executor.executeScript("return window.jQuery != undefined && jQuery.active != 0");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
