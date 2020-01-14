package com.myUiTest.stepdefinitions;

import com.myUiTest.pages.HomePage;
import com.myUiTest.pages.SearchPage;
import com.myUiTest.util.SharedDriver;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Home extends SharedDriver {

    WebDriver driver = start();

    HomePage homePage;
    SearchPage searchPage;

    public Home() {

        homePage = PageFactory.initElements(driver, com.myUiTest.pages.HomePage.class);
        searchPage = PageFactory.initElements(driver,com.myUiTest.pages.SearchPage.class);
        driver.manage().deleteAllCookies();
    }


    @Given("^I login$")
    public void i_login() throws Throwable{
        homePage.goToPage("https://dev.centree.scibite.io/#/login?redirect=%2Fsearch");
        homePage.login("qatester","1234");
        Thread.sleep(2000);
    }
}
