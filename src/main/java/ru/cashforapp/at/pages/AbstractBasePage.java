package ru.cashforapp.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractBasePage {

    private static final String BASE_URL = "https://dev-lk.cashforapp.net";

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    protected void open(String url) {
        driver.navigate().to(BASE_URL + url);
    }

    public boolean isClickable(WebElement el)
    {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(el));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

}
