package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TeacherOrderPage extends BasePage {


    //Locators

    By ClickQtyBoxItemLoc = By.xpath("//input[@data-itemid='3S4']");
    By JumperMessageLoc = By.xpath("//div[@class='info-modal-content' and contains(text(), 'All student paper flyer orders MUST be entered in the')] ");
    By ClickCloseJumperMessageLoc = By.xpath("//i[@class='fa fa-times info-modal-close']");
    By ClickAnthrQtyBoxItemLoc = By.xpath("//input[@data-itemid='5S4']");


    //Methods


    public void ScrollDown () {

        sleep();
        JavascriptExecutor js =(JavascriptExecutor) Web.getDriver();

        js.executeScript("scrollBy(0,350);");
        sleep();


    }

    public void ClickQtyBox () {

        clickThis(ClickQtyBoxItemLoc);


    }


    public boolean IsJumperMessageDisplayed () {

        WebElement JumperMessageElem = findElementUsingFluentWait(JumperMessageLoc);

        return JumperMessageElem.isDisplayed();


    }


    public void closeJumperMessage () {

        clickThis(ClickCloseJumperMessageLoc);

    }


    public void ClickAnotherQtyBox () {

        clickThis(ClickAnthrQtyBoxItemLoc);

    }












}
