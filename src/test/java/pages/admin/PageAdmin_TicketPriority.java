package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageAdmin_TicketPriority {

    public PageAdmin_TicketPriority(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id=\"sidebar_menu\"]/li[17]/a/div[2]/span")
    public WebElement ddmSupportTicket;

    @FindBy (xpath = "//*[@id=\"sidebar_menu\"]/li[17]/ul/li[3]/a")
    public WebElement ddmPriorityLink;

    @FindBy (id = "name")
    public WebElement fieldsNamePriority;
    @FindBy (xpath = "//*[@id=\"theme_nav\"]/li[1]/label/span")
    public WebElement radioCheckboxActive;

    @FindBy (xpath = "//*[@id=\"theme_nav\"]/li[2]/label/span")
    public WebElement radioCheckboxInactive;

    @FindBy (xpath = "//*[@id=\"submit_btn\"]")
    public WebElement buttonSavePriority;

    @FindBy (xpath = "//*[@id=\"sku_tbody\"]/tr[1]/td[3]/label/div")
    public WebElement checkBoxStatus;

    @FindBy (xpath = "(//*[@id=\"dropdownMenu2\"])[1]")
    public WebElement buttonDDMSelect;

    @FindBy (xpath = "//*[@id=\"sku_tbody\"]/tr[1]/td[4]/div/div/a[1]")
    public WebElement buttonDDMSelect_EDIT;

    @FindBy (xpath = "//*[@id=\"sku_tbody\"]/tr[1]/td[4]/div/div/a[2]")
    public WebElement buttonDDMSelect_DELETE;

    @FindBy (xpath = "//*[@id=\"form_div\"]/div[1]/div/div/h3")
    public WebElement pageEdit_DDMSelect;

    @FindBy (xpath = "//*[@id=\"deleteItemModal\"]/div/div/div[1]/h4")
    public WebElement pageDelete_DDMSelect;

    @FindBy (xpath = "//*[@id=\"dataDeleteBtn\"]")
    public WebElement buttonDelete_PageDelete_DDMSelect;

    @FindBy (xpath = "//*[@id=\"dataDeleteBtn\"]")
    public WebElement buttonUPDATE_PageDEdit_DDMSelect;

    @FindBy (xpath = "//input[@class=\"primary_input_field\"]")
    public WebElement fieldName_EditDDMSelect;


}
