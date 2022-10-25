package io.github.mfaisalkhatri.pages;

import static io.github.mfaisalkhatri.data.TestDataBuilder.getRegisterUserData;
import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;
import static io.github.mfaisalkhatri.utilities.Helper.enterText;

import io.github.mfaisalkhatri.data.RegisterUserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Faisal Khatri
 * @since 10/25/2022
 **/
public class RegistrationPage {

    private static final String           PASSWORD = "Password123#";
    private final        RegisterUserData registerUserData;

    public RegistrationPage () {
        registerUserData = getRegisterUserData ();
    }

    public String getRegisteredEmail () {
        return registerUserData.getEmail ();
    }

    public String getPassword() {
        return PASSWORD;
    }
    public RegistrationSuccessPage registerUser () {
        enterText (firstNameField (), this.registerUserData.getFirstName ());
        enterText (lastNameField (), this.registerUserData.getLastName ());
        enterText (emailField (), getRegisteredEmail ());
        enterText (telephoneField (), this.registerUserData.getTelephone ());
        enterText (passwordField (), PASSWORD);
        enterText (confirmPasswordField (), PASSWORD);
        final Actions actions = new Actions (getDriver ());
        actions.moveToElement (agreePrivacyPolicyField ())
            .click ()
            .perform ();
        continueBtn ().click ();
        return new RegistrationSuccessPage ();
    }

    public String getPageHeader () {
        return getDriver ().findElement (By.tagName ("h1"))
            .getText ();
    }
    private WebElement agreePrivacyPolicyField () {
        return registrationForm ().findElement (By.id ("input-agree"));
    }

    private WebElement confirmPasswordField () {
        return registrationForm ().findElement (By.id ("input-confirm"));
    }

    private WebElement continueBtn () {
        return registrationForm ().findElement (By.cssSelector ("input.btn-primary"));
    }

    private WebElement emailField () {
        return registrationForm ().findElement (By.id ("input-email"));
    }

    private WebElement firstNameField () {
        return registrationForm ().findElement (By.id ("input-firstname"));
    }

    private WebElement lastNameField () {
        return registrationForm ().findElement (By.id ("input-lastname"));
    }

    private WebElement passwordField () {
        return registrationForm ().findElement (By.id ("input-password"));
    }

    private WebElement registrationForm () {
        return getDriver ().findElement (By.id ("content"));
    }

    private WebElement telephoneField () {
        return registrationForm ().findElement (By.id ("input-telephone"));
    }
}
