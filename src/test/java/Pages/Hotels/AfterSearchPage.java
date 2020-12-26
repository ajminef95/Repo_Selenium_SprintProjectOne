package Pages.Hotels;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AfterSearchPage extends BasePage {

    By DestinationLandMark = By.id("q-destination");
    By PriceMenuToggleLoc = By.xpath("//a[@data-menu='sort-submenu-price']");
    By PriceLowToHigh = By.xpath("//a[@data-option-id='opt_PRICE']");
    By LowestPriceLoc = By.xpath("//ins[text()='$43']");
    By HotelNameLoc = By.xpath("//a[text()='Lake View Inn']");


    public boolean searchHeaderTextContains (String data) {

        String headerText = getWebPageTitle();
        return headerText.contains(data);


    }




    public boolean IsDesLMEqual (String data) {
        WebElement DesLM = findElementUsingFluentWait(DestinationLandMark);
        String DesLMText = DesLM.getAttribute("value");
        return  DesLMText.equalsIgnoreCase(data);



    }


    public void HoverToPriceMenuToggleAndClick () {
        WebElement PriceMenu = findElementUsingFluentWait(PriceMenuToggleLoc);
        Actions actII = new Actions(Web.getDriver());
        actII.moveToElement(PriceMenu).build().perform();
        clickThis(PriceLowToHigh);



    }

    public void PrintTheLowestPriceAndHotel () {
        WebElement LowestPrice = findElementUsingFluentWait(LowestPriceLoc);
        String LowestPriceText = LowestPrice.getText();
        System.out.println("Lowest price of Hotel is: " + LowestPriceText);
        WebElement HotelName = Web.getDriver().findElement(HotelNameLoc);
        String HotelNameText = HotelName.getText();
        System.out.println("Hotel Name is: " + HotelNameText);

    }

    public boolean isLowestPriceLessThan100 () {
        WebElement LowestPrice1 = findElementUsingFluentWait(LowestPriceLoc);
        String LowestPriceText1 = LowestPrice1.getText();

        int LowestPriceIntTxt = Integer.parseInt(LowestPriceText1);
        String price = "$100";
        int priceInt = Integer.parseInt(price);

        if (LowestPriceIntTxt < priceInt) {

        }
        return true;
    }

}














