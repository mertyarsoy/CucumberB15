package com.smartbear.stepdefinitions;

import com.smartbear.pages.SmartBearHomePage;
import com.smartbear.pages.SmartBearLoginPage;
import com.smartbear.pages.SmartBearOrderPage;
import com.smartbear.pages.SmartBearViewOrdersPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SmartBearStepDef {
    WebDriver driver = DriverHelper.getDriver();
    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage(driver);
    SmartBearHomePage smartBearHomePage = new SmartBearHomePage(driver);
    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage(driver);
    SmartBearViewOrdersPage smartBearViewOrdersPage = new SmartBearViewOrdersPage(driver);

    @Given("User provides username and password")
    public void user_provides_username_and_password() {
        smartBearLoginPage.Login(ConfigReader.readProperty("username"),ConfigReader.readProperty("password"));
    }
    @Then("User provides product information {string} and {string}")
    public void user_provides_product_information_and(String product, String quantity) throws InterruptedException {
        smartBearHomePage.clickOrder();
        smartBearOrderPage.provideProductInfo(product,quantity);
    }
    @Then("User provides general information {string}, {string}, {string}, {string} and {string}")
    public void user_provides_general_information_and(String name, String street, String city, String state, String zip) {
        smartBearOrderPage.provideGeneralInfo(name,street,city,state,zip);
    }
    @Then("User provides payment information {string}, {string} and {string}")
    public void user_provides_payment_information_and(String card, String cardNumber, String expDate) throws InterruptedException{
        smartBearOrderPage.providePaymentInfo(card,cardNumber,expDate);
    }
    @Then("User validates the message {string}")
    public void user_validates_the_message(String message) {
        smartBearOrderPage.validateMessage(message);
    }
    @Then("User validates {string}, {string}, {string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_validates(String name, String product, String quantity, String street,
                               String city, String state, String zip, String card, String cardNumber, String expDate) {
        smartBearHomePage.clickViewOrders();
        smartBearViewOrdersPage.validateAllInfoFromTable(name,product,quantity,street,city,state,zip,card,cardNumber,expDate);
    }

    @When("User provides product information")
    public void user_provides_product_information(DataTable dataTable) throws InterruptedException {
        smartBearHomePage.clickOrder();
        Map<String,String> productInfo = dataTable.asMap();
//        System.out.println(productInfo); // {product=MyMoney, quantity=5}
        smartBearOrderPage.provideProductInfo(productInfo.get("product"),productInfo.get("quantity"));
    }
    @When("User provides general information")
    public void user_provides_general_information(DataTable dataTable) {
        Map<String,String> generalInfo = dataTable.asMap();
        System.out.println(generalInfo); // {name=Mert, street=201 Se, city=Miami, state=FL, zip=33131}
        smartBearOrderPage.provideGeneralInfo(generalInfo.get("name"),generalInfo.get("street"),generalInfo.get("city"),
                generalInfo.get("state"),generalInfo.get("zip"));
    }
    @When("User provides payment information")
    public void user_provides_payment_information(DataTable dataTable){
        Map<String,String> paymentInfo = dataTable.asMap();
//        System.out.println(paymentInfo); // {card=Visa, cardNumber=21333112, expDate=05/23}
        smartBearOrderPage.providePaymentInfo(paymentInfo.get("card"),paymentInfo.get("cardNumber"),paymentInfo.get("expDate"));
    }
    @Then("User validates the message")
    public void user_validates_the_message(DataTable dataTable) {
        List<String> list = dataTable.asList();
        smartBearOrderPage.validateMessage(list.get(0));
    }

}
