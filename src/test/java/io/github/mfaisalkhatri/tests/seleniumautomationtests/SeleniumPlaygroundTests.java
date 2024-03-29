package io.github.mfaisalkhatri.tests.seleniumautomationtests;

import io.github.mfaisalkhatri.drivers.Browsers;
import io.github.mfaisalkhatri.seleniumplayground.pages.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static io.github.mfaisalkhatri.drivers.DriverManager.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

        final HomePage homePage = new HomePage();
        homePage.navigateToLink("Simple Form Demo");

        final SimpleFormPage formPage = new SimpleFormPage();
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

        final HomePage homePage = new HomePage();
        homePage.navigateToLink("Simple Form Demo");

        final SimpleFormPage formPage = new SimpleFormPage();
        formPage.getSumOfTwoNumbers("2", "6");
        assertEquals("8", formPage.getResultText());
    }

    @Test
    public void checkboxDemoTest() {
        createDriver(Browsers.REMOTE_CHROME);
        final String website = "https://www.lambdatest.com/selenium-playground/";
        getDriver().get(website);

        final HomePage homePage = new HomePage();
        homePage.navigateToLink("Checkbox Demo");

        final var checkboxDemoPage = new CheckboxDemoPage();
        assertTrue(checkboxDemoPage.checkIfCheckboxOneIsTicked(), "Check box one is not ticked");
        assertTrue(checkboxDemoPage.checkIfCheckboxThreeIsDisabled());
    }

    @Test
    public void redirectionPageTest() {
        createDriver(Browsers.REMOTE_CHROME);
        final String website = "https://www.lambdatest.com/selenium-playground/";
        getDriver().get(website);

        final HomePage homePage = new HomePage();
        homePage.navigateToLink("Redirection");

        final var redirectionPage = new RedirectionPage();
        assertTrue(redirectionPage.isPageTitleDisplayed());
    }

    @Test
    public void dataFilterPageTest() {
        createDriver(Browsers.REMOTE_CHROME);
        final String website = "https://www.lambdatest.com/selenium-playground/";
        getDriver().get(website);

        final HomePage homePage = new HomePage();
        homePage.navigateToLink("Data List Filter");

        final var dataListFilterPage = new DataListFilterPage();
        final String attendeeName = "Dwayne";
        dataListFilterPage.searchAttendees(attendeeName);
        assertTrue(dataListFilterPage.getAttendeeName().contains(attendeeName));
    }
}