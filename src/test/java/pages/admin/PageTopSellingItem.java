package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PageTopSellingItem {

    public PageTopSellingItem() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "visitorTable")
    public WebElement tableTopSellingItem;

    @FindBy(xpath = "//h3[text()='Top selling item']")
    public WebElement titleTopSellingItem;

    @FindAll({@FindBy(xpath = "//thead//tr//th")})
    public List<WebElement> titleListTable;

    @FindBy(xpath = "((//tbody//tr)[1]//td)[1]")
    public WebElement columnValueListNumber;

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

    @FindBy(xpath = "(//a[@aria-controls='visitorTable'])[last()-1]")
    public WebElement lastPagination;
}
