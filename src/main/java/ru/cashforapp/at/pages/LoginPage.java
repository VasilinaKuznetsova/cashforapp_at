package ru.cashforapp.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage {

    @FindBy(xpath = "//*[contains(@class, 'phone-input')]//input")
    private WebElement loginInput;

    @FindBy(xpath = "//*[@id='id-password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@value='Вход']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[contains(@class, 'modal-close')]")
    private WebElement modalCloseButton;

    @FindBy(xpath = "//*[@class='user-data__info']/h5")
    private WebElement userDataInfo;




    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        open("/ru/sign-in");
    }

    public void login(String login, String password) {
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void clickModalClose() {
        modalCloseButton.click();
    }

    public String getActualLoginText() {
        return userDataInfo.getText();
    }



}
