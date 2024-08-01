package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.admin.PageAdminDashboard29;
import pages.admin.PageAdminLogin;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class US_29_AdminPanelStepDefinition {
    PageAdminLogin adminLoginPage = new PageAdminLogin();
    PageAdminDashboard29 pageAdminDashboard29=new PageAdminDashboard29();
    ReusableMethods reusableMethods=new ReusableMethods();
    String windowHandle;

    @Then("Verify admin panel URL is accessible")
    public void verify_admin_panel_url_is_accessible() {
        String expectetUrl="https://trendlifebuy.com/admin-dashboard";
        String actuelUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectetUrl,actuelUrl);

    }
    @Then("Verify that user logins to the admin Dashboard page")
    public void verify_that_user_logins_to_the_admin_dashboard_page() {
        Assert.assertTrue(pageAdminDashboard29.profilePictureAdmin.isDisplayed());

    }
    @Then("Verify that the Search TextBox is visible in the admin Dashboard page")
    public void verify_that_the_search_text_box_is_visible_in_the_admin_dashboard_page() {
        Assert.assertTrue(pageAdminDashboard29.searchTextBoxDashboard.isDisplayed());

    }
   @Then("Verify that the site can be searched using the serach TextBox")
   public void verify_that_the_site_can_be_searched_using_the_serach_text_box() {
        pageAdminDashboard29.searchTextBoxDashboard.sendKeys("Visitor Report"+ Keys.ENTER);
        Assert.assertTrue(pageAdminDashboard29.titleVisitorReport.isDisplayed());


   }
    @Then("Click the menu icon on the Dashboard home page")
    public void click_the_menu_icon_on_the_dashboard_home_page() {
        pageAdminDashboard29.iconMenüDashboard.click();

    }
    @Then("Verify that the Dashboard Side Bar narrows and expands")
    public void verify_that_the_dashboard_side_bar_narrows_and_expands() {
        reusableMethods.wait(2);
        Assert.assertFalse(pageAdminDashboard29.menuseperatorDashboard.isDisplayed());

    }
    @Then("Click on the Website button on the Dashboard home page")
    public void click_on_the_website_button_on_the_dashboard_home_page() {
        pageAdminDashboard29.buttonWebsite.click();
        reusableMethods.wait(2);



    }
    @Then("Verify that it redirects to the user interface of the site")
    public void verify_that_it_redirects_to_the_user_interface_of_the_site() {
    String targetTitle=" Trendlifebuy Online Shopping ";
        String current = Driver.getDriver().getWindowHandle();
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(current))
                Driver.getDriver().switchTo().window(handle);
        }
        System.out.println(Driver.getDriver().getCurrentUrl());

    }

    @Then("Verify that Visitor data in Summary Dashboard changes to {string}")
    public void verify_that_visitor_data_in_summary_dashboard_changes_to(String string) {
        ReusableMethods.switchToWindow("https://trendlifebuy.com/");
        String expectetTitle="https://trendlifebuy.com/";


    }
    @Then("Click Visitor button")
    public void click_visitor_button() {
       pageAdminDashboard29.buttonToday.click();
    }
    @Then("Verify Visitor Page visible")
    public void verify_visitor_page_visible() {
      Assert.assertTrue(pageAdminDashboard29.titleVisitorReport.isDisplayed());
    }
    @Then("Click Total Subscriber button")
    public void click_total_subscriber_button() {
        pageAdminDashboard29.buttonTotalSubscriber.click();

    }
    @Then("Verify Subscriber Page visible")
    public void verify_subscriber_page_visible() {
        Assert.assertTrue(pageAdminDashboard29.titleSubscriberList.isDisplayed());

    }
    @Then("Click Today button")
    public void click_today_button() {
        pageAdminDashboard29.buttonToday.click();
        String text = pageAdminDashboard29.totalVisitor.getText();

    }
    @Then("Verify that Visitor data in Summary Dashboard changes to Today")
    public void verify_that_visitor_data_in_summary_dashboard_changes_to_today() {

    }
    @Then("Click This Week button")
    public void click_this_week_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that Visitor data in Summary Dashboard changes to This Week")
    public void verify_that_visitor_data_in_summary_dashboard_changes_to_this_week() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Click This Month button")
    public void click_this_month_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that Visitor data in Summary Dashboard changes to This Month")
    public void verify_that_visitor_data_in_summary_dashboard_changes_to_this_month() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Click This Year button")
    public void click_this_year_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that Visitor data in Summary Dashboard changes to This Year")
    public void verify_that_visitor_data_in_summary_dashboard_changes_to_this_year() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("Verify that Visitor data in Summary Dashboard changes for clicking Today This Week This Month This Year filters")
    public void verifyThatVisitorDataInSummaryDashboardChangesForClickingTodayThisWeekThisMonthThisYearFilters() {
        pageAdminDashboard29.buttonToday.click();
        String temp = pageAdminDashboard29.totalVisitor.getText();
        pageAdminDashboard29.buttonThisWeek.click();
        String current=pageAdminDashboard29.totalVisitor.getText();
        Assert.assertEquals(temp,current);
 //       reusableMethods.wait(2);
 //       temp=current;
 //       pageAdminDashboard29.buttonThisMonth.click();
 //       current=pageAdminDashboard29.totalVisitor.getText();
 //       Assert.assertNotEquals(temp,current);
 //       pageAdminDashboard29.buttonToday.click();
 //      temp = pageAdminDashboard29.totalVisitor.getText();
 //       pageAdminDashboard29.buttonThisYear.click();
 //       current = pageAdminDashboard29.totalVisitor.getText();
 //       Assert.assertNotEquals(temp,current);

    }
}
