package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReviewCartPage extends BasePage {


    //Locators
    By ItemOneAfterReviewLoc = By.xpath("//a[@class='truncate' and contains(text(), 'Dream Big')]");
    //By ItemTwoAfterReviewLoc = By.xpath("//a[text()='35J3']");
    By ItemOneQtyAfterReviewLoc = By.xpath("//input[@name='dwfrm_cart_shipments_i0_items_i0_quantity']");
    By ItemTwoQtyAfterReviewLoc = By.xpath("//input[@name='dwfrm_cart_shipments_i0_items_i1_quantity']");
    By ItemOnePriceAfterReview = By.xpath("//span[@class='value' and contains(text(), '$9.00')]");
    By ItemTwoPriceAfterReview = By.xpath("//span[@class='value' and contains(text(), '$4.00')]");
    By TotalPriceHarryLoc = By.xpath("//li[@class='std-total-price stdPriceTotal' and contains(text(), '$35.00')]");
    By TotalItemsLoc = By.xpath("//span[@class='total-qty stdPriceQty' and contains(text(), '5')]");
    By SFOTotalPriceLoc = By.id("student_flyer_orders");

    By ItemOneJohnAfterRLoc = By.xpath("//input[@name='dwfrm_cart_shipments_i0_items_i2_quantity']");
    By ItemOneMichaelAfterRLoc = By.xpath("//input[@name='dwfrm_cart_shipments_i0_items_i3_quantity']");
    By TotalPriceJohnLoc = By.xpath("//li[@class='std-total-label' and contains(text(), 'John Total')]/following::li[@class='std-total-price stdPriceTotal' and contains(text(), '$3')]");
    By ItemOneJohnARPriceLoc = By.xpath("//span[@class='value' and contains(text(), '$18')]");
    By TotalPriceMichaelLoc = By.xpath("//li[@class='std-total-label' and contains(text(), 'Michael')]/following::li[@class='std-total-price stdPriceTotal' and contains(text(), '$2')]");
    By ItemOneMichaelARPriceLoc = By.xpath("//span[@class='value' and contains(text(), '$5')]");
    By TotalPriceCombinedLoc = By.xpath("//li[@class='std-total-price sfoSubTotalPrice']");

    By FirstCheckOutLoc = By.id("dwfrm_cart_checkoutCart");
    By SecondCheckOutLoc = By.xpath("//form[@action='/startcheckout']");

    By DeleteItemCrossLoc = By.xpath("//tbody/tr[@id='16B3']/td[6]/span[1]/i[1]");
    By YesLocAfterItemDelete = By.xpath("//button[@name='dwfrm_cart_shipments_i0_items_i0_deleteProduct']");
    By PriceChangeHarryAfterDelLoc = By.xpath("//li[@class='std-total-price stdPriceTotal' and contains(text(), '$8.00')]");
    By AllItemsListLoc = By.xpath("//td[@class='itemNum details-control']");
    By TotalItemsForAllLoc = By.xpath("//span[@class='total-qty sfoSubTotalQty']");

    //Methods

    //public String ItemOneVerify () {

    //WebElement ItemOneAfterRELEM = findElementUsingFluentWait(ItemOneAfterReviewLoc);
    //return ItemOneAfterRELEM.getText();


    //}


    //public String ItemTwoVerify () {

    //WebElement ItemTwoAfterRELEM = findElementUsingFluentWait(ItemTwoAfterReviewLoc);
    //return ItemTwoAfterRELEM.getText();

    //}


    public String ItemOneQtyVerify() {

        WebElement ItemOneQty = findElementUsingFluentWait(ItemOneQtyAfterReviewLoc);
        return ItemOneQty.getAttribute("value");

    }

    public String ItemTwoQtyVerify() {

        WebElement ItemTwoQty = findElementUsingFluentWait(ItemTwoQtyAfterReviewLoc);
        return ItemTwoQty.getAttribute("value");

    }

    public String ItemOneJohnVerify() {

        WebElement ItemOneQtyJohn = findElementUsingFluentWait(ItemOneJohnAfterRLoc);
        return ItemOneQtyJohn.getAttribute("value");



    }

    public String ItemOneMichaelVerify() {

        WebElement ItemOneQtyMichael = findElementUsingFluentWait(ItemOneMichaelAfterRLoc);
        return ItemOneQtyMichael.getAttribute("value");

    }

    public int TotalItemsPresent() {

        WebElement TotalItemsElem = findElementUsingFluentWait(TotalItemsLoc);
        String TotalItemsTxt = TotalItemsElem.getText();
        int TotalItemsInt = Integer.parseInt(TotalItemsTxt);

        return TotalItemsInt;

    }

    public int TotalItemsCalculated() {

        WebElement ItemOneQtyElem = findElementUsingFluentWait(ItemOneQtyAfterReviewLoc);
        String ItemOneQtyTxt = ItemOneQtyElem.getText();
        int ItemOneQtyInt = Integer.parseInt(ItemOneQtyTxt);

        WebElement ItemTwoQtyElem = findElementUsingFluentWait(ItemTwoQtyAfterReviewLoc);
        String ItemTwoQtyTxt = ItemTwoQtyElem.getText();
        int ItemTwoQtyInt = Integer.parseInt(ItemTwoQtyTxt);

        int TotalItemsCalc = ItemOneQtyInt + ItemTwoQtyInt;
        return TotalItemsCalc;


    }

    public double TotalPricePresentHarry() {

        WebElement TotalPriceElem = findElementUsingFluentWait(TotalPriceHarryLoc);
        String TotalPriceElemTxt = TotalPriceElem.getText();
        String TotalPriceWithoutDollar = TotalPriceElemTxt.replace("$", "");
        double TotalPriceF = Double.parseDouble(TotalPriceWithoutDollar);
        return TotalPriceF;
    }

    public double TotalPricePresentJohn() {

        WebElement TotalPriceElem = findElementUsingFluentWait(TotalPriceJohnLoc);
        String TotalPriceElemTxt = TotalPriceElem.getText();
        String TotalPriceWithoutDollar = TotalPriceElemTxt.replace("$", "");
        double TotalPriceJ = Double.parseDouble(TotalPriceWithoutDollar);
        return TotalPriceJ;

    }


    public double TotalPriceCalcJohn() {

        WebElement ItemOnePriceElem = findElementUsingFluentWait(ItemOneJohnARPriceLoc);
        String ItemOnePriceTxt = ItemOnePriceElem.getText();
        String ItemOnePriceWithoutDollar = ItemOnePriceTxt.replace("$", "");
        double ItemOnePriceJ = Double.parseDouble(ItemOnePriceWithoutDollar);

        WebElement ItemOneQtyElem = findElementUsingFluentWait(ItemOneJohnAfterRLoc);
        String ItemOneQtyTxt = ItemOneQtyElem.getAttribute("value");
        double ItemOneQtyF = Double.parseDouble(ItemOneQtyTxt);

        double TotalPriceJ = ItemOnePriceJ*ItemOneQtyF;
        return TotalPriceJ;


    }

    public double TotalPricePresentMichael() {

        WebElement TotalPriceElem = findElementUsingFluentWait(TotalPriceMichaelLoc);
        String TotalPriceElemTxt = TotalPriceElem.getText();
        String TotalPriceWithoutDollar = TotalPriceElemTxt.replace("$", "");
        double TotalPriceM = Double.parseDouble(TotalPriceWithoutDollar);
        return TotalPriceM;

    }

    public double TotalPriceMichaelCalc() {

        WebElement ItemOnePriceElem = findElementUsingFluentWait(ItemOneMichaelARPriceLoc);
        String ItemOnePriceTxt = ItemOnePriceElem.getText();
        String ItemOnePriceWithoutDollar = ItemOnePriceTxt.replace("$", "");
        double ItemOnePriceM = Double.parseDouble(ItemOnePriceWithoutDollar);

        WebElement ItemOneQtyElem = findElementUsingFluentWait(ItemOneMichaelAfterRLoc);
        String ItemOneQtyTxt = ItemOneQtyElem.getAttribute("value");
        double ItemOneQtyF = Double.parseDouble(ItemOneQtyTxt);

        double TotalPriceM = ItemOnePriceM*ItemOneQtyF;
        return TotalPriceM;


    }


    public double TotalPriceCalculatedHarry() {

        WebElement ItemOnePriceElem = findElementUsingFluentWait(ItemOnePriceAfterReview);
        String ItemOnePriceTxt = ItemOnePriceElem.getText();
        String ItemOnePriceWithoutDollar= ItemOnePriceTxt.replace("$", "");
        double ItemOnePriceF = Double.parseDouble(ItemOnePriceWithoutDollar);

            WebElement ItemTwoPriceElem = findElementUsingFluentWait(ItemTwoPriceAfterReview);
            String ItemTwoPriceTxt = ItemTwoPriceElem.getText();
            String ItemTwoPriceWithoutDollar = ItemTwoPriceTxt.replace("$", "");
            double ItemTwoPriceF = Double.parseDouble(ItemTwoPriceWithoutDollar);

            WebElement ItemOneQtyElem = findElementUsingFluentWait(ItemOneQtyAfterReviewLoc);
                String ItemOneQtyTxt = ItemOneQtyElem.getAttribute("value");
               double ItemOneQtyF = Double.parseDouble(ItemOneQtyTxt);

                WebElement ItemTwoQtyElem = findElementUsingFluentWait(ItemTwoQtyAfterReviewLoc);
                    String ItemTwoQtyTxt = ItemTwoQtyElem.getAttribute("value");
                    double ItemTwoQtyF = Double.parseDouble(ItemTwoQtyTxt);
                    double TotalPrice = (ItemOnePriceF*ItemOneQtyF) + (ItemTwoPriceF*ItemTwoQtyF);
                    return TotalPrice;

                    }




    public double SFOTotalPrice() {

        WebElement SFOPriceElem = findElementUsingFluentWait(SFOTotalPriceLoc);
        String SFOPriceTxt = SFOPriceElem.getText();
        String SFOPriceWithoutDollar = SFOPriceTxt.replace("$","");
        double SFOPriceF = Double.parseDouble(SFOPriceWithoutDollar);

        return SFOPriceF;



    }


    public double TotalPriceCombined() {

        WebElement TotalPriceComElem = findElementUsingFluentWait(TotalPriceCombinedLoc);
        String TotalPriceComTxt = TotalPriceComElem.getText();
        String TotalPriceComWithoutDollar = TotalPriceComTxt.replace("$", "");
        double TotalPriceSum = Double.parseDouble(TotalPriceComWithoutDollar);

        return TotalPriceSum;


    }


    public void clickProceedToCheckout() {

        clickThis(FirstCheckOutLoc);

    }

    public void clickProceedToCheckoutAgain() {

        clickThis(SecondCheckOutLoc);

    }

    public void clickDeleteItem16B3() {

        clickThis(DeleteItemCrossLoc);
        sleep();
        clickThis(YesLocAfterItemDelete);

    }


    public int Item16B3Deleted() {

        List<WebElement> AllItemsElem = Web.getDriver().findElements(AllItemsListLoc);

          return AllItemsElem.size();
    }


    public double HarryTotalPriceAfterDelete() {

        WebElement HarryTotalPriceElem = findElementUsingFluentWait(PriceChangeHarryAfterDelLoc);
        String HarryTotalPriceTxt = HarryTotalPriceElem.getText();
        String HarryTotalPriceWithoutDollar = HarryTotalPriceTxt.replace("$", "");
        double HarryTotalPrice = Double.parseDouble(HarryTotalPriceWithoutDollar);

        return HarryTotalPrice;


    }


    public String TotalItemsCombForAll () {

        WebElement TotalItemsComb = findElementUsingFluentWait(TotalItemsForAllLoc);

        return TotalItemsComb.getText();

    }




}

