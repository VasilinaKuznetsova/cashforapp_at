package ru.cashforapp.at.steps;

import static org.assertj.core.api.Assertions.assertThat;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class AssertionStep extends AbstractStep {

    public AssertionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Account should be equal to '{expectedText}'")
    public void assertThatActualAccountEqualExpectedAccount(String expectedText) {
        assertThat(loginPage.getActualLoginText()).isEqualTo(expectedText);
    }
}
