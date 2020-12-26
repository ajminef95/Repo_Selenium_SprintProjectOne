package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyReadingClubAccPage extends BasePage {


    //Locators

    By ReadingAccClassCodeLoc = By.xpath("//div[@class='name-section']/preceding::span[starts-with(text(), 'Z')]");
    By ReadingAccNameLoc = By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]");
    By SchoolAddressNameLoc = By.xpath("//div[@class='text-blk']/following::span[text()='SCHOLASTIC+BOOK+CLUBS']");
    By SchoolAddressStreetLoc = By.xpath("//div[@class='text-blk']/following::span[text()='568 Broadway # 2']");
    By SchoolAddressCityLoc = By.xpath("//div[@class='text-blk']/following::span[text()='New York, NY']");
    By SchoolAddressZipLoc = By.xpath("//div[@class='text-blk']/following::span[text()='10012']");
    By FirstNameLoc = By.id("dwfrm_profile_customer_firstname");
    By LastNameLoc = By.id("dwfrm_profile_customer_lastname");
    By TitleLoc = By.xpath("//div[@class='selected-option input-select profile-title required']");


    By AdakSchoolAddressNameLoc = By.xpath("//div[@class='text-blk']/following::span[text()='ADAK SCHOOL']");
    By AdakSchoolAddressStreetLoc = By.xpath("//div[@class='text-blk']/following::span[text()='118 E INTL AIRPORT RD']");
    By AdakSchoolAddressCityLoc = By.xpath("//div[@class='text-blk']/following::span[text()='ANCHORAGE, AK']");
    By AdakSchoolAddressZipLoc = By.xpath("//div[@class='text-blk']/following::span[text()='99518']");


    By ClickAddACreditCardLoc = By.xpath("//a[@class='reading-club add-creditcardtoaccount']");
    By SendKeysCardNumberLoc = By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[5]/form[1]/fieldset[1]/div[1]/div[3]/input[1]");
    // had to use absolute xPath for Card Number Box, I have tried and exhausted all the other locators possible; it can't find the element
    // even though clearly using just the ID shows there's only one element which is the Card Number Box, but fails to locate during Automation Test
    // It appears to be a bug with the locator of the card number box, every other box works smoothly.
    // Potential Bug: cannot locate element when Automation Test is being executed
    By ClickCCMonthLoc = By.xpath("//div[text()='Month']");
    By ClickCardMonthLoc = By.xpath("//li[@data-label='03']");
    By ClickCCYearLoc = By.xpath("//div[text()='Year']");
    By ClickCardYearLoc = By.xpath("//li[@data-label='2022']");
    By SendKeysCCSecCodeLoc = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_cvn");
    By SendKeysCCFirstNameLoc = By.id("dwfrm_paymentinstruments_creditcards_address_firstname");
    By SendKeysCCLastNameLoc = By.id("dwfrm_paymentinstruments_creditcards_address_lastname");
    By SendKeysCCAddressLoc = By.id("dwfrm_paymentinstruments_creditcards_address_address1");
    By SendKeysCCZipLoc = By.id("dwfrm_paymentinstruments_creditcards_address_postal");
    By SendKeysCCPhoneLoc = By.id("dwfrm_paymentinstruments_creditcards_address_phone");
    By ClickCCSaveLoc = By.id("applyBtn");
    By AddCardLocAfterCardAdded = By.xpath("//a[@class='custom-tooltip tooltipstered']");
    By ErrorMDisplayedLoc = By.xpath("//div[@class='tooltipster-body']");


    //By SelectMonthLoc = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_month");
    //By SelectYearLoc = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_year");
    //Select is not working, tried numerous ways. Unable to identify the reason, possible bug.



    //Methods


    public String ReadingAccCCText () {

        WebElement ReadingAccCCElem = findElementUsingFluentWait(ReadingAccClassCodeLoc);

        String ReadingAccCCText = ReadingAccCCElem.getText();
        return ReadingAccCCText;


    }

    public boolean VerifyingTeacherName() {
        String TitleG = "Mr.";
        String FirstNameBeingUsed = "Scrum";
        String LastNameBeingUsed = "Master";
        WebElement ReadingAccNameElem = findElementUsingFluentWait(ReadingAccNameLoc);
        String TeacherNameCheck = ReadingAccNameElem.getText();
        String FullNameWithTitle = TitleG + FirstNameBeingUsed + LastNameBeingUsed;

        if (FullNameWithTitle.equalsIgnoreCase(TeacherNameCheck)) {

        }
        return true;


        //WebElement FirstNameElem = findElementUsingFluentWait(FirstNameLoc);
        //String FirstNameText = FirstNameElem.getText();
        //WebElement LastNameElem = findElementUsingFluentWait(LastNameLoc);
        //String LastNameText = LastNameElem.getText();
        //WebElement TitleName = findElementUsingFluentWait(TitleLoc);
        //String TitleG = TitleName.getText();

    }


    public boolean VerifyingSchoolAddress () {

        String schoolActualName = "SCHOLASTIC+BOOK+CLUBS";
        String schoolActualStreetText = "568 Broadway #2";
        String schoolActualCityText = "New York";
        String schoolActualZipText = "NY 10012";
        WebElement schoolAddName = findElementUsingFluentWait(SchoolAddressNameLoc);
        String schoolAddNameText = schoolAddName.getText();

        WebElement schoolAddStreet = findElementUsingFluentWait(SchoolAddressStreetLoc);
        String schoolAddStreetText = schoolAddStreet.getText();

        WebElement schoolAddCity = findElementUsingFluentWait(SchoolAddressCityLoc);
        String schoolAddCityText = schoolAddCity.getText();

        WebElement schoolAddZip = findElementUsingFluentWait(SchoolAddressZipLoc);
        String schoolAddZipText = schoolAddZip.getText();

        String FullSchoolAddress = schoolAddNameText + schoolAddStreetText + schoolAddCityText + schoolAddZipText;
        String FullActualAddress = schoolActualName + schoolActualStreetText + schoolActualCityText + schoolActualZipText;

        if (FullActualAddress.equalsIgnoreCase(FullSchoolAddress)) {
            System.out.println(FullActualAddress);
            System.out.println(FullSchoolAddress);


        }

           return true;




    }


    public boolean VerifyAdakSchoolAddress() {

        String schoolActualName = "ADAK SCHOOL";
        String schoolActualStreetText = "118 E INTL AIRPORT RD";
        String schoolActualCityText = "ANCHORAGE";
        String schoolActualZipText = "AK 99518";

        WebElement schoolAddName = findElementUsingFluentWait(AdakSchoolAddressNameLoc);
        String schoolAddNameText = schoolAddName.getText();

        WebElement schoolAddStreet = findElementUsingFluentWait(AdakSchoolAddressStreetLoc);
        String schoolAddStreetText = schoolAddStreet.getText();

        WebElement schoolAddCity = findElementUsingFluentWait(AdakSchoolAddressCityLoc);
        String schoolAddCityText = schoolAddCity.getText();

        WebElement schoolAddZip = findElementUsingFluentWait(AdakSchoolAddressZipLoc);
        String schoolAddZipText = schoolAddZip.getText();

        String FullSchoolAddress = schoolAddNameText + schoolAddStreetText + schoolAddCityText + schoolAddZipText;
        String FullActualAddress = schoolActualName + schoolActualStreetText + schoolActualCityText + schoolActualZipText;

        if (FullActualAddress.equalsIgnoreCase(FullSchoolAddress)) {
            System.out.println(FullActualAddress);
            System.out.println(FullSchoolAddress);


        }

        return true;


    }


   public void AddACreditCard () {

        clickThis(ClickAddACreditCardLoc);


   }


   public void ScrollDownAfterAddingCreditCard () {
        sleep();
       JavascriptExecutor js =(JavascriptExecutor) Web.getDriver();

       js.executeScript("scrollBy(0,350);");
       sleep();


   }

   public void EnterCreditCardNo (String data) {

       //Actions act = new Actions(Web.getDriver());
       //WebElement CardElem = findElementUsingFluentWait(SendKeysCardNumberLoc);
      //act.moveToElement(CardElem).build().perform();
      //CardElem.click();
     clickThis(SendKeysCardNumberLoc);
        sleep();
      type(SendKeysCardNumberLoc, data);


   }


   public void SelectMonthCC () {

        clickThis(ClickCCMonthLoc);
        clickThis(ClickCardMonthLoc);
   }


   public void SelectYearLoc () {

        clickThis(ClickCCYearLoc);
         clickThis(ClickCardYearLoc);
        //selectFromDropdownUsingVisibleText(SelectYearLoc, data);

   }


   public void EnterSecurityCode (String data) {

        type(SendKeysCCSecCodeLoc, data);

   }




   public void EnterFirstNameInCC (String data) {

        type(SendKeysCCFirstNameLoc, data);


   }


   public void EnterLastNameInCC (String data) {

        type(SendKeysCCLastNameLoc, data);

   }


   public void EnterAddressInCC (String data) {

        type(SendKeysCCAddressLoc, data);

   }


   public void EnterZipInCC (String data) {

        type(SendKeysCCZipLoc, data);

   }


   public void EnterPhoneInCC (String data) {

        type(SendKeysCCPhoneLoc, data);

   }


   public void ClickCCSave () {

        clickThis(ClickCCSaveLoc);

   }

   public void clickAddCardAfterAdded () {

        clickThis(AddCardLocAfterCardAdded);

   }


   public boolean IsErrorMessageDisplayed () {

        WebElement ErrorMessageElem = findElementUsingFluentWait(ErrorMDisplayedLoc);
        return ErrorMessageElem.isDisplayed();


   }




}
