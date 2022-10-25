package io.github.mfaisalkhatri.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

public class Helper {

    public static void enterText (WebElement element, String text) {
        element.click ();
        element.clear ();
        element.sendKeys (text);
    }

    private Helper () {
        
    }
}