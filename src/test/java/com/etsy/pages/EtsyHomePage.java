package com.etsy.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class EtsyHomePage {
    public EtsyHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@data-id='search-query']")
    WebElement searchBar;
    public void searchFor(String item){
        searchBar.sendKeys(item, Keys.ENTER);
    }
    public void validateTitle(String expected,WebDriver driver){
        Assert.assertEquals(expected,driver.getTitle().trim());
    }
}
