package io.github.mfaisalkhatri.utilities;

import org.openqa.selenium.WebElement;

public class Helper {

    public static void enterText (final WebElement element, String text) {
        element.click ();
        element.clear ();
        element.sendKeys (text);
    }

    private Helper () {
        
    }
}