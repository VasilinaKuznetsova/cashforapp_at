package ru.cashforapp.at.appmanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.cashforapp.at.appmanager.steps.ActionStep;
import ru.cashforapp.at.appmanager.steps.AssertionStep;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    protected WebDriver driver;

    protected ActionStep actionStep;
    protected AssertionStep assertionStep;

    @BeforeSuite
    public void beforeSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);
        actionStep = new ActionStep(driver);
        assertionStep = new AssertionStep(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
