package Pages.Hotels;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class LandingPage extends BasePage {

    //Locators

    By searchBox = By.id("qf-0q-destination");
    By LakeGeorgeLoc = By.xpath("//div[@class='autosuggest-category-result' and contains (text(), 'Lake George')]");
    By Search = By.xpath("//button[@type='submit']");
    By AutoSuggestionsLoc = By.xpath("//div[@class='autosuggest-category-result']");
    By closeOverlayLoc = By.xpath("//button[@class='cta widget-overlay-close']");
    By ChildrenSelectLoc = By.id("qf-0q-room-0-children");
    By ChildAgeLoc = By.id("qf-0q-room-0-child-0-age");
    By ChildTwoAgeLoc = By.id("qf-0q-room-0-child-1-age");

    public void closeOverlay () {
        WebElement crossSign = findElementUsingFluentWait(closeOverlayLoc);
        crossSign.click();

    }





    public void enterKeysSearchBox (String data) {

        WebElement searchBoxElement = findElementUsingFluentWait(searchBox);
        searchBoxElement.clear();
        clickThis(searchBox);
        type(searchBox, data);

    }

    public void selectLocation () {
        List<WebElement> autoSuggestions = Web.getDriver().findElements(AutoSuggestionsLoc);
        WebElement LakeGeorgeElement = findElementUsingFluentWait(LakeGeorgeLoc);
        String LakeGeorgeText = LakeGeorgeElement.getText();
        for (WebElement suggestions : autoSuggestions) {
            if (suggestions.getText().equalsIgnoreCase(LakeGeorgeText)) {
                clickThis(LakeGeorgeLoc);
                break;
            }

    } }

    public void SearchClick () {
        clickThis(Search);


    }


    public void closeThePopUp () {
        Set<String> allHandles = getAllTheWindowHandles();
        String HomeHandle = getTheHomeWindowHandle();
        for (String handle: allHandles) {
            if (!handle.equals(HomeHandle)) {
                Web.getDriver().switchTo().window(handle);
                closeAWindow();

            }

        }


    }

    public void sleep () {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}


    }

    public void selectChild (String data) {
        selectFromDropdownUsingVisibleText(ChildrenSelectLoc, data);


    }

    public void selectChildAge (String data) {

        selectFromDropdownUsingVisibleText(ChildAgeLoc, data );

    }

    public void SelectChildTwoAge (String data) {

        selectFromDropdownUsingVisibleText(ChildTwoAgeLoc, data);
    }










}
