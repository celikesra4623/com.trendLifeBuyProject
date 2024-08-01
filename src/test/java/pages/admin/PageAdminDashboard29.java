package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageAdminDashboard29 {

    public PageAdminDashboard29(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//img[@id='profile_pic']")
    public WebElement profilePictureAdmin;

    @FindBy (xpath = "//input[@placeholder='Search']")
    public WebElement searchTextBoxDashboard;

    @FindBy (xpath = "(//i[@class='ti-menu'])[2]")
    public WebElement iconMenüDashboard;

    @FindBy (xpath = "//span[text()='Dashboard']")
    public WebElement textBoxDashboard;

    @FindBy (xpath = "(//span[@class='menu_seperator'])[1]")
    public WebElement menuseperatorDashboard;

    @FindBy (xpath = "//a[@class='primary-btn white mr-10 tab_hide']")
    public WebElement buttonWebsite;

    @FindBy (xpath = "//a[@data-type='today']")
    public WebElement buttonToday;

    @FindBy (xpath = "//h1[contains(@class,'total_visitors')]")
    public WebElement totalVisitor;

    @FindBy (xpath = "//a[@data-type='week']")
    public WebElement buttonThisWeek;

    @FindBy (xpath = "//a[@data-type='month']")
    public WebElement buttonThisMonth;

    @FindBy (xpath = "//a[@data-type='year']")
    public WebElement buttonThisYear;

    @FindBy (xpath = "//h3[text()='Visitor']")
    public WebElement buttonVisitor;

    @FindBy (xpath = "//div[@class='main-title d-md-flex']")
    public WebElement titleVisitorReport;

    @FindBy (xpath = "//h3[text()='Total Order']")
    public WebElement buttonTotalOrder;

    @FindBy (xpath = "//h3[text()='Total Pending Order']")
    public WebElement buttonTotalPendingOrder;

    @FindBy (xpath = "//h3[text()='Total Pending Order']")
    public WebElement buttonTotalCompletedOrder;

    @FindBy (xpath = "//h3[text()='Total Sale']")
    public WebElement buttonTotalSale;

    @FindBy (xpath = "//h3[text()='Total Review']")
    public WebElement buttonTotalReview;

    @FindBy (xpath = "//h3[text()='Today Revenue']")
    public WebElement buttonTodayRevenue;

    @FindBy (xpath = "//h3[text()='Active Customer']")
    public WebElement buttonActiveCustomer;

    @FindBy (xpath = "//h3[text()='Total Subscriber']")
    public WebElement buttonTotalSubscriber;

    @FindBy (xpath = "//h3[text()='Subscriber List']")
    public WebElement titleSubscriberList;


}
