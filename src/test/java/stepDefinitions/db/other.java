package stepDefinitions.db;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class other {
    private List<Object> ids;


    @When("DB user saves all IDs in a list from staff table")
    public void db_user_saves_all_i_ds_in_a_list_from_staff_table() {
        String query = "SELECT id FROM u480337000_tlb_training.staff";
        ids = DBUtils.getColumnData(query, "id");
    }
    //@Then("Verify that given staff ID {int} is in the list")
    //public void verify_that_given_staff_id_is_in_the_list(Integer id) {
    //    Assert.assertTrue(ids.contains(id));
    //}
}
