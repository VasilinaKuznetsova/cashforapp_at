package ru.cashforapp.at;


import io.qameta.allure.TmsLink;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginUploader extends AbstractTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test(description = "Паблишер: Логин")
    @TmsLink("CFA-579")
    public void loginTest() {

        actionStep.openLoginPage();
        actionStep.phoneInput();
        actionStep.passwordInput();
        actionStep.clickLoginButton();
        assertionStep.assertThatActualAccountEqualExpectedAccount("User");

        actionStep.clickTasks();
        assertionStep.assertThatTabTitleEqualExpectedText("Задания");
        assertionStep.assertThatTaskCardsIsAvailable();

        actionStep.clickReferrals();
        assertionStep.assertThatTabTitleEqualExpectedText("Промокод");
        assertionStep.assertThatCodeIsAvailable();
        assertionStep.assertThatCodeCopyButtonIsClickable();

        actionStep.clickWithdrawal();
        assertionStep.assertThatWithdrawalTabIsAvailable();
        assertionStep.assertThatWithdrawalTabTitleEqualExpectedText(0,"История вывода средств");
        assertionStep.assertThatWithdrawalTabTitleEqualExpectedText(1,"История начислений");

    }

}
