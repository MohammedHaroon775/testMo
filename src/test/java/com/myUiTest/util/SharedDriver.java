package com.myUiTest.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedDriver {

    public static WebDriver driver;

    public static WebDriver start() {

        System.setProperty("webdriver.chrome.driver", "/Users/mh/Desktop/Chromedriver/chromedriver");

        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

}
