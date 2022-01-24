package ru.cashforapp.at.appmanager;


import io.qameta.allure.TmsLink;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginAppmanager extends AbstractTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test(description = "Аппменеджер: Логин")
    @TmsLink("CFA-")
    public void loginTest() {

        actionStep.openLoginPage();
        actionStep.phoneInput("+79655422601");
        actionStep.passwordInput("Makeapp_2020");
        actionStep.clickLoginButton();
        assertionStep.assertThatActualAccountEqualExpectedAccount("AppManager");

    }

}
