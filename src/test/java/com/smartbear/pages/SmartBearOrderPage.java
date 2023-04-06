package com.smartbear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class SmartBearOrderPage {
    public SmartBearOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    WebElement selection;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    WebElement quantity;
    public void provideProductInfo(String product, String quantity){
        BrowserUtils.selectBy(selection, product, "text");
        this.quantity.sendKeys(quantity);
    }

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
    WebElement name;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
    WebElement street;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox3")
    WebElement city;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
    WebElement state;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zip;
    public void provideGeneralInfo(String name, String street, String city, String state, String zip) {
        this.name.sendKeys(name);
        this.street.sendKeys(street);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.zip.sendKeys(zip);
    }

    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_0")
    WebElement visa;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_1")
    WebElement masterCard;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_2")
    WebElement americanExpress;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    WebElement cardNumber;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expireDate;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_InsertButton")
    WebElement processButton;
    public void providePaymentInfo(String card,String cardNumber,String expDate){
        card = card.toUpperCase();
            switch (card) {
                case "VISA":
                    visa.click();
                    break;
                case "MASTERCARD":
                    masterCard.click();
                    break;
                case "AMERICAN EXPRESS":
                    americanExpress.click();
                    break;
                default:
                    System.out.println("INVALID CARD");

        }
        this.cardNumber.sendKeys(cardNumber);
        this.expireDate.sendKeys(expDate);
        processButton.click();
    }

    @FindBy (tagName = "strong")
    WebElement message;
    public boolean validateMessage(String message){
       return BrowserUtils.getTextandTrim(this.message).contains(message);
    }

}
