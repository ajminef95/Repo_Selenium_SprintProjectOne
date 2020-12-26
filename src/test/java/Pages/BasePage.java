package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.Set;
import java.util.function.Function;

public class BasePage {


    public WebElement findElementUsingFluentWait(By locator) {
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(35))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is not found after 30 seconds");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }


    public void type(By locator, String data) {
        findElementUsingFluentWait(locator).sendKeys(data);
    }

    public void clickThis(By locator) {
        findElementUsingFluentWait(locator).click();
    }

    public boolean isElementDisplayed(By locator) {
        return findElementUsingFluentWait(locator).isDisplayed();
    }


    public void selectFromDropdownUsingVisibleText(By locator, String data) {
        WebElement dropdownElement = findElementUsingFluentWait(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(data);
    }


    public String getWebPageTitle () {
        return Web.getDriver().getTitle();


    }

    public Set<String> getAllTheWindowHandles () {
        return Web.getDriver().getWindowHandles();

    }

    public String getTheHomeWindowHandle () {
        return Web.getDriver().getWindowHandle();

    }

    public void closeAWindow () {
        Web.getDriver().close();
    }


    public void sleep () {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}


    }

}
