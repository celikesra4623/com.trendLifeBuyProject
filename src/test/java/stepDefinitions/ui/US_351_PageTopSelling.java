package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.admin.PageTopSellingItem;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class US_351_PageTopSelling {

    private PageTopSellingItem pageTopSellingItem = new PageTopSellingItem();
    private String searchInfoForTable;
    private String firstValueRowNumber;

    @Then("Verify that Top Selling Item table title is visible")
    public void verify_that_top_selling_item_table_title_is_visible() {
        boolean isDisplayed = pageTopSellingItem.titleTopSellingItem.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Then("Verify that first column for the first item of the Top Selling Item table is not empty")
    public void verify_that_first_column_for_the_first_item_of_the_top_selling_item_table_is_not_empty() {
        String totalSpendTime = pageTopSellingItem.columnValueListNumber.getText().trim();
        Assert.assertFalse(totalSpendTime.isEmpty());
    }

    @When("Admin sends {string} key to the Quick Search element on Top Selling Item Page")
    public void admin_sends_key_to_the_quick_search_element_on_top_selling_item_page(String searchKey) {
        pageTopSellingItem.fieldQuickSearch.clear();
        ReusableMethods.wait(2);
        pageTopSellingItem.fieldQuickSearch.sendKeys(searchKey);
        ReusableMethods.wait(2);
        searchInfoForTable = pageTopSellingItem.labelTableInfo.getText();
    }

    @Then("Verify that Table Info element shows {string} result on Top Selling Item Page")
    public void verify_that_table_info_element_shows_result_on_top_selling_item_page(String expectedCount) {
        String expectedPString = "0";
        int from = searchInfoForTable.indexOf("Showing ") + "Showing ".length();
        int to = searchInfoForTable.indexOf(" to");
        String actualCount = searchInfoForTable.substring(from, to);
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Then("Verify that Table Info element shows greater then {string} result on Top Selling Item Page")
    public void verify_that_table_info_element_shows_greater_then_result_on_top_selling_item_page(String lowerBound) {
        int from = searchInfoForTable.indexOf("of ") + "of ".length();
        int to = searchInfoForTable.indexOf(" entries");
        int actualCount = Integer.parseInt(searchInfoForTable.substring(from, to));
        Assert.assertTrue(actualCount > 0);
    }

    @Then("Verify that first row of the table has the {string} search key on Top Selling Item Page")
    public void verify_that_first_row_of_the_table_has_the_search_key_on_top_customer_page(String searchKey) {
        verify_that_table_info_element_shows_greater_then_result_on_top_selling_item_page("0");
        List<WebElement> rowFirstValues = pageTopSellingItem.rowFirstValues;
        Assert.assertTrue(rowFirstValues.contains(searchKey));
    }

    @Then("Verify that {string} title of the Top Selling Item table are visible")
    public void verify_that_title_of_the_top_selling_item_table_are_visible(String title) {
        List<WebElement> listTableTitle = pageTopSellingItem.titleListTable;
        Map<String, WebElement> elementsText = ReusableMethods.getMapTextAndElement(listTableTitle);
        Assert.assertTrue(elementsText.keySet().contains(title.toLowerCase()));
    }

    @Then("Verify that first row of the table has its values on Top Selling Item table")
    public void verify_that_first_row_of_the_table_has_its_values_on_top_selling_item_table() {
        List<WebElement> firstRowValues = pageTopSellingItem.rowFirstValues;
        List<String> textsOfFirstRow = ReusableMethods.getElementsText(firstRowValues);
        boolean hasMin5Value = textsOfFirstRow.size() >= 5;
        Assert.assertTrue(hasMin5Value);
    }

    @When("Admin clicks the Previous Pagination button on Top Selling List Page")
    public void admin_clicks_the_previous_pagination_buttonon_on_top_selling_list_page() {
        firstValueRowNumber = pageTopSellingItem.columnValueListNumber.getText();
        pageTopSellingItem.buttonPreviousPagination.click();
        ReusableMethods.wait(1);
    }

    @Then("Verify that the List items are not changed on Top Selling List table")
    public void verify_that_the_list_items_are_not_changed_on_top_selling_list_table() {
        String secondValue = pageTopSellingItem.columnValueListNumber.getText();
        Assert.assertEquals(firstValueRowNumber, secondValue);
    }

    @When("Admin clicks the Next Pagination button on Top Selling List Page")
    public void admin_clicks_the_next_pagination_button_on_top_selling_list_page() {
        firstValueRowNumber = pageTopSellingItem.columnValueListNumber.getText();
        pageTopSellingItem.buttonNextPagination.click();
        ReusableMethods.wait(1);

    }

    @Then("Verify that the List items are changed on Top Selling List table")
    public void verify_that_the_list_items_are_changed_on_top_selling_list_table() {
        String secondValue = pageTopSellingItem.columnValueListNumber.getText();
        Assert.assertNotEquals(firstValueRowNumber, secondValue);
    }

    @When("Admin clicks the Last Pagination item on Top Selling List Page")
    public void admin_clicks_the_last_pagination_item_on_top_selling_list_page() {
        firstValueRowNumber = pageTopSellingItem.columnValueListNumber.getText();
        pageTopSellingItem.lastPagination.click();
        ReusableMethods.wait(1);
    }

}
