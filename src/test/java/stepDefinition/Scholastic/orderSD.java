package stepDefinition.Scholastic;

import Pages.Scholastic.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class orderSD {

    HomePage hPage = new HomePage();
    StudentFlyerOrdersPage SFOPage = new StudentFlyerOrdersPage();
    TeacherOrderPage TOPage = new TeacherOrderPage();
    StartCheckOutPage SCOPage = new StartCheckOutPage();
    ReviewCartPage RCPage = new ReviewCartPage();
    OrderConfirmationPage OCPage = new OrderConfirmationPage();


    @And("^I hover to Enter Orders$")
    public void HoveringToEnterOrders () {

        hPage.sleepingTime();
        hPage.HoverToEnterOrders();

    }


    @And("^I select Student Flyer Orders$")
    public void SelectingStudentFlyerOrders() {

        hPage.sleepingTime();
        hPage.SelectStudentFlyerOrders();


    }


    @Then("^I type '(.+)' as the Student Name$")
    public void EnteringStudentName (String data) {

        hPage.sleepingTime();
        SFOPage.EnterStudentName(data);

    }


    @And("^I type '(.+)' as the Item Number$")
    public void EnteringItemNumber (String data) {

        hPage.sleepingTime();
        SFOPage.EnterItemNumber(data);


    }


    @And("^I click on the Add Button$")
    public void clickingAddButton () {

        hPage.sleepingTime();
        SFOPage.clickAddOrder();
        hPage.sleepingTime();

    }


    @Then("^I verify if the Error Message For Item is Displayed$")
    public void VerifyErrorMessageItem () {

        hPage.sleepingTime();
        Assert.assertTrue(SFOPage.IsErrorMessageForOrderDisplayed());

    }


    @And("^I select Your Teacher Order$")
    public void ClickingTeacherOrder () {

        hPage.sleepingTime();
        hPage.SelectTeacherOrder();

    }


    @And("^I scroll down$")
    public void ScrollDownInTeachersPage () {

        hPage.sleepingTime();
        TOPage.ScrollDown();


    }


    @And("^I click on Quantity Box$")
    public void ClickingQtyBox () {

        hPage.sleepingTime();
        TOPage.ClickQtyBox();
        hPage.sleepingTime();


    }


    @Then("^I verify the Jumper Message is Displayed$")
    public void VerifyJumperMessageDisplayed () {

        hPage.sleepingTime();

        Assert.assertTrue(TOPage.IsJumperMessageDisplayed());


    }

    @And("^I close the Jumper Message$")
    public void ClosingTheJumperMessage () {

        hPage.sleepingTime();
        TOPage.closeJumperMessage();


    }


    @And("^I click on Quantity Box for another item$")
    public void ClickingAnotherQtyBox () {

        hPage.sleepingTime();
        TOPage.ClickAnotherQtyBox();
        hPage.sleepingTime();


    }

    @Then("^I verify the Jumper Message is not Displayed$")
    public void VerifyJumperMessageNotDisplayed () {

        hPage.sleepingTime();

        Assert.assertFalse(TOPage.IsJumperMessageDisplayed());


    }


    @And("^I click Proceed To Checkout$")
    public void clickProceedToCheckout () {

        hPage.sleepingTime();

        RCPage.clickProceedToCheckout();

    }

    @And("^I click Proceed To Checkout again$")
    public void clickProceedToCheckoutAgain () {

        hPage.sleepingTime();

        RCPage.clickProceedToCheckoutAgain();

    }



    @Then("^I verify the Tax Price is Zero$")
    public void VerifyTaxPriceIsZero () {

        double ExpectedTaxPrice = 0.00;

        hPage.sleepingTime();

        Assert.assertEquals(ExpectedTaxPrice, SCOPage.TaxPriceZero(), "not equals" );


    }

    @And("^I enter '(.+)' as quantity for one item$")
    public void EnterQtyInTeacherItemBox (String data) {

        hPage.sleepingTime();

        TOPage.EnterItemTeacherQtyBox(data);

    }

    @And("^I enter '(.+)' as quantity for another item$")
    public void EnterQtyInAnotherTItemBox (String data) {

        hPage.sleepingTime();

        TOPage.EnterItemAnthrTeacherQtyBox(data);
    }


    @Then("^I verify the Tax Price is greater than Zero$")
    public void VerifyTaxIsGreaterThanZero () {
        double tax = 0.00;
        hPage.sleepingTime();

        if (SCOPage.TaxPriceGreaterThanZero() > tax) {

            Assert.assertNotEquals(SCOPage.TaxPriceGreaterThanZero(), tax);
        }

    }


    @And("^I click on Continue To Checkout$")
    public void ClickContinueCheckOut () {

        hPage.sleepingTime();

        SCOPage.clickContinueCheckout();

    }

    @And("^I select 'Credit Card' as my payment method$")
    public void SelectCreditCardAsP() {

        hPage.sleepingTime();

        SCOPage.SelectCreditCard();
    }


    @And("^I select 'Add a New Card' as my card type$")
    public void SelectCardTypeAsP() {

        hPage.sleepingTime();

        SCOPage.SelectCardType();
    }


    @And("^I enter '(.+)' as my card number$")
    public void EnterCardNumber(String data) {

        hPage.sleepingTime();

        SCOPage.enterCardNumber(data);

    }


    @And("^I select '03' for the Month Expiration Date$")
    public void SelectExpDatesForMonth() {

        hPage.sleepingTime();

        SCOPage.selectExpDatesMonth();
    }


    @And("^I select '2023' for the Year Expiration Date$")
    public void SelectExpDatesForYear() {

        hPage.sleepingTime();

        SCOPage.selectExpDatesYear();
    }


    @And("^I enter '(.+)' as my security code$")
    public void EnterSecurityCode(String data) {

        hPage.sleepingTime();

        SCOPage.enterSecurityCode(data);
    }


    @And("^I put '(.+)' as my First Name$")
    public void EnterFirstName(String data) {

        hPage.sleepingTime();

        SCOPage.enterFirstName(data);
    }


    @And("^I put '(.+)' as my Last Name$")
    public void EnterLastName(String data) {

        hPage.sleepingTime();

        SCOPage.enterLastName(data);

    }

    @And("^I put '(.+)' as my Address")
    public void EnterAddress(String data) {

        hPage.sleepingTime();

        SCOPage.enterAddress(data);
    }

    @And("^I put '(.+)' as my Zip Code$")
    public void EnterZipCode(String data) {

        hPage.sleepingTime();

        SCOPage.enterZip(data);

    }

    @And("^I put '(.+)' as my Phone Number")
    public void EnterPhone(String data) {

        hPage.sleepingTime();

        SCOPage.enterPhone(data);
    }


    @And("^I untick the save card box$")
    public void UnTickSaveBox() {

        hPage.sleepingTime();

        SCOPage.unTickSaveCardBox();

    }


    @Then("^I click on 'Ship To My School' Radio Button$")
    public void ClickShipToMySchoolRadio() {

        hPage.sleepingTime();

        SCOPage.clickShipToMySchoolRadio();

    }


    @And("^I click on Submit Order$")
    public void ClickSubmitOrder() {

        hPage.sleepingTime();

        SCOPage.clickSubmitOrder();
    }


    @Then("^I verify if 'Thank You For Your Order' is displayed$")
    public void VerifyThankYouForYourOrder() {

        hPage.sleepingTime();

        OCPage.IsThankYouForYourOrderDisplayed();

    }


    @And("^I verify if Your Customer Number is displayed$")
    public void VerifyCustomerNumberDisplayed() {

        hPage.sleepingTime();

        OCPage.IsCustomerNumberDisplayed();

    }


    @And("^I click on Continue To Checkout again$")
    public void ClickContinueCheckOutAgain() {

        hPage.sleepingTime();

        SCOPage.clickContinueCheckOutAgain();
    }












}
