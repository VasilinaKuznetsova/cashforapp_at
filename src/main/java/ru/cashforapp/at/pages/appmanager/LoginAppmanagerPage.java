package ru.cashforapp.at.pages.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class LoginAppmanagerPage extends AbstractBasePage {

    @FindBy(xpath = "//*[@placeholder='Номер телефона']")
    private WebElement phoneInput;

    @FindBy(xpath = "//*[@type='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[contains(@class, 'sidebar-item__title-text')]")
    private WebElement userDataInfo;

    @FindBy(xpath = "//*[contains(@class, 'sidebar-item__title-text')]")
    private List<WebElement> dashboardTitles;



    public LoginAppmanagerPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        open("/login");
    }

    public void phoneInput(String phone) {
        phoneInput.sendKeys(phone);
    }

    public void passwordInput(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void login(String login, String password) {
        phoneInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public String getActualLoginText() {
        return dashboardTitles.get(0).getText();
    }

    public List<String> getDashboardTitles() {
        return dashboardTitles
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }



}
