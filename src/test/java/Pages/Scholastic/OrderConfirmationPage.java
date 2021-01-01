package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class OrderConfirmationPage extends BasePage {


    By ThankYouForYourOrderLoc = By.xpath("//h2[contains(text(), 'Thank You')]");
    By CustomerNumberLoc = By.xpath("//div[@class='customer-number']");



    public boolean IsThankYouForYourOrderDisplayed () {

        return isElementDisplayed(ThankYouForYourOrderLoc);

    }


    public boolean IsCustomerNumberDisplayed () {

        return isElementDisplayed(CustomerNumberLoc);

    }






}
