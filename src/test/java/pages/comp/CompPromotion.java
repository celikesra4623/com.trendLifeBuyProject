package pages.comp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class CompPromotion {

    public CompPromotion() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='close_modal']/i")
    public WebElement buttonClosePromotion;

    @FindBy(css = "div.newsletter_form.text-center")
    public WebElement popUpPromotion;

    public void close() {
        try {
            buttonClosePromotion = ReusableMethods.waitForVisibility(buttonClosePromotion, 10);
            buttonClosePromotion.click();
        } catch (RuntimeException e) {
            System.out.println("buttonClosePromotion element is not visible\n");
            e.printStackTrace();
        }
    }

}
