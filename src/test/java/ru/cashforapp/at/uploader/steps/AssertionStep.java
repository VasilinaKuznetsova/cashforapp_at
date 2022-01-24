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
        assertThat(loginUploaderPage.getActualLoginText()).containsIgnoringCase(expectedText);
//        assertThat(loginUploaderPage.getActualLoginText()).isEqualTo(expectedText);
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

    @Step("Пункт выделен голубым цветом")
    public void assertThatMcButtonIsActive() {
        assertThat(lkUploaderPage.getMcActiveButton())
            .as("Пункт не выделен голубым цветом")
            .hasSizeGreaterThan(0);
    }

    @Step("Успешный вывод средств. Появилось сообщение \"Заявка на вывод средств отправлена в обработку\"")
    public void assertThatNotificationPayoutMessageIsAvailable() {
        assertThat(lkUploaderPage.getNotificationMessage())
            .as("Сообщение не найдено")
            .hasSizeGreaterThan(0);
    }

    @Step("В \"Истории вывода средств\" появилась карточка с данными о выполненном выводе")
    public void assertThatNewWithdrawalCardIsAvailable() {
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

    @Step("Появилось всплывающее окно")
    public void assertThatModalWindowIsAvailable() {
        assertThat(lkUploaderPage.getStartTaskButton())
            .as("Всплывающее окно не найдено")
            .hasSizeGreaterThan(0);
    }

    @Step("Задача взята в работу")
    public void assertThatTaskInProcess() {
        assertThat(lkUploaderPage.getGuideContent())
            .as("Задача не взята в работу")
            .hasSizeGreaterThan(0);
    }

    @Step("Появился таймер на выполнение задачи")
    public void assertThatTimerIsAvailable() {
        assertThat(lkUploaderPage.getTimer())
            .as("Таймер на выполнение задачи не появился")
            .hasSizeGreaterThan(0);
    }

    @Step("Доступна кнопка \"Далее\"")
    public void assertThatNextButtonIsAvailable() {
        assertThat(lkUploaderPage.getNextButton())
            .as("Кнопка \"Далее\" не доступна")
            .hasSizeGreaterThan(0);
    }

    @Step("На вкладке \"Задания\" отображается карточка взятого в работу задания")
    public void assertThatProcessTaskCardsIsAvailable() {
        assertThat(lkUploaderPage.getTaskCards())
            .as("Задания не найдены на странице")
            .hasSizeGreaterThan(0);
    }

    @Step("На карточке отображается таймер до окончания задания")
    public void assertThatTaskCardTimerIsAvailable() {
        assertThat(lkUploaderPage.getTimer())
            .as("Таймер на выполнение задачи не появился")
            .hasSizeGreaterThan(0);
    }

    @Step("На карточке отображается надпись \"Идет выполнение задания...\"")
    public void assertThatTaskCardTextIsAvailable() {
        assertThat(lkUploaderPage.getTaskCardText())
            .as("Надпись на карточке задачи не появилась")
            .hasSizeGreaterThan(0);
    }


}
