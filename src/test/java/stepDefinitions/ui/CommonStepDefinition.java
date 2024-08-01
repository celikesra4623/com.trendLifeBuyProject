package stepDefinitions.ui;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.admin.CompAdminSideBar;
import pages.admin.PageAdminLogin;
import pages.comp.CompHeader;
import pages.user.PageUserLogin;
import utilities.Driver;
import utilities.URLReader;

public class CommonStepDefinition {
    PageUserLogin userLoginPage = new PageUserLogin();
    PageAdminLogin adminLoginPage = new PageAdminLogin();


    @Given("User lands on user login url and logins with {string} email and {string} password")
    public void user_lands_on_user_login_url_and_logins_with_email_and_password(String userKey, String passwordKey) {
        Driver.getDriver().get(URLReader.getUrl("url.user.login"));
        userLoginPage.login(userKey, passwordKey);
    }

    @Given("Admin lands on admin login url and logins with {string} email and {string} password")
    public void admin_lands_on_admin_login_url_and_logins_with_email_and_password(String adminKey, String passwordKey) {
        Driver.getDriver().get(URLReader.getUrl("url.admin.login"));
        adminLoginPage.login(adminKey, passwordKey);
    }

    @Given("User logout")
    public void user_logout() {
        new CompHeader().logout();
    }

    @Given("Admin logout")
    public void admin_logout() {
        throw new RuntimeException("Did not implement admin logout method yet! Anil");
    }

    @Given("Go to {string} url")
    public void go_to_url(String givenUrl) {
        String url = URLReader.getUrl(givenUrl);
        Driver.getDriver().get(url);
    }

    @Then("Verify actual URL is {string}")
    public void verify_actual_url_is(String expectedURL) {
        String actualURL = Driver.getDriver().getCurrentUrl();
        expectedURL = URLReader.getUrl(expectedURL);
        Assert.assertTrue(actualURL.contains(expectedURL));
    }

    @Then("Admin clicks the {string} drop down and then clicks the {string} item")
    public void admin_clicks_the_drop_down_and_then_clicks_the_item(String dropDownText, String itemText) {
        new CompAdminSideBar().clickItemElement(dropDownText, itemText);
    }


}
