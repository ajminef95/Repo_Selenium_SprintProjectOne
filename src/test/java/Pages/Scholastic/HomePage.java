package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {


    //Locators

    By createAnAccLoc = By.xpath("//div[@id='navLinksOnly']/preceding::a[@class='create-account-trigger']");
    By ClickHomePageSignInLoc = By.xpath("//a[@class='signin pureguest dialog-close disable-autoplay']");
    By SignInEmailSendKeysLoc = By.id("dwfrm_login_username");
    By SignInPasswordSendKeysLoc = By.id("dwfrm_login_password");
    By ClickSignInAfterCredsLoc = By.id("loginModalBtn");
    By SearchBookSendKeysLoc = By.id("q");
    By ClickSearchButtonToFindBooksLoc = By.xpath("//i[@class='fa fa-search']");
    By TipsterLoc = By.xpath("//div[@class='tooltipster-title']/following::span[contains(text(), 'undefined')]/following::span[@class='tooltipster-close ']");


    By HoverToEnterOrdersLoc = By.xpath("//li[@class='topcategory']/following::a[@id='enter-orders']");
    By ClickStudentFlyerOrdersLoc = By.xpath("//li[@id='student-flyer-orders']/following::a[contains(text(), 'Student Flyer Orders')]");
    By ClickTeacherOrderLoc = By.xpath("//li[@id='your-teacher-order']/following::a[@href='https://clubs3qa1.scholastic.com/ytoflyerentry']");







    // Methods


    public void clickCreateAnAcc () {
        clickThis(createAnAccLoc);


    }


    public void EnteringEmailInSignIn (String data) {

        type(SignInEmailSendKeysLoc, data);


    }

    public void clickSignInOnHomePage () {

        clickThis(ClickHomePageSignInLoc);



    }


    public void EnteringPassInSignIn (String data) {

        type(SignInPasswordSendKeysLoc, data);


    }

    public void clickSignInAfterCreds () {

        clickThis(ClickSignInAfterCredsLoc);



    }



    public void SearchBook (String data) {
        clickThis(TipsterLoc);
        clickThis(SearchBookSendKeysLoc);
        type(SearchBookSendKeysLoc, data);
        sleepingTime();
        clickThis(ClickSearchButtonToFindBooksLoc);


    }


    public void sleepingTime () {
        sleep();

    }


    public void HoverToEnterOrders() {

        WebElement EnterOrdersElem = findElementUsingFluentWait(HoverToEnterOrdersLoc);

        Actions act = new Actions(Web.getDriver());

        act.moveToElement(EnterOrdersElem).build().perform();

    }

    public void SelectStudentFlyerOrders () {

        clickThis(ClickStudentFlyerOrdersLoc);

    }


    public void SelectTeacherOrder () {

        sleepingTime();
        clickThis(ClickTeacherOrderLoc);

    }





}
