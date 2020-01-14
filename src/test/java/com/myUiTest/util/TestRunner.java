package com.myUiTest.util;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/", tags = {"@test"}, plugin = {"pretty","html:target/cucumber-html-report"},
        glue = {"com.myUiTest"})

public class TestRunner extends SharedDriver {

    static WebDriver driver = start();

    @AfterClass
    public static void AfterAll(){
        driver.quit();
    }
}

