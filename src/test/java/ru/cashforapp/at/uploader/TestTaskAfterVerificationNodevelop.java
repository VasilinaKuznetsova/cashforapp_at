package ru.cashforapp.at.uploader;


import io.qameta.allure.TmsLink;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTaskAfterVerificationNodevelop extends AbstractTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test(description = "Паблишер: Прохождение задачи до конца")
    @TmsLink("CFA-729")
    public void processTaskTest() {

        actionStep.openLoginPage();
        actionStep.login();
        assertionStep.assertThatActualAccountEqualExpectedAccount("User_12");

    }

}
