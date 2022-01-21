package ru.cashforapp.at.appmanager.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;


public class ActionStep extends AbstractStep {

    public ActionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Открыть страницу appmanager.cashforapp.net")
    public void openLoginPage() {
        loginAppmanagerPage.open();
    }

    @Step("Ввести значение в поле \"Телефон\"")
    public void phoneInput(String phone) {
        loginAppmanagerPage.phoneInput(phone);
    }

    @Step("Ввести значение в поле \"Пароль\"")
    public void passwordInput(String password) {
        loginAppmanagerPage.passwordInput(password);
    }

    @Step("Нажать кнопку \"Вход\"")
    public void clickLoginButton() {
        loginAppmanagerPage.clickLoginButton();
    }

    @Step("Войти в кабинет Менеджера приложения")
    public void login(String phone, String password) {
        loginAppmanagerPage.login(phone,
                password);
    }

    @Step("Перейти в раздел \"Профиль\"")
    public void clickProfile() {
        lkAppmanagerPage.clickProfile();
    }

    @Step("Загрузить фото в аватарку")
    public void inputAvatar() {
        lkAppmanagerPage.inputAvatar();
    }

    @Step("Нажать на \"Сохранить\"")
    public void clickSaveAvatarButton() {
        lkAppmanagerPage.clickSaveAvatarButton();
    }

    @Step("Заполнить поле \"Фамилия\"")
    public void inputSurname(String surname) {
        lkAppmanagerPage.inputSurname(surname);
    }

    @Step("Заполнить поле \"Имя\"")
    public void inputName(String name) {
        lkAppmanagerPage.inputName(name);
    }

    @Step("Заполнить поле \"Email\"")
    public void inputEmail(String email) {
        lkAppmanagerPage.inputEmail(email);
    }

    @Step("Нажать на \"Сохранить\"")
    public void clickSaveProfileButton() {
        lkAppmanagerPage.clickSaveProfileButton();
    }



}
