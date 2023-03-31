package io.github.mfaisalkhatri.drivers;

import static java.text.MessageFormat.format;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author Faisal Khatri
 * @since 10/25/2022
 **/
public class DriverManager {
    private static final ThreadLocal<WebDriver> DRIVER          = new ThreadLocal<> ();
    private static final Logger                 LOG             = LogManager.getLogger ("DriverManager.class");
    private static final String                 GRID_URL        = "@hub.lambdatest.com/wd/hub";
    private static final String                 LT_ACCESS_TOKEN = System.getProperty ("LT_ACCESS_TOKEN");
    private static final String                 LT_USERNAME     = System.getProperty ("LT_USERNAME");

    public static void createDriver () {
        //setupChromeInRemote ();
        setupChrome ();
    }

    public static WebDriver getDriver () {
        return DriverManager.DRIVER.get ();
    }

    public static void quitDriver () {
        if (null != DRIVER.get ()) {
            LOG.info ("Closing the driver...");
            getDriver ().quit ();
            DRIVER.remove ();
        }
    }

    private static void setDriver (final WebDriver driver) {
        DriverManager.DRIVER.set (driver);
    }

    private static void setupBrowserTimeouts () {
        LOG.info ("Setting Browser Timeouts....");
        getDriver ().manage ()
            .timeouts ()
            .implicitlyWait (Duration.ofSeconds (30));
        getDriver ().manage ()
            .timeouts ()
            .pageLoadTimeout (Duration.ofSeconds (30));
        getDriver ().manage ()
            .timeouts ()
            .scriptTimeout (Duration.ofSeconds (30));
    }

    private static void setupChrome () {
        ChromeOptions chromeOptions = new ChromeOptions ();
        chromeOptions.addArguments("--remote-allow-origins=*");
        setDriver (new ChromeDriver (chromeOptions));
        setupBrowserTimeouts ();
    }

    private static void setupChromeInRemote () {
        final ChromeOptions browserOptions = new ChromeOptions ();
        browserOptions.setPlatformName ("Windows 10");
        browserOptions.setBrowserVersion ("107.0");
        final HashMap<String, Object> ltOptions = new HashMap<> ();
        ltOptions.put ("username", LT_USERNAME);
        ltOptions.put ("accessKey", LT_ACCESS_TOKEN);
        ltOptions.put ("resolution", "2560x1440");
        ltOptions.put ("selenium_version", "4.0.0");
        ltOptions.put ("build", "LambdaTest ECommerce Playground Build");
        ltOptions.put ("name", "Tests for JUnit 5 Tutorial");
        ltOptions.put ("w3c", true);
        ltOptions.put ("plugin", "java-junit");
        browserOptions.setCapability ("LT:Options", ltOptions);
        try {
            setDriver (
                new RemoteWebDriver (new URL (format ("https://{0}:{1}{2}", LT_USERNAME, LT_ACCESS_TOKEN, GRID_URL)),
                    browserOptions));
        } catch (final MalformedURLException e) {
            LOG.error ("Error setting up chrome browser in LambdaTest");
        }
        setupBrowserTimeouts ();
    }

    private DriverManager () {
    }

}