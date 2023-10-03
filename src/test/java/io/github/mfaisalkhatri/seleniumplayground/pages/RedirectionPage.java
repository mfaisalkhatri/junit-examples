package io.github.mfaisalkhatri.seleniumplayground.pages;

import org.openqa.selenium.By;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

public class RedirectionPage {

    public boolean isPageTitleDisplayed() {
        return getDriver().findElement(By.tagName("h1")).isDisplayed();
    }
}
