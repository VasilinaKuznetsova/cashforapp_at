package ru.cashforapp.at.uploader.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ru.cashforapp.at.utils.ConfProperties;

import java.util.List;

public class ActionStep extends AbstractStep {

    public ActionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Открыть страницу lk.cashforapp.net")
    public void openLoginPage() {
        loginUploaderPage.open();
    }

    @Step("Ввести значение в поле \"Телефон\"")
    public void phoneInput() {
        loginUploaderPage.phoneInput(ConfProperties.getProperty("phone"));
    }

    @Step("Ввести значение в поле \"Пароль\"")
    public void passwordInput() {
        loginUploaderPage.passwordInput(ConfProperties.getProperty("password"));
    }

    @Step("Нажать кнопку \"Вход\"")
    public void clickLoginButton() {
        loginUploaderPage.clickLoginButton();
    }

    @Step("Войти в ЛК Паблишера")
    public void login() {
        loginUploaderPage.login(ConfProperties.getProperty("phone"),
            ConfProperties.getProperty("password"));
    }

    @Step("Нажать вкладку \"Задания\"")
    public void clickTasks() {
        lkUploaderPage.clickTasks();
    }

    @Step("Нажать вкладку \"Рефералы\"")
    public void clickReferrals() {
        lkUploaderPage.clickReferrals();
    }

    @Step("Нажать вкладку \"Вывести средства\"")
    public void clickWithdrawal() {
        lkUploaderPage.clickWithdrawal();
    }

    @Step("Выбрать вкладку \"История вывода средств\"")
    public void clickWithdrawalHistory() {
        lkUploaderPage.getWithdrawalHistoryTabs().get(0).click();
    }

    @Step("Выбрать вкладку \"История начислений\"")
    public void clickDepositHistory() {
        lkUploaderPage.getWithdrawalHistoryTabs().get(1).click();
    }

    @Step("Нажать на изображение (аватарку)")
    public void clickAvatar() {
        lkUploaderPage.clickUserAvatar();
    }

    @Step("Нажать на редактирование (\"карандаш\")")
    public void clickEditProfile() {
        lkUploaderPage.clickEditProfileButton();
    }

    @Step("Закрыть сайдбар")
    public void clickCloseSidebar() {
        lkUploaderPage.clickCloseSidebarButton();
    }

    @Step("Проверить заполненные данные")
    public List<String> getProfileData() {
        return lkUploaderPage.getProfileData();
    }

    @Step("Ввести значение в поле \"Фамилия\"")
    public void surnameInput(String surname) {
        lkUploaderPage.surnameInput(surname);
    }

    @Step("Ввести значение в поле \"Имя\"")
    public void nameInput(String name) {
        lkUploaderPage.nameInput(name);
    }

    @Step("Ввести значение в поле \"E-mail\"")
    public void emailInput(String email) {
        lkUploaderPage.emailInput(email);
    }

    @Step("Нажать \"Изменить пароль\"")
    public void clickEditPasswordButton() {
        lkUploaderPage.clickEditPasswordButton();
    }

    @Step("Ввести значение в поле \"Пароль\"")
    public void editPasswordInput(String password) {
        lkUploaderPage.passwordInput(password);
    }

    @Step("Нажать кнопку \"Сохранить\"")
    public void clickSaveButton() {
        lkUploaderPage.clickSaveButton();
    }


}
