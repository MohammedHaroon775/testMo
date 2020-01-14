package com.myUiTest.stepdefinitions;

import com.myUiTest.pages.HomePage;
import com.myUiTest.pages.SearchPage;
import com.myUiTest.util.SharedDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Search extends SharedDriver {

    WebDriver driver = start();

    HomePage homePage;
    SearchPage searchPage;

    int numberOfResutls;

    public Search() {

        homePage = PageFactory.initElements(driver, com.myUiTest.pages.HomePage.class);
        searchPage = PageFactory.initElements(driver,com.myUiTest.pages.SearchPage.class);
        driver.manage().deleteAllCookies();
    }

    @When("^I search for an item$")
    public void i_search_for_an_item() throws Throwable{
        searchPage.Search("beriberi:");
        Thread.sleep(2000);
        numberOfResutls = searchPage.getResults();
    }

    @Then("^At least one is returned$")
    public void at_least_one_result_is_returned() {
        Assert.assertTrue(numberOfResutls>=1);
    }



}
