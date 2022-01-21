package ru.cashforapp.at.appmanager.steps;

import org.openqa.selenium.WebDriver;
import ru.cashforapp.at.pages.appmanager.LKAppmanagerPage;
import ru.cashforapp.at.pages.appmanager.LoginAppmanagerPage;


public abstract class AbstractStep {

    private WebDriver driver;

    protected LoginAppmanagerPage loginAppmanagerPage;
    protected LKAppmanagerPage lkAppmanagerPage;

    protected AbstractStep(WebDriver driver) {
        this.driver = driver;
        loginAppmanagerPage = new LoginAppmanagerPage(driver);
        lkAppmanagerPage = new LKAppmanagerPage(driver);
    }

}
