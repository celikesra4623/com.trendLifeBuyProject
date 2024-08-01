package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.admin.PageAdminDashboard;
import utilities.Driver;
import utilities.URLReader;

public class US_053_UserActivity {

    PageAdminDashboard pageAdminDashboard=new PageAdminDashboard();

    @Then("Click Activity Logs Button")
    public void click_activity_logs_button() {
        pageAdminDashboard.dropDownLoginActivity.click();
        Assert.assertEquals(URLReader.getUrl("url.admin.activity.login"), Driver.getDriver().getCurrentUrl());
    }





}
