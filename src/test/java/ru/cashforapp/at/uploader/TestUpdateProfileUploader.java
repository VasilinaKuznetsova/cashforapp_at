package ru.cashforapp.at.uploader;


import io.qameta.allure.TmsLink;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

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
        assertionStep.assertThatActualAccountEqualExpectedAccount("User_12");

        actionStep.clickAvatar();
        assertionStep.assertThatSidebarIsAvailable();

        actionStep.clickEditProfile();
        actionStep.clickCloseSidebar();
        assertionStep.assertThatProfileTitleEqualExpectedText("Редактирование профиля");
        List<String> profileData = actionStep.getProfileData();
//      Добавить шаг "Нажать кнопку "Загрузить фото""

        actionStep.surnameInput("Тестовая");
        actionStep.nameInput("Тест");
        actionStep.emailInput("Testnew@gmail.com");
//      Добавить проверки "Справа от поля отобразилась надпись "Вы изменили "старое значение" на  "новое значение""

        actionStep.clickEditPasswordButton();
        actionStep.editPasswordInput("Makeapp_2021");
        actionStep.clickSaveButton();
        assertionStep.assertThatNotificationMessageIsAvailable();

    }

}
