package io.github.mfaisalkhatri.seleniumplayground.pages;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataListFilterPage {

    public String getAttendeeName () {
        final WebDriverWait wait = new WebDriverWait (getDriver (), Duration.ofSeconds (20));
        return wait.until (
                ExpectedConditions.visibilityOfElementLocated (By.cssSelector ("div:nth-child(3) > div > h4")))
            .getText ();
    }

    public void searchAttendees (final String attendeeName) {
        searchAttendeesField ().sendKeys (attendeeName);
    }

    private WebElement searchAttendeesField () {
        return getDriver ().findElement (By.id ("input-search"));
    }
}