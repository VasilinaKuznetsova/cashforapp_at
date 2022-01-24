package ru.cashforapp.at.pages.appmanager;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class LKAppmanagerPage extends AbstractBasePage {

    @FindBy(xpath = "//*[contains(@class, 'sidebar-item__title-text')]")
    private WebElement userDataInfo;

    @FindBy(xpath = "//*[contains(@class, 'sidebar-item__title-text')]")
    private List<WebElement> dashboardTitles;

    @FindBy(xpath = "//*[contains(text(), 'Профиль')]")
    private WebElement profileButton;

    @FindBy(xpath = "//*[contains(text(), 'Изменить профиль')]")
    private List<WebElement> editProfileCard;

    @FindBy(xpath = "//*[contains(text(), 'Изменить пароль')]")
    private List<WebElement> editPasswordCard;

    @FindBy(xpath = "//*[@type='file']")
    private WebElement avatar;

    @FindBy(xpath = "//*[contains(@class, 'btn-container')]/button[2]")
    private WebElement saveAvatarButton;

    @FindBy(xpath = "//*[contains(@src, 'https://dev-manager.cashforapp.net//upload/images/users/')]")
    private List<WebElement> avatarImage;

    @FindBy(xpath = "//*[@name='Last name']")
    private WebElement surnameInput;

    @FindBy(xpath = "//*[@name='First name']")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@name='Email']")
    private WebElement emailInput;

    @FindBy(xpath = "//*[contains(text(), 'Сохранить изменения')]")
    private WebElement saveProfileButton;


    public LKAppmanagerPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        open("/dashboard");
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

    public void clickProfile() {
        dashboardTitles.get(0).click();
        profileButton.click();
    }

    public List<WebElement> getEditProfileCard() {
        return editProfileCard;
    }

    public List<WebElement> getEditPasswordCard() {
        return editPasswordCard;
    }

    public void inputAvatar(String filePath) {
        avatar.sendKeys(filePath);
    }

    public void clickSaveAvatarButton() {
        saveAvatarButton.click();
    }

    public List<WebElement> getAvatarImage() {
        return avatarImage;
    }

    public void inputSurname(String surname) {
        emailInput.sendKeys(Keys.CONTROL + "a");
        emailInput.sendKeys(Keys.DELETE);
        surnameInput.sendKeys(surname);}

    public String getSurname() {return surnameInput.getAttribute("value");}


    public void inputName(String name) {nameInput.sendKeys(name);}

    public void inputEmail(String email) {
//        emailInput.sendKeys(Keys.BACK_SPACE);
        emailInput.sendKeys(Keys.CONTROL + "a");
        emailInput.sendKeys(Keys.DELETE);
        emailInput.sendKeys(email);}

    public void clickSaveProfileButton() {
        saveProfileButton.click();
    }


}
