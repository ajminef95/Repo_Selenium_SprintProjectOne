package stepDefinition.Scholastic;

import Pages.Scholastic.AfterSearchBookPage;
import Pages.Scholastic.HomePage;
import Pages.Scholastic.WishListPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class bookSD {

    HomePage hPage = new HomePage();
    AfterSearchBookPage ASBPage = new AfterSearchBookPage();
    WishListPage WLPage = new WishListPage();

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





}
