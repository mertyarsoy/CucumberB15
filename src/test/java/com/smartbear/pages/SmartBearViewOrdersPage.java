package com.smartbear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class SmartBearViewOrdersPage {
    public SmartBearViewOrdersPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//tr[2]//td")
    List<WebElement> allInfo;
    public void validateAllInfoFromTable(String name,String product,String quantity,String street,
                                         String city,String state,String zip,String card,String cardNumber,String expDate){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String currentTime = dtf.format(now);
        List<String> expectedList = Arrays.asList("",name,product,quantity,currentTime,street,
                city,state,zip,card,cardNumber,expDate,"");

        for (int i = 1; i < allInfo.size()-1; i++) {
            Assert.assertEquals(expectedList.get(i), BrowserUtils.getTextandTrim(allInfo.get(i)));
        }
    }
}
