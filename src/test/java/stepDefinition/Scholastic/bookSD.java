package stepDefinition.Scholastic;

import DriverWrapper.Web;
import Pages.Scholastic.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class bookSD {

    HomePage hPage = new HomePage();
    AfterSearchBookPage ASBPage = new AfterSearchBookPage();
    WishListPage WLPage = new WishListPage();
    StudentFlyerOrdersPage SFOPage = new StudentFlyerOrdersPage();
    ReviewCartPage RCPage = new ReviewCartPage();

    @And("^I click on sign in$")
    public void ClickingSignIn () {

        hPage.sleepingTime();
        hPage.clickSignInOnHomePage();


    }

     @Then("^I put my '(.+)' as my email$")
     public void EnterEmailSignIn (String data) {

        hPage.sleepingTime();
        hPage.EnteringEmailInSignIn(data);

     }

     @And("^I put '(.+)' as my password$")
     public void EnterPassSignIn (String data) {

        hPage.sleepingTime();
        hPage.EnteringPassInSignIn(data);
     }

     @And("^I click the sign in button with my credentials$")
     public void ClickingSignInAfterCreds () {

        hPage.sleepingTime();
        hPage.clickSignInAfterCreds();

     }


     @And("^I type in '(.+)' on search and click the search button$")
     public void SearchingBook (String data) {

        hPage.sleepingTime();
        hPage.SearchBook(data);

     }


     @Then("^I choose the Book and click on Quick Look$")
     public void ChoosingBookAndClickQuickLook () {

        hPage.sleepingTime();
        ASBPage.clickQuickLook();

     }

     @And("^I add the book using the Recommended Star and close all$")
     public void AddTheBook () {

        hPage.sleepingTime();
        ASBPage.AddingTheBook();

     }

     @Then("^I click on My Lists and then Recommendations$")
     public void ClickingOnMyListsAndRec () {

        hPage.sleepingTime();
        ASBPage.ClickMyListsAndRecs();


     }

     @And("I verify if the book is added in the wishlist")
     public void VerifyTheBookIsAdded () {

        hPage.sleepingTime();
        Assert.assertTrue(WLPage.IsTheBookAdded());

     }


     @Then("^I verify the correct student name 'Harry' was added$")
     public void VerifyStudentNameHarryAfterAdd () {

        hPage.sleepingTime();
        Assert.assertEquals(SFOPage.StudentNameAfterAdd(), "Harry", "not equals");


    }


    @And("^I verify the correct item numbers for Harry was added$")
    public void VerifyItemNumberHarryAfterAdd () {

        hPage.sleepingTime();
        Assert.assertEquals(SFOPage.ItemNumberOneAfterAdd(), "35J3", "not equals");
        Assert.assertEquals(SFOPage.ItemNumberTwoAfterAdd(), "16B3", "not equals");



    }


    @Then("^I add quantity for items$")
    public void EnterItemQtyNumbers () {

        hPage.sleepingTime();
        SFOPage.EnterItemQtyOne("2");
        hPage.sleepingTime();
        SFOPage.EnterItemQtyTwo("3");


    }


    @And("^I click on Review Cart$")
    public void clickingReviewCart () {

        hPage.sleepingTime();
        SFOPage.clickReviewCart();

    }



    @Then("^I verify the quantity is the same as chosen for Harry$")
    public void VerifyItemsQty () {

        hPage.sleepingTime();


        Assert.assertEquals(RCPage.ItemOneQtyVerify(), "3", "not equal");
        Assert.assertEquals(RCPage.ItemTwoQtyVerify(), "2", "not equals");

    }


    @And("^I verify the price total for Harry$")
    public void VerifyPriceTotalHarry () {

        hPage.sleepingTime();

        Assert.assertEquals(RCPage.TotalPricePresentHarry(), RCPage.TotalPriceCalculatedHarry(), "not equal");

    }


    @And("^I verify the SFO price is the same price total$")
    public void VerifySFOPriceTotalHarry () {

        hPage.sleepingTime();

        Assert.assertEquals(RCPage.TotalPricePresentHarry(), RCPage.SFOTotalPrice(), "not equal");




    }

    @And("^I verify the correct student name 'John' was added$")
    public void VerifyStudentNameJohnAfterAdd () {

        hPage.sleepingTime();

        Assert.assertEquals(SFOPage.StudentNameJohnAfterAdd(), "John", "not equals");



    }


    @And("^I verify the correct student name 'Michael' was added$")
    public void VerifyStudentMichaelAfterAdd () {

        hPage.sleepingTime();

        Assert.assertEquals(SFOPage.StudentNameMichaelAfterAdd(), "Michael", "not equals");


    }


    @And("^I verify the correct item numbers for John was added$")
    public void VerifyItemNumberJohnAfterAdd () {

        hPage.sleepingTime();

        Assert.assertEquals(SFOPage.ItemNumberThreeAfterAdd(), "35S3", "not equals");


    }


    @And("^I verify the correct item numbers for Michael was added$")
    public void VerifyItemNumberMichaelAfterAdd () {

        hPage.sleepingTime();

        Assert.assertEquals(SFOPage.ItemNumberFourAfterAdd(), "35N3", "not equals");



    }


    @And("^I add quantity for items of John$")
    public void EnterQtyNumbersJohn () {

        hPage.sleepingTime();
        SFOPage.EnterItemQtyFour("2");

    }

    @And("^I add quantity for items of Michael$")
    public void EnterQtyNumbersMichael () {

        hPage.sleepingTime();
        SFOPage.EnterItemQtyThree("4");

    }


    @And("^I add quantity for items of Harry$")
    public void EnterQtyNumbersHarry () {

        hPage.sleepingTime();
        SFOPage.EnterItemQtyOneExHarry("2");
        SFOPage.EnterItemQtyTwoExHarry("3");

    }


    @Then("^I verify the quantity is the same as chosen for John$")
    public void VerifyItemQtyJohn () {

        hPage.sleepingTime();

        Assert.assertEquals(RCPage.ItemOneJohnVerify(), "2", "not equals");

    }

    @Then("^I verify the quantity is the same as chosen for Michael$")
    public void VerifyItemQtyMichael () {

        hPage.sleepingTime();

        Assert.assertEquals(RCPage.ItemOneMichaelVerify(), "4", "not equals");

    }


    @And("^I verify the price total for John$")
    public void VerifyJohnPriceTotal () {

        hPage.sleepingTime();

        Assert.assertEquals(RCPage.TotalPricePresentJohn(), RCPage.TotalPriceCalcJohn(), "not equals");
    }


    @And("^I verify the price total for Michael$")
    public void VerifyMichaelPriceTotal () {

        hPage.sleepingTime();

        Assert.assertEquals(RCPage.TotalPricePresentMichael(), RCPage.TotalPriceMichaelCalc(), "not equals");
    }

    @Then("^I verify the SFO price total is the same as their total combined$")
    public void VerifySFOPriceToTotalSumPrice () {

        hPage.sleepingTime();

        Assert.assertEquals(RCPage.TotalPriceCombined(), RCPage.SFOTotalPrice(), "not equals");

    }


    @Then("^I delete item 16B3 of Harry$")
    public void DeleteItem16B3 () {

         hPage.sleepingTime();

         RCPage.clickDeleteItem16B3();





    }


    @And("^I verify the item change for Harry$")
    public void VerifyHarryItemAfterDelete () {
        int ItemsBeforeDelete = 4;
        hPage.sleepingTime();

        Assert.assertNotEquals(RCPage.Item16B3Deleted(), ItemsBeforeDelete);
    }


    @And("^I verify that there was a price change total for Harry$")
    public void VerifyHarryPriceChange() {

        double PriceBeforeChange = 35.00;
        hPage.sleepingTime();

        Assert.assertNotEquals(RCPage.HarryTotalPriceAfterDelete(), PriceBeforeChange);

    }


    @And("^I verify the price change total for all$")
    public void VerifyPriceChangeForAll() {

        double PreviousTotal = 73.00;
        hPage.sleepingTime();

        Assert.assertNotEquals(RCPage.TotalPriceCombined(), PreviousTotal);

    }

    @And("^I verify the total item changes$")
    public void VerifyItemChangeForAll() {

       String PreviousTotalItems = "9";
       hPage.sleepingTime();

       Assert.assertNotEquals(RCPage.TotalItemsCombForAll(), PreviousTotalItems);


    }











}
