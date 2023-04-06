package com.smartbear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearHomePage {
    public SmartBearHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Order')]")
    WebElement orderButton;
    public void clickOrder(){
        orderButton.click();
    }

    @FindBy(linkText = "View all orders")
    WebElement viewAllOrdersButton;
    public void clickViewOrders(){
        viewAllOrdersButton.click();
    }

}
