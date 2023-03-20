package io.github.mfaisalkhatri.lambdatestcommerce.pages;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Faisal Khatri
 * @since 10/25/2022
 **/
public class AccountPage {

    public WebElement logoutLink() {
        return getDriver().findElement (By.linkText ("Logout"));
    }

}