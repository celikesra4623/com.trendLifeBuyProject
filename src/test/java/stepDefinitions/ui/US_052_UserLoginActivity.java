package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.admin.PageAdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.URLReader;

public class US_052_UserLoginActivity {
    PageAdminDashboard pageAdminDashboard=new PageAdminDashboard();


    @Then("Click All activity Logs Button")
    public void click_all_activity_logs_button() {
        pageAdminDashboard.dropDownAllActivityLogs.click();
    }
    @Then("Click Login Activity Button")
    public void click_login_activity_button() {
        pageAdminDashboard.dropDownLoginActivity.click();
        Assert.assertEquals(URLReader.getUrl("url.admin.activity.login"), Driver.getDriver().getCurrentUrl());
    }
    @Then("Click Clean All Button")
    public void click_clean_all_button() {
        pageAdminDashboard.buttonCleanAll.click();
    }
    @Then("Click Delete Activity Button")
    public void click_delete_activity_button() {
        pageAdminDashboard.buttonDeleteActivity.click();
        Assert.assertTrue(pageAdminDashboard.toastSuccess.isDisplayed());
    }
    @Then("Verify that headings are displayed")
    public void Verify_that_headings_are_displayed() {
        Assert.assertTrue(pageAdminDashboard.headingUser.isDisplayed());
        Assert.assertTrue(pageAdminDashboard.headingLoginAt.isDisplayed());
        Assert.assertTrue(pageAdminDashboard.headingLoginAt.isDisplayed());
        Assert.assertTrue(pageAdminDashboard.headingLogoutAt.isDisplayed());
        Assert.assertTrue(pageAdminDashboard.headingIp.isDisplayed());
        Assert.assertTrue(pageAdminDashboard.headingAgent.isDisplayed());
        Assert.assertTrue(pageAdminDashboard.headingDescription.isDisplayed());

    }

    @Then("Click Next Page")
    public void click_next_page() {
        pageAdminDashboard.buttonNextPage.click();
        Assert.assertTrue(pageAdminDashboard.element11.isDisplayed());

    }

    @Then("Click Quick Search Field and Enter Any User")
    public void click_Quick_Search_Field() {
        pageAdminDashboard.inputQuickSearch.click();
        pageAdminDashboard.inputQuickSearch.sendKeys(ConfigReader.getProperty("userExample")+ Keys.ENTER);
        Assert.assertEquals(ConfigReader.getProperty("userExample"),pageAdminDashboard.element1User.getText());
    }



}
