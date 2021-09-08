package ru.cashforapp.at.steps;

import org.openqa.selenium.WebDriver;
import ru.cashforapp.at.pages.LoginPage;

public abstract class AbstractStep {

    private WebDriver driver;

    protected LoginPage loginPage;

    protected AbstractStep(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

}
