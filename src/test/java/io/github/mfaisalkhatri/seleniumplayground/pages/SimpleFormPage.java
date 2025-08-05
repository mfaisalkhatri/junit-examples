package io.github.mfaisalkhatri.seleniumplayground.pages;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created By Faisal Khatri on 20-03-2023
 */
public class SimpleFormPage {

    public void enterMessage (final String messageText) {
        messageField ().sendKeys (messageText);
        showMessageBtn ().click ();
    }

    public String getMessage () {
        return getDriver ().findElement (By.id ("message"))
            .getText ();
    }

    public String getResultText () {
        return getDriver ().findElement (By.id ("addmessage"))
            .getText ();
    }

    public void getSumOfTwoNumbers (final String numberOne, final String numberTwo) {
        fieldA ().sendKeys (numberOne);
        fieldB ().sendKeys (numberTwo);
        getValuesBtn ().click ();
    }

    private WebElement fieldA () {
        return getDriver ().findElement (By.id ("sum1"));
    }

    private WebElement fieldB () {
        return getDriver ().findElement (By.id ("sum2"));
    }

    private WebElement getValuesBtn () {
        return getDriver ().findElement (By.cssSelector ("#gettotal > button"));
    }

    private WebElement messageField () {
        return getDriver ().findElement (By.id ("user-message"));
    }

    private WebElement showMessageBtn () {
        return getDriver ().findElement (By.id ("showInput"));
    }
}