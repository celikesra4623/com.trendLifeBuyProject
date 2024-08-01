package stepDefinitions.db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.math.BigInteger;
import java.util.List;

public class US_374_Staff {

    private List<Object> ids;

    @When("DB User saves all IDs in a list from staff table")
    public void dbUserSavesAllIDsInAListFromStaffTable() {
        String query = "SELECT id FROM u480337000_tlb_training.staff";
        ids = DBUtils.getColumnData(query, "id");
    }

    @Then("Verify that given staff ID {int} is in the list")
    public void verifyThatGivenStaffIDIsInTheList(int id) {

        String idString = String.valueOf(id);

        Assert.assertTrue(ids.contains(new BigInteger(idString)));
    }
}
