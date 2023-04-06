package com.etsy.stepdefinitions;

import com.etsy.pages.EtsyHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class EtsySearchStepDef {
    WebDriver driver = DriverHelper.getDriver();
    EtsyHomePage etsyHomePage = new EtsyHomePage(driver);
    @When("User searches for {string} on Etsy WebPage")
    public void user_searches_for_on_etsy_web_page(String item) {
        etsyHomePage.searchFor(item);
    }
    @Then("User validates the title {string} from Etsy WebPage")
    public void user_validates_the_title_from_etsy_web_page(String expected) {
        etsyHomePage.validateTitle(expected,driver);
    }
}
