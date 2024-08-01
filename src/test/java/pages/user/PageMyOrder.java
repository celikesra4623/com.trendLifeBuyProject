package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageMyOrder {

    public PageMyOrder(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/my-purchase-orders'][1]")
    public WebElement linkMyOrder;
}
