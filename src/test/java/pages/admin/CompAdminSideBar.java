package pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CompAdminSideBar {
    public CompAdminSideBar() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='large_logo']")
    public WebElement logoSideBar;

    public void clickDropDownElement(String textOfItem) {
        WebElement dropDownElement = null;
        String xpath = "//span[text()='" + textOfItem + "']";
        try {
            dropDownElement = Driver.getDriver().findElement(By.xpath(xpath));
        } catch (RuntimeException e) {
            throw new RuntimeException(xpath + " couldn't find an elament with the text of '" + textOfItem + "'" + Driver.getDriver().getCurrentUrl());
        }
        dropDownElement.click();
    }

    public void clickItemElement(String textDropDown, String textOfItem) {
        clickDropDownElement(textDropDown);
        WebElement itemElement = null;
        String xpath = "//a[text()='" + textOfItem + "']";
        try {
            itemElement = Driver.getDriver().findElement(By.xpath(xpath));
        } catch (RuntimeException e) {
            throw new RuntimeException("\n" +xpath + "\n couldn't find an elament with the text of '" + textOfItem + "'\n" + Driver.getDriver().getCurrentUrl());
        }
        itemElement.click();
    }
}
