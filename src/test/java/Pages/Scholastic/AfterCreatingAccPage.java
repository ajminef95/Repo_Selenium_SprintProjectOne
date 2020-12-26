package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AfterCreatingAccPage extends BasePage {


    //Locators

    By ClassCodeLoc = By.xpath("//div[@class='value' and starts-with(text(), 'Z')]");
    By MyAccountLoc = By.xpath("//span[@class='hide-mobile user-account-name']");
    By ProfileLoc = By.xpath("//a[@title='Profile']");


    //Methods

    public String getClassCodeText() {

        WebElement classCodeElem = findElementUsingFluentWait(ClassCodeLoc);

        return classCodeElem.getText();


    }


    public void clickMyAccountAndProfile () {

        clickThis(MyAccountLoc);
        clickThis(ProfileLoc);


    }



}






