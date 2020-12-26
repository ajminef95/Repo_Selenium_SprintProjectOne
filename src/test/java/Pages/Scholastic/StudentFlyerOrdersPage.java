package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StudentFlyerOrdersPage extends BasePage {

    //Locators

    By EnterStudentNameLoc = By.id("student-name");
    By EnterItemNumberLoc = By.id("item-number");
    By ClickOrderAddLoc = By.id("btn-add");
    By ErrorMessageOrderLoc = By.id("error-message-tooltip");



    //Methods


    public void EnterStudentName (String data) {

        type(EnterStudentNameLoc, data);

    }


    public void EnterItemNumber (String data) {

        type(EnterItemNumberLoc, data);

    }

     public void clickAddOrder () {

        clickThis(ClickOrderAddLoc);


     }


     public boolean IsErrorMessageForOrderDisplayed () {

         WebElement ErrorMessageElem = findElementUsingFluentWait(ErrorMessageOrderLoc);

         return ErrorMessageElem.isDisplayed();


     }



}
