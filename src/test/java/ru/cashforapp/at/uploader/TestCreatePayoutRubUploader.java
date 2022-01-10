package ru.cashforapp.at.uploader;


import io.qameta.allure.TmsLink;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCreatePayoutRubUploader extends AbstractTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test(description = "Паблишер: Вывод средств")
    @TmsLink("CFA-583")
    public void createPayoutRubTest() {

        actionStep.openLoginPage();
        actionStep.login();
        assertionStep.assertThatActualAccountEqualExpectedAccount("User_12");

        actionStep.clickWithdrawal();
        assertionStep.assertThatWithdrawalTabIsAvailable();
        assertionStep.assertThatWithdrawalTabTitleEqualExpectedText(0,"История вывода средств");
        assertionStep.assertThatWithdrawalTabTitleEqualExpectedText(1,"История начислений");

        actionStep.amountInput("10");
        actionStep.clickMcButton();
        assertionStep.assertThatMcButtonIsActive();

        actionStep.payoutPurseInput("90000000000");
        actionStep.clickPayoutButton();
        assertionStep.assertThatNotificationPayoutMessageIsAvailable();


    }

}
