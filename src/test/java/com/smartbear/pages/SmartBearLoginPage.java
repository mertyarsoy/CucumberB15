package com.smartbear.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {
    public SmartBearLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "#ctl00_MainContent_username")
    WebElement username;
    @FindBy (css = "#ctl00_MainContent_password")
    WebElement password;
    public void Login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password, Keys.ENTER);
    }
}
