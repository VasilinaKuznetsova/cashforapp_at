package ru.cashforapp.at;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.cashforapp.at.pages.LoginPage;
import ru.cashforapp.at.utils.ConfProperties;

public class TestLogin extends AbstractTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test(description = "Login in lk.cashforapp.net")
    public void loginTest() {

        actionStep.openLoginPage();
        actionStep.login();
        actionStep.closeModalClose();
        assertionStep.assertThatActualAccountEqualExpectedAccount("User_12");


    }

}
