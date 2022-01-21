package ru.cashforapp.at.appmanager.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertionStep extends AbstractStep {

    public AssertionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Вход прошел успешно")
    public void assertThatActualAccountEqualExpectedAccount(String expectedText) {
        assertThat(loginAppmanagerPage.getDashboardTitles())
                .as("Личный кабинет не открылся")
                .hasSizeGreaterThan(0);
        assertThat(loginAppmanagerPage.getActualLoginText()).containsIgnoringCase(expectedText);
    }

    @Step("Доступны подразделы: \"Изменить профиль\", \"Изменить пароль\"")
    public void assertThatEditProfileIsAvailable() {
        assertThat(lkAppmanagerPage.getEditProfileCard())
                .as("Подраздел \"Изменить профиль\" не открылся")
                .hasSizeGreaterThan(0);
        assertThat(lkAppmanagerPage.getEditPasswordCard())
                .as("Подраздел \"Изменить пароль\" не открылся")
                .hasSizeGreaterThan(0);
    }

    @Step("Фото отобразилось")
    public void assertThatNewAvatarImageIsAvailable() {
        assertThat(lkAppmanagerPage.getAvatarImage())
                .as("Фото не отобразилось")
                .hasSizeGreaterThan(0);
    }

    @Step("Поле \"Фамилия\" отредактировалось")
    public void assertThatActualSurnameEqualExpectedSurname(String expectedText) {
        assertThat(lkAppmanagerPage.getSurname()).containsIgnoringCase(expectedText);
    }


}
