package pages.comp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CompProductAdded {
    public CompProductAdded() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='add_cart_modalAdded']")
    public WebElement popUpProductAdded;

    @FindBy(xpath = "//div[@class='add_cart_modalAdded']//div//h4")
    public WebElement labelSuccessMessage;

    @FindBy(xpath = "//div[@class='cart_added_content']//h4")
    public WebElement labelProductTitle;

    @FindBy(xpath = "//div[@class='cart_added_content']//h5")
    public WebElement labelProductPrice;

    @FindBy(xpath = "//a[text()='View cart']")
    public WebElement buttonViewCart;


}
