package com.myUiTest.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver localDriver){

        this.driver = localDriver;
    }

    //Locators

    @FindBy(xpath = "//input[@type=\"text\"]") WebElement searchBox;
    @FindBy(xpath = "//*[@data-icon=\"search\"]") WebElement submit;
    @FindBy(xpath = "//*[@class=\"result-list\"]") WebElement results;


    //Methods

    public void Search(String searchTerm){
        searchBox.sendKeys(searchTerm);
        submit.click();
    }

    public int getResults(){

        String resultsText = results.getText();
        List<String> textList = new ArrayList<String>(Arrays.asList(resultsText.split("Show tree paths")));
        return textList.size();
    }

}
