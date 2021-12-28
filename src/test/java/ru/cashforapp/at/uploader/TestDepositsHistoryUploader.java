package ru.cashforapp.at.uploader;


import io.qameta.allure.TmsLink;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDepositsHistoryUploader extends AbstractTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test(description = "Паблишер: История начислений")
    @TmsLink("CFA-585")
    public void depositsHistoryTest() {

        actionStep.openLoginPage();
        actionStep.login();
        assertionStep.assertThatActualAccountEqualExpectedAccount("User_12");

        actionStep.clickWithdrawal();
        assertionStep.assertThatWithdrawalTabIsAvailable();
        assertionStep.assertThatWithdrawalTabTitleEqualExpectedText(0,"История вывода средств");
        assertionStep.assertThatWithdrawalTabTitleEqualExpectedText(1,"История начислений");

        actionStep.clickDepositHistory();
        assertionStep.assertThatDepositCardsIsAvailable();

    }

}
