package io.github.mfaisalkhatri.seleniumplayground.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static io.github.mfaisalkhatri.drivers.DriverManager.getDriver;

/**
 * Created By Faisal Khatri on 20-03-2023
 */
public class SimpleFormPage {

    public void getSumOfTwoNumbers(String numberOne, String numberTwo) {
        fieldA().sendKeys(numberOne);
        fieldB().sendKeys(numberTwo);
        getValuesBtn().click();
    }

    private WebElement messageField() {
        return getDriver().findElement(By.id("user-message"));
    }

    public String getMessage() {
        return getDriver().findElement(By.id("message")).getText();
    }

    private WebElement fieldB() {
        return getDriver().findElement(By.id("sum2"));
    }

    public String getResultText() {
        return getDriver().findElement(By.id("addmessage")).getText();
    }

    private WebElement getValuesBtn() {
        return getDriver().findElement(By.cssSelector("#gettotal > button"));
    }

    private WebElement fieldA() {
        return getDriver().findElement(By.id("sum1"));
    }

    private WebElement showMessageBtn() {
        return getDriver().findElement(By.id("showInput"));
    }

    public void enterMessage(String messageText) {
        messageField().sendKeys(messageText);
        showMessageBtn().click();
    }
}