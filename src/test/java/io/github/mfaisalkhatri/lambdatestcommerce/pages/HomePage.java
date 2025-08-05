package io.github.mfaisalkhatri.lambdatestcommerce.pages;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Faisal Khatri
 * @since 10/25/2022
 **/
public class HomePage {

    public LoginPage openLoginPage () {
        openMyAccountMenu ().loginLink ()
            .click ();
        return new LoginPage ();
    }

    public RegistrationPage openUserRegistrationPage () {
        openMyAccountMenu ().registerLink ()
            .click ();
        return new RegistrationPage ();
    }

    private WebElement loginLink () {
        return getDriver ().findElement (By.linkText ("Login"));
    }

    private HomePage openMyAccountMenu () {
        getDriver ().findElement (By.linkText ("My account"))
            .click ();
        return this;
    }

    private WebElement registerLink () {
        return getDriver ().findElement (By.linkText ("Register"));
    }
}