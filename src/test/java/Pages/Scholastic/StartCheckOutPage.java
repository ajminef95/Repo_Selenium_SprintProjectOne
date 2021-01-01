package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartCheckOutPage extends BasePage {


    //Locators

    By TaxPriceLoc = By.xpath("//div[@class='tooltip-salestax-help hide']/following-sibling::span");
    By ContinueCheckoutLoc = By.id("btn-continue-checkout");
    By PaymentMethodDropDownLocClick = By.xpath("//div[@class='selected-option']");
    By ClickCreditCardLoc = By.xpath("//span[text()='Credit Card']");
    By CardTypeDropDownLoc = By.xpath("//div[@class='selected-option input-select selected-active' and contains(text(), 'Visa ending in')]");
    By ClickAddANewCardLoc = By.xpath("//span[text()='Add a New Card']");
    By CardNumberCheckOutLoc = By.id("dwfrm_billing_paymentMethods_creditCard_number");
    By ExpDateMonthLoc = By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[@id='primary']/div[4]/div[1]/div[2]/div[3]/div[1]/div[2]/form[1]/fieldset[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]");
    By SelectExpDateMonthLoc= By.xpath("//span[text()='03']");
    By ExpDateYearLoc = By.xpath("//body[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[3]/div[1]/div[2]/form[1]/fieldset[2]/div[2]/div[3]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]");
    By SelectExpDateYearLoc = By.xpath("//span[text()='2023']");
    By SecurityCodeLoc = By.id("dwfrm_billing_paymentMethods_creditCard_cvn");
    By CheckOutFirstNameLoc = By.id("dwfrm_billing_billingAddress_addressFields_firstName");
    By CheckOutLastNameLoc = By.id("dwfrm_billing_billingAddress_addressFields_lastName");
    By CheckOutAddressLoc = By.id("dwfrm_billing_billingAddress_addressFields_address1");
    By CheckOutZipLoc = By.id("dwfrm_billing_billingAddress_addressFields_postal");
    By CheckOutPhoneLoc = By.id("dwfrm_billing_billingAddress_addressFields_phone");
    By ClickDontSaveTickCardLoc = By.id("dwfrm_billing_paymentMethods_creditCard_saveCard");
    By ClickShipToMySchoolRadioLoc = By.xpath("//span[contains(text(), 'Ship to My School')]/preceding-sibling::span[@class='custom-radio fa']");
    By ClickSubmitOrderLoc = By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[@id='primary']/div[4]/div[1]/div[1]/div[1]/div[4]/form[1]/fieldset[1]/div[1]/button[1]");
    By ContinueCheckOutAgainLoc = By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[@id='primary']/div[4]/div[1]/div[3]/span[1]/button[1]/span[1]");

    //Methods

    public double TaxPriceZero () {

        WebElement TaxPriceElem = findElementUsingFluentWait(TaxPriceLoc);
        String TaxPriceTxt = TaxPriceElem.getText();
        String TaxPriceWithoutDollar = TaxPriceTxt.replace("$", "");
        double TaxPriceFinal = Double.parseDouble(TaxPriceWithoutDollar);
        return TaxPriceFinal;

    }


    public double TaxPriceGreaterThanZero () {

        WebElement TaxPriceElem = findElementUsingFluentWait(TaxPriceLoc);
        String TaxPriceTxt = TaxPriceElem.getText();
        String TaxPriceWithoutDollar = TaxPriceTxt.replace("$", "");
        double TaxPriceFinal = Double.parseDouble(TaxPriceWithoutDollar);
        return TaxPriceFinal;
    }


    public void clickContinueCheckout() {

        clickThis(ContinueCheckoutLoc);

    }


    public void SelectCreditCard() {

        clickThis(PaymentMethodDropDownLocClick);
        sleep();
        clickThis(ClickCreditCardLoc);
        //selectFromDropdownUsingVisibleText(PaymentMethodDropDownLoc, "Credit Card");

    }


    public void SelectCardType() {

       clickThis(CardTypeDropDownLoc);
       sleep();
       clickThis(ClickAddANewCardLoc);

        //selectFromDropdownUsingVisibleText(CardTypeDropDownLoc, "Add a New Card");
    }


    public void enterCardNumber(String data) {

        type(CardNumberCheckOutLoc, data);
    }


    public void selectExpDatesMonth() {

        clickThis(ExpDateMonthLoc);
        sleep();
        clickThis(SelectExpDateMonthLoc);

    }


    public void selectExpDatesYear() {

        clickThis(ExpDateYearLoc);
        sleep();
        clickThis(SelectExpDateYearLoc);
    }


    public void enterSecurityCode(String data) {

        type(SecurityCodeLoc, data);
    }

    public void enterFirstName(String data) {

        type(CheckOutFirstNameLoc, data);
    }


    public void enterLastName(String data) {

        type(CheckOutLastNameLoc, data);
    }

    public void enterAddress(String data) {

        type(CheckOutAddressLoc, data);
    }

    public void enterZip(String data) {

        type(CheckOutZipLoc, data);
    }


    public void enterPhone(String data) {

        type(CheckOutPhoneLoc, data);
    }

    public void unTickSaveCardBox() {

        clickThis(ClickDontSaveTickCardLoc);
        sleep();

    }

    public void clickShipToMySchoolRadio() {

        clickThis(ClickShipToMySchoolRadioLoc);
    }


    public void clickSubmitOrder() {

        clickThis(ClickSubmitOrderLoc);
    }


    public void clickContinueCheckOutAgain() {

        sleep();
        clickThis(ContinueCheckOutAgainLoc);
    }


}
