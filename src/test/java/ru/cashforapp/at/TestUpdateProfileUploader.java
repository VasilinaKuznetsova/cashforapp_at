package ru.cashforapp.at;


import io.qameta.allure.TmsLink;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestUpdateProfileUploader extends AbstractTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test(description = "Паблишер: Редактирование профиля")
    @TmsLink("CFA-582")
    public void updateProfileTest() {

        actionStep.openLoginPage();
        actionStep.login();
        assertionStep.assertThatActualAccountEqualExpectedAccount("User");


    }

}
