package ru.cashforapp.at.pages.uploader;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LKUploaderPage extends AbstractBasePage {

    @FindBy(xpath = "//*[@class='user-data__info']/h5")
    private WebElement userDataInfo;

    @FindBy(css = "[href='/available-tasks']")
    private WebElement tasksButton;

    @FindBy(xpath = "//*[contains(@class, 'ui-kit dashboard__title')]")
    private WebElement dashboardTitle;

    @FindBy(xpath = "//*[contains(@class, 'ui-kit dashboard__title')]")
    private List<WebElement> dashboardTitles;

    @FindBy(xpath = "//*[contains(@class, 'task-preview-card')]")
    private List<WebElement> taskCards;

    @FindBy(css = "[href='/referrals']")
    private WebElement referralsButton;

    @FindBy(xpath = "//*[contains(@class, 'referral-card')]")
    private List<WebElement> referralCodeCards;

    @FindBy(xpath = "//*[contains(@class, 'referrals__main-card-btn')]")
    private WebElement referralCodeCopyButton;

    @FindBy(css = "[href='/withdrawal']")
    private WebElement withdrawalButton;

    @FindBy(xpath = "//*[contains(@class, 'payment-form-wrap')]")
    private List<WebElement> withdrawalForm;

    @FindBy(xpath = "//*[@class='transactions-history__tabs']//h3")
    private List<WebElement> withdrawalHistoryTabs;

    @FindBy(xpath = "//*[contains(@class, 'payment-history-item')]")
    private List<WebElement> withdrawalHistoryCards;

    @FindBy(xpath = "//*[contains(@class, 'history-date-id')]")
    private List<WebElement> dateIdWithdrawalHistoryCards;

    @FindBy(xpath = "//*[contains(@class, 'history-item-count')]")
    private List<WebElement> amountPurseWithdrawalHistoryCards;

    @FindBy(xpath = "//*[contains(@class, 'accruals-history-item')]")
    private List<WebElement> depositHistoryCards;

    @FindBy(xpath = "//*[contains(@class, 'accruals-history-item__meta')]")
    private List<WebElement> dateIdDepositHistoryCards;

    @FindBy(xpath = "//*[contains(@class, 'accruals-history-item__body')]")
    private List<WebElement> amountPurseDepositHistoryCards;

    @FindBy(xpath = "//*[contains(@class, 'user-data__avatar')]")
    private WebElement userAvatar;

    @FindBy(xpath = "//*[contains(@class, 'user-sidebar')]")
    private List<WebElement> userSidebar;

    @FindBy(xpath = "//*[contains(@class, 'user-sidebar__personal-edit-btn')]")
    private WebElement editProfileButton;

    @FindBy(xpath = "//*[contains(@class, 'user-sidebar__close-btn')]")
    private WebElement closeSidebarButton;

    @FindBy(xpath = "//*[contains(@class, 'form-control__container')]/input")
    private List<WebElement> profileInputs;

    @FindBy(xpath = "//*[contains(@class, 'user-profile__form-password-btn')]")
    private WebElement editPasswordButton;

    @FindBy(xpath = "//*[@id='id-password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@value='Сохранить']")
    private WebElement saveButton;

    @FindBy(xpath = "//*[contains(@class, 'ant-notification-notice-message')]")
    private List<WebElement> notificationMessage;


    public LKUploaderPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        open("/available-tasks");
    }

    public void clickReferrals() {
        referralsButton.click();
    }

    public void clickTasks() {
        tasksButton.click();
    }

    public void clickWithdrawal() {
        withdrawalButton.click();
    }

    public String getActualLoginText() {
        return userDataInfo.getText();
    }

    public String getDashboardTitleText() {
        return dashboardTitle.getText();
    }

    public List<String> getDashboardTitles() {
        return dashboardTitles
            .stream()
            .map(WebElement::getText)
            .collect(Collectors.toList());
    }

    public List<WebElement> getTaskCards() {
        return taskCards;
    }

    public List<WebElement> getReferralsCodeCards() {
        return referralCodeCards;
    }

    public boolean codeCopyButtonIsClickable() {
        return isClickable(referralCodeCopyButton);
    }

    public List<WebElement> getWithdrawalForm() {
        return withdrawalForm;
    }

    public List<WebElement> getWithdrawalHistoryTabs() {
        return withdrawalHistoryTabs;
    }

    public List<WebElement> getWithdrawalHistoryCards() {
        return withdrawalHistoryCards;
    }

    public List<WebElement> getDateIdWithdrawalHistoryCards() {
        return dateIdWithdrawalHistoryCards;
    }

    public List<WebElement> getAmountPurseWithdrawalHistoryCards() {
        return amountPurseWithdrawalHistoryCards;
    }

    public List<WebElement> getDepositHistoryCards() {
        return depositHistoryCards;
    }

    public List<WebElement> getDateIdDepositHistoryCards() {
        return dateIdDepositHistoryCards;
    }

    public List<WebElement> getAmountPurseDepositHistoryCards() {
        return amountPurseDepositHistoryCards;
    }

    public void clickUserAvatar() {
        userAvatar.click();
    }

    public List<WebElement> getUserSidebar() {
        return userSidebar;
    }

    public void clickEditProfileButton() {
        editProfileButton.click();
    }

    public void clickCloseSidebarButton() {
        closeSidebarButton.click();
    }

    public List<String> getProfileData() {
        return profileInputs
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public void surnameInput(String surname) {
        profileInputs.get(0).clear();
        profileInputs.get(0).sendKeys(surname);
    }

    public void nameInput(String name) {
        profileInputs.get(1).clear();
        profileInputs.get(1).sendKeys(name);
    }

    public void emailInput(String email) {
        profileInputs.get(3).clear();
        profileInputs.get(3).sendKeys(email);
    }

    public void clickEditPasswordButton() {
        editPasswordButton.click();
    }

    public void passwordInput(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public List<WebElement> getNotificationMessage() {
        return notificationMessage;
    }


}
