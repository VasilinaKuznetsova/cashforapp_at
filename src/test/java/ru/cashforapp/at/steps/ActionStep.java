package ru.cashforapp.at.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ru.cashforapp.at.utils.ConfProperties;

public class ActionStep extends AbstractStep {

    public ActionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Open lk.cashforapp.net")
    public void openLoginPage() {
        loginPage.open();
    }

    @Step("Login")
    public void login() {
        loginPage.login(ConfProperties.getProperty("login"),
            ConfProperties.getProperty("password"));
    }

    @Step("Close modal window")
    public void closeModalClose() {
        loginPage.clickModalClose();
    }

}
