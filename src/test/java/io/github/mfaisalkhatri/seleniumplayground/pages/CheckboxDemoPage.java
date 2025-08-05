package io.github.mfaisalkhatri.seleniumplayground.pages;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxDemoPage {

    public boolean checkIfCheckboxOneIsTicked () {
        tickCheckBoxOne ();
        return this.checkboxOne ()
            .isSelected ();
    }

    public boolean checkIfCheckboxThreeIsDisabled () {
        return !this.checkboxThree ()
            .isEnabled ();
    }

    public WebElement checkboxOne () {
        return getDriver ().findElement (
            By.cssSelector ("div:nth-child(2) > div:nth-child(1) > input[type=\"checkbox\"]"));
    }

    public WebElement checkboxThree () {
        return getDriver ().findElement (
            By.cssSelector ("div:nth-child(2) > div:nth-child(3) > input[type=\"checkbox\"]"));
    }

    public void tickCheckBoxOne () {
        checkboxOne ().click ();
    }
}