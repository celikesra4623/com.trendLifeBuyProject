package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.admin.CompAdminSideBar;
import pages.admin.PageTopCustomer;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class US_350_PageTopCustomer {
    private PageTopCustomer topCustomer = new PageTopCustomer();
    private CompAdminSideBar sideBar = new CompAdminSideBar();
    private String searchInfoForTable;

    private String firstValueOfSpentTime;

    @When("User clicks the Admin Report drop down")
    public void user_clicks_the_admin_report_drop_down() {
        //sideBar'da scroll gerekebilir
        topCustomer.dropDownAdminReports.click();
    }

    @When("User click the Top Customers item")
    public void user_click_the_top_customers_item() {
        //Admin Report drop down acildiktan sonra scroll gerekebilir
        topCustomer.itemTopCustomer.click();
    }

    @Then("Verify that Top Customers table title is visible")
    public void verify_that_top_customers_table_title_is_visible() {
        boolean isDisplayed = topCustomer.titleTopCustomerTable.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Then("Verify that Total Spend Time column for the first item of the Top customer table is not empty")
    public void verify_that_total_spend_time_column_for_the_first_item_of_the_top_customer_table_is_not_empty() {
        String totalSpendTime = topCustomer.columnValueSpentTime.getText().trim();
        Assert.assertFalse(totalSpendTime.isEmpty());
    }

    @Then("Verify that {string} title of the TopCustomer table are visible")
    public void verify_that_title_of_the_top_customer_table_are_visible(String title) {
        List<WebElement> listTableTitle = topCustomer.titleListTable;
        Map<String, WebElement> elementsText = ReusableMethods.getMapTextAndElement(listTableTitle);
        Assert.assertTrue(elementsText.keySet().contains(title.toLowerCase()));
    }

    @Then("Verify that first row of the table has its values")
    public void verify_that_first_row_of_the_table_has_its_values() {
        List<WebElement> firstRowValues = topCustomer.rowFirstValues;
        List<String> textsOfFirstRow = ReusableMethods.getElementsText(firstRowValues);
        boolean hasMin5Value = textsOfFirstRow.size() >= 5;
        Assert.assertTrue(hasMin5Value);
    }

    @When("Admin sends {string} key to the Quick Search element on Top Customer Page")
    public void admin_sends_key_to_the_quick_search_element_on_top_customer_page(String searchKey) {
        topCustomer.fieldQuickSearch.clear();
        ReusableMethods.wait(2);
        topCustomer.fieldQuickSearch.sendKeys(searchKey);
        ReusableMethods.wait(2);
        searchInfoForTable = topCustomer.labelTableInfo.getText();
    }


    @Then("Verify that Table Info element shows {string} result on Top Customer Page")
    public void verify_that_table_info_element_shows_result_on_top_customer_page(String expectedCount) {
        String expectedPString = "0";
        int from = searchInfoForTable.indexOf("Showing ") + "Showing ".length();
        int to = searchInfoForTable.indexOf(" to");
        String actualCount = searchInfoForTable.substring(from, to);
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Then("Verify that Table Info element shows greater then {string} result on Top Customer Page")
    public void verify_that_table_info_element_shows_greater_then_result_on_top_customer_page(String lowerBound) {
        int from = searchInfoForTable.indexOf("of ") + "of ".length();
        int to = searchInfoForTable.indexOf(" entries");
        int actualCount = Integer.parseInt(searchInfoForTable.substring(from, to));
        Assert.assertTrue(actualCount > 0);
    }

    @Then("Verify that first row of the table has the {string} search key on Top Customer Page")
    public void verify_that_first_row_of_the_table_has_the_search_key_on_top_customer_page(String searchKey) {
        verify_that_table_info_element_shows_greater_then_result_on_top_customer_page("0");
        List<WebElement> rowFirstValues = topCustomer.rowFirstValues;
        Assert.assertTrue(rowFirstValues.contains(searchKey));
    }

    @When("Admin clicks the Previous Pagination button")
    public void admin_clicks_the_previous_pagination_button() {
        firstValueOfSpentTime = topCustomer.columnValueSpentTime.getText();
        topCustomer.buttonPreviousPagination.click();
        ReusableMethods.wait(1);
    }

    @Then("Verify that the List items are not changed")
    public void verify_that_the_list_items_are_not_changed() {
        String secondValue = topCustomer.columnValueSpentTime.getText();
        Assert.assertEquals(firstValueOfSpentTime, secondValue);
    }

    @When("Admin clicks the Next Pagination button")
    public void admin_clicks_the_next_pagination_button() {
        firstValueOfSpentTime = topCustomer.columnValueSpentTime.getText();
        topCustomer.buttonNextPagination.click();
        ReusableMethods.wait(1);

    }

    @Then("Verify that List items are changed")
    public void verify_that_list_items_are_changed() {
        String secondValue = topCustomer.columnValueSpentTime.getText();
        Assert.assertNotEquals(firstValueOfSpentTime, secondValue);
    }

    @When("Admin clicks the Last Pagination item")
    public void admin_clicks_the_last_pagination_item() {
        firstValueOfSpentTime = topCustomer.columnValueSpentTime.getText();
        topCustomer.lastPagination.click();
        ReusableMethods.wait(1);
    }


}
