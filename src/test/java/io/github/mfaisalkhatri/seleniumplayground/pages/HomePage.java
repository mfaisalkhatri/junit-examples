package io.github.mfaisalkhatri.seleniumplayground.pages;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

import org.openqa.selenium.By;

/**
 * Created By Faisal Khatri on 20-03-2023
 */
public class HomePage {

    public void navigateToLink (String linkText) {
        getDriver ().findElement (By.linkText (linkText)).click ();
    }

}