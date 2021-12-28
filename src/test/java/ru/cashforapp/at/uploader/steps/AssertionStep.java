package ru.cashforapp.at.uploader.steps;

import static org.assertj.core.api.Assertions.assertThat;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class AssertionStep extends AbstractStep {

    public AssertionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Вход прошел успешно")
    public void assertThatActualAccountEqualExpectedAccount(String expectedText) {
        assertThat(lkUploaderPage.getDashboardTitles())
                .as("Личный кабинет не открылся")
                .hasSizeGreaterThan(0);
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
        assertThat(lkUploaderPage.codeCopyButtonIsClickable()).isTrue();
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
        assertThat(lkUploaderPage.getDateIdWithdrawalHistoryCards())
            .as("Дата и id вывода не найдены")
            .hasSizeGreaterThan(0);

        assertThat(lkUploaderPage.getAmountPurseWithdrawalHistoryCards())
            .as("Сумма вывода и счет зачисления не найдены")
            .hasSizeGreaterThan(0);
    }

    @Step("Отображаются карточки с данными о начислении")
    public void assertThatDepositCardsIsAvailable() {
        assertThat(lkUploaderPage.getDepositHistoryCards())
            .as("Карточки с данными о начислении не найдены")
            .hasSizeGreaterThan(0);
        assertThat(lkUploaderPage.getDateIdDepositHistoryCards())
            .as("Дата и id начисления не найдены")
            .hasSizeGreaterThan(0);

        assertThat(lkUploaderPage.getAmountPurseDepositHistoryCards())
            .as("Тип и сумма начисления не найдены")
            .hasSizeGreaterThan(0);
    }

    @Step("Откроется сайдбар в левой части страницы")
    public void assertThatSidebarIsAvailable() {
        assertThat(lkUploaderPage.getUserSidebar())
                .as("Сайдбар не найден")
                .hasSizeGreaterThan(0);
    }

    @Step("Откроется страница \"Редактирование профиля\"")
    public void assertThatProfileTitleEqualExpectedText(String expectedText) {
        assertThat(lkUploaderPage.getDashboardTitleText()).isEqualTo(expectedText);
    }

    @Step("Появилось сообщение \"Данные профиля обновлены\"")
    public void assertThatNotificationMessageIsAvailable() {
        assertThat(lkUploaderPage.getNotificationMessage())
                .as("Сообщение не найдено")
                .hasSizeGreaterThan(0);
    }


//- Все отредактированные значения изменены на странице
//- Все отредактированные значения изменены в сайдбаре
//- Все отредактированные значения изменены в правом верхнем углу


}
