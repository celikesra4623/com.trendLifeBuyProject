package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.admin.PageAdminLogin;
import pages.user.PageUserDashboard;
import pages.user.PageUserLogin;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_25_UserLogoutStepDefinition {
    PageUserLogin userLoginPage = new PageUserLogin();
    PageUserDashboard userDashboardPage = new PageUserDashboard();

    @When("User clicks the Dashboard button")
    public void user_clicks_the_dashboard_button() {
        userDashboardPage.buttonDashboard.click();

    }

    @When("Verify that the Logout button appears on the page")
    public void verify_that_the_logout_button_appears_on_the_page() {
        Assert.assertTrue(userDashboardPage.linkLogoutHomePage.isDisplayed());

    }

    @When("Close Driver")
    public void close_driver() {

    }

    @Then("User clicks the Logout button")
    public void user_clicks_the_logout_button() {
        userDashboardPage.linkLogoutHomePage.click();
    }

    @Then("Verify logout")
    public void verify_logout() {
        Assert.assertTrue(userDashboardPage.linkLogin.isDisplayed());

    }

    @When("Verify that the Logout button appears on the Sidebar")
    public void verify_that_the_logout_button_appears_on_the_sidebar() {
        Assert.assertTrue(userDashboardPage.linkLogoutDashboardSideBar.isDisplayed());
    }

    @When("User clicks the Logout button on the Sidebar")
    public void user_clicks_the_logout_button_on_the_sidebar() {
          ReusableMethods.clickElementByJS(userDashboardPage.linkLogoutDashboardSideBar);


    }

}
