package com.weborder.pages;

import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.lang.invoke.CallSite;

public class WebOrderFoodOrderPage {
    public WebOrderFoodOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//label[@class='custom-control-label']")
    WebElement groupOrder;
    @FindBy (xpath = "//button[@id='getAddressNextButton']")
    WebElement next;
    public void clickGroupOrderandNextButton(){
        groupOrder.click();
        next.click();
    }

    @FindBy (css = "#InviteNote")
    WebElement InviteNote;
    public void sendMessagetoInviteNote(String message){
        InviteNote.sendKeys(message);
    }
    @FindBy (css = "#InviteList")
    WebElement InviteList;
    public void sendMessagetoInviteList(String email,String email2){
        InviteList.sendKeys(email,email2);
    }

    @FindBy (xpath = "//select[@id='ConfirmAddressID']")
    WebElement myLocation;
    @FindBy(xpath = "//div[@id='addressPreview']")
    WebElement address;
    public void chooseAddressAndValidate(String location,String expected){
        BrowserUtils.selectBy(myLocation,location,"text");
        Assert.assertTrue(BrowserUtils.getTextandTrim(this.address).contains(expected));
    }
    @FindBy (xpath = "//button[@id='createGroupOrder']")
    WebElement createGroupOrder;
    public void clickGroupOrder(){
        createGroupOrder.click();
    }

    @FindBy (tagName = "h1")
    WebElement header;
    public String validateHeader() throws InterruptedException {
        Thread.sleep(500);
        return BrowserUtils.getTextandTrim(header);
    }
    @FindBy (xpath = "//p[contains(text(),'Your group order')]")
    WebElement description;
    public boolean validateDescription(String description){
        return BrowserUtils.getTextandTrim(this.description).contains(description);
    }


}
