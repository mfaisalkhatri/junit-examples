package io.github.mfaisalkhatri.tests;

import io.github.mfaisalkhatri.drivers.Browsers;
import io.github.mfaisalkhatri.lambdatestcommerce.pages.*;
import org.junit.jupiter.api.*;

import static io.github.mfaisalkhatri.drivers.DriverManager.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Faisal Khatri
 * @since 10/25/2022
 **/

@Disabled
public class LambdaTestEcommerceWebsiteTest {

    private static String registeredEmail = null;
    private static String password = null;

    @BeforeAll
    public static void testSetup() {
        createDriver(Browsers.CHROME);
        final String website = "https://ecommerce-playground.lambdatest.io/";
        getDriver().get(website);
    }

    @AfterAll
    public static void tearDown() {
        quitDriver();
    }

    @Test
    @DisplayName("Test by registering a new user")
    public void testRegisterUser() {
        HomePage homePage = new HomePage();
        RegistrationPage registrationPage = homePage.openUserRegistrationPage();
        registeredEmail = registrationPage.getRegisteredEmail();
        password = registrationPage.getPassword();
        assertEquals("Register Account", registrationPage.getPageHeader());

        RegistrationSuccessPage registrationSuccessPage = registrationPage.registerUser();
        assertEquals("Your Account Has Been Created!", registrationSuccessPage.getRegistrationSuccessMessage());
        AccountPage accountPage = new AccountPage();
        accountPage.logoutLink()
                .click();
    }

    @Nested
    @DisplayName("Login Functionality Tests")
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class Login {

        private LoginPage loginPage;

        @BeforeEach
        public void testSetup() {
            final String website = "https://ecommerce-playground.lambdatest.io/";
            getDriver().get(website);
            HomePage homePage = new HomePage();
            loginPage = homePage.openLoginPage();
        }

        @Test
        @DisplayName("Should not allow logging in user with Invalid Username")
        @Order(1)
        void testLoginWithInvalidUsername() {
            loginPage.loginIntoWebsite("test_invalid_username@gmail.com", password);
            assertEquals("Warning: No match for E-Mail Address and/or Password.", loginPage.getFailedLoginWarning());
        }

        @Test
        @DisplayName("Should not allow logging in user with Invalid Password")
        @Order(2)
        void testLoginWithInvalidPassword() {
            loginPage.loginIntoWebsite(registeredEmail, "InvalidPassword");
            assertEquals("Warning: No match for E-Mail Address and/or Password.", loginPage.getFailedLoginWarning());

        }

        @Test
        @DisplayName("Should not allow logging in user by keeping Username and Password fields blank")
        @Order(3)
        void testLoginWithBlankUsernameAndPassword() {
            loginPage.loginIntoWebsite(" ", " ");
            assertEquals("Warning: No match for E-Mail Address and/or Password.", loginPage.getFailedLoginWarning());

        }

        @Test
        @DisplayName("Should allow logging in with Valid credentials")
        @Order(4)
        void testLoginWithValidCredentials() {
            loginPage.loginIntoWebsite(registeredEmail, password);
            AccountPage accountPage = new AccountPage();
            assertTrue(accountPage.logoutLink()
                    .isDisplayed());
        }
    }
}