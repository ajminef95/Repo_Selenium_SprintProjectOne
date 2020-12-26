package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AfterSearchBookPage extends BasePage {

    //Locators


    By HoverToHarryPotterBook = By.xpath("//img[@title='Harry Potter and the Deathly Hallows']");
    By ClickQuickLookLoc = By.xpath("//a[@href='/harry-potter-and-the-deathly-hallows/9781338299205-rco-us.html?cgid=6_1' and contains(text(), 'QUICK LOOK')]");
    By ClickRecStarLoc = By.xpath("//span[@class='icon-button-text' and contains(text(), 'Rec')]");
    By ClickRecToStudentsLoc = By.xpath("//input[@class='wishlist-dialog-checkbox recommended']");
    By ClickCloseAddToMyListLoc = By.xpath("//span[@class='tooltipster-close ']");
    By ClickCloseTheHarryWindowLoc = By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']");
    By ClickMyListLoc = By.xpath("//li[@class='mylists toggle-menu']");
    By ClickMyRecsLoc = By.xpath("//li[@class='recommend']");
    By HarryPotterBooksLoc = By.xpath("//a[@class='name-link']");




    //Methods


    public void clickQuickLook () {
        String book = "Harry Potter and the Deathly Hallows";

        Actions act = new Actions(Web.getDriver());
        List<WebElement> AllHarryPotterBooks = Web.getDriver().findElements(HarryPotterBooksLoc);
        for (WebElement books : AllHarryPotterBooks) {
            if (books.getText().equalsIgnoreCase(book)) {

                WebElement HarryPotterBookElem = findElementUsingFluentWait(HoverToHarryPotterBook);

                act.moveToElement(HarryPotterBookElem).build().perform();
                clickThis(ClickQuickLookLoc);

            }

        }



    }


    public void AddingTheBook () {

        clickThis(ClickRecStarLoc);
        sleep();
        clickThis(ClickRecToStudentsLoc);
        clickThis(ClickCloseAddToMyListLoc);
        clickThis(ClickCloseTheHarryWindowLoc);


    }

      public void ClickMyListsAndRecs () {

        clickThis(ClickMyListLoc);
        clickThis(ClickMyRecsLoc);



      }


}
