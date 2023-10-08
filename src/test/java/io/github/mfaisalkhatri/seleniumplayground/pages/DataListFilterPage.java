package io.github.mfaisalkhatri.seleniumplayground.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

public class DataListFilterPage {


    private WebElement searchAttendeesField() {
        return getDriver().findElement(By.id("input-search"));
    }

    public void searchAttendees(final String attendeeName) {
        searchAttendeesField().sendKeys(attendeeName);
    }

    public String getAttendeeName() {
        final WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
       return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-child(3) > div > h4"))).getText();
    }
}
