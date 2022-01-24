package ru.cashforapp.at.uploader;


import io.qameta.allure.TmsLink;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTaskBeforeVerificationNodevelop extends AbstractTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test(description = "Паблишер: Прохождение задачи до верификации")
    @TmsLink("CFA-730")
    public void processTaskTest() {

        actionStep.openLoginPage();
        actionStep.login();
        assertionStep.assertThatActualAccountEqualExpectedAccount("User_92114");

        actionStep.clickContinueTaskButton();
        assertionStep.assertThatTaskInProcess();
        assertionStep.assertThatTimerIsAvailable();
        assertionStep.assertThatNextButtonIsAvailable();


    }

}
