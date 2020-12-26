package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WishListPage extends BasePage {

    //Locators

    By HPDeadlyHallowsAddedLoc = By.xpath("//a[@class='quickview' and contains(text(), 'Harry Potter and the Deathly Hallows')] ");
    //By HarryPotterAddedLoc = By.xpath("//div[@class='name']/following::a[contains(text(), 'Harry Potter and the Deathly Hallows')]");
    //By TestItemListLoc = By.xpath("//div[@class='product-list-item']");


    //Methods


    public boolean IsTheBookAdded() {

     WebElement ItemAddedElem = findElementUsingFluentWait(HPDeadlyHallowsAddedLoc);

        return ItemAddedElem.isDisplayed();



    }








}
