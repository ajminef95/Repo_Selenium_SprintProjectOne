package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StudentFlyerOrdersPage extends BasePage {

    //Locators

    By EnterStudentNameLoc = By.id("student-name");
    By EnterItemNumberLoc = By.id("item-number");
    By ClickOrderAddLoc = By.id("btn-add");
    By ErrorMessageOrderLoc = By.id("error-message-tooltip");

    By StudentNameAfterAddedLoc = By.xpath("//td[@class=' studentName']");
    //By ItemsAfterAddedLoc = By.xpath("//td[@class=' itemNum details-control']");
    By ItemOneLoc = By.xpath("//a[text()='35J3']");
    By ItemTwoLoc = By.xpath("//a[text()='16B3']");
    By ItemThreeJohnLoc = By.xpath("//a[text()='35S3']");
    By ItemFourMichaelLoc = By.xpath("//a[text()='35N3']");
    By ItemQtyOneLoc = By.xpath("/html[1]/body[1]/div[1]/div[4]/div[10]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/input[1]");
    By ItemQtyTwoLoc = By.xpath("/html[1]/body[1]/div[1]/div[4]/div[10]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[8]/input[1]");
    By ReviewCartLoc = By.xpath("//button[@class='secondary']");
    //By ItemsBeforeRevLoc = By.xpath("//input[@class='input-qty numericenteronly']");

    By ItemQtyThreeMichaelLoc = By.xpath("/html[1]/body[1]/div[1]/div[4]/div[10]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/input[1]");
    By ItemQtyFourJohnLoc = By.xpath("/html[1]/body[1]/div[1]/div[4]/div[10]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[8]/input[1]");

    By ExItemQtyOneHarryLoc = By.xpath("/html[1]/body[1]/div[1]/div[4]/div[10]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[8]/input[1]");
    By ExItemQtyTwoHarryLoc = By.xpath("/html[1]/body[1]/div[1]/div[4]/div[10]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[8]/input[1]");

    By TeacherOrderEnterItemLoc = By.xpath("//a[@href='/ytoitementry']");

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


     public String StudentNameAfterAdd () {

        String StudentName = "Harry";
        String book= "";

         List<WebElement> StudentNameAfterAddedElem = Web.getDriver().findElements(StudentNameAfterAddedLoc);

         for (WebElement books : StudentNameAfterAddedElem) {

             if (books.getText().equalsIgnoreCase(StudentName)) {

                 book = books.getText();
                 System.out.println(book);


             }



         }
               return book;

     }


     public String ItemNumberOneAfterAdd () {

        WebElement ItemNumberOneElem = findElementUsingFluentWait(ItemOneLoc);

        return ItemNumberOneElem.getText();

     }

     public String ItemNumberTwoAfterAdd () {

        WebElement ItemNumberTwoElem = findElementUsingFluentWait(ItemTwoLoc);

        return ItemNumberTwoElem.getText();


         }

         public String ItemNumberThreeAfterAdd () {

        WebElement ItemNumberThreeElem = findElementUsingFluentWait(ItemThreeJohnLoc);

        return ItemNumberThreeElem.getText();

         }

         public String ItemNumberFourAfterAdd () {

        WebElement ItemNumberFourElem = findElementUsingFluentWait(ItemFourMichaelLoc);

        return ItemNumberFourElem.getText();


         }


         public void EnterItemQtyOne (String data) {

        type(ItemQtyOneLoc, data);

       }

         public void EnterItemQtyTwo (String data) {

        type(ItemQtyTwoLoc, data);

         }

         public void EnterItemQtyThree (String data) {

        type(ItemQtyThreeMichaelLoc, data);

         }

         public void EnterItemQtyFour (String data) {

        type(ItemQtyFourJohnLoc, data);

         }


         public void clickReviewCart () {

         clickThis(ReviewCartLoc);


         }


    public String StudentNameJohnAfterAdd () {

        String StudentName = "John";
        String book= "";

        List<WebElement> StudentNameAfterAddedElem = Web.getDriver().findElements(StudentNameAfterAddedLoc);

        for (WebElement books : StudentNameAfterAddedElem) {

            if (books.getText().equalsIgnoreCase(StudentName)) {

                book = books.getText();
                System.out.println(book);


            }



        }
        return book;

    }

    public String StudentNameMichaelAfterAdd () {

        String StudentName = "Michael";
        String book= "";

        List<WebElement> StudentNameAfterAddedElem = Web.getDriver().findElements(StudentNameAfterAddedLoc);

        for (WebElement books : StudentNameAfterAddedElem) {

            if (books.getText().equalsIgnoreCase(StudentName)) {

                book = books.getText();
                System.out.println(book);


            }



        }
        return book;

    }


    public void EnterItemQtyOneExHarry (String data) {

        type(ExItemQtyOneHarryLoc, data);


    }

    public void EnterItemQtyTwoExHarry (String data) {

        type(ExItemQtyTwoHarryLoc, data);

    }


    public void clickTeacherOrderEnterItem() {

        clickThis(TeacherOrderEnterItemLoc);
    }




}







