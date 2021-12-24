package ru.cashforapp.at.steps;

import static org.assertj.core.api.Assertions.assertThat;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class AssertionStep extends AbstractStep {

    public AssertionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Вход прошел успешно")
    public void assertThatActualAccountEqualExpectedAccount(String expectedText) {
        assertThat(loginUploaderPage.getActualLoginText()).isEqualTo(expectedText);
    }

    @Step("Вкладка '{expectedText}' доступна")
    public void assertThatTabTitleEqualExpectedText(String expectedText) {
        assertThat(loginUploaderPage.getDashboardTitleText()).isEqualTo(expectedText);
    }

    @Step("Вкладка '{expectedText}' доступна new")
    public void assertThatTabIsAvailable() {
        assertThat(lkUploaderPage.getDashboardTitles())
            .as("Вкладка не найдена")
            .hasSizeGreaterThan(0);
    }

    @Step("На странице отображаются задания")
    public void assertThatTaskCardsIsAvailable() {
        assertThat(lkUploaderPage.getTaskCards())
            .as("Задания не найдены на странице")
            .hasSizeGreaterThan(0);
    }

    @Step("На странице отображается Промокод")
    public void assertThatCodeIsAvailable() {
        assertThat(lkUploaderPage.getReferralsCodeCards())
            .as("Промокод не найден на странице")
            .hasSizeGreaterThan(0);
    }

    @Step("Кнопка Скопировать активна")
    public void assertThatCodeCopyButtonIsClickable() {
        assertThat(lkUploaderPage.сodeCopyButtonIsClickable()).isTrue();
    }

    @Step("Вкладка доступна. На странице отображается форма вывода средств")
    public void assertThatWithdrawalTabIsAvailable() {
        assertThat(lkUploaderPage.getWithdrawalForm())
            .as("Вкладка не найдена")
            .hasSizeGreaterThan(0);
    }

    @Step("Вкладка '{expectedText}' доступна")
    public void assertThatWithdrawalTabTitleEqualExpectedText(int index, String expectedText) {
        assertThat(lkUploaderPage.getWithdrawalHistoryTabs().get(index).getText()).isEqualTo(expectedText);
    }

    @Step("Отображаются карточки с данными о выводах")
    public void assertThatWithdrawalCardsIsAvailable() {
        assertThat(lkUploaderPage.getWithdrawalHistoryCards())
            .as("Карточки с данными о выводах не найдены")
            .hasSizeGreaterThan(0);

        //            - Отображаются карточки с данными о выводах:
        //            - дата
        //            - id транзакции
        //            - сумма вывода (с валютой)
        //            - тип счета зачисления
        //            - счет зачисления
    }

}
