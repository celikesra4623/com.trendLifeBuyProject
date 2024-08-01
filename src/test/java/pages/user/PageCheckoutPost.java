package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageCheckoutPost {
    public PageCheckoutPost() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Continue To Payment']")
    public WebElement buttonContinueToPayment;

    @FindBy(xpath = "//span[text()='Free Shipping']")
    public WebElement radioFreeShipping;

    @FindBy(id = "grand_total")
    public WebElement labelTaxAddedPrice;

    @FindBy(xpath = "//div[@class='product_list_content']//a")
    public WebElement labelProductName;
}
