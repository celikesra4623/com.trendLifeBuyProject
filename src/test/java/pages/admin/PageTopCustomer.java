package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PageTopCustomer {
    public PageTopCustomer() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "sidebar")
    public WebElement sideBar;

    @FindBy(xpath = "//span[text()='Admin Reports']")
    public WebElement dropDownAdminReports;

    @FindBy(xpath = "//a[text()='Top Customers']")
    public WebElement itemTopCustomer;

    @FindBy(xpath = "//h3[text()='Top Customers']")
    public WebElement titleTopCustomerTable;

    @FindAll({@FindBy(xpath = "//thead//tr//th")})
    public List<WebElement> titleListTable;

    @FindBy(xpath = "((//tbody//tr)[1]//td)[5]")
    public WebElement columnValueSpentTime;

    @FindAll({@FindBy(xpath = "((//tbody//tr)[1]//td)")})
    public List<WebElement> rowFirstValues;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement fieldQuickSearch;

    @FindBy(id = "visitorTable_info")
    public WebElement labelTableInfo;

    @FindBy(xpath = "//a[contains(@class,'paginate_button previous')]")
    public WebElement buttonPreviousPagination;

    @FindBy(xpath = "//a[contains(@class,'paginate_button next')]")
    public WebElement buttonNextPagination;

    //[last()]
    @FindBy(xpath = "(//a[@aria-controls='visitorTable'])[last()-1]")
    public WebElement lastPagination;

}
