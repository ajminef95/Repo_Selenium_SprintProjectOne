package stepDefinition.Scholastic;

import Pages.Scholastic.AfterCreatingAccPage;
import Pages.Scholastic.HomePage;
import Pages.Scholastic.MyReadingClubAccPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class CreditCardSD {

    HomePage hPage = new HomePage();
    AfterCreatingAccPage ACAPage = new AfterCreatingAccPage();
    MyReadingClubAccPage MRCAPage = new MyReadingClubAccPage();


    @And("^I click on My Account and Profile$")
    public void clickOnAccountAndProfile () {

        hPage.sleepingTime();
        ACAPage.clickMyAccountAndProfile();


    }

    @Then("^I add a credit card$")
    public void AddACreditCard () {

        MRCAPage.AddACreditCard();
        hPage.sleepingTime();


    }

    @And("^I scroll down to fill out all the information$")
    public void ScrollingDown () {

        hPage.sleepingTime();
        MRCAPage.ScrollDownAfterAddingCreditCard();
        hPage.sleepingTime();

    }

    @And("^I enter '(.+)' as the Card Number$")
    public void EnterCardNumber (String data) {

        hPage.sleepingTime();
        MRCAPage.EnterCreditCardNo(data);

    }

    @And("^I select '03' as the Month Expiration Date$")
    public void SelectMonth () {

        hPage.sleepingTime();
        MRCAPage.SelectMonthCC();

    }

    @And("^I select '2022' as the Year Expiration")
    public void SelectYear () {

        hPage.sleepingTime();
        MRCAPage.SelectYearLoc();


    }

    @And("^I enter '(.+)' as the Security Code$")
    public void EnterSecurityCode (String data) {

        hPage.sleepingTime();
        MRCAPage.EnterSecurityCode(data);


    }

    @And("^I enter '(.+)' as my First Name$")
    public void EnterFirstName (String data) {

        hPage.sleepingTime();
        MRCAPage.EnterFirstNameInCC(data);

    }

    @And("^I enter '(.+)' as my Last Name$")
    public void EnterLastName (String data) {

        hPage.sleepingTime();
        MRCAPage.EnterLastNameInCC(data);
    }

    @And("^I enter '(.+)' as my Address$")
    public void EnterAddress (String data) {

        hPage.sleepingTime();
        MRCAPage.EnterAddressInCC(data);

    }

    @And("^I enter '(.+)' as my Zip Code$")
    public void EnterZipCode (String data) {

        hPage.sleepingTime();
        MRCAPage.EnterZipInCC(data);

    }

    @And("^I enter '(.+) as my Phone Number$")
    public void EnterPhoneNumber (String data) {

        hPage.sleepingTime();
        MRCAPage.EnterPhoneInCC(data);

    }

    @And("^I click on save to add the card$")
    public void SaveToAddTheCard () {

        hPage.sleepingTime();
        MRCAPage.ClickCCSave();

    }


    @Then("^I verify if the Error Message is Displayed by trying to add a new card$")
    public void VerifyErrorMessageDisplayed () {

        hPage.sleepingTime();
        MRCAPage.clickAddCardAfterAdded();
        hPage.sleepingTime();
        Assert.assertTrue(MRCAPage.IsErrorMessageDisplayed());

    }




















}
