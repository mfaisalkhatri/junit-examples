package io.github.mfaisalkhatri.seleniumplayground.pages;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created By Faisal Khatri on 20-03-2023
 */
public class SimpleFormPage {

    private WebElement messageField () {
        return getDriver ().findElement (By.id ("user-message"));
    }

    private WebElement showMessageBtn() {
        return getDriver ().findElement (By.id ("showInput"));
    }

    public String getMessage() {
        return getDriver ().findElement (By.id ("message")).getText ();
    }

    public void enterMessage(String messageText) {
        messageField ().sendKeys (messageText);
        showMessageBtn ().click ();
    }

    private WebElement fieldA() {
        return getDriver ().findElement (By.id("sum1"));

    }

    private WebElement fieldB () {
        return getDriver ().findElement (By.id ("sum2"));
    }

    private WebElement getValuesBtn() {
        return getDriver ().findElement (By.cssSelector ("#gettotal > button"));
    }
}