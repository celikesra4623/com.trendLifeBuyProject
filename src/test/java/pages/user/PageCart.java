package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageCart {
    public PageCart() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='summery_pro_content']//h4")
    public WebElement labelPossibleAddedProduct;

    @FindBy(xpath = "//form[@id='cart_form']//a[text()='Proceed to checkout']")
    public WebElement buttonProceedToCheckout;
}
