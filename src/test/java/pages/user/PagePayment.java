package pages.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PagePayment {
    public PagePayment() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "payment_btn_trigger")
    public WebElement buttonPayNow;

    @FindBy(id = "payment_btn_trigger")
    public WebElement radioCashOnDelivery;
}
