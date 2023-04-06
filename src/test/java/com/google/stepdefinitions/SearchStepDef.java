package com.google.stepdefinitions;

import com.google.pages.GoogleMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.ConfigReader;
import utils.DriverHelper;

import java.time.Duration;

public class SearchStepDef {

    WebDriver driver = DriverHelper.getDriver();
    GoogleMainPage googleMainPage = new GoogleMainPage(driver);
    @Given("User navigates to the Google")
    public void user_navigates_to_the_google() {
        driver.navigate().to(ConfigReader.readProperty("googleUrl"));
    }

    @When("User searches for CodeFish")
    public void user_searches_for_code_fish() {
        googleMainPage.searchFor("CodeFish");
    }

    @Then("User gets more than ten links on the first page")
    public void user_gets_more_than_ten_links_on_the_first_page() {
        Assert.assertTrue(googleMainPage.validateNumberOfLinks(10));
    }
    @When("User searches for Kyrgyz food in USA")
    public void user_searches_for_kyrgyz_food_in_usa() {
        googleMainPage.searchFor("Kyrgyz food in USA");
    }
    @Then("User validates the message of the result amount")
    public void user_validates_the_message_of_the_result_amount() {
        Assert.assertTrue(googleMainPage.validateResultMessage(12100000));
    }

    @When("User searches for Turkish Baklava")
    public void user_searches_for_turkish_baklava() {
        googleMainPage.searchFor("Turkish Baklava");
    }

    @Then("User validates the message of the searchtime")
    public void user_validates_the_message_of_the_searchtime() {
        googleMainPage.validateSearchTime();
        driver.quit();
    }


}
