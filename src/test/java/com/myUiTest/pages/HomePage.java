package com.myUiTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver localDriver){

        this.driver = localDriver;
    }

    //Locators

    @FindBy(id = "username-field") WebElement username;
    @FindBy(id = "password-field") WebElement password;
    @FindBy(xpath = "//button[@type=\"submit\"]") WebElement submit;



    //Methods

    public void goToPage(String url) {
        driver.get(url);
    }

    public void login(String userName, String passWord)throws Throwable{
        username.sendKeys(userName);
        password.sendKeys(passWord);
        Thread.sleep(2000);
        submit.click();
    }
}
