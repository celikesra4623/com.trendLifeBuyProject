package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PageContactRequest {


    public PageContactRequest() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Contact Request']")
    public WebElement linkContactRequest;
    @FindBy(xpath = "//*[text()='Contact Mail']")
    public WebElement linkContactMail;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement fieldQuickSearchBox;
    @FindBy(id = "dropdownMenu2")
    public WebElement buttonSelect;
    @FindBy(xpath = "(//*[text()='Show'])[1]")
    public WebElement linkShow;
    @FindBy(xpath = "(//*[text()='Delete'])[1]")
    public WebElement linkDelete;
    @FindAll({@FindBy(xpath = "//tbody//tr")})
    public List<WebElement> rowListContactMail;
    @FindAll({@FindBy(xpath = "//thead//tr//th")})
    public List<WebElement> columnListContactMail;
    @FindAll({@FindBy(xpath = "//tbody//tr//td")})
    public List<WebElement> dataListContactMail;
    @FindBy(xpath = "(//tbody//tr//td)[4]")
    public WebElement dataforDelete;
    @FindBy(xpath = "//input[@id='dataDeleteBtn']")
    public WebElement buttonDataDelete;
    @FindBy(xpath = "(//tbody//tr//td)[2]")
    public WebElement textName;
    @FindBy(xpath = "(//tbody//tr//td)[3]")
    public WebElement textEmail;
    @FindBy(xpath = "(//tbody//tr//td)[4]")
    public WebElement textMessage;
    @FindBy(xpath = "(//div[@class='name'])[1]")
    public WebElement detailsName;
    @FindBy(xpath = "(//div[@class='name'])[2]")
    public WebElement detailsEmail;
    @FindBy(xpath = "(//div[@class='name'])[3]")
    public WebElement detailsMessage;
}
