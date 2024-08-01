package pages.comp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CompProductQuickView {

    public CompProductQuickView() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='product_quick_view ']")
    public WebElement popUpQuickView;

    @FindBy(xpath = "" +
            "//div[contains(@class, 'product_content_details')]" +
            "//p[@class='stock_text']")
    public WebElement productStockText;

    @FindBy(xpath = "//div[contains(@class, 'product_content_details')]//h5")
    public WebElement productPrice;

    @FindBy(xpath = "//div[contains(@class, 'product_content_details')]//h3")
    public WebElement productTitle;

    @FindBy(id = "add_to_cart_btn_modal")
    public WebElement buttonAddToCart;
}
