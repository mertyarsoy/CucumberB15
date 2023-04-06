package com.weborder.stepdefinitions;

import com.weborder.pages.WebOrderFoodOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class WebOrderFoodOrderStepDef {

    WebDriver driver = DriverHelper.getDriver();
    WebOrderFoodOrderPage webOrderFoodOrderPage = new WebOrderFoodOrderPage(driver);

    @When("User clicks Group Order Box and Next Button")
    public void user_clicks_group_order_box_and_next_button() {
        webOrderFoodOrderPage.clickGroupOrderandNextButton();
    }
    @When("User sends the word {string} for note to the Invitees Section")
    public void user_sends_the_word_for_note_to_the_invitees_section(String message) {
        webOrderFoodOrderPage.sendMessagetoInviteNote(message);

    }
    @When("User sends e-mail address which are {string} and {string} to the Invite List")
    public void user_sends_e_mail_address_which_are_and_to_the_invite_list(String email, String email2) {
        webOrderFoodOrderPage.sendMessagetoInviteList(email,email2);
    }
    @When("User chooses the delivery address {string} and validates the address {string}")
    public void user_chooses_the_delivery_address_and_validates_the_address(String location,String expected) throws InterruptedException {
        webOrderFoodOrderPage.chooseAddressAndValidate(location,expected);
    }
    @When("User clicks the create Group Order Button")
    public void user_clicks_the_create_group_order_button() {
        webOrderFoodOrderPage.clickGroupOrder();
    }
    @Then("User validates the header of the page {string}")
    public void user_validates_the_header_of_the_page(String expectedHeader) throws InterruptedException {
        Assert.assertEquals(expectedHeader,webOrderFoodOrderPage.validateHeader());
    }
    @Then("User validates the sentence {string} from description")
    public void user_validates_the_sentence_from_description(String description) {
        Assert.assertTrue(webOrderFoodOrderPage.validateDescription(description));
    }
}
