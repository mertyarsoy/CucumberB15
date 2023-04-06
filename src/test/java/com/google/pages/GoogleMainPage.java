package com.google.pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.security.Key;
import java.util.List;

public class GoogleMainPage {
    public GoogleMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//*[@title='Search']")
    WebElement searchBar;
    public void searchFor(String search){
        searchBar.sendKeys(search, Keys.ENTER);
    }
    @FindBy (xpath = "//a//h3")
    List<WebElement> allLinks;
    public boolean validateNumberOfLinks(int num){
        return (allLinks.size() > num);
    }

    @FindBy (xpath = "//div[@id='result-stats']")
    WebElement result;
    public boolean validateResultMessage(double num){
        String[] result = BrowserUtils.getTextandTrim(this.result).split(" ");
       return Double.parseDouble(result[1].replace(",","")) > num;
    }

    @FindBy (tagName = "nobr")
    WebElement searchTime;
    public boolean validateSearchTime(){
        String[] searchTime = BrowserUtils.getTextandTrim(this.searchTime).split(" ");
        return Double.parseDouble(searchTime[0].replace("(","").replace(")","")) < 1;
    }



}
