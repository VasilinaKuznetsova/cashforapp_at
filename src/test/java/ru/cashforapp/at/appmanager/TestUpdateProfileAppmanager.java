package ru.cashforapp.at.appmanager;


import io.qameta.allure.TmsLink;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestUpdateProfileAppmanager extends AbstractTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test(description = "Аппменеджер: Редактирование профиля")
    @TmsLink("CFA-968")
    public void updateProfileTest() {

        actionStep.openLoginPage();
        actionStep.login("+79655422601","Makeapp_2020");
        assertionStep.assertThatActualAccountEqualExpectedAccount("AppManager");

        actionStep.clickProfile();
        assertionStep.assertThatEditProfileIsAvailable();

        actionStep.inputAvatar();
        actionStep.clickSaveAvatarButton();
        assertionStep.assertThatNewAvatarImageIsAvailable();

        actionStep.inputSurname("Test");
        actionStep.inputName("Test");
        actionStep.inputEmail("Appmanager@mail.ru");
        actionStep.clickSaveProfileButton();
        assertionStep.assertThatActualSurnameEqualExpectedSurname("Test");
        assertionStep.assertThatActualAccountEqualExpectedAccount("Test");

//        actionStep.clickLoginButton();


    }

}
