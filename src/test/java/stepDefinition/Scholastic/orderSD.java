package stepDefinition.Scholastic;

import Pages.Scholastic.HomePage;
import Pages.Scholastic.StudentFlyerOrdersPage;
import Pages.Scholastic.TeacherOrderPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class orderSD {

    HomePage hPage = new HomePage();
    StudentFlyerOrdersPage SFOPage = new StudentFlyerOrdersPage();
    TeacherOrderPage TOPage = new TeacherOrderPage();


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











}
