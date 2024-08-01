package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageProductStock {

    public PageProductStock() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@class='primary_input_label']")
    public WebElement labelType;

    @FindBy(xpath = "//div[@class='nice-select primary_select mb-15']")
    public WebElement buttonType;

    @FindBy(xpath = "//button[@id='save_button_parent']")
    public WebElement buttonSearch;

    @FindBy(xpath = "(//input[@class='nice-select-search'])[2]")
    public WebElement fieldSearch;

    @FindBy(xpath = "//li[text()='Select One']")
    public WebElement buttonSelectOne;

    @FindBy(xpath = "//*[@class='option selected focus']")
    public WebElement buttonAllProductList;

    @FindBy(xpath = "//span[text()='Select One']")
    public WebElement buttonCurrentSelectOneType;

    @FindBy(xpath = "(//span[@class='current'])[2]")
    public WebElement buttonCurrentAllProductListType;

    @FindBy(xpath = "//h3[text()='Product stock (All)']")
    public WebElement labelProductStockAll;

    @FindBy(xpath = "(//td[text()='Digital Product'])[1]")
    public WebElement DigitalProduct;

}
