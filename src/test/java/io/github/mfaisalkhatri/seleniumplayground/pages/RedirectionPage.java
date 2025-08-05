package io.github.mfaisalkhatri.seleniumplayground.pages;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

import org.openqa.selenium.By;

public class RedirectionPage {
    public boolean isPageTitleDisplayed () {
        return getDriver ().findElement (By.tagName ("h1"))
            .isDisplayed ();
    }
}