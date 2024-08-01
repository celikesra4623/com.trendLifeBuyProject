package stepDefinitions.ui;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.comp.CompHeader;

public class US_001_PageHome {

    CompHeader compHeader= new CompHeader();

    @And("logout buton is displayed")
    public void logoutButtonIsDisplayed(){
        Assert.assertTrue(compHeader.buttonLogout.isDisplayed());
    }


}
