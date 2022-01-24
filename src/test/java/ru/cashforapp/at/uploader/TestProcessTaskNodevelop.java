package ru.cashforapp.at.uploader;


import io.qameta.allure.TmsLink;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestProcessTaskNodevelop extends AbstractTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test(description = "Паблишер: Взятие задачи на публикацию в работу")
    @TmsLink("CFA-631")
    public void processTaskTest() {

        actionStep.openLoginPage();
        actionStep.login();
        assertionStep.assertThatActualAccountEqualExpectedAccount("User_92114");

        actionStep.clickStartTaskButton();
        assertionStep.assertThatModalWindowIsAvailable();

        actionStep.clickStartTaskModalButton();
        assertionStep.assertThatTaskInProcess();
        assertionStep.assertThatTimerIsAvailable();
        assertionStep.assertThatNextButtonIsAvailable();

        actionStep.clickCloseGuide();
        assertionStep.assertThatProcessTaskCardsIsAvailable();
        assertionStep.assertThatTaskCardTextIsAvailable();

    }

}
