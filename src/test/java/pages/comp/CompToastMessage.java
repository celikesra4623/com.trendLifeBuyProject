package pages.comp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class CompToastMessage {

    public CompToastMessage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='toast-close-button']")
    public WebElement buttonCloseToast;


    @FindBy(xpath = "//div[@class='toast-title']")
    public WebElement labelTitleToast;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement labelMessageToast;

    public void close() {
        try {
            buttonCloseToast = ReusableMethods.waitForVisibility(buttonCloseToast, 10);
            buttonCloseToast.click();
        } catch (RuntimeException e) {
            System.out.println("buttonCloseToast element is not visible\n");
            e.printStackTrace();
        }
    }
}
