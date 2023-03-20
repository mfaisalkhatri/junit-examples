package io.github.mfaisalkhatri.tests;

import static io.github.mfaisalkhatri.drivers.DriverManager.createDriver;
import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;
import static io.github.mfaisalkhatri.drivers.DriverManager.quitDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.mfaisalkhatri.seleniumplayground.pages.HomePage;
import io.github.mfaisalkhatri.seleniumplayground.pages.SimpleFormPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;

/**
 * Created By Faisal Khatri on 17-03-2023
 */

public class SeleniumPlaygroundTests {

    private static HomePage homePage;
    @BeforeAll
    public static void testSetup () {
        homePage = new HomePage ();
        createDriver ();
        final String website = "https://www.lambdatest.com/selenium-playground/";
        getDriver ().get (website);
    }

    @Test
    public void testSimpleForm () {
        homePage.navigateToLink ("Simple Form Demo");
        SimpleFormPage formPage = new SimpleFormPage ();
        String messageText = "This is a test";
        formPage.enterMessage (messageText);
        assertEquals (messageText, formPage.getMessage ());
    }

    @Test
    public void testAdditionOfValues() {

    }

    @AfterAll
    public static void tearDown () {
        quitDriver ();
    }

}