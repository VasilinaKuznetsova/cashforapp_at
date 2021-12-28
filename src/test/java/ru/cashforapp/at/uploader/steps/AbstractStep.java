package ru.cashforapp.at.uploader.steps;

import org.openqa.selenium.WebDriver;
import ru.cashforapp.at.pages.uploader.LKUploaderPage;
import ru.cashforapp.at.pages.uploader.LoginUploaderPage;

public abstract class AbstractStep {

    private WebDriver driver;

    protected LoginUploaderPage loginUploaderPage;
    protected LKUploaderPage lkUploaderPage;

    protected AbstractStep(WebDriver driver) {
        this.driver = driver;
        loginUploaderPage = new LoginUploaderPage(driver);
        lkUploaderPage = new LKUploaderPage(driver);
    }

}
