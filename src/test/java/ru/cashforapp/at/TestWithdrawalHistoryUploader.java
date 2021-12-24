package ru.cashforapp.at;


import io.qameta.allure.TmsLink;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWithdrawalHistoryUploader extends AbstractTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test(description = "Паблишер: История вывода")
    @TmsLink("CFA-584")
    public void withdrawalHistoryTest() {

        actionStep.openLoginPage();
        actionStep.login();
        assertionStep.assertThatActualAccountEqualExpectedAccount("User");

        actionStep.clickWithdrawal();
        assertionStep.assertThatWithdrawalTabIsAvailable();
        assertionStep.assertThatWithdrawalTabTitleEqualExpectedText(0,"История вывода средств");
        assertionStep.assertThatWithdrawalTabTitleEqualExpectedText(1,"История начислений");

        actionStep.clickWithdrawalHistory();
        assertionStep.assertThatWithdrawalCardsIsAvailable();

    }

}
