package ru.cashforapp.at.pages;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginUploaderPage extends AbstractBasePage {

    @FindBy(xpath = "//*[contains(@class, 'phone-input')]//input")
    private WebElement phoneInput;

    @FindBy(xpath = "//*[@id='id-password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@value='Вход']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[contains(@class, 'modal-close')]")
    private WebElement modalCloseButton;

    @FindBy(xpath = "//*[@class='user-data__info']/h5")
    private WebElement userDataInfo;

    @FindBy(xpath = "//*[contains(@class, 'ui-kit dashboard__title')]")
    private WebElement dashboardTitle;


    public LoginUploaderPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        open("/ru/sign-in");
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

    public void clickModalClose() {
        modalCloseButton.click();
    }

    public String getActualLoginText() {
        return userDataInfo.getText();
    }

    public String getDashboardTitleText() {
        return dashboardTitle.getText();
    }


}
