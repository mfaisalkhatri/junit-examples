package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.drivers.Browsers;
import io.github.mfaisalkhatri.seleniumplayground.pages.HomePage;
import io.github.mfaisalkhatri.seleniumplayground.pages.SimpleFormPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static io.github.mfaisalkhatri.drivers.DriverManager.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created By Faisal Khatri on 17-03-2023
 */

public class SeleniumPlaygroundTests {
    @AfterAll
    public static void tearDown() {
        quitDriver();
    }

    @DisabledOnOs(value = OS.MAC, architectures = "aarch64")
    @Test
    public void testSimpleForm() {
        createDriver(Browsers.SAFARI);
        final String website = "https://www.lambdatest.com/selenium-playground/";
        getDriver().get(website);

        HomePage homePage = new HomePage();
        homePage.navigateToLink("Simple Form Demo");

        SimpleFormPage formPage = new SimpleFormPage();
        final String messageText = "This is a test";
        formPage.enterMessage(messageText);
        assertEquals(messageText, formPage.getMessage());
    }

    @DisabledOnOs(OS.WINDOWS)
    @Test
    public void testAdditionOfValues() {

        createDriver(Browsers.CHROME);
        final String website = "https://www.lambdatest.com/selenium-playground/";
        getDriver().get(website);

        HomePage homePage = new HomePage();
        homePage.navigateToLink("Simple Form Demo");

        SimpleFormPage formPage = new SimpleFormPage();
        formPage.getSumOfTwoNumbers("2", "6");
        assertEquals("8", formPage.getResultText());
        //to find os arch
        //System.out.println(System.getProperty("os.arch"));

    }

}