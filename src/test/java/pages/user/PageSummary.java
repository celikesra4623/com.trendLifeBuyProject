package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageSummary {
    public PageSummary() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h4[text()='Order summary']")
    public WebElement labelSummary;

    @FindBy(xpath = "//div[@class='summery_pro_content']//h4")
    public WebElement titleProduct;

    @FindBy(xpath = "//span[contains(text(), '$')]")
    public WebElement priceProduct;

    @FindBy(xpath = "//a[text()='Continue Shopping']")
    public WebElement buttonContinueShopping;

}
