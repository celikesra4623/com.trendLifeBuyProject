package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageAdminDashboard {

    public PageAdminDashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Marketing']")
    public WebElement dropDownMarketing;

    @FindBy(xpath = "//*[text()='Wallet Manage']")
    public WebElement dropDownWalletManege;

    @FindBy(xpath = "//*[text()='Admin Reports']")
    public WebElement dropDownAdminReports;

    @FindBy(xpath = "//span[text()='Support Ticket']")
    public WebElement dropDownSupportTicket;

    @FindBy(xpath = "//span[text()='All Activity Logs']")
    public WebElement dropDownAllActivityLogs;

    @FindBy(xpath = "//a[text()='Login Activity']")
    public WebElement dropDownLoginActivity;

    @FindBy(xpath = "//a[text()='Clean All']")
    public WebElement buttonCleanAll;

    @FindBy(xpath = "//input[@value='Delete']")
    public WebElement buttonDeleteActivity;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement toastSuccess;

    @FindBy(xpath ="//th[text()='User']")
    public WebElement headingUser;

    @FindBy(xpath ="//th[text()='Login At']")
    public WebElement headingLoginAt;

    @FindBy(xpath ="//th[text()='Logout At']")
    public WebElement headingLogoutAt;

    @FindBy(xpath ="//th[text()='IP']")
    public WebElement headingIp;

    @FindBy(xpath ="//th[text()='Agent']")
    public WebElement headingAgent;

    @FindBy(xpath ="//th[text()='Description']")
    public WebElement headingDescription;

    @FindBy(xpath ="//input[@placeholder='Quick Search']")
    public WebElement inputQuickSearch;

    @FindBy(xpath = "//a[text()='Activity']")
    public WebElement dropDownActivity;

    @FindBy(xpath = "//a[@class='paginate_button next']")
    public WebElement buttonNextPage;

    @FindBy(xpath = "//td[text()='11']")
    public WebElement element11;

    @FindBy(xpath = "//*[@id='loginLogoutDataTable']/tbody/tr[1]/td[2]")
    public WebElement element1User;






















}
