package io.github.mfaisalkhatri.lambdatestcommerce.pages;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;
import static io.github.mfaisalkhatri.utilities.Helper.enterText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Faisal Khatri
 * @since 10/25/2022
 **/
public class LoginPage {

    private WebElement emailField() {
        return getDriver().findElement (By.id ("input-email"));
    }

    private WebElement passwordField () {
        return getDriver ().findElement (By.id ("input-password"));
    }

    private WebElement loginBtn() {
        return getDriver ().findElement (By.cssSelector ("form > .btn-primary"));
    }

    public String getFailedLoginWarning() {
        return getDriver ().findElement (By.cssSelector ("#account-login > div.alert")).getText ();
    }

    public void loginIntoWebsite (final String email, final String password) {
        enterText(emailField (), email);
        enterText(passwordField (), password);
        loginBtn ().click ();
    }
}