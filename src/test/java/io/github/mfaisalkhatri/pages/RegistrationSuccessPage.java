package io.github.mfaisalkhatri.pages;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Faisal Khatri
 * @since 10/25/2022
 **/
public class RegistrationSuccessPage {

    public String getRegistrationSuccessMessage () {
        return getDriver ().findElement (By.tagName ("h1"))
            .getText ();
    }

//    public RegistrationSuccessPage verifySuccessfulRegistration () {
//        assertEquals (, "Your Account Has Been Created!");
//
//    }

    private WebElement continueBtn () {
        return getDriver ().findElement (By.cssSelector (".buttons > a.btn-primary"));
    }

}
